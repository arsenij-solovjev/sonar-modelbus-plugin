/**
 */
package SoftwareMetricsMetamodel2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimensional Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.DimensionalMeasure#getUnit <em>Unit</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DimensionalMeasure#getLowerThreshold <em>Lower Threshold</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DimensionalMeasure#getUpperThreshold <em>Upper Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDimensionalMeasure()
 * @model extendedMetaData="name='DimensionalMeasure' kind='elementOnly'"
 * @generated
 */
public interface DimensionalMeasure extends Measure {
	/**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see #setUnit(String)
   * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDimensionalMeasure_Unit()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='unit' namespace='##targetNamespace'"
   * @generated
   */
	String getUnit();

	/**
   * Sets the value of the '{@link SoftwareMetricsMetamodel2.DimensionalMeasure#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see #getUnit()
   * @generated
   */
	void setUnit(String value);

	/**
   	 * Returns the value of the '<em><b>Lower Threshold</b></em>' attribute.
   	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 * @return the value of the '<em>Lower Threshold</em>' attribute.
   	 * @see #setLowerThreshold(double)
   	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDimensionalMeasure_LowerThreshold()
   	 * @model
   	 * @generated
   	 */
	double getLowerThreshold();

	/**
   	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DimensionalMeasure#getLowerThreshold <em>Lower Threshold</em>}' attribute.
   	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 * @param value the new value of the '<em>Lower Threshold</em>' attribute.
   	 * @see #getLowerThreshold()
   	 * @generated
   	 */
	void setLowerThreshold(double value);

	/**
   	 * Returns the value of the '<em><b>Upper Threshold</b></em>' attribute.
   	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 * @return the value of the '<em>Upper Threshold</em>' attribute.
   	 * @see #setUpperThreshold(double)
   	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDimensionalMeasure_UpperThreshold()
   	 * @model
   	 * @generated
   	 */
	double getUpperThreshold();

	/**
   	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DimensionalMeasure#getUpperThreshold <em>Upper Threshold</em>}' attribute.
   	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 * @param value the new value of the '<em>Upper Threshold</em>' attribute.
   	 * @see #getUpperThreshold()
   	 * @generated
   	 */
	void setUpperThreshold(double value);

} // DimensionalMeasure
