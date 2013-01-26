package org.sonar.plugins.modelbus;




import org.sonar.api.Properties;
import org.sonar.api.Property;
import org.sonar.api.SonarPlugin;
import org.sonar.plugins.modelbus.batch.CountClassesDecorator;
import org.sonar.plugins.modelbus.batch.ModelBusSensor;
import org.sonar.plugins.modelbus.ui.ExampleFooter;
import org.sonar.plugins.modelbus.ui.ExampleRubyWidget;

import java.util.Arrays;
import java.util.List;

/**
 * This class is the entry point for all extensions
 */
@Properties({ 
  @Property(
    key = ModelBusPlugin.MY_PROPERTY,
    name = "Modelbus Plugin",
    description = "Modelbus and Metrino Connector",
    defaultValue = "Hello World!")})
public final class ModelBusPlugin extends SonarPlugin {

  public static final String MY_PROPERTY = "sonar.example.myproperty";

  // This is where you're going to declare all your Sonar extensions
  public List getExtensions() {
    return Arrays.asList(
        // Definitions 
        ModelBusMetrics.class,

        // Batch
        ModelBusSensor.class,
        CountClassesDecorator.class,
        // UI
        ExampleFooter.class, ExampleRubyWidget.class);
  }
}
