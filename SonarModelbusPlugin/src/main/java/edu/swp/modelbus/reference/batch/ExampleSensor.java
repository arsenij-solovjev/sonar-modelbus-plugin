package edu.swp.modelbus.reference.batch;

import edu.swp.modelbus.reference.ModelbusMetrics;
import edu.swp.modelbus.reference.ModelbusPlugin;

import org.sonar.api.batch.Sensor;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.config.Settings;
import org.sonar.api.measures.Measure;
import org.sonar.api.resources.Project;

public class ExampleSensor implements Sensor {

  private Settings settings;

  /**
   * Use of IoC to get Settings
   */
  public ExampleSensor(Settings settings) {
    this.settings = settings;
  }

  public boolean shouldExecuteOnProject(Project project) {
    // This sensor is executed on any type of projects
    return true;
  }

  public void analyse(Project project, SensorContext sensorContext) {
    Measure measure = new Measure(ModelbusMetrics.MESSAGE, settings.getString(ModelbusPlugin.MY_PROPERTY));
    sensorContext.saveMeasure(measure);
  }
}
