package org.sonar.plugins.modelbus.smmparserImpl;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import SoftwareMetricsMetamodel2.Measurement;
import SoftwareMetricsMetamodel2.SMMElement;
import SoftwareMetricsMetamodel2.SMMModel;
import SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package;
import SoftwareMetricsMetamodel2.impl.DirectMeasureImpl;


public class SMMParser {
	public static SMMModel load(File file) {
		// Initialize the model
		SoftwareMetricsMetamodel2Package.eINSTANCE.eClass();

		// Register the XMI resource factory for the .website extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("smm", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		URI fileURI = URI.createFileURI(file.getAbsolutePath());
		Resource resource = resSet.getResource(fileURI, true);

		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		SMMModel smmModel = (SMMModel) resource.getContents().get(0);
		return smmModel;
	}

	public static void main(String[] args) {
		System.out.println("| PARSING SMM [BEGIN]");

		// Read SMM file
		SMMModel smmModel = load(new File("SMM.smm"));
		EList<SMMElement> smmElements = smmModel.getSMMElement();

		// find measures (measurements have references to measurements)
		Iterator<SMMElement> measureIterator = smmElements.iterator();
		List<SMMElement> measures = new ArrayList<SMMElement>();
		SMMElement item = null;
		while (measureIterator.hasNext()) {
			item = measureIterator.next();
			if (item instanceof DirectMeasureImpl) {
				measures.add(item);
				System.out.println("\t | Measure "
						+ ((DirectMeasureImpl) item).getName() + " has "
						+ ((DirectMeasureImpl) item).getMeasurement().size()
						+ " measurements");
				System.out.println("\t | The measurements are " + ((DirectMeasureImpl) item).getMeasurement());
			}
		}

		System.out.println("| PARSING SMM [DONE]");
	}
}
