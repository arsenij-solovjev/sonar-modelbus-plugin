/**
 */
package org.sonar.plugins.modelbus.smmparser;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class models the specification of measures either by name, by representing derivations of base measures, or by representing method operations directly applied to the measured object.  For example,  McCabe�s cyclomatic complexity could be specified by its name, McCabe�s cyclomatic complexity, by a direct measurement operation or by rescaling counts of either independent paths or choice points.

The essential semantic requirements for the measure metaclass is that it meaningfully identifies the measure applied to produce a given measurement.

The scope of a measure, found by self.characterizes.scope, is the EntitySet that is the domain for this measure.

 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.Measure#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.Measure#getCategory <em>Category</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.Measure#getEquivalentFrom <em>Equivalent From</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.Measure#getRefinement <em>Refinement</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.Measure#getScope <em>Scope</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.Measure#getUtil <em>Util</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.Measure#isDirectInvoke <em>Direct Invoke</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.Measure#getTrait <em>Trait</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.Measure#getMeasurement <em>Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getMeasure()
 * @model abstract="true"
 *        extendedMetaData="name='Measure' kind='elementOnly'"
 * @generated
 */
public interface Measure extends SMMNamedElement {
	/**
 	 * Returns the value of the '<em><b>Library</b></em>' attribute.
 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
 	 * @return the value of the '<em>Library</em>' attribute.
 	 * @see #setLibrary(String)
 	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getMeasure_Library()
 	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
 	 *        extendedMetaData="kind='element' name='library' namespace='##targetNamespace'"
 	 * @generated
 	 */
	String getLibrary();

	/**
 	 * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.Measure#getLibrary <em>Library</em>}' attribute.
 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
 	 * @param value the new value of the '<em>Library</em>' attribute.
 	 * @see #getLibrary()
 	 * @generated
 	 */
	void setLibrary(String value);

	/**
 	 	 * Returns the value of the '<em><b>Category</b></em>' reference list.
 	 	 * The list contents are of type {@link org.sonar.plugins.modelbus.smmparser.SMMCategory}.
 	 	 * It is bidirectional and its opposite is '{@link org.sonar.plugins.modelbus.smmparser.SMMCategory#getMeasureElement <em>Measure Element</em>}'.
 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
 	 	 * @return the value of the '<em>Category</em>' reference list.
 	 	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getMeasure_Category()
 	 	 * @see org.sonar.plugins.modelbus.smmparser.SMMCategory#getMeasureElement
 	 	 * @model opposite="measureElement" resolveProxies="false"
 	 	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
 	 	 * @generated
 	 	 */
	EList<SMMCategory> getCategory();

	/**
 	 	 	 * Returns the value of the '<em><b>Equivalent From</b></em>' reference list.
 	 	 	 * The list contents are of type {@link org.sonar.plugins.modelbus.smmparser.Measure}.
 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
 	 	 	 * @return the value of the '<em>Equivalent From</em>' reference list.
 	 	 	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getMeasure_EquivalentFrom()
 	 	 	 * @model resolveProxies="false"
 	 	 	 *        extendedMetaData="kind='element' name='equivalentFrom' namespace='##targetNamespace'"
 	 	 	 * @generated
 	 	 	 */
	EList<Measure> getEquivalentFrom();

	/**
 	 	 	 	 * Returns the value of the '<em><b>Refinement</b></em>' reference list.
 	 	 	 	 * The list contents are of type {@link org.sonar.plugins.modelbus.smmparser.Measure}.
 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
 	 	 	 	 * @return the value of the '<em>Refinement</em>' reference list.
 	 	 	 	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getMeasure_Refinement()
 	 	 	 	 * @model resolveProxies="false"
 	 	 	 	 *        extendedMetaData="kind='element' name='refinement' namespace='##targetNamespace'"
 	 	 	 	 * @generated
 	 	 	 	 */
	EList<Measure> getRefinement();

	/**
 	 	 	 	 	 * Returns the value of the '<em><b>Scope</b></em>' reference.
 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
 	 	 	 	 	 * @return the value of the '<em>Scope</em>' reference.
 	 	 	 	 	 * @see #setScope(Scope)
 	 	 	 	 	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getMeasure_Scope()
 	 	 	 	 	 * @model resolveProxies="false" required="true"
 	 	 	 	 	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
 	 	 	 	 	 * @generated
 	 	 	 	 	 */
	Scope getScope();

	/**
 	 	 	 	 	 * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.Measure#getScope <em>Scope</em>}' reference.
 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
 	 	 	 	 	 * @param value the new value of the '<em>Scope</em>' reference.
 	 	 	 	 	 * @see #getScope()
 	 	 	 	 	 * @generated
 	 	 	 	 	 */
	void setScope(Scope value);

	/**
 	 	 	 	 	 	 * Returns the value of the '<em><b>Util</b></em>' reference list.
 	 	 	 	 	 	 * The list contents are of type {@link org.sonar.plugins.modelbus.smmparser.MeasureUtil}.
 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Util</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
 	 	 	 	 	 	 * @return the value of the '<em>Util</em>' reference list.
 	 	 	 	 	 	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getMeasure_Util()
 	 	 	 	 	 	 * @model
 	 	 	 	 	 	 * @generated
 	 	 	 	 	 	 */
	EList<MeasureUtil> getUtil();

	/**
 	 	 	 	 	 	 * Returns the value of the '<em><b>Direct Invoke</b></em>' attribute.
 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direct Invoke</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
 	 	 	 	 	 	 * @return the value of the '<em>Direct Invoke</em>' attribute.
 	 	 	 	 	 	 * @see #setDirectInvoke(boolean)
 	 	 	 	 	 	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getMeasure_DirectInvoke()
 	 	 	 	 	 	 * @model
 	 	 	 	 	 	 * @generated
 	 	 	 	 	 	 */
	boolean isDirectInvoke();

	/**
 	 	 	 	 	 	 * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.Measure#isDirectInvoke <em>Direct Invoke</em>}' attribute.
 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
 	 	 	 	 	 	 * @param value the new value of the '<em>Direct Invoke</em>' attribute.
 	 	 	 	 	 	 * @see #isDirectInvoke()
 	 	 	 	 	 	 * @generated
 	 	 	 	 	 	 */
	void setDirectInvoke(boolean value);

	/**
 	 	 	 	 	 	 * Returns the value of the '<em><b>Trait</b></em>' reference.
 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trait</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
 	 	 	 	 	 	 * @return the value of the '<em>Trait</em>' reference.
 	 	 	 	 	 	 * @see #setTrait(Characteristic)
 	 	 	 	 	 	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getMeasure_Trait()
 	 	 	 	 	 	 * @model required="true" ordered="false"
 	 	 	 	 	 	 * @generated
 	 	 	 	 	 	 */
	Characteristic getTrait();

	/**
 	 	 	 	 	 	 * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.Measure#getTrait <em>Trait</em>}' reference.
 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
 	 	 	 	 	 	 * @param value the new value of the '<em>Trait</em>' reference.
 	 	 	 	 	 	 * @see #getTrait()
 	 	 	 	 	 	 * @generated
 	 	 	 	 	 	 */
	void setTrait(Characteristic value);

	/**
 	 	 	 	 	 	 * Returns the value of the '<em><b>Measurement</b></em>' reference list.
 	 	 	 	 	 	 * The list contents are of type {@link org.sonar.plugins.modelbus.smmparser.Measurement}.
 	 	 	 	 	 	 * It is bidirectional and its opposite is '{@link org.sonar.plugins.modelbus.smmparser.Measurement#getMeasure <em>Measure</em>}'.
 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
 	 	 	 	 	 	 * @return the value of the '<em>Measurement</em>' reference list.
 	 	 	 	 	 	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getMeasure_Measurement()
 	 	 	 	 	 	 * @see org.sonar.plugins.modelbus.smmparser.Measurement#getMeasure
 	 	 	 	 	 	 * @model opposite="measure" ordered="false"
 	 	 	 	 	 	 * @generated
 	 	 	 	 	 	 */
	EList<Measurement> getMeasurement();

} // Measure
