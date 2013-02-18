package org.sonar.plugins.modelbus.batch;

import java.io.IOException; 
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.sonar.api.batch.AbstractSourceImporter;
import org.sonar.api.batch.Phase;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.resources.InputFile;
import org.sonar.api.resources.Project;
import org.sonar.api.resources.ProjectFileSystem;
import org.sonar.plugins.modelbus.ModelBusPlugin;
import org.sonar.plugins.modelbus.language.uml.Uml;
import org.sonar.plugins.modelbus.language.uml.UmlFile;

@Phase(name = Phase.Name.PRE)
public class UmlSourceImporter extends AbstractSourceImporter {

	public UmlSourceImporter(Uml uml) {
		super(uml);
	}

	@Override
	public boolean shouldExecuteOnProject(Project project) {
		
		return true; //getLanguage().equals(project.getLanguage());
	}
	
	@Override
	protected boolean isEnabled(Project project) {
		return true;
//	    return project.getConfiguration().getBoolean(CoreProperties.CORE_IMPORT_SOURCES_PROPERTY,
//	        CoreProperties.CORE_IMPORT_SOURCES_DEFAULT_VALUE);
	  }
	
	@Override
	protected void analyse(ProjectFileSystem fileSystem, SensorContext context) {
		List<InputFile> mainFiles = fileSystem.mainFiles(ModelBusPlugin.UML_KEY);
		 String charset = fileSystem.getSourceCharset().toString();

		for(InputFile file:mainFiles){
			addFileToSonar(context, file, charset);
		}
		
//		parseDirs(context, InputFileUtils.toFiles(mainFiles),
//				fileSystem.getSourceDirs(), false, fileSystem.getSourceCharset());
	}

	 private void addFileToSonar(SensorContext sensorContext, InputFile inputFile, String charset) {
		    try {
		      String source = FileUtils.readFileToString(inputFile.getFile(), charset);
		      UmlFile resource = UmlFile.fromInputFile(inputFile);

		      sensorContext.index(resource);
		      sensorContext.saveSource(resource, source);
		      
		    
		    } catch (IOException ioe) {
		    	ioe.printStackTrace();
		    //  LOGGER.error("Could not read the file: " + inputFile.getFile().getAbsolutePath(), ioe);
		    }
		  }
	
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

}