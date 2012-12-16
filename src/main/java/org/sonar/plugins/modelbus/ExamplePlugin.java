package org.sonar.plugins.modelbus;

import org.sonar.api.Properties;
import org.sonar.api.Property;
import org.sonar.api.SonarPlugin;
import org.sonar.plugins.modelbus.batch.ExampleSensor;
import org.sonar.plugins.modelbus.batch.ModelBusCheckout;
import org.sonar.plugins.modelbus.batch.RandomDecorator;
import org.sonar.plugins.modelbus.ui.ExampleFooter;
import org.sonar.plugins.modelbus.ui.ExampleRubyWidget;

import java.util.Arrays;
import java.util.List;

/**
 * This class is the entry point for all extensions
 */
@Properties({
    @Property(
        key = ExamplePlugin.MY_PROPERTY,
        name = "Plugin Property",
        description = "A property for the plugin")})
public final class ExamplePlugin extends SonarPlugin {

  public static final String MY_PROPERTY = "sonar.example.myproperty";

  // This is where you're going to declare all your Sonar extensions
  public List getExtensions() {
    return Arrays.asList(
        // Definitions
        ExampleMetrics.class,

        // Batch
        ExampleSensor.class, RandomDecorator.class,
        ModelBusCheckout.class,
        
        // UI
        ExampleFooter.class, ExampleRubyWidget.class);
  }
}