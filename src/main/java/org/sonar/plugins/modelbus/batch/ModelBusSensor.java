package org.sonar.plugins.modelbus.batch;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.common.util.EList;
import org.modelbus.dosgi.repository.descriptor.NonExistingResourceException;
import org.modelbus.dosgi.repository.descriptor.RepositoryAuthentificationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.batch.Sensor;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.measures.Measure;
import org.sonar.api.measures.Metric;
import org.sonar.api.resources.Project;
import org.sonar.api.resources.ProjectFileSystem;
import org.sonar.api.resources.Resource;
import org.sonar.plugins.modelbus.ModelBusMetrics;
import org.sonar.plugins.modelbus.Resources;

import org.sonar.plugins.modelbus.language.uml.Uml;
import org.sonar.plugins.modelbus.metrinoclient.CheckModels;
import org.sonar.plugins.modelbus.smmparser.DirectMeasure;
import org.sonar.plugins.modelbus.smmparser.SMMElement;
import org.sonar.plugins.modelbus.smmparser.SMMModel;
import org.sonar.plugins.modelbus.smmparser.SMMParser;
import org.sonar.plugins.modelbus.smmparser.SmmModelAdapter;

public class ModelBusSensor implements Sensor {

	public static final Logger LOG = LoggerFactory.getLogger(ModelBusSensor.class);

	public boolean shouldExecuteOnProject(Project project) {
		// This sensor is executed on any type of projects
//		project.setLanguage(Uml.INSTANCE);
		return true;
	}

	public void analyse(Project project, SensorContext sensorContext) {

		// HACK: context classloader must be overwritten with the plugin
		// classloader (otherwise modelbus fails on initialization)
		ClassLoader initialClassLoader = Thread.currentThread().getContextClassLoader();
		try {

			Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
			Resources resources = Resources.getInstance();
			
			CheckModels checkModels = new CheckModels();
			checkModels.run(project);

			// Create parse resulting model, and make it accessible via Resources
			SMMModel smmModel = SMMParser.load(checkModels.checkoutSmm());
		
			SmmModelAdapter smm = new SmmModelAdapter(smmModel, project.getFileSystem());
			
			resources.setModel(smm);	
			
			Map<Metric, Double> sums = new HashMap<Metric, Double>();
			Map<Resource, Map<Metric, Double>> mapping = smm.getResourceToMetrics();
			for(Resource resource : mapping.keySet()) {
				Map<Metric, Double> metrics = mapping.get(resource);
				for(Metric metric : metrics.keySet()) {
					//save resource's metric value
					double value = metrics.get(metric);
					sensorContext.saveMeasure(resource, metric, value);
					//summing up the metric values
					if(sums.containsKey(metric))
						sums.put(metric, sums.get(metric) + value);
					else
						sums.put(metric, value);
				}
			}
			for(Metric metric : sums.keySet())
				sensorContext.saveMeasure(metric, sums.get(metric));
		} catch (Exception e){
			e.printStackTrace();	
		}
		
		finally {
			Thread.currentThread().setContextClassLoader(initialClassLoader);
		}
	}
	
	@Override
	public String toString(){
		
		return this.getClass().getSimpleName();
		
	}
}
