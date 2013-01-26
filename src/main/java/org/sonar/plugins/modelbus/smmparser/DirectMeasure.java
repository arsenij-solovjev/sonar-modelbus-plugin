/**
 */
package org.sonar.plugins.modelbus.smmparser;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.DirectMeasure#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getDirectMeasure()
 * @model extendedMetaData="name='DirectMeasure' kind='elementOnly'"
 * @generated
 */
public interface DirectMeasure extends DimensionalMeasure {
	/**
   * Returns the value of the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' attribute.
   * @see #setOperation(String)
   * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getDirectMeasure_Operation()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
   * @generated
   */
	String getOperation();

	/**
   * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.DirectMeasure#getOperation <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' attribute.
   * @see #getOperation()
   * @generated
   */
	void setOperation(String value);

} // DirectMeasure
