package edu.swp.modelbus.reference.batch;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.batch.CheckProject;
import org.sonar.api.batch.PostJob;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.resources.Project;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import edu.swp.modelbus.reference.SMMParser.SMMParserHandler;



public class ServicePostJob implements PostJob, CheckProject {

	public static final Logger LOG = LoggerFactory.getLogger(ServicePostJob.class);


  public boolean shouldExecuteOnProject(Project project) {
    return true;
  }

  public void executeOn(Project project, SensorContext context) {

    // this sensor is executed if no config defined on sonar server
    LOG.debug("START XML Parser");

    parseSSMFiles(project, context);

    LOG.debug("END XML Parser");
  }

  /**
   * Parse for ssm files and get the values
   * @param project
   * @param context
   */
  protected  void parseSSMFiles(Project project, SensorContext context) {
	  String baseDirPath = project.getFileSystem().getBasedir().getAbsolutePath();
	  String modelPath = baseDirPath + ModelbusPluginConst.MODEL_PATH;
	  
	  LOG.info("baseDirPath: " + baseDirPath);
	  LOG.info("Modelpath: " + modelPath);
	  
		try {

			// create SAX parser
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();

			// call parser handler
			SMMParserHandler handler = new SMMParserHandler();
			saxParser.parse(new File(modelPath+"SampleMetrics.smm"), handler);
			
			LOG.info("PARSER Result: " + handler.exampleResultString);

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
	  
  }
  
  
//  /**
//   * Gets the generated jtl file path, if it was any generated
//   */
//  protected String getJtlFilePath(Project project, String innerProjectJMeterReportsPath) {
//    String baseDirPath = project.getFileSystem().getBasedir().getAbsolutePath();
//    File reportDir = new File(baseDirPath + innerProjectJMeterReportsPath);
//    
//    if (reportDir.exists()) {
//      for (File file : (Collection<File>) FileUtils.listFiles(reportDir, new String[] { "jtl" }, true)) {
//        return file.getAbsolutePath();
//      }
//  
//      for (File file : (Collection<File>) FileUtils.listFiles(reportDir, new String[] { "xml" }, true)) {
//        return file.getAbsolutePath();
//      }
//    }
//    return null;
//  }
//
//  /**
//   * Gets the GlobalSummary from jtl file in target/jmeter-reports
//   */
//  protected GlobalSummary getGlobalSummaryFromLocalJTL(Project project) {
//    GlobalSummary globalSummary = null;
//    String projectName = project.getName();
//    
//    final String jtlPaths[] = new String[] { "/target/jmeter/results", "/target/jmeter-reports" };
//    for (String innerPath : jtlPaths) {
//      String jtlPath = getJtlFilePath(project, innerPath);
//      if (jtlPath == null) {
//        LOG.info("No JTL files found in "+innerPath);
//      } else {
//        // Get report parsing jtl file
//        LOG.info("Getting JMeter results from "+jtlPath);
//        ConfigInfo configInfo = new ConfigInfo(jtlPath);
//        configService.setTestConfigInfo(projectName, configInfo);
//        globalSummary = metricService.getGlobalSummary(projectName);
//        LOG.debug("JMeter GlobalSummary:\n"+globalSummary);
//        return globalSummary;
//      }
//    }
//    
//    return globalSummary;
//  }
//  
}