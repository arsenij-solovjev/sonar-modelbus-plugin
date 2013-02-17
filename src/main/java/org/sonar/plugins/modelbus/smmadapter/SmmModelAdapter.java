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
import org.sonar.api.resources.ProjectFileSystem;
import org.sonar.api.resources.Resource;
import org.sonar.plugins.modelbus.ModelBusMetrics;
import org.sonar.plugins.modelbus.language.uml.Uml;
import org.sonar.plugins.modelbus.smmparser.DirectMeasure;
import org.sonar.plugins.modelbus.smmparser.DirectMeasurement;
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

	@SuppressWarnings("rawtypes")
	private void init(ProjectFileSystem p) {

		List<SMMElement> elements = model.getSMMElement();
		DirectMeasurement measurement;
		Resource resource;
		Metric metric = ModelBusMetrics.COUNTCLASSES;
		Double value;
		Collection<Object> es = EcoreUtil.getObjectsByType(elements,
				SoftwareMetricsMetamodel2Package.eINSTANCE.getDirectMeasurement());

		for (Object e : es) {

			measurement = (DirectMeasurement) e;

			String resourceUri = EcoreUtil.getURI(measurement.getMeasurand()).toFileString();

			File file = new File(resourceUri);
			resource = new org.sonar.api.resources.File(Uml.INSTANCE, file.getParent(), file.getName());
			String metricName = measurement.getMeasure().getName();

			if (metricName.equals("NumberOfClasses"))
				metric = ModelBusMetrics.COUNTCLASSES;

			value = measurement.getValue();
			if (metricName.equals("NumberOfClasses")){				
				if (resourceToMetrics.get(resource) != null) {
					
					resourceToMetrics.get(resource).put(metric, value);
				} else {
					resourceToMetrics.put(resource, new HashMap<Metric, Double>());
					resourceToMetrics.get(resource).put(metric, value);
				}
			}
		}
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
	public Set<String> getMetrics() {
		List<SMMElement> elements = model.getSMMElement();
		Collection<Object> es = EcoreUtil.getObjectsByType(elements,
				SoftwareMetricsMetamodel2Package.eINSTANCE.getDirectMeasure());

		HashSet<String> metrics = new HashSet<String>();

		for (Object e : es) {

			DirectMeasure measurement = (DirectMeasure) e;
			metrics.add(measurement.getName());

		}
		return metrics;
	}

	public Map<Resource<?>, Map<Metric, Double>> getResourceToMetrics() {
		return resourceToMetrics;
	}

}
