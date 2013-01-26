/**
 */
package org.sonar.plugins.modelbus.smmparser;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collective Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.CollectiveMeasure#getAccumulator <em>Accumulator</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.CollectiveMeasure#getBaseMeasure <em>Base Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getCollectiveMeasure()
 * @model extendedMetaData="name='CollectiveMeasure' kind='elementOnly'"
 * @generated
 */
public interface CollectiveMeasure extends DimensionalMeasure {
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
   * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getCollectiveMeasure_Accumulator()
   * @model default="sum" unsettable="true" required="true"
   *        extendedMetaData="kind='element' name='accumulator' namespace='##targetNamespace'"
   * @generated
   */
	Accumulator getAccumulator();

	/**
   * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.CollectiveMeasure#getAccumulator <em>Accumulator</em>}' attribute.
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
   * Unsets the value of the '{@link org.sonar.plugins.modelbus.smmparser.CollectiveMeasure#getAccumulator <em>Accumulator</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetAccumulator()
   * @see #getAccumulator()
   * @see #setAccumulator(Accumulator)
   * @generated
   */
	void unsetAccumulator();

	/**
   * Returns whether the value of the '{@link org.sonar.plugins.modelbus.smmparser.CollectiveMeasure#getAccumulator <em>Accumulator</em>}' attribute is set.
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
   	 * Returns the value of the '<em><b>Base Measure</b></em>' reference.
   	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 * @return the value of the '<em>Base Measure</em>' reference.
   	 * @see #setBaseMeasure(DimensionalMeasure)
   	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getCollectiveMeasure_BaseMeasure()
   	 * @model resolveProxies="false" required="true" ordered="false"
   	 *        extendedMetaData="kind='element' name='baseMeasure' namespace='##targetNamespace'"
   	 * @generated
   	 */
	DimensionalMeasure getBaseMeasure();

	/**
   	 * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.CollectiveMeasure#getBaseMeasure <em>Base Measure</em>}' reference.
   	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 * @param value the new value of the '<em>Base Measure</em>' reference.
   	 * @see #getBaseMeasure()
   	 * @generated
   	 */
	void setBaseMeasure(DimensionalMeasure value);

	/**
   	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 * @model
   	 	 * @generated
   	 	 */
	void containRelation();

} // CollectiveMeasure
