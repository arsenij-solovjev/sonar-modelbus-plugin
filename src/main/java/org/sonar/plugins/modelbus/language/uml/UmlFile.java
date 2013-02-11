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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.sonar.api.resources.InputFile;
import org.sonar.api.resources.Language;
import org.sonar.api.resources.Qualifiers;
import org.sonar.api.resources.Resource;
import org.sonar.api.resources.Scopes;
import org.sonar.api.utils.WildcardPattern;

/**
 * This class implements a Erlang source file for Sonar.
 *
 * @since 0.1
 */
public class UmlFile extends Resource<UmlDirectory> {

  private final String filename;
  private final String longName;
  private final UmlDirectory parent;
  //private List<ErlangFunction> functions = new ArrayList<ErlangFunction>(); 

  public UmlFile(String packageKey, String className) {
    super();
    filename = className.trim();

    String key;
    String pKey;
    if (StringUtils.isBlank(packageKey)) {
      pKey = UmlDirectory.DEFAULT_PACKAGE_NAME;
      key = new StringBuilder().append(pKey).append(".").append(this.filename).toString();
      longName = filename;
    } else {
      pKey = packageKey.trim();
      key = new StringBuilder().append(pKey).append(".").append(this.filename).toString();
      longName = key;
    }
    parent = new UmlDirectory(pKey);
    setKey(key);
  }

  @Override
  public String getName() {
    return filename;
  }

  @Override
  public String getLongName() {
    return longName;
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
    return Scopes.FILE;
  }

  @Override
  public String getQualifier() {
    return Qualifiers.FILE;
  }

  @Override
  public UmlDirectory getParent() {
    return parent;
  }

  public String getFilename() {
	return filename;
}

@Override
  public boolean matchFilePattern(String antPattern) {
    final String patternWithoutFileSuffix = StringUtils.substringBeforeLast(antPattern, ".");
    final WildcardPattern matcher = WildcardPattern.create(patternWithoutFileSuffix, ".");
    return matcher.match(getKey());
  }


  /**
   * Shortcut for {@link #fromInputFile(InputFile, boolean)} for source files.
   */
  public static UmlFile fromInputFile(InputFile inputFile) {
    return UmlFile.fromInputFile(inputFile, false);
  }

  /**
   * Creates a {@link UmlFile} from a file in the source directories.
   *
   * @param inputFile the file object with relative path
   * @param isUnitTest whether it is a unit test file or a source file
   * @return the {@link UmlFile} created if exists, null otherwise
   */
  public static UmlFile fromInputFile(InputFile inputFile, boolean isUnitTest) {
    if (inputFile == null || inputFile.getFile() == null || inputFile.getRelativePath() == null) {
      return null;
    }
    final String packageName = "package";
    final String className = resolveClassName(inputFile);
    return new UmlFile(packageName, className);
  }

  private static String resolveClassName(InputFile inputFile) {
    String classname = inputFile.getRelativePath();
    if (inputFile.getRelativePath().indexOf('/') >= 0) {
      classname = StringUtils.substringAfterLast(inputFile.getRelativePath(), "/");
    }
    return StringUtils.substringBeforeLast(classname, ".");
  }
}