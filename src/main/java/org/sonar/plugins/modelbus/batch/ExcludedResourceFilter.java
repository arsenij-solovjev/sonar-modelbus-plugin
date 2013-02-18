/*
 * Sonar, open source software quality management tool.
 * Copyright (C) 2008-2012 SonarSource
 * mailto:contact AT sonarsource DOT com
 *
 * Sonar is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * Sonar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Sonar; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02
 */
package org.sonar.plugins.modelbus.batch;

import org.sonar.api.batch.ResourceFilter;
import org.sonar.api.resources.Directory;
import org.sonar.api.resources.File;
import org.sonar.api.resources.Project;
import org.sonar.api.resources.Resource;
import org.sonar.plugins.modelbus.language.uml.Uml;

/**
 * @since 1.12
 */
public class ExcludedResourceFilter implements ResourceFilter {
	@SuppressWarnings("unused")
	private final Project project;

	public ExcludedResourceFilter(Project project) {
		this.project = project;
	}

	public boolean isIgnored(@SuppressWarnings("rawtypes") Resource resource) {
		System.out.println("1");
		return true;
	}
	
	public boolean isIgnored(Directory resource) {
		System.out.println("2");
		return false;
	}
	
	public boolean isIgnored(File resource) {
		System.out.println("3");
		return !(resource.getLanguage() instanceof Uml);
	}
}