/**
 */
package org.sonar.plugins.modelbus.smmparser;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.Characteristic#getMeasure <em>Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getCharacteristic()
 * @model extendedMetaData="name='Characteristic' kind='elementOnly'"
 * @generated
 */
public interface Characteristic extends SMMNamedElement {
	/**
   * Returns the value of the '<em><b>Measure</b></em>' reference list.
   * The list contents are of type {@link org.sonar.plugins.modelbus.smmparser.Measure}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Measure</em>' reference list.
   * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getCharacteristic_Measure()
   * @model resolveProxies="false"
   *        extendedMetaData="kind='element' name='Measure' namespace='##targetNamespace'"
   * @generated
   */
	EList<Measure> getMeasure();

} // Characteristic
