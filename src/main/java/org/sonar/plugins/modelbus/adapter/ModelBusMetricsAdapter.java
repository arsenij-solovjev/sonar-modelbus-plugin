package org.sonar.plugins.modelbus.adapter;

import org.apache.log4j.Logger;

public abstract class ModelBusMetricsAdapter<T> {


	private Class<?> cl;

	public ModelBusMetricsAdapter(Class<?> cl) {
		this.cl = cl;
	}

	
	public abstract T execute() throws Exception;
	
	public T start() {
		// HACK: context classloader must be overwritten with the plugin
		// classloader (otherwise modelbus fails on initialization)
		ClassLoader initialClassLoader = Thread.currentThread().getContextClassLoader();
		T out = null;
		try {
			Thread.currentThread().setContextClassLoader(cl.getClassLoader());
			out = execute();
		} catch (Exception e){
			error(e);
		}
		
		finally {
			Thread.currentThread().setContextClassLoader(initialClassLoader);
		}
		return out;
	}
	
	public void error(Exception e) {
		Logger.getLogger(cl).error("Classloader adapter wrapper error on "+cl, e);
	}
	
}
