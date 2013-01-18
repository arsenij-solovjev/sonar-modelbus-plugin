package edu.swp.modelbus.reference.batch;

import edu.swp.modelbus.reference.ModelbusMetrics;
import edu.swp.modelbus.reference.ModelbusPlugin;

import org.sonar.api.batch.Sensor;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.config.Settings;
import org.sonar.api.measures.Measure;
import org.sonar.api.resources.Project;

public class CountClassesSensor implements Sensor {
	
  
	private Settings settings;

  /**
   * Use of IoC to get Settings
   */
  public CountClassesSensor(Settings settings) {
    this.settings = settings;
  }

  public boolean shouldExecuteOnProject(Project project) {
    // This sensor is executed on any type of projects
    return true;
  }

  public void analyse(Project project, SensorContext sensorContext) {
	  
	//parse and analyse smm data
	analyseSMM(project);
	  
    Measure measure = new Measure(ModelbusMetrics.COUNTCLASSES, settings.getString(ModelbusPlugin.MY_PROPERTY));
    sensorContext.saveMeasure(measure);
  }
  
  /**
   * SMM files a stored in a special fold so just analyse them and use the parser to filter the results
   * @param project
   */
  private void analyseSMM(Project project) {
	  
	  
  }
}
