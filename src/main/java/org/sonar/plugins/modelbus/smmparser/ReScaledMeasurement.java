/**
 */
package org.sonar.plugins.modelbus.smmparser;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Re Scaled Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.ReScaledMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.ReScaledMeasurement#getBaseMeasurement <em>Base Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getReScaledMeasurement()
 * @model extendedMetaData="name='ReScaledMeasurement' kind='elementOnly'"
 * @generated
 */
public interface ReScaledMeasurement extends DimensionalMeasurement {
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
   * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getReScaledMeasurement_IsBaseSupplied()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
   *        extendedMetaData="kind='element' name='isBaseSupplied' namespace='##targetNamespace'"
   * @generated
   */
	boolean isIsBaseSupplied();

	/**
   * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.ReScaledMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}' attribute.
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
   * Unsets the value of the '{@link org.sonar.plugins.modelbus.smmparser.ReScaledMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetIsBaseSupplied()
   * @see #isIsBaseSupplied()
   * @see #setIsBaseSupplied(boolean)
   * @generated
   */
	void unsetIsBaseSupplied();

	/**
   * Returns whether the value of the '{@link org.sonar.plugins.modelbus.smmparser.ReScaledMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}' attribute is set.
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
   	 * Returns the value of the '<em><b>Base Measurement</b></em>' reference.
   	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 * @return the value of the '<em>Base Measurement</em>' reference.
   	 * @see #setBaseMeasurement(DimensionalMeasurement)
   	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getReScaledMeasurement_BaseMeasurement()
   	 * @model resolveProxies="false" required="true"
   	 *        extendedMetaData="kind='element' name='baseMeasurement' namespace='##targetNamespace'"
   	 * @generated
   	 */
	DimensionalMeasurement getBaseMeasurement();

	/**
   	 * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.ReScaledMeasurement#getBaseMeasurement <em>Base Measurement</em>}' reference.
   	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 * @param value the new value of the '<em>Base Measurement</em>' reference.
   	 * @see #getBaseMeasurement()
   	 * @generated
   	 */
	void setBaseMeasurement(DimensionalMeasurement value);

} // ReScaledMeasurement
