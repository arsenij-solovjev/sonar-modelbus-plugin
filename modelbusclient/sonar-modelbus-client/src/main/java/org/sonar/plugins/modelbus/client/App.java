package org.sonar.plugins.modelbus.client;

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

public class App 
{
	private IRepositoryHelper repository;
	private Session session;
	
	private void init() {
		repository = ModelBusCoreLib.getRepositoryHelper();
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
	}
	
	private String GetPath(String path, String filename)
	{
	    if(filename.compareTo("")==0)
	      return path+"/.";
	    else
	      return path + "/" + filename;
	}
	
	private void CheckOutDirectory(IRepositoryHelper repository, Session session, String path, RepositoryDirEntry directory)
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
			CheckOutDirectory(repository, session, subpath, entry);
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
	
	public void run() {
		init();
		try {
			RepositoryDirEntry root = repository.getRoot(session);
			CheckOutDirectory(repository, session, "MODELBUS", root);
		} catch(Exception e) {}
	}
				
    public static void main( String[] args )
    {
        new App().run();
    }
}
