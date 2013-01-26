package org.sonar.plugins.modelbus.batch;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
import org.sonar.api.resources.Project;
import org.sonar.plugins.modelbus.ModelBusMetrics;
import org.sonar.plugins.modelbus.metrinoclient.CheckModels;
import org.sonar.plugins.modelbus.smmparser.DirectMeasure;
import org.sonar.plugins.modelbus.smmparser.SMMElement;
import org.sonar.plugins.modelbus.smmparser.SMMModel;
import org.sonar.plugins.modelbus.smmparser.SMMParser;

public class ModelBusSensor implements Sensor {

	public static final Logger LOG = LoggerFactory.getLogger(ModelBusSensor.class);

	public boolean shouldExecuteOnProject(Project project) {
		// This sensor is executed on any type of projects
		return true;
	}

	public void analyse(Project project, SensorContext sensorContext) {
		ClassLoader initialClassLoader = Thread.currentThread().getContextClassLoader();
		try {

			Thread.currentThread().setContextClassLoader(getClass().getClassLoader());

			CheckModels checkModels = new CheckModels();
			checkModels.execute(project);
			// returns an SMM inputStream, which should be passed to the XML
			// parser

			// Add a measure to the current Java method
			// Read SMM file
			SMMModel smmModel = SMMParser.load(checkModels.checkoutSmm());
			EList<SMMElement> smmElements = smmModel.getSMMElement();

			// find measures (measurements have references to measurements)
			List<DirectMeasure> measures = new ArrayList<DirectMeasure>();
			DirectMeasure measure;
			for (SMMElement item : smmElements) {
				if (item instanceof DirectMeasure) {
					measure = (DirectMeasure) item;
					measures.add(measure);
					System.out.println("\t | Measure " + measure.getName() + " has "
							+ measure.getMeasurement().size() + " measurements");
					System.out.println("\t | The measurements are " + measure.getMeasurement());

				}
			}

		} finally {
			Thread.currentThread().setContextClassLoader(initialClassLoader);
		}
	}
}
