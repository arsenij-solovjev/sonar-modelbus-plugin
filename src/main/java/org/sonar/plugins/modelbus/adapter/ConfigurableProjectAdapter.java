package org.sonar.plugins.modelbus.adapter;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Metric;
import org.sonar.api.resources.Project;
import org.sonar.plugins.modelbus.Resources;
import org.sonar.plugins.modelbus.batch.ModelBusPluginConst;

public class ConfigurableProjectAdapter {
	private static final Logger log = Logger.getLogger(ConfigurableProjectAdapter.class);

	public static final String PROPERTY_CORE_METRIC_PREFIX = "CoreMetrics.";
		
		
	private static HashMap<Project, Properties> projectConfigurationMap = new HashMap<Project, Properties>();
	
	public void configure(Project project, Class<?> cl) {
		log.info("Checking project \""+project+"\" for configuration.");

		Properties props = projectConfigurationMap.get(project);
		if(props==null) {
			props = loadProperties(project, cl);
			projectConfigurationMap.put(project, props);
		}
		if(props!=null) {
			handleProperties(props);
		}
		else {
			log.error("Could not load configuration properties for project \""+project+"\"");
		}
	}

	

	private void handleProperties(Properties prop) {
		log.info("Opening configuration properties \""+prop+"\" with "+prop.size()+" entries.");
		
		// set constants
		ModelBusPluginConst.MODEL_PATH	= prop.getProperty("MODEL_PATH",	ModelBusPluginConst.MODEL_PATH);
		Resources.SMM					= prop.getProperty("SMM",			Resources.SMM);
		Resources.UML_EXT				= prop.getProperty("UML_EXT",		Resources.UML_EXT);
		
		log.debug("set configuration for MODEL_PATH: "+prop.getProperty("MODEL_PATH"));
		log.debug("set configuration for SMM: "+prop.getProperty("SMM"));
		log.debug("set configuration for UML_EXT: "+prop.getProperty("UML_EXT"));
		
		// set core metrics mapping
		Map<String, Metric> metricMap = new HashMap<String, Metric>();
		for(String key : prop.stringPropertyNames()) {
			String val = prop.getProperty(key);
			log.debug("Looking for configuration key \""+key+"\" => \""+val+"\".");
			if(val!=null && !val.equals("") && key.startsWith(PROPERTY_CORE_METRIC_PREFIX)) {
				String keyName = key.substring(PROPERTY_CORE_METRIC_PREFIX.length());
				try {
					Field f = CoreMetrics.class.getDeclaredField(keyName);
					log.debug("Found \""+PROPERTY_CORE_METRIC_PREFIX+"\"-property for \""+keyName+"\" for corresponding field \""+f+"\".");
    				if(f != null) {
    					f.setAccessible(true);
    					Object metricRaw = f.get(null);
    					if(metricRaw!=null && metricRaw instanceof Metric) {
    						metricMap.put(val, (Metric) metricRaw);
    					}
    				}
				}
				catch(Exception e) {
					log.warn("Could not find or initate declared core metric \""+keyName+"\".", e);
				}
			}
		}
    	log.info("Set "+metricMap.size()+" core metrics.");
	}



	private Properties loadProperties(final Project project, Class<?> cl) {
		String baseDirPath = project.getFileSystem().getBasedir().getAbsolutePath();
		final File f = new File(baseDirPath, "plugin.sonarbus.properties");
		
		return new ModelBusMetricsAdapter<Properties>(cl) {
			@Override
			public Properties execute() throws Exception {
	    		Properties prop = new Properties();
	    		prop.load(new FileReader(f));
	    		log.info("Opened configuration properties file \""+f+"\" with "+prop.size()+" entries.");
	    		return prop;
			}
			@Override
			public void error(Exception e) {
				log.error("Could not get configuration file \""+f+". Default values will be used: They might be wrong!", e);
			}
		}.start();
	}

}
