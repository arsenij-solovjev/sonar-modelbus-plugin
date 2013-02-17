/**
 */
package org.sonar.plugins.modelbus.smmparser.impl;


import org.eclipse.emf.ecore.EClass;
import org.sonar.plugins.modelbus.smmparser.DirectMeasurement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DirectMeasurementImpl extends DimensionalMeasurementImpl implements DirectMeasurement {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DirectMeasurementImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DIRECT_MEASUREMENT;
  }

} //DirectMeasurementImpl
