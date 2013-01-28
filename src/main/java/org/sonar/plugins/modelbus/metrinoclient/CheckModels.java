package org.sonar.plugins.modelbus.metrinoclient;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.modelbus.core.lib.IRepositoryHelper;
import org.modelbus.core.lib.ModelBusCoreLib;
import org.modelbus.dosgi.repository.descriptor.InvalidRevisionException;
import org.modelbus.dosgi.repository.descriptor.NonExistingResourceException;
import org.modelbus.dosgi.repository.descriptor.Property;
import org.modelbus.dosgi.repository.descriptor.RepositoryAuthentificationException;
import org.modelbus.dosgi.repository.descriptor.RepositoryDirEntry;
import org.modelbus.dosgi.repository.descriptor.RepositoryNodeKind;
import org.modelbus.dosgi.repository.descriptor.RepositoryRuntimeException;
import org.modelbus.dosgi.repository.descriptor.Session;
import org.sonar.api.resources.Project;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckModels {
	Logger log = LoggerFactory.getLogger(getClass());
	private static final String UML_EXT = ".uml";
	private static final String SMM = "http://sonar-modelbus-plugin/src/main/resources/metrinostuff/SampleMetrics.smm";
	private Session session;
	private IRepositoryHelper repository;
	MetrinoSoapClient metrino;

	private void initSession() {
		session = new Session();
		session.setId(EcoreUtil.generateUUID());
		metrino = new MetrinoSoapClient();
		Property propertyUserName = new Property();
		propertyUserName.setKey("username");
		propertyUserName.setValue("Admin");
		Property propertyPassword = new Property();
		propertyPassword.setKey("password");
		propertyPassword.setValue("ModelBus");
		session.getProperties().add(propertyUserName);
		session.getProperties().add(propertyPassword);
		System.out.println("- modelbus session initialized");
	}

	private void initRepository() {
		repository = ModelBusCoreLib.getRepositoryHelper();
		System.out.println("- modelbus repository initialized");
	}

	private void traverseRepository(Project project) {
		try { // retrieve the root entry from the repository
			RepositoryDirEntry root = repository.getRoot(session);
			System.out.println("- reading root directory...");

			checkAllModels(root, project);
		} catch (Exception e) {
			reportError("An error occured while checking the models", e);
		}
	}

	public void checkAllModels(RepositoryDirEntry directory, Project project)
			throws RepositoryRuntimeException, RepositoryAuthentificationException, IOException,
			InvalidRevisionException, NonExistingResourceException {
		// retrieve the child entries from an repository
		// entry from the repository
		// (note that revision -1 corresponds to the latest revision)
		RepositoryDirEntry[] entries;
		if (project == null)
			entries = repository.getDirEntries(session, URI.createURI(directory.getUri()), -1L);
		else
			entries = repository.getDirEntries(session,
					URI.createURI(directory.getUri() + project.getArtifactId()), -1L);
		System.out.println("- visting directory '" + directory.getUri() + "'...");

		for (int i = 0; i < entries.length; i++) {
			RepositoryDirEntry entry = entries[i];
			if (entry.getKind().equals(RepositoryNodeKind.DIR)) {
				checkAllModels(entry, null);
			} else {
				String filename = entry.getName();
				if (filename.endsWith(UML_EXT)) {
					System.out.println("checking model '" + filename + "'...");
					metrino.ccheckModel(entry.getUri(), SMM);
					System.out.println("Entry URI: " + entry.getUri());
					System.out.println("Directory URI: " + directory.getUri());
				}
			}
		}
	}

	public InputStream checkoutSmm() {
		try {
			return repository.checkOutFile(session, URI.createURI(SMM), -1L);
		} catch (Exception e) {
			reportError("An error occured while checking out the SMM", e);
		}
		return null;
	}

	private void reportError(String message, Exception e) {
		log.error(message);
		log.error(e.getStackTrace().toString());
		e.printStackTrace();
	}

	public void execute(Project project) {
		initSession();
		initRepository();
		traverseRepository(project);
	}
}
