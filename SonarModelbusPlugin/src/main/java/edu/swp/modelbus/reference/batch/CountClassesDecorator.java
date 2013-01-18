package edu.swp.modelbus.reference.batch;

/**
 * 
 * @deprecated use ServicePostJob
 * 
 */

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.swp.modelbus.reference.ModelbusMetrics;
import edu.swp.modelbus.reference.SMMParser.SMMParserHandler;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.sonar.api.batch.Decorator;
import org.sonar.api.batch.DecoratorContext;
import org.sonar.api.measures.MeasureUtils;
import org.sonar.api.resources.Java;
import org.sonar.api.resources.Project;
import org.sonar.api.resources.Resource;
import org.sonar.api.resources.Scopes;
import org.xml.sax.SAXException;

public class CountClassesDecorator implements Decorator {
  public static final Logger LOG = LoggerFactory.getLogger(CountClassesDecorator.class);
  
  String baseDirPath;
  String modelPath;
  
  public boolean shouldExecuteOnProject(Project project) {
	  LOG.info("Testlog in CountClassesDecorator");
	  
	  baseDirPath = project.getFileSystem().getBasedir().getAbsolutePath();
  	  modelPath = baseDirPath + ModelbusPluginConst.MODEL_PATH;
  	  
  	  LOG.info("baseDirPath: " + baseDirPath);
  	  LOG.info("Modelpath: " + modelPath);
	  
	//execute on all until we get the right language code
	return true;  
  }

  public void decorate(Resource resource, DecoratorContext context) {
    // This method is executed on the whole tree of resources.
    // Bottom-up navigation : Java methods -> Java classes -> files -> packages -> modules -> project
//    if (Scopes.isBlockUnit(resource)) {
    	
   
  	  /**
  	   * TODO:
  	   * -check kind of resource to make sure its possible to request metrino
  	   * -request metrino
  	   * -save smm in models
  	   * -read this specifiy file and parse the result like in the example
  	   * -outsource this to minimize decorator code
  	   */
  		try {

  			// create SAX parser
  			SAXParserFactory factory = SAXParserFactory.newInstance();
  			SAXParser saxParser = factory.newSAXParser();

  			// call parser handler
  			SMMParserHandler handler = new SMMParserHandler();
  			saxParser.parse(new File(modelPath+"SampleMetrics.smm"), handler);
  			
  			LOG.info("PARSER Result: " + handler.exampleResultString);
  			LOG.info("ID Number of classes: " + handler.numberOfClassesId);
  			LOG.info("Number of classes: " + handler.numberOfClasses);

	      // Add a measure to the current Java method
	      context.saveMeasure(ModelbusMetrics.COUNTCLASSES, (double) handler.numberOfClasses);
	      
  		} catch (ParserConfigurationException e) {
  			System.out.println("ParserConfigurationException");
  			e.printStackTrace();
  		} catch (SAXException e) {
  			System.out.println("SAXException");
  			e.printStackTrace();
  		} catch (IOException e) {
  			System.out.println("IOException");
  			e.printStackTrace();
  		}

//    } else {
//      // we sum random values on resources different than method
//      context.saveMeasure(ModelbusMetrics.COUNTCLASSES, MeasureUtils.sum(true, context.getChildrenMeasures(ModelbusMetrics.COUNTCLASSES)));
//    }
	  
	  //computeCountClasses(resource, context);

  }
  
  
}