/**
 */
package SoftwareMetricsMetamodel2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.Observation#getObserver <em>Observer</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.Observation#getTool <em>Tool</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.Observation#getWhenObserved <em>When Observed</em>}</li>
 * </ul>
 * </p>
 *
 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getObservation()
 * @model extendedMetaData="name='Observation' kind='elementOnly'"
 * @generated
 */
public interface Observation extends SMMElement {
	/**
   * Returns the value of the '<em><b>Observer</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Observer</em>' attribute.
   * @see #setObserver(String)
   * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getObservation_Observer()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='observer' namespace='##targetNamespace'"
   * @generated
   */
	String getObserver();

	/**
   * Sets the value of the '{@link SoftwareMetricsMetamodel2.Observation#getObserver <em>Observer</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Observer</em>' attribute.
   * @see #getObserver()
   * @generated
   */
	void setObserver(String value);

	/**
   	 * Returns the value of the '<em><b>Tool</b></em>' attribute.
   	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 * @return the value of the '<em>Tool</em>' attribute.
   	 * @see #setTool(String)
   	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getObservation_Tool()
   	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   	 *        extendedMetaData="kind='element' name='tool' namespace='##targetNamespace'"
   	 * @generated
   	 */
	String getTool();

	/**
   	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.Observation#getTool <em>Tool</em>}' attribute.
   	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 * @param value the new value of the '<em>Tool</em>' attribute.
   	 * @see #getTool()
   	 * @generated
   	 */
	void setTool(String value);

	/**
   	 	 * Returns the value of the '<em><b>When Observed</b></em>' containment reference.
   	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Observed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 * @return the value of the '<em>When Observed</em>' containment reference.
   	 	 * @see #setWhenObserved(Date)
   	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getObservation_WhenObserved()
   	 	 * @model containment="true"
   	 	 *        extendedMetaData="kind='element' name='whenObserved' namespace='##targetNamespace'"
   	 	 * @generated
   	 	 */
	Date getWhenObserved();

	/**
   	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.Observation#getWhenObserved <em>When Observed</em>}' containment reference.
   	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 * @param value the new value of the '<em>When Observed</em>' containment reference.
   	 	 * @see #getWhenObserved()
   	 	 * @generated
   	 	 */
	void setWhenObserved(Date value);

} // Observation
