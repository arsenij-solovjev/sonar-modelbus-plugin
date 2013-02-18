package org.sonar.plugins.modelbus;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Metric;
import org.sonar.api.measures.Metrics;
import org.sonar.plugins.modelbus.adapter.ModelBusMetricsAdapter;
import org.sonar.plugins.modelbus.adapter.SmmModelAdapter;
import org.sonar.plugins.modelbus.metrinoclient.CheckModels;
import org.sonar.plugins.modelbus.smmparser.SMMModel;
import org.sonar.plugins.modelbus.smmparser.SMMParser;

public final class ModelBusMetrics implements Metrics {
	private static List<Metric> cachedMetrics;

	public static Map<String, Metric> CONF_MEASURE_NAME_TO_CORE_METRICS = new HashMap<String, Metric>();
	
	public static final String METRIC_DOMAIN = "Model";

	// define all metrics
	public static final Metric MESSAGE = new Metric.Builder("message_key", "Message",
			Metric.ValueType.STRING)
			.setDescription("This is a metric to store a well known message")
			.setDirection(Metric.DIRECTION_WORST).setQualitative(false)
			.setDomain(CoreMetrics.DOMAIN_GENERAL).create();

	public static final Metric RANDOM = new Metric.Builder("random", "Random",
			Metric.ValueType.FLOAT).setDescription("Random value")
			.setDirection(Metric.DIRECTION_BETTER).setQualitative(false)
			.setDomain(CoreMetrics.DOMAIN_GENERAL).create();

	public static final Metric COUNTCLASSES = new Metric.Builder("NumberOfClasses", "Count Classes",
			Metric.ValueType.INT).setDescription("Count number of classes")
			.setDirection(Metric.DIRECTION_BETTER).setQualitative(false)
			.setDomain(ModelBusMetrics.METRIC_DOMAIN).create();


	
	
	// getMetrics() method is defined in the Metrics interface and is used by
	// Sonar to retrieve the list of new metrics
	public List<Metric> getMetrics() {
		return getAllMetrics();
	}
	
	
	public static List<Metric> getAllMetrics() {
		if(cachedMetrics==null) {			
			HashMap<String, Metric> metricNameMap = new HashMap<String, Metric>();
			for(Metric m : getPredefinedMetrics()) {
				metricNameMap.put(m.getKey(), m);
			}
			for(Metric m : receiveMetrics()) {
				metricNameMap.put(m.getKey(), m);
			}
			
			cachedMetrics = new LinkedList<Metric>(metricNameMap.values());
		}
		return cachedMetrics;
	}
	
	private static Set<Metric> getPredefinedMetrics() {
		Set<Metric> out = new HashSet<Metric>();
		for (Field field : ModelBusMetrics.class.getDeclaredFields()) {
		    if (java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
				try {
					field.setAccessible(true);
					Object fieldStaticValue = field.get(null);
					
			    	if(fieldStaticValue instanceof Metric) {
			    		Metric m = ((Metric) fieldStaticValue);
				        out.add(m);
			    	}
				} catch (Exception e) {
					e.printStackTrace();
				}
		    }
		}
		return out;
	}
	
	
	private static Set<Metric> receiveMetrics() {
		Set<Metric> out = new ModelBusMetricsAdapter<Set<Metric>>(ModelBusMetrics.class) {
			@Override
			public Set<Metric> execute() {
				CheckModels checkModels = CheckModels.getInstance();
				SMMModel smmModel = SMMParser.load(checkModels.checkoutSmm());
				SmmModelAdapter smm = new SmmModelAdapter(smmModel);
				return smm.getMetrics();
			}
		}.start();
		return out != null ? out : new HashSet<Metric>();
	}
}
