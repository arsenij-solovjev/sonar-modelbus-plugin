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
import org.sonar.api.resources.Project;
import org.sonar.api.resources.Resource;
import org.sonar.api.resources.ResourceUtils;
import org.sonar.plugins.modelbus.language.uml.Uml;

/**
 * @since 1.12
 */
public class ExcludedResourceFilter implements ResourceFilter {
	private final Project project;

	public ExcludedResourceFilter(Project project) {
		this.project = project;
	}

	public boolean isIgnored(Resource resource) {
		if(resource.getLanguage() != null)
		if (resource.getLanguage().equals(Uml.class))
			return false;

		return true;
	}
}