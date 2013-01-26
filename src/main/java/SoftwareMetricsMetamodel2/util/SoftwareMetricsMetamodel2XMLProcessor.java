/**
 */
package SoftwareMetricsMetamodel2.util;

import SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareMetricsMetamodel2XMLProcessor extends XMLProcessor {

	/**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SoftwareMetricsMetamodel2XMLProcessor() {
    super(new EPackageRegistryImpl(EPackage.Registry.INSTANCE));
    extendedMetaData.putPackage(null, SoftwareMetricsMetamodel2Package.eINSTANCE);
  }
	
	/**
   * Register for "*" and "xml" file extensions the SoftwareMetricsMetamodel2ResourceFactoryImpl factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
    if (registrations == null)
    {
      super.getRegistrations();
      registrations.put(XML_EXTENSION, new SoftwareMetricsMetamodel2ResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new SoftwareMetricsMetamodel2ResourceFactoryImpl());
    }
    return registrations;
  }

} //SoftwareMetricsMetamodel2XMLProcessor
