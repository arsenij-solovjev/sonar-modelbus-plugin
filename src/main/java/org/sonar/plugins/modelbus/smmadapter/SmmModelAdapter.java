package org.sonar.plugins.modelbus.smmadapter;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.sonar.api.measures.Metric;
import org.sonar.api.measures.Metric.Builder;
import org.sonar.api.measures.Metric.ValueType;
import org.sonar.api.measures.SumChildValuesFormula;
import org.sonar.api.resources.ProjectFileSystem;
import org.sonar.api.resources.Resource;
import org.sonar.plugins.modelbus.ModelBusMetrics;
import org.sonar.plugins.modelbus.language.uml.Uml;
import org.sonar.plugins.modelbus.smmparser.DirectMeasure;
import org.sonar.plugins.modelbus.smmparser.DirectMeasurement;
import org.sonar.plugins.modelbus.smmparser.Measure;
import org.sonar.plugins.modelbus.smmparser.SMMElement;
import org.sonar.plugins.modelbus.smmparser.SMMModel;
import org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package;

public class SmmModelAdapter {

	private SMMModel model;
	private Map<Resource<?>, Map<Metric, Double>> resourceToMetrics = new HashMap<Resource<?>, Map<Metric, Double>>();

	

	public SmmModelAdapter(SMMModel model, ProjectFileSystem projectFileSystem) {
		this.model = model;
		init(projectFileSystem);
	}

	public SmmModelAdapter(SMMModel model) {
		this.model = model;
	}

	private void init(ProjectFileSystem p) {

		List<SMMElement> elements = model.getSMMElement();
		Collection<Object> es = EcoreUtil.getObjectsByType(elements, SoftwareMetricsMetamodel2Package.eINSTANCE.getDirectMeasurement());
		Map<String, Metric> cachedMetrics = new HashMap<String, Metric>();

		// look for static metrics defined in class "ModelBusMetrics"
		Map<String, Metric> staticPredefinedMetrics = new HashMap<String, Metric>();
		for (Metric predefinedMetric : ModelBusMetrics.getAllMetrics()) {
			staticPredefinedMetrics.put(predefinedMetric.getName(), predefinedMetric);
		}
		
		// add predefined metrics to cached metrics
		cachedMetrics.putAll(staticPredefinedMetrics);
		
		// iterate over resulting measures
		for (Object e : es) {
			Metric metric = null;
			DirectMeasurement measurement = (DirectMeasurement) e;

			File file = new File(EcoreUtil.getURI(measurement.getMeasurand()).toFileString());
			Resource<?> resource = new org.sonar.api.resources.File(Uml.INSTANCE, file.getParent(), file.getName());

			Measure measure = measurement.getMeasure();
			String metricName = measure.getName();
			
			if(metric==null) {
				metric = cachedMetrics.get(metricName);

				// generate custom metrics if needed
				if(metric==null) {
					metric = createMetricByMeasure(measure);
					cachedMetrics.put(metricName, metric);
					System.out.println("created custom metric "+metric.getName());
				}
			}

			// set value
			Double value = measurement.getValue();

			Map<Metric, Double> resourceMetricsMap = resourceToMetrics.get(resource);
			if(resourceMetricsMap==null) {
				resourceMetricsMap = new HashMap<Metric, Double>();
				resourceToMetrics.put(resource, resourceMetricsMap);
			}
			resourceMetricsMap.put(metric, value);
		}
	}

	
	
	
	private Metric createMetricByMeasure(Measure measure) {
		ValueType floatType = Metric.ValueType.FLOAT;
		Builder metricBuilder = new Metric.Builder(
			measure.getName(),
			measure.getName(),
			floatType
		);
		metricBuilder.setDescription(measure.getDescription());
		
		if(measure.getName().toLowerCase().startsWith("numberof")) {
			metricBuilder.setFormula(new SumChildValuesFormula(true));
		}

		return metricBuilder.create();
	}

	
	
	public Map<Metric, Double> getMeasurements(Resource<?> resource) {

		for (Resource<?> r : resourceToMetrics.keySet()) {
			boolean equals = r.getKey().equals(resource.getKey());
			if (equals)
				return resourceToMetrics.get(r);
		}
		return null;
	}

	/**
	 * 
	 * @return Set of all metrics in the SMM
	 */
	public Set<Metric> getMetrics() {
		List<SMMElement> elements = model.getSMMElement();
		Collection<Object> es = EcoreUtil.getObjectsByType(elements, SoftwareMetricsMetamodel2Package.eINSTANCE.getDirectMeasure());

		HashSet<Metric> metrics = new HashSet<Metric>();

		for (Object e : es) {
			DirectMeasure measure = (DirectMeasure) e;
			Metric metric = createMetricByMeasure(measure);
			metrics.add(metric);

		}
		return metrics;
	}

	public Map<Resource<?>, Map<Metric, Double>> getResourceToMetrics() {
		return resourceToMetrics;
	}

}
