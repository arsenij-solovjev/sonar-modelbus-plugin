/**
 */
package org.sonar.plugins.modelbus.smmparser.impl;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sonar.plugins.modelbus.smmparser.DimensionalMeasure;
import org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimensional Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DimensionalMeasureImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DimensionalMeasureImpl#getLowerThreshold <em>Lower Threshold</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DimensionalMeasureImpl#getUpperThreshold <em>Upper Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DimensionalMeasureImpl extends MeasureImpl implements DimensionalMeasure {
	/**
   * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
	protected static final String UNIT_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
	protected String unit = UNIT_EDEFAULT;

	/**
   * The default value of the '{@link #getLowerThreshold() <em>Lower Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLowerThreshold()
   * @generated
   * @ordered
   */
	protected static final double LOWER_THRESHOLD_EDEFAULT = 0.0;

	/**
   * The cached value of the '{@link #getLowerThreshold() <em>Lower Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLowerThreshold()
   * @generated
   * @ordered
   */
	protected double lowerThreshold = LOWER_THRESHOLD_EDEFAULT;

	/**
   * The default value of the '{@link #getUpperThreshold() <em>Upper Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUpperThreshold()
   * @generated
   * @ordered
   */
	protected static final double UPPER_THRESHOLD_EDEFAULT = 0.0;

	/**
   * The cached value of the '{@link #getUpperThreshold() <em>Upper Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUpperThreshold()
   * @generated
   * @ordered
   */
	protected double upperThreshold = UPPER_THRESHOLD_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DimensionalMeasureImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DIMENSIONAL_MEASURE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getUnit() {
    return unit;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setUnit(String newUnit) {
    String oldUnit = unit;
    unit = newUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASURE__UNIT, oldUnit, unit));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public double getLowerThreshold() {
    return lowerThreshold;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLowerThreshold(double newLowerThreshold) {
    double oldLowerThreshold = lowerThreshold;
    lowerThreshold = newLowerThreshold;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASURE__LOWER_THRESHOLD, oldLowerThreshold, lowerThreshold));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public double getUpperThreshold() {
    return upperThreshold;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setUpperThreshold(double newUpperThreshold) {
    double oldUpperThreshold = upperThreshold;
    upperThreshold = newUpperThreshold;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASURE__UPPER_THRESHOLD, oldUpperThreshold, upperThreshold));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASURE__UNIT:
        return getUnit();
      case SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASURE__LOWER_THRESHOLD:
        return getLowerThreshold();
      case SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASURE__UPPER_THRESHOLD:
        return getUpperThreshold();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASURE__UNIT:
        setUnit((String)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASURE__LOWER_THRESHOLD:
        setLowerThreshold((Double)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASURE__UPPER_THRESHOLD:
        setUpperThreshold((Double)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASURE__UNIT:
        setUnit(UNIT_EDEFAULT);
        return;
      case SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASURE__LOWER_THRESHOLD:
        setLowerThreshold(LOWER_THRESHOLD_EDEFAULT);
        return;
      case SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASURE__UPPER_THRESHOLD:
        setUpperThreshold(UPPER_THRESHOLD_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASURE__UNIT:
        return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
      case SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASURE__LOWER_THRESHOLD:
        return lowerThreshold != LOWER_THRESHOLD_EDEFAULT;
      case SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASURE__UPPER_THRESHOLD:
        return upperThreshold != UPPER_THRESHOLD_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (unit: ");
    result.append(unit);
    result.append(", lowerThreshold: ");
    result.append(lowerThreshold);
    result.append(", upperThreshold: ");
    result.append(upperThreshold);
    result.append(')');
    return result.toString();
  }

} //DimensionalMeasureImpl
