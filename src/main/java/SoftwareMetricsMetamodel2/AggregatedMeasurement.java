/**
 */
package SoftwareMetricsMetamodel2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregated Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.AggregatedMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.AggregatedMeasurement#getBaseMeasurement <em>Base Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getAggregatedMeasurement()
 * @model extendedMetaData="name='AggregatedMeasurement' kind='elementOnly'"
 * @generated
 */
public interface AggregatedMeasurement extends DimensionalMeasurement {
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
   * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getAggregatedMeasurement_IsBaseSupplied()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
   *        extendedMetaData="kind='element' name='isBaseSupplied' namespace='##targetNamespace'"
   * @generated
   */
	boolean isIsBaseSupplied();

	/**
   * Sets the value of the '{@link SoftwareMetricsMetamodel2.AggregatedMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}' attribute.
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
   * Unsets the value of the '{@link SoftwareMetricsMetamodel2.AggregatedMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetIsBaseSupplied()
   * @see #isIsBaseSupplied()
   * @see #setIsBaseSupplied(boolean)
   * @generated
   */
	void unsetIsBaseSupplied();

	/**
   * Returns whether the value of the '{@link SoftwareMetricsMetamodel2.AggregatedMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}' attribute is set.
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
   	 * The list contents are of type {@link SoftwareMetricsMetamodel2.DimensionalMeasurement}.
   	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 * @return the value of the '<em>Base Measurement</em>' reference list.
   	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getAggregatedMeasurement_BaseMeasurement()
   	 * @model resolveProxies="false" ordered="false"
   	 *        extendedMetaData="kind='element' name='baseMeasurement' namespace='##targetNamespace'"
   	 * @generated
   	 */
	EList<DimensionalMeasurement> getBaseMeasurement();

} // AggregatedMeasurement
