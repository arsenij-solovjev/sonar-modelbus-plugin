package org.sonar.plugins.modelbus.batch;

import java.io.File;
import java.io.IOException;
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
import org.sonar.api.batch.Initializer;
import org.sonar.api.resources.Project;
import org.sonar.plugins.modelbus.CustomClassLoader;

public class ModelBusCheckout extends Initializer {	
	private static final String BASE_DIRECTORY = "MODELBUS";
	  
	private Session session;
	private IRepositoryHelper repository;
	  
	private void InitSession()
	{
	    session = new Session();
	    session.setId(EcoreUtil.generateUUID());
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
	  
	private void InitRepository()
	{
	    repository = ModelBusCoreLib.getRepositoryHelper();
	    System.out.println("- modelbus repository initialized");
	}

	private void TraverseRepository()
	{
	    try { // retrieve the root entry from the repository
	      RepositoryDirEntry root = repository.getRoot(session);
		  System.out.println("- reading root directory...");
	      CheckOutDirectory(BASE_DIRECTORY, root);
	    } catch (Exception e) {
	    	System.out.println(e.getMessage());
	    	e.printStackTrace();
	    	throw new RuntimeException(e);
	    }
	}
	  
	public void CheckOutDirectory(String path, RepositoryDirEntry directory)
	      throws RepositoryRuntimeException, RepositoryAuthentificationException, InvalidRevisionException, NonExistingResourceException, IOException 
	{
	    // retrieve the child entries from an repository
	    // entry from the repository
	    // (note that revision -1 corresponds to the latest revision)
	    RepositoryDirEntry[] entries = repository.getDirEntries(session, URI.createURI(directory.getUri()), -1L);
	    String subpath = GetPath(path, directory.getName());
	    File dir = new File(subpath);
        System.out.println("- visting directory '"+directory.getUri()+"'...");
	    dir.mkdir();
	    for (int i = 0; i < entries.length; i++) 
	    {
	      RepositoryDirEntry entry = entries[i];
	      if (entry.getKind().equals(RepositoryNodeKind.DIR)) 
	      {
	        CheckOutDirectory(subpath, entry);
	      } 
	      else 
	      {  
	        String filename = GetPath(subpath, entry.getName());
	        if(filename.endsWith(".ecore"))
	        {
              System.out.println("check out file to '"+filename+"'...");
	          repository.checkOutFile(session, URI.createURI(entry.getUri()), -1, new File(filename));
	        }
	      }
	    }
	}
	  
	private String GetPath(String path, String filename)
	{
	    if(filename.compareTo("")==0)
	      return path+"/.";
	    else
	      return path + "/" + filename;
	}
	
	@Override
	public void execute(Project project) {
		ClassLoader initialClassLoader = Thread.currentThread().getContextClassLoader();
	    try {
	      Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
	      InitSession();
		  InitRepository();
		  TraverseRepository();
	    } finally {
	      Thread.currentThread().setContextClassLoader(initialClassLoader);
	    }
	}
}
