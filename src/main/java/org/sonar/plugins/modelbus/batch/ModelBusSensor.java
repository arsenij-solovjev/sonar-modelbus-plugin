package org.sonar.plugins.modelbus.batch;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

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
import org.sonar.plugins.modelbus.xmlparser.SmmMeasurement;
import org.sonar.plugins.modelbus.xmlparser.SmmParser;

public class ModelBusSensor implements Sensor {

	public static final Logger LOG = LoggerFactory.getLogger(ModelBusSensor.class);

	
	public boolean shouldExecuteOnProject(Project project) {
		// This sensor is executed on any type of projects
		return true;
	}

	public void analyse(Project project, SensorContext sensorContext) {

		CheckModels checkModels = new CheckModels();
		checkModels.execute(project);
		// returns an SMM inputStream, which should be passed to the XML parser

		// Add a measure to the current Java method
		
		SmmParser parser = new SmmParser();
		parser.parse(checkModels.checkoutSmm());
		
		for(SmmMeasurement m : parser.measures){
			if(m.getName().equals("NumberOfClasses"))
				sensorContext.saveMeasure(ModelBusMetrics.COUNTCLASSES, m.getValue());
				
		}
		

	}
}
