package org.sonar.plugins.modelbus;

import org.sonar.api.Properties;
import org.sonar.api.Property;
import org.sonar.api.SonarPlugin;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Metric;
import org.sonar.plugins.modelbus.adapter.ClassLoaderAdapter;
import org.sonar.plugins.modelbus.batch.CountClassesDecorator;
import org.sonar.plugins.modelbus.batch.ExcludedResourceFilter;
import org.sonar.plugins.modelbus.batch.ModelBusPluginConst;
import org.sonar.plugins.modelbus.batch.ModelBusSensor;
import org.sonar.plugins.modelbus.batch.UmlSourceImporter;
import org.sonar.plugins.modelbus.language.uml.Uml;
import org.sonar.plugins.modelbus.ui.ExampleFooter;
import org.sonar.plugins.modelbus.ui.ModelBusWidget;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



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
	public static final String PROPERTY_CORE_METRIC_PREFIX = "CoreMetric.";
	public static final String[] UML_SUFFIXES= {"uml"};

	public ModelBusPlugin() {
		super();
		initConfiguration();
	}
	
	private void initConfiguration() {
		ModelBusMetrics.CONF_MEASURE_NAME_TO_CORE_METRICS = new ClassLoaderAdapter<Map<String, Metric>>(getClass()) {
			@Override
			public Map<String, Metric> execute() throws Exception {
		   		//load a properties file
	    		java.util.Properties prop = new java.util.Properties();
	    		prop.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
	    		
	    		// set constants
	    		ModelBusPluginConst.MODEL_PATH	= prop.getProperty("MODEL_PATH",	ModelBusPluginConst.MODEL_PATH);
	    		Resources.SMM					= prop.getProperty("SMM",			Resources.SMM);
	    		Resources.UML_EXT				= prop.getProperty("UML_EXT",		Resources.UML_EXT);

	    		// set core metrics mapping
	    		Map<String, Metric> metricMap = new HashMap<String, Metric>();
	    		for(Object key : prop.keySet()) {
	    			Object val = prop.get(key);
	    			if(val!=null && !val.equals("") && key.toString().startsWith(PROPERTY_CORE_METRIC_PREFIX)) {
	    				String keyName = key.toString().substring(PROPERTY_CORE_METRIC_PREFIX.length());
	    				try {
	    					Field f = CoreMetrics.class.getDeclaredField(keyName);
		    				if(f != null) {
		    					Object metricRaw = f.get(null);
		    					if(metricRaw!=null && metricRaw instanceof Metric) {
		    						metricMap.put(val.toString(), (Metric) metricRaw);
		    					}
		    				}
	    				}
	    				catch(Exception e) {
	    					System.out.println("Could not find or initate declared core metric \""+keyName+"\".");
	    				}
	    			}
	    		}
	        	System.out.println("Cached core metrics: "+metricMap);
	    		return metricMap;
			}
			@Override
			public void error(Exception e) {
				System.err.println("Could not get configuration file. Default values will be used: They might be wrong!");
			}
		}.start();
	}
	
	
	
	
	// This is where you're going to declare all your Sonar extensions
	public List<?> getExtensions() {
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
