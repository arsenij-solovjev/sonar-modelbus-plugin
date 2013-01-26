/**
 */
package SoftwareMetricsMetamodel2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMM Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.SMMModel#getSMMElement <em>SMM Element</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.SMMModel#getMetaModelPackageURI <em>Meta Model Package URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getSMMModel()
 * @model extendedMetaData="name='SMM_Model' kind='elementOnly'"
 * @generated
 */
public interface SMMModel extends SMMElement {
	/**
   * Returns the value of the '<em><b>SMM Element</b></em>' containment reference list.
   * The list contents are of type {@link SoftwareMetricsMetamodel2.SMMElement}.
   * It is bidirectional and its opposite is '{@link SoftwareMetricsMetamodel2.SMMElement#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SMM Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>SMM Element</em>' containment reference list.
   * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getSMMModel_SMMElement()
   * @see SoftwareMetricsMetamodel2.SMMElement#getParent
   * @model opposite="parent" containment="true" required="true" ordered="false"
   *        extendedMetaData="kind='element' name='SMM_Element' namespace='##targetNamespace'"
   * @generated
   */
	EList<SMMElement> getSMMElement();

	/**
   	 * Returns the value of the '<em><b>Meta Model Package URI</b></em>' attribute.
   	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Model Package URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 * @return the value of the '<em>Meta Model Package URI</em>' attribute.
   	 * @see #setMetaModelPackageURI(String)
   	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getSMMModel_MetaModelPackageURI()
   	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   	 * @generated
   	 */
	String getMetaModelPackageURI();

	/**
   	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.SMMModel#getMetaModelPackageURI <em>Meta Model Package URI</em>}' attribute.
   	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 * @param value the new value of the '<em>Meta Model Package URI</em>' attribute.
   	 * @see #getMetaModelPackageURI()
   	 * @generated
   	 */
	void setMetaModelPackageURI(String value);

} // SMMModel
