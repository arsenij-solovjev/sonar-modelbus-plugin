package edu.swp.modelbus.reference.batch;

/**
 * 
 * @deprecated use ServicePostJob
 * 
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.swp.modelbus.reference.ModelbusMetrics;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.sonar.api.batch.Decorator;
import org.sonar.api.batch.DecoratorContext;
import org.sonar.api.measures.MeasureUtils;
import org.sonar.api.resources.Java;
import org.sonar.api.resources.Project;
import org.sonar.api.resources.Resource;
import org.sonar.api.resources.Scopes;

public class CountClassesDecorator implements Decorator {
  public static final Logger LOG = LoggerFactory.getLogger(CountClassesSensor.class);
  
  public boolean shouldExecuteOnProject(Project project) {
	  LOG.info("Testlog in CountClassesDecorator");
	  
	
	  
	//execute on all until we get the right language code
	return true;  
  }

  public void decorate(Resource resource, DecoratorContext context) {
    // This method is executed on the whole tree of resources.
    // Bottom-up navigation : Java methods -> Java classes -> files -> packages -> modules -> project
    if (Scopes.isBlockUnit(resource)) {
    	
        
    	
      // Sonar API includes many libraries like commons-lang and google-collections
      int value = 10;

      // Add a measure to the current Java method
      context.saveMeasure(ModelbusMetrics.COUNTCLASSES, (double) value);

    } else {
      // we sum random values on resources different than method
      context.saveMeasure(ModelbusMetrics.COUNTCLASSES, MeasureUtils.sum(true, context.getChildrenMeasures(ModelbusMetrics.COUNTCLASSES)));
    }
	  
	  //computeCountClasses(resource, context);

  }
  
  private void computeCountClasses(Resource resource, DecoratorContext context) {
	  
  }
  
}