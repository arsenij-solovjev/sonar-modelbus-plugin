package org.sonar.plugins.modelbus.batch;

/**
 *
 * @deprecated use ServicePostJob
 *
 */

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.eclipse.emf.common.util.EList;
import org.sonar.api.batch.Decorator;
import org.sonar.api.batch.DecoratorContext;
import org.sonar.api.measures.MeasureUtils;
import org.sonar.api.measures.Metric;
import org.sonar.api.resources.Java;
import org.sonar.api.resources.Project;
import org.sonar.api.resources.Resource;
import org.sonar.api.resources.Scopes;
import org.sonar.plugins.modelbus.ModelBusMetrics;
import org.sonar.plugins.modelbus.Resources;
import org.sonar.plugins.modelbus.metrinoclient.CheckModels;
import org.sonar.plugins.modelbus.smmparser.SMMElement;
import org.sonar.plugins.modelbus.smmparser.SMMModel;
import org.sonar.plugins.modelbus.smmparser.SMMParser;
import org.sonar.plugins.modelbus.smmparser.SmmModelAdapter;
import org.xml.sax.SAXException;

public class CountClassesDecorator implements Decorator {
	public static final Logger LOG = LoggerFactory.getLogger(CountClassesDecorator.class);

	String baseDirPath;
	String modelPath;

	public boolean shouldExecuteOnProject(Project project) {
		LOG.info("Testlog in CountClassesDecorator");

		baseDirPath = project.getFileSystem().getBasedir().getAbsolutePath();
		modelPath = baseDirPath + ModelBusPluginConst.MODEL_PATH;

		LOG.info("baseDirPath: " + baseDirPath);
		LOG.info("Modelpath: " + modelPath);

		// execute on all until we get the right language code
		return true;
	}

	public void decorate(Resource resource, DecoratorContext context) {

		Resources resources = Resources.getInstance();

		if (resource.getKey().endsWith(Resources.UML_EXT)) {

			SmmModelAdapter smm = resources.getModel();
			// Map<Resource, Map<Metric, Double>> r2m =
			// smm.getResourceToMetricsList(project.getFileSystem());
			Map<Metric, Double> measurements = smm.getMeasurements(resource);
			// smm.getMetrics();

			for (Metric m : measurements.keySet())
				context.saveMeasure(m, measurements.get(m));

		}

	}

}