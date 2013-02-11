package org.sonar.plugins.modelbus;

import org.sonar.api.Properties;
import org.sonar.api.Property;
import org.sonar.api.SonarPlugin;
import org.sonar.plugins.modelbus.batch.CountClassesDecorator;
import org.sonar.plugins.modelbus.batch.ExcludedResourceFilter;
import org.sonar.plugins.modelbus.batch.ModelBusSensor;
import org.sonar.plugins.modelbus.batch.UmlSourceImporter;
import org.sonar.plugins.modelbus.language.uml.Uml;
import org.sonar.plugins.modelbus.ui.ExampleFooter;
import org.sonar.plugins.modelbus.ui.ModelBusWidget;

import java.util.Arrays;
import java.util.List;



/**
 * This class is the entry point for all extensions
 */
@Properties({ 
	@Property(key = ModelBusPlugin.MY_PROPERTY, name = "Modelbus Plugin", description = "Modelbus and Metrino Connector", defaultValue = "Hello World!") ,
@Property(key = ModelBusPlugin.FILE_SUFFIXES_KEY, defaultValue = ModelBusPlugin.UML_KEY, name = "File suffixes", description = "Comma-separated list of suffixes for files to analyze. To not filter, leave the list empty.", global = true, project = true),

	
})
public final class ModelBusPlugin extends SonarPlugin {


public static final String FILE_SUFFIXES_KEY = "sonar.modelbus.file.suffixes";
	public static final String MY_PROPERTY = "sonar.example.myproperty";
	public static final String UML_KEY= "uml";
	public static final String UML_NAME= "Uml";
	public static final String[] UML_SUFFIXES= {"uml"};

	// This is where you're going to declare all your Sonar extensions
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List getExtensions() {
		return Arrays.asList(
		// Definitions
				ModelBusMetrics.class, Uml.class,
				// // Batch
				UmlSourceImporter.class, 
				ModelBusSensor.class, 
				CountClassesDecorator.class,
				ExcludedResourceFilter.class,
				ModelBusDefaultProfile.class,
				// // UI
				ExampleFooter.class, ModelBusWidget.class);

	}
}
