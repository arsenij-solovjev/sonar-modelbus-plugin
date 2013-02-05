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

import org.apache.commons.lang.StringUtils;
import org.sonar.api.resources.Language;
import org.sonar.api.resources.Qualifiers;
import org.sonar.api.resources.Resource;
import org.sonar.api.resources.Scopes;
import org.sonar.api.utils.WildcardPattern;

/**
 * This class implements a logical Erlang package.
 *
 * @since 0.1
 */
@SuppressWarnings("rawtypes")
public class UmlDirectory extends Resource {

  public static final String DEFAULT_PACKAGE_NAME = "[default]";
  
  public UmlDirectory() {
    this(null);
  }

  public UmlDirectory(String key) {
    super();
    setKey(StringUtils.defaultIfEmpty(StringUtils.trim(key), DEFAULT_PACKAGE_NAME));
  }

  @Override
  public String getName() {
    return getKey();
  }

  @Override
  public String getLongName() {
    return getKey();
  }

  @Override
  public String getDescription() {
    return "";
  }

  @Override
  public Language getLanguage() {
    return Uml.INSTANCE;
  }

  @Override
  public String getScope() {
    return Scopes.DIRECTORY;
  }

  @Override
  public String getQualifier() {
    return Qualifiers.PACKAGE;
  }

  @Override
  public Resource getParent() {
    return null;
  }

  @Override
  public boolean matchFilePattern(String antPattern) {
    String patternWithoutFileSuffix = StringUtils.substringBeforeLast(antPattern, ".");
    WildcardPattern matcher = WildcardPattern.create(patternWithoutFileSuffix, ".");
    return matcher.match(getKey());
  }
}