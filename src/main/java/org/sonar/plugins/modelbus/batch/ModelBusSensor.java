package org.sonar.plugins.modelbus.batch;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.batch.Sensor;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.measures.Metric;
import org.sonar.api.resources.Project;
import org.sonar.api.resources.Resource;
import org.sonar.plugins.modelbus.Resources;

import org.sonar.plugins.modelbus.adapter.ModelBusMetricsAdapter;
import org.sonar.plugins.modelbus.adapter.ConfigurableProjectAdapter;
import org.sonar.plugins.modelbus.adapter.SmmModelAdapter;
import org.sonar.plugins.modelbus.metrinoclient.CheckModels;
import org.sonar.plugins.modelbus.smmparser.SMMModel;
import org.sonar.plugins.modelbus.smmparser.SMMParser;

public class ModelBusSensor extends ConfigurableProjectAdapter implements Sensor {

	public static final Logger LOG = LoggerFactory.getLogger(ModelBusSensor.class);

	public boolean shouldExecuteOnProject(Project project) {
		LOG.info("Checking project \""+project+"\" for execution.");
		
		// This sensor is executed on any type of projects
		//	project.setLanguage(Uml.INSTANCE);
		return true;
	}

	public void analyse(final Project project, final SensorContext sensorContext) {
		super.configure(project, getClass());
		
		// HACK: context classloader must be overwritten with the plugin
		// classloader (otherwise modelbus fails on initialization)
		new ModelBusMetricsAdapter<Boolean>(getClass()) {
			@Override
			public Boolean execute() {
				Resources resources = Resources.getInstance();
				
				CheckModels checkModels = CheckModels.getInstance();
				checkModels.startTraverseRepository(project);

				// Create parse resulting model, and make it accessible via Resources
				SMMModel smmModel = SMMParser.load(checkModels.checkoutSmm());
				SmmModelAdapter smm = new SmmModelAdapter(smmModel, project.getFileSystem());
				
				resources.setModel(smm);	
				
				Map<Metric, Double> sums = new HashMap<Metric, Double>();
				Map<Resource<?>, Map<Metric, Double>> mapping = smm.getResourceToMetrics();
				for(Resource<?> resource : mapping.keySet()) {
					Map<Metric, Double> metrics = mapping.get(resource);
					LOG.debug("sensor: set data for resource "+resource.getName()+": "+metrics.size());
					
					for(Metric metric : metrics.keySet()) {
						try {
							//save resource's metric value
							double value = metrics.get(metric);
							sensorContext.saveMeasure(resource, metric, value);
							
							//summing up the metric values
							if(sums.containsKey(metric))
								sums.put(metric, sums.get(metric) + value);
							else
								sums.put(metric, value);
						}
						catch(Exception e) {
							LOG.warn("Could not save measure: "+e.getMessage());
						}
					}
				}
				for(Metric metric : sums.keySet()) {
					sensorContext.saveMeasure(metric, sums.get(metric));
				}
				return true;
			}
		}.start();
	}
	
	@Override
	public String toString(){
		
		return this.getClass().getSimpleName();
		
	}
}
