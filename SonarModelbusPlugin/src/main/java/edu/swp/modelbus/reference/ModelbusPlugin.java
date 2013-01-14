package edu.swp.modelbus.reference;


import edu.swp.modelbus.reference.batch.ExampleSensor;
import edu.swp.modelbus.reference.batch.RandomDecorator;
import edu.swp.modelbus.reference.ui.ExampleFooter;
import edu.swp.modelbus.reference.ui.ExampleRubyWidget;

import org.sonar.api.Properties;
import org.sonar.api.Property;
import org.sonar.api.SonarPlugin;

import java.util.Arrays;
import java.util.List;

/**
 * This class is the entry point for all extensions
 */
@Properties({
  @Property(
    key = ModelbusPlugin.MY_PROPERTY,
    name = "Plugin Property",
    description = "A property for the plugin",
    defaultValue = "Hello World!")})
public final class ModelbusPlugin extends SonarPlugin {

  public static final String MY_PROPERTY = "sonar.example.myproperty";

  // This is where you're going to declare all your Sonar extensions
  public List getExtensions() {
    return Arrays.asList(
        // Definitions
        ModelbusMetrics.class,

        // Batch
        ExampleSensor.class, RandomDecorator.class,

        // UI
        ExampleFooter.class, ExampleRubyWidget.class);
  }
}
