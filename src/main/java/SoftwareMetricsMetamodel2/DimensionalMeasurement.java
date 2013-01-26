/**
 */
package SoftwareMetricsMetamodel2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimensional Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.DimensionalMeasurement#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDimensionalMeasurement()
 * @model abstract="true"
 *        extendedMetaData="name='DimensionalMeasurement' kind='elementOnly'"
 * @generated
 */
public interface DimensionalMeasurement extends Measurement {
	/**
 	 * Returns the value of the '<em><b>Value</b></em>' attribute.
 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
 	 * @return the value of the '<em>Value</em>' attribute.
 	 * @see #isSetValue()
 	 * @see #unsetValue()
 	 * @see #setValue(double)
 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDimensionalMeasurement_Value()
 	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
 	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
 	 * @generated
 	 */
	double getValue();

	/**
 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DimensionalMeasurement#getValue <em>Value</em>}' attribute.
 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
 	 * @param value the new value of the '<em>Value</em>' attribute.
 	 * @see #isSetValue()
 	 * @see #unsetValue()
 	 * @see #getValue()
 	 * @generated
 	 */
	void setValue(double value);

	/**
 	 * Unsets the value of the '{@link SoftwareMetricsMetamodel2.DimensionalMeasurement#getValue <em>Value</em>}' attribute.
 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
 	 * @see #isSetValue()
 	 * @see #getValue()
 	 * @see #setValue(double)
 	 * @generated
 	 */
	void unsetValue();

	/**
 	 * Returns whether the value of the '{@link SoftwareMetricsMetamodel2.DimensionalMeasurement#getValue <em>Value</em>}' attribute is set.
 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
 	 * @return whether the value of the '<em>Value</em>' attribute is set.
 	 * @see #unsetValue()
 	 * @see #getValue()
 	 * @see #setValue(double)
 	 * @generated
 	 */
	boolean isSetValue();

} // DimensionalMeasurement
