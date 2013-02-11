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
package org.sonar.plugins.modelbus;

import org.sonar.api.profiles.ProfileDefinition;
import org.sonar.api.profiles.RulesProfile;
import org.sonar.api.profiles.XMLProfileParser;
import org.sonar.api.utils.ValidationMessages;

public class ModelBusDefaultProfile extends ProfileDefinition {
  private XMLProfileParser xmlProfileParser;

  public ModelBusDefaultProfile(XMLProfileParser xmlProfileParser) {
    this.xmlProfileParser = xmlProfileParser;
  }

  @Override
  public RulesProfile createProfile(ValidationMessages messages) {
	RulesProfile profile = new RulesProfile();
	profile.setName("ModelBus Quality Profile");
	profile.setLanguage("uml");
	 
    return profile;
//    xmlProfileParser.parseResource(getClass().getClassLoader(),
//                                          "org/sonar/plugins/erlang/profile-default.xml", messages);
  }
}
