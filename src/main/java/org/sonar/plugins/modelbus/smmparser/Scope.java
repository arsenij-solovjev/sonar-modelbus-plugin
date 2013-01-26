/**
 */
package org.sonar.plugins.modelbus.smmparser;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.Scope#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.Scope#isEnumerated <em>Enumerated</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.Scope#getRecognizer <em>Recognizer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getScope()
 * @model extendedMetaData="name='Scope' kind='elementOnly'"
 * @generated
 */
public interface Scope extends SMMNamedElement {
	/**
   * Returns the value of the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' attribute.
   * @see #setClass(String)
   * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getScope_Class()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
   * @generated
   */
	String getClass_();

	/**
   * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.Scope#getClass_ <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see #getClass_()
   * @generated
   */
	void setClass(String value);

	/**
   	 * Returns the value of the '<em><b>Enumerated</b></em>' attribute.
   	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 * @return the value of the '<em>Enumerated</em>' attribute.
   	 * @see #isSetEnumerated()
   	 * @see #unsetEnumerated()
   	 * @see #setEnumerated(boolean)
   	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getScope_Enumerated()
   	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   	 *        extendedMetaData="kind='element' name='enumerated' namespace='##targetNamespace'"
   	 * @generated
   	 */
	boolean isEnumerated();

	/**
   	 * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.Scope#isEnumerated <em>Enumerated</em>}' attribute.
   	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 * @param value the new value of the '<em>Enumerated</em>' attribute.
   	 * @see #isSetEnumerated()
   	 * @see #unsetEnumerated()
   	 * @see #isEnumerated()
   	 * @generated
   	 */
	void setEnumerated(boolean value);

	/**
   	 * Unsets the value of the '{@link org.sonar.plugins.modelbus.smmparser.Scope#isEnumerated <em>Enumerated</em>}' attribute.
   	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 * @see #isSetEnumerated()
   	 * @see #isEnumerated()
   	 * @see #setEnumerated(boolean)
   	 * @generated
   	 */
	void unsetEnumerated();

	/**
   	 * Returns whether the value of the '{@link org.sonar.plugins.modelbus.smmparser.Scope#isEnumerated <em>Enumerated</em>}' attribute is set.
   	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 * @return whether the value of the '<em>Enumerated</em>' attribute is set.
   	 * @see #unsetEnumerated()
   	 * @see #isEnumerated()
   	 * @see #setEnumerated(boolean)
   	 * @generated
   	 */
	boolean isSetEnumerated();

	/**
   	 	 * Returns the value of the '<em><b>Recognizer</b></em>' attribute.
   	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recognizer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 * @return the value of the '<em>Recognizer</em>' attribute.
   	 	 * @see #setRecognizer(String)
   	 	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getScope_Recognizer()
   	 	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   	 	 *        extendedMetaData="kind='element' name='recognizer' namespace='##targetNamespace'"
   	 	 * @generated
   	 	 */
	String getRecognizer();

	/**
   	 	 * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.Scope#getRecognizer <em>Recognizer</em>}' attribute.
   	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 * @param value the new value of the '<em>Recognizer</em>' attribute.
   	 	 * @see #getRecognizer()
   	 	 * @generated
   	 	 */
	void setRecognizer(String value);

} // Scope
