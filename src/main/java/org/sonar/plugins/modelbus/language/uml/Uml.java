/*
 * Sonar Erlang Plugin
 * Copyright (C) 2012 Tamás Kende
 * kende.tamas@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.plugins.modelbus.language.uml;

import java.util.Arrays;

import org.apache.commons.configuration.Configuration; 
import org.apache.commons.lang.StringUtils;
import org.sonar.api.resources.AbstractLanguage;
import org.sonar.plugins.modelbus.ModelBusPlugin;

public class Uml extends AbstractLanguage {
	public static final Uml INSTANCE = new Uml();
	private Configuration configuration;

	public Uml(){
		super(ModelBusPlugin.UML_KEY, ModelBusPlugin.UML_NAME);
	}
	
	public Uml(Configuration configuration) {
		super(ModelBusPlugin.UML_KEY, ModelBusPlugin.UML_NAME);
		this.configuration = configuration;
	}


	public void setConfiguration(Configuration configuration) {
	    this.configuration = configuration;
	  }
	
	public String[] getFileSuffixes() {
		String[] suffixes = configuration.getStringArray(ModelBusPlugin.FILE_SUFFIXES_KEY);
		if (suffixes == null || suffixes.length == 0) {
			suffixes = StringUtils.split(ModelBusPlugin.UML_KEY, ",");
		}
		System.err.println("suffices: "+Arrays.toString(suffixes));
		return suffixes;
	}

	public Configuration getConfiguration() {
		return configuration;
	}


}
