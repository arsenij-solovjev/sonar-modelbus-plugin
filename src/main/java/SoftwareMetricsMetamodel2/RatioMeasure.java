/**
 */
package SoftwareMetricsMetamodel2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ratio Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.RatioMeasure#getFunctor1 <em>Functor1</em>}</li>
 * </ul>
 * </p>
 *
 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getRatioMeasure()
 * @model extendedMetaData="name='RatioMeasure' kind='elementOnly'"
 * @generated
 */
public interface RatioMeasure extends BinaryMeasure {
	/**
   * Returns the value of the '<em><b>Functor1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functor1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Functor1</em>' attribute.
   * @see #setFunctor1(String)
   * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getRatioMeasure_Functor1()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='functor' namespace='##targetNamespace'"
   * @generated
   */
	String getFunctor1();

	/**
   * Sets the value of the '{@link SoftwareMetricsMetamodel2.RatioMeasure#getFunctor1 <em>Functor1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functor1</em>' attribute.
   * @see #getFunctor1()
   * @generated
   */
	void setFunctor1(String value);

} // RatioMeasure
