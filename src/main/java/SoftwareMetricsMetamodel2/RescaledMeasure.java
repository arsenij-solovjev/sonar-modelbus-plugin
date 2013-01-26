/**
 */
package SoftwareMetricsMetamodel2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rescaled Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.RescaledMeasure#getFormula <em>Formula</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.RescaledMeasure#getBaseMeasure <em>Base Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getRescaledMeasure()
 * @model extendedMetaData="name='RescaledMeasure' kind='elementOnly'"
 * @generated
 */
public interface RescaledMeasure extends DimensionalMeasure {
	/**
   * Returns the value of the '<em><b>Formula</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Formula</em>' attribute.
   * @see #setFormula(String)
   * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getRescaledMeasure_Formula()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='formula' namespace='##targetNamespace'"
   * @generated
   */
	String getFormula();

	/**
   * Sets the value of the '{@link SoftwareMetricsMetamodel2.RescaledMeasure#getFormula <em>Formula</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formula</em>' attribute.
   * @see #getFormula()
   * @generated
   */
	void setFormula(String value);

	/**
   	 * Returns the value of the '<em><b>Base Measure</b></em>' reference.
   	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 * @return the value of the '<em>Base Measure</em>' reference.
   	 * @see #setBaseMeasure(DimensionalMeasure)
   	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getRescaledMeasure_BaseMeasure()
   	 * @model resolveProxies="false" required="true"
   	 *        extendedMetaData="kind='element' name='baseMeasure' namespace='##targetNamespace'"
   	 * @generated
   	 */
	DimensionalMeasure getBaseMeasure();

	/**
   	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.RescaledMeasure#getBaseMeasure <em>Base Measure</em>}' reference.
   	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 * @param value the new value of the '<em>Base Measure</em>' reference.
   	 * @see #getBaseMeasure()
   	 * @generated
   	 */
	void setBaseMeasure(DimensionalMeasure value);

} // RescaledMeasure
