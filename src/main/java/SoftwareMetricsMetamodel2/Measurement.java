/**
 */
package SoftwareMetricsMetamodel2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.Measurement#getError <em>Error</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.Measurement#getObservation <em>Observation</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.Measurement#getMeasure <em>Measure</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.Measurement#getMeasurand <em>Measurand</em>}</li>
 * </ul>
 * </p>
 *
 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getMeasurement()
 * @model abstract="true"
 *        extendedMetaData="name='Measurement' kind='elementOnly'"
 * @generated
 */
public interface Measurement extends SMMElement {
	/**
 	 * Returns the value of the '<em><b>Error</b></em>' attribute.
 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
 	 * @return the value of the '<em>Error</em>' attribute.
 	 * @see #setError(String)
 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getMeasurement_Error()
 	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
 	 *        extendedMetaData="kind='element' name='error' namespace='##targetNamespace'"
 	 * @generated
 	 */
	String getError();

	/**
 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.Measurement#getError <em>Error</em>}' attribute.
 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
 	 * @param value the new value of the '<em>Error</em>' attribute.
 	 * @see #getError()
 	 * @generated
 	 */
	void setError(String value);

	/**
 	 	 * Returns the value of the '<em><b>Observation</b></em>' reference.
 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
 	 	 * @return the value of the '<em>Observation</em>' reference.
 	 	 * @see #setObservation(Observation)
 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getMeasurement_Observation()
 	 	 * @model resolveProxies="false" required="true" ordered="false"
 	 	 *        extendedMetaData="kind='element' name='observation' namespace='##targetNamespace'"
 	 	 * @generated
 	 	 */
	Observation getObservation();

	/**
 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.Measurement#getObservation <em>Observation</em>}' reference.
 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
 	 	 * @param value the new value of the '<em>Observation</em>' reference.
 	 	 * @see #getObservation()
 	 	 * @generated
 	 	 */
	void setObservation(Observation value);

	/**
 	 	 	 * Returns the value of the '<em><b>Measure</b></em>' reference.
 	 	 	 * It is bidirectional and its opposite is '{@link SoftwareMetricsMetamodel2.Measure#getMeasurement <em>Measurement</em>}'.
 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
 	 	 	 * @return the value of the '<em>Measure</em>' reference.
 	 	 	 * @see #setMeasure(Measure)
 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getMeasurement_Measure()
 	 	 	 * @see SoftwareMetricsMetamodel2.Measure#getMeasurement
 	 	 	 * @model opposite="measurement" resolveProxies="false" required="true"
 	 	 	 *        extendedMetaData="kind='element' name='measure' namespace='##targetNamespace'"
 	 	 	 * @generated
 	 	 	 */
	Measure getMeasure();

	/**
 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.Measurement#getMeasure <em>Measure</em>}' reference.
 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
 	 	 	 * @param value the new value of the '<em>Measure</em>' reference.
 	 	 	 * @see #getMeasure()
 	 	 	 * @generated
 	 	 	 */
	void setMeasure(Measure value);

	/**
 	 	 	 	 * Returns the value of the '<em><b>Measurand</b></em>' reference.
 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
 	 	 	 	 * @return the value of the '<em>Measurand</em>' reference.
 	 	 	 	 * @see #setMeasurand(EObject)
 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getMeasurement_Measurand()
 	 	 	 	 * @model
 	 	 	 	 * @generated
 	 	 	 	 */
	EObject getMeasurand();

	/**
 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.Measurement#getMeasurand <em>Measurand</em>}' reference.
 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
 	 	 	 	 * @param value the new value of the '<em>Measurand</em>' reference.
 	 	 	 	 * @see #getMeasurand()
 	 	 	 	 * @generated
 	 	 	 	 */
	void setMeasurand(EObject value);

} // Measurement
