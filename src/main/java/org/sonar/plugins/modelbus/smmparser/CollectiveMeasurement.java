/**
 */
package org.sonar.plugins.modelbus.smmparser;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collective Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.CollectiveMeasurement#getAccumulator <em>Accumulator</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.CollectiveMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.CollectiveMeasurement#getBaseMeasurement <em>Base Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getCollectiveMeasurement()
 * @model extendedMetaData="name='CollectiveMeasurement' kind='elementOnly'"
 * @generated
 */
public interface CollectiveMeasurement extends DimensionalMeasurement {
	/**
   * Returns the value of the '<em><b>Accumulator</b></em>' attribute.
   * The default value is <code>"sum"</code>.
   * The literals are from the enumeration {@link org.sonar.plugins.modelbus.smmparser.Accumulator}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accumulator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Accumulator</em>' attribute.
   * @see org.sonar.plugins.modelbus.smmparser.Accumulator
   * @see #isSetAccumulator()
   * @see #unsetAccumulator()
   * @see #setAccumulator(Accumulator)
   * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getCollectiveMeasurement_Accumulator()
   * @model default="sum" unsettable="true" required="true"
   *        extendedMetaData="kind='element' name='accumulator' namespace='##targetNamespace'"
   * @generated
   */
	Accumulator getAccumulator();

	/**
   * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.CollectiveMeasurement#getAccumulator <em>Accumulator</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accumulator</em>' attribute.
   * @see org.sonar.plugins.modelbus.smmparser.Accumulator
   * @see #isSetAccumulator()
   * @see #unsetAccumulator()
   * @see #getAccumulator()
   * @generated
   */
	void setAccumulator(Accumulator value);

	/**
   * Unsets the value of the '{@link org.sonar.plugins.modelbus.smmparser.CollectiveMeasurement#getAccumulator <em>Accumulator</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetAccumulator()
   * @see #getAccumulator()
   * @see #setAccumulator(Accumulator)
   * @generated
   */
	void unsetAccumulator();

	/**
   * Returns whether the value of the '{@link org.sonar.plugins.modelbus.smmparser.CollectiveMeasurement#getAccumulator <em>Accumulator</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Accumulator</em>' attribute is set.
   * @see #unsetAccumulator()
   * @see #getAccumulator()
   * @see #setAccumulator(Accumulator)
   * @generated
   */
	boolean isSetAccumulator();

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
   	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getCollectiveMeasurement_IsBaseSupplied()
   	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
   	 *        extendedMetaData="kind='element' name='isBaseSupplied' namespace='##targetNamespace'"
   	 * @generated
   	 */
	boolean isIsBaseSupplied();

	/**
   	 * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.CollectiveMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}' attribute.
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
   	 * Unsets the value of the '{@link org.sonar.plugins.modelbus.smmparser.CollectiveMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}' attribute.
   	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 * @see #isSetIsBaseSupplied()
   	 * @see #isIsBaseSupplied()
   	 * @see #setIsBaseSupplied(boolean)
   	 * @generated
   	 */
	void unsetIsBaseSupplied();

	/**
   	 * Returns whether the value of the '{@link org.sonar.plugins.modelbus.smmparser.CollectiveMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}' attribute is set.
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
   	 	 * Returns the value of the '<em><b>Base Measurement</b></em>' reference list.
   	 	 * The list contents are of type {@link org.sonar.plugins.modelbus.smmparser.DimensionalMeasurement}.
   	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 * @return the value of the '<em>Base Measurement</em>' reference list.
   	 	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getCollectiveMeasurement_BaseMeasurement()
   	 	 * @model resolveProxies="false"
   	 	 *        extendedMetaData="kind='element' name='baseMeasurement' namespace='##targetNamespace'"
   	 	 * @generated
   	 	 */
	EList<DimensionalMeasurement> getBaseMeasurement();

} // CollectiveMeasurement
