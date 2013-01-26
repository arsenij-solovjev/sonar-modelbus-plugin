/**
 */
package org.sonar.plugins.modelbus.smmparser;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.BinaryMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.BinaryMeasurement#getBaseMeasurement1 <em>Base Measurement1</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.BinaryMeasurement#getBaseMeasurement2 <em>Base Measurement2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getBinaryMeasurement()
 * @model extendedMetaData="name='BinaryMeasurement' kind='elementOnly'"
 * @generated
 */
public interface BinaryMeasurement extends DimensionalMeasurement {
	/**
   * Returns the value of the '<em><b>Is Base Supplied</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Base Supplied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Is Base Supplied</em>' attribute.
   * @see #isSetIsBaseSupplied()
   * @see #unsetIsBaseSupplied()
   * @see #setIsBaseSupplied(boolean)
   * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getBinaryMeasurement_IsBaseSupplied()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
   *        extendedMetaData="kind='element' name='isBaseSupplied' namespace='##targetNamespace'"
   * @generated
   */
	boolean isIsBaseSupplied();

	/**
   * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.BinaryMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Base Supplied</em>' attribute.
   * @see #isSetIsBaseSupplied()
   * @see #unsetIsBaseSupplied()
   * @see #isIsBaseSupplied()
   * @generated
   */
	void setIsBaseSupplied(boolean value);

	/**
   * Unsets the value of the '{@link org.sonar.plugins.modelbus.smmparser.BinaryMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetIsBaseSupplied()
   * @see #isIsBaseSupplied()
   * @see #setIsBaseSupplied(boolean)
   * @generated
   */
	void unsetIsBaseSupplied();

	/**
   * Returns whether the value of the '{@link org.sonar.plugins.modelbus.smmparser.BinaryMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Is Base Supplied</em>' attribute is set.
   * @see #unsetIsBaseSupplied()
   * @see #isIsBaseSupplied()
   * @see #setIsBaseSupplied(boolean)
   * @generated
   */
	boolean isSetIsBaseSupplied();

	/**
   	 * Returns the value of the '<em><b>Base Measurement1</b></em>' reference.
   	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 * @return the value of the '<em>Base Measurement1</em>' reference.
   	 * @see #setBaseMeasurement1(DimensionalMeasurement)
   	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getBinaryMeasurement_BaseMeasurement1()
   	 * @model resolveProxies="false"
   	 *        extendedMetaData="kind='element' name='baseMeasurement1' namespace='##targetNamespace'"
   	 * @generated
   	 */
	DimensionalMeasurement getBaseMeasurement1();

	/**
   	 * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.BinaryMeasurement#getBaseMeasurement1 <em>Base Measurement1</em>}' reference.
   	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 * @param value the new value of the '<em>Base Measurement1</em>' reference.
   	 * @see #getBaseMeasurement1()
   	 * @generated
   	 */
	void setBaseMeasurement1(DimensionalMeasurement value);

	/**
   	 	 * Returns the value of the '<em><b>Base Measurement2</b></em>' reference.
   	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 * @return the value of the '<em>Base Measurement2</em>' reference.
   	 	 * @see #setBaseMeasurement2(DimensionalMeasurement)
   	 	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getBinaryMeasurement_BaseMeasurement2()
   	 	 * @model resolveProxies="false"
   	 	 *        extendedMetaData="kind='element' name='baseMeasurement2' namespace='##targetNamespace'"
   	 	 * @generated
   	 	 */
	DimensionalMeasurement getBaseMeasurement2();

	/**
   	 	 * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.BinaryMeasurement#getBaseMeasurement2 <em>Base Measurement2</em>}' reference.
   	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 * @param value the new value of the '<em>Base Measurement2</em>' reference.
   	 	 * @see #getBaseMeasurement2()
   	 	 * @generated
   	 	 */
	void setBaseMeasurement2(DimensionalMeasurement value);

} // BinaryMeasurement
