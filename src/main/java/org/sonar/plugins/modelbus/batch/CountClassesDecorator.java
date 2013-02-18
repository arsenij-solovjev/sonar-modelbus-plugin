package org.sonar.plugins.modelbus.batch;

/**
 *
 * @deprecated use ServicePostJob
 *
 */

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.sonar.api.batch.Decorator;
import org.sonar.api.batch.DecoratorContext;
import org.sonar.api.measures.Metric;
import org.sonar.api.resources.Project;
import org.sonar.api.resources.Resource;
import org.sonar.api.resources.Language;

import org.sonar.api.resources.ResourceUtils;
import org.sonar.plugins.modelbus.Resources;
import org.sonar.plugins.modelbus.adapter.ConfigurableProjectAdapter;
import org.sonar.plugins.modelbus.adapter.SmmModelAdapter;
import org.sonar.plugins.modelbus.language.uml.Uml;

public class CountClassesDecorator extends ConfigurableProjectAdapter implements Decorator {
	public static final Logger LOG = LoggerFactory.getLogger(CountClassesDecorator.class);

	String baseDirPath;
	String modelPath;

	public boolean shouldExecuteOnProject(Project project) {
		LOG.info("Checking project \""+project+"\" for execution.");
		

		baseDirPath = project.getFileSystem().getBasedir().getAbsolutePath();
		modelPath = baseDirPath + ModelBusPluginConst.MODEL_PATH;

		LOG.info("baseDirPath: " + baseDirPath);
		LOG.info("Modelpath: " + modelPath);

		// execute on all until we get the right language code
		return true;
	}

	public void decorate(@SuppressWarnings("rawtypes") Resource resource, DecoratorContext context) {
		super.configure(context.getProject(), getClass());
		
		LOG.debug("decorating resource "+resource+" (" +resource.getLongName()+")");
		
		if (ResourceUtils.isFile(resource)) {
			 
			Language language = resource.getLanguage();
			if (language instanceof Uml) {
				Resources resources = Resources.getInstance();
					SmmModelAdapter smm = resources.getModel();
					if(smm!=null) {
						Map<Metric, Double> measurements = smm.getMeasurements(resource);
						
						if(measurements!=null) {
							for (Metric m : measurements.keySet()) {
								try {
									context.saveMeasure(m, measurements.get(m));
								}
								catch(Exception e) {
									LOG.warn("Could not save measure \""+m+"\" for resource \""+resource.getName()+"\": "+e.getMessage());
								}
							}
						}
						else {
							LOG.warn("Could not get any SMM measurements for resource \""+resource.getName()+"\".");
						}
					}
					else {
						LOG.error("Could not get SMM file.");
					}
			}
		}

	}

}