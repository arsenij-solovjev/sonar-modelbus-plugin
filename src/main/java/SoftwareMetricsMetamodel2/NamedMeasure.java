/**
 */
package SoftwareMetricsMetamodel2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.NamedMeasure#getName1 <em>Name1</em>}</li>
 * </ul>
 * </p>
 *
 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getNamedMeasure()
 * @model extendedMetaData="name='NamedMeasure' kind='elementOnly'"
 * @generated
 */
public interface NamedMeasure extends DimensionalMeasure {
	/**
   * Returns the value of the '<em><b>Name1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Name1</em>' attribute.
   * @see #setName1(String)
   * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getNamedMeasure_Name1()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
   * @generated
   */
	String getName1();

	/**
   * Sets the value of the '{@link SoftwareMetricsMetamodel2.NamedMeasure#getName1 <em>Name1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name1</em>' attribute.
   * @see #getName1()
   * @generated
   */
	void setName1(String value);

} // NamedMeasure
