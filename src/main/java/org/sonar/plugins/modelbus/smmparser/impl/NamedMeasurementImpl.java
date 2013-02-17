/**
 */
package org.sonar.plugins.modelbus.smmparser.impl;


import org.eclipse.emf.ecore.EClass;
import org.sonar.plugins.modelbus.smmparser.NamedMeasurement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NamedMeasurementImpl extends DimensionalMeasurementImpl implements NamedMeasurement {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected NamedMeasurementImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.NAMED_MEASUREMENT;
  }

} //NamedMeasurementImpl
