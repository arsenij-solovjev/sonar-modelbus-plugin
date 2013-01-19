package org.sonar.plugins.modelbus.batch;

import java.io.IOException;

import org.modelbus.dosgi.repository.descriptor.NonExistingResourceException;
import org.modelbus.dosgi.repository.descriptor.RepositoryAuthentificationException;
import org.sonar.api.batch.Sensor;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.measures.Measure;
import org.sonar.api.resources.Project;
import org.sonar.plugins.modelbus.ExampleMetrics;
import org.sonar.plugins.modelbus.metrinoclient.CheckModels;

public class ModelBusSensor implements Sensor {

  public boolean shouldExecuteOnProject(Project project) {
    // This sensor is executed on any type of projects
    return true;
  }

  public void analyse(Project project, SensorContext sensorContext) {
    Measure measure = new Measure(ExampleMetrics.MESSAGE, "Hello World!");
    sensorContext.saveMeasure(measure);
    
    CheckModels checkModels = new CheckModels();
    checkModels.execute(project);
    //returns an SMM inputStream, which should be passed to the XML parser
    checkModels.checkoutSmm();
	
  }
}
