/**
 */
package SoftwareMetricsMetamodel2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.MeasurementRelation#getName <em>Name</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.MeasurementRelation#getFrom <em>From</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.MeasurementRelation#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getMeasurementRelation()
 * @model abstract="true"
 *        extendedMetaData="name='MeasurementRelation' kind='elementOnly'"
 * @generated
 */
public interface MeasurementRelation extends SMMRelationship {
	/**
 	 * Returns the value of the '<em><b>Name</b></em>' attribute.
 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
 	 * @return the value of the '<em>Name</em>' attribute.
 	 * @see #setName(String)
 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getMeasurementRelation_Name()
 	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
 	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
 	 * @generated
 	 */
	String getName();

	/**
 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.MeasurementRelation#getName <em>Name</em>}' attribute.
 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
 	 * @param value the new value of the '<em>Name</em>' attribute.
 	 * @see #getName()
 	 * @generated
 	 */
	void setName(String value);

	/**
 	 	 * Returns the value of the '<em><b>From</b></em>' reference.
 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
 	 	 * @return the value of the '<em>From</em>' reference.
 	 	 * @see #setFrom(Measurement)
 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getMeasurementRelation_From()
 	 	 * @model resolveProxies="false" required="true" ordered="false"
 	 	 *        extendedMetaData="kind='element' name='from' namespace='##targetNamespace'"
 	 	 * @generated
 	 	 */
	Measurement getFrom();

	/**
 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.MeasurementRelation#getFrom <em>From</em>}' reference.
 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
 	 	 * @param value the new value of the '<em>From</em>' reference.
 	 	 * @see #getFrom()
 	 	 * @generated
 	 	 */
	void setFrom(Measurement value);

	/**
 	 	 	 * Returns the value of the '<em><b>To</b></em>' reference.
 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
 	 	 	 * @return the value of the '<em>To</em>' reference.
 	 	 	 * @see #setTo(Measurement)
 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getMeasurementRelation_To()
 	 	 	 * @model resolveProxies="false" required="true" ordered="false"
 	 	 	 *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace'"
 	 	 	 * @generated
 	 	 	 */
	Measurement getTo();

	/**
 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.MeasurementRelation#getTo <em>To</em>}' reference.
 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
 	 	 	 * @param value the new value of the '<em>To</em>' reference.
 	 	 	 * @see #getTo()
 	 	 	 * @generated
 	 	 	 */
	void setTo(Measurement value);

} // MeasurementRelation
