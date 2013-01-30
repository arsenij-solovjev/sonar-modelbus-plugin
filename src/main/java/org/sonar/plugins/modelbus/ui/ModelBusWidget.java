package org.sonar.plugins.modelbus.ui;

import org.sonar.api.web.*;

@UserRole(UserRole.USER)
@Description("Show ModelBus metrics")
@WidgetCategory("Sample")
@WidgetProperties({
    @WidgetProperty(key = "param1",
        description = "This is a mandatory parameter",
        optional = false
    ),
    @WidgetProperty(key = "max",
        description = "max threshold",
        type = WidgetPropertyType.INTEGER,
        defaultValue = "80"
    ),
    @WidgetProperty(key = "param2",
        description = "This is an optional parameter"
    ),
    @WidgetProperty(key = "floatprop",
        description = "test description"
    )
})
public class ModelBusWidget extends AbstractRubyTemplate implements RubyRailsWidget {

  public String getId() {
    return "modelbus";
  }

  public String getTitle() {
    return "ModelBus metrics";
  }

  @Override
  protected String getTemplatePath() {
    return "/widgets/main.html.erb";
  }
}