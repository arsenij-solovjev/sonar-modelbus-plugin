/**
 */
package org.sonar.plugins.modelbus.smmparser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMM Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.SMMElement#getParent <em>Parent</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.SMMElement#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getSMMElement()
 * @model abstract="true"
 *        extendedMetaData="name='SMM_Element' kind='empty'"
 * @generated
 */
public interface SMMElement extends EObject {
	/**
 	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
 	 * It is bidirectional and its opposite is '{@link org.sonar.plugins.modelbus.smmparser.SMMModel#getSMMElement <em>SMM Element</em>}'.
 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
 	 * @return the value of the '<em>Parent</em>' container reference.
 	 * @see #setParent(SMMModel)
 	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getSMMElement_Parent()
 	 * @see org.sonar.plugins.modelbus.smmparser.SMMModel#getSMMElement
 	 * @model opposite="sMMElement" transient="false" ordered="false"
 	 * @generated
 	 */
	SMMModel getParent();

	/**
 	 * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.SMMElement#getParent <em>Parent</em>}' container reference.
 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
 	 * @param value the new value of the '<em>Parent</em>' container reference.
 	 * @see #getParent()
 	 * @generated
 	 */
	void setParent(SMMModel value);

	/**
 	 * Returns the value of the '<em><b>Description</b></em>' attribute.
 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
 	 * @return the value of the '<em>Description</em>' attribute.
 	 * @see #setDescription(String)
 	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getSMMElement_Description()
 	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
 	 * @generated
 	 */
	String getDescription();

	/**
 	 * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.SMMElement#getDescription <em>Description</em>}' attribute.
 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
 	 * @param value the new value of the '<em>Description</em>' attribute.
 	 * @see #getDescription()
 	 * @generated
 	 */
	void setDescription(String value);

} // SMMElement
