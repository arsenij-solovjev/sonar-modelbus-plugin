package org.sonar.plugins.modelbus;

import org.sonar.plugins.modelbus.smmadapter.SmmModelAdapter;

public class Resources {
	private static Resources instance;
	
	
	private SmmModelAdapter modelAdapter; 
	
	public static final String UML_EXT = ".uml";
	// TODO load SMM const from properties file
	public static final String SMM = "http://sonar-modelbus-plugin/model/MetricsUml2.3.smm";

	
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
