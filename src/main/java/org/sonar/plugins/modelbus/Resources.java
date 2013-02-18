package org.sonar.plugins.modelbus;

import org.sonar.plugins.modelbus.adapter.SmmModelAdapter;

public class Resources {
	private static Resources instance;
	
	
	private SmmModelAdapter modelAdapter; 
	
	public static String UML_EXT = ".uml";
	public static String SMM = "http://sonar-modelbus-plugin/model/MetricsUml2.3.smm";

	
	public static Resources getInstance(){
		if (instance == null){
			instance = new Resources();
		}
		return instance;
			
	}

	public SmmModelAdapter getModel() {
		return modelAdapter;
	}

	public void setModel(SmmModelAdapter modelAdapter) {
		this.modelAdapter = modelAdapter;
	}
}
