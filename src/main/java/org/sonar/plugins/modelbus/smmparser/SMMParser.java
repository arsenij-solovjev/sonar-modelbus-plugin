package org.sonar.plugins.modelbus.smmparser;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class SMMParser {

	public static SMMModel load(InputStream file) {
		// Initialize the model
		SoftwareMetricsMetamodel2Package.eINSTANCE.eClass();

		// Register the XMI resource factory for the .website extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("smm", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// // Get the resource
		Resource resource = resSet.createResource(URI.createURI("fake.smm"));
		
		try {
			resource.load(file, null);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		SMMModel smmModel = (SMMModel) resource.getContents().get(0);
		return smmModel;
		
	}
}
