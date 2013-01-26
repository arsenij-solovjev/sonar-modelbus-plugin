/**
 */
package org.sonar.plugins.modelbus.smmparser;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.BinaryMeasure#getFunctor <em>Functor</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.BinaryMeasure#getBaseMeasure1 <em>Base Measure1</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.BinaryMeasure#getBaseMeasure2 <em>Base Measure2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getBinaryMeasure()
 * @model extendedMetaData="name='BinaryMeasure' kind='elementOnly'"
 * @generated
 */
public interface BinaryMeasure extends DimensionalMeasure {
	/**
   * Returns the value of the '<em><b>Functor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Functor</em>' attribute.
   * @see #setFunctor(String)
   * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getBinaryMeasure_Functor()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='functor' namespace='##targetNamespace'"
   * @generated
   */
	String getFunctor();

	/**
   * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.BinaryMeasure#getFunctor <em>Functor</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functor</em>' attribute.
   * @see #getFunctor()
   * @generated
   */
	void setFunctor(String value);

	/**
   	 * Returns the value of the '<em><b>Base Measure1</b></em>' reference.
   	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 * @return the value of the '<em>Base Measure1</em>' reference.
   	 * @see #setBaseMeasure1(DimensionalMeasure)
   	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getBinaryMeasure_BaseMeasure1()
   	 * @model resolveProxies="false" required="true" ordered="false"
   	 *        extendedMetaData="kind='element' name='baseMeasure1' namespace='##targetNamespace'"
   	 * @generated
   	 */
	DimensionalMeasure getBaseMeasure1();

	/**
   	 * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.BinaryMeasure#getBaseMeasure1 <em>Base Measure1</em>}' reference.
   	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 * @param value the new value of the '<em>Base Measure1</em>' reference.
   	 * @see #getBaseMeasure1()
   	 * @generated
   	 */
	void setBaseMeasure1(DimensionalMeasure value);

	/**
   	 	 * Returns the value of the '<em><b>Base Measure2</b></em>' reference.
   	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 * @return the value of the '<em>Base Measure2</em>' reference.
   	 	 * @see #setBaseMeasure2(DimensionalMeasure)
   	 	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getBinaryMeasure_BaseMeasure2()
   	 	 * @model resolveProxies="false" required="true" ordered="false"
   	 	 *        extendedMetaData="kind='element' name='baseMeasure2' namespace='##targetNamespace'"
   	 	 * @generated
   	 	 */
	DimensionalMeasure getBaseMeasure2();

	/**
   	 	 * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.BinaryMeasure#getBaseMeasure2 <em>Base Measure2</em>}' reference.
   	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 * @param value the new value of the '<em>Base Measure2</em>' reference.
   	 	 * @see #getBaseMeasure2()
   	 	 * @generated
   	 	 */
	void setBaseMeasure2(DimensionalMeasure value);

} // BinaryMeasure
