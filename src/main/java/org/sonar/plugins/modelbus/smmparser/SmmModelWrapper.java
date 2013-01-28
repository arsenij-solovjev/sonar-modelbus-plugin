package org.sonar.plugins.modelbus.smmparser;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.cxf.binding.corba.utils.EprMetaData;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.sonar.api.measures.Metric;
import org.sonar.api.resources.ProjectFileSystem;
import org.sonar.api.resources.Resource;

public class SmmModelWrapper {

	private SMMModel model;

	public SmmModelWrapper(SMMModel model) {
		this.model = model;
	}

	/**
	 * @return a more convenient mapping of resource to metrics
	 */
	public Map<Resource, Map<Metric, Double>> getResourceToMetricsList(ProjectFileSystem p) {

		List<SMMElement> elements = model.getSMMElement();
		Map<Resource, Map<Metric, Double>> resourceToMetrics = new HashMap<Resource, Map<Metric, Double>>();
		DirectMeasure measure;
		for (SMMElement e : elements) {
			if (e instanceof DirectMeasure) {
				measure = (DirectMeasure) e;

				for (Measurement m : measure.getMeasurement()) {
					String s = EcoreUtil.getURI(m.getMeasurand()).toFileString();
					System.out.println(s);
					Resource r = p.toResource(new File(s));
					
				}
			}

		}

		return resourceToMetrics;
	}

}
