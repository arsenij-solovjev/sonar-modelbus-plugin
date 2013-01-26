/**
 */
package org.sonar.plugins.modelbus.smmparser.impl;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sonar.plugins.modelbus.smmparser.DimensionalMeasurement;
import org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimensional Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DimensionalMeasurementImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DimensionalMeasurementImpl extends MeasurementImpl implements DimensionalMeasurement {
	/**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected double value = VALUE_EDEFAULT;

	/**
   * This is true if the Value attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean valueESet;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DimensionalMeasurementImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DIMENSIONAL_MEASUREMENT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public double getValue() {
    return value;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setValue(double newValue) {
    double oldValue = value;
    value = newValue;
    boolean oldValueESet = valueESet;
    valueESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASUREMENT__VALUE, oldValue, value, !oldValueESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetValue() {
    double oldValue = value;
    boolean oldValueESet = valueESet;
    value = VALUE_EDEFAULT;
    valueESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASUREMENT__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetValue() {
    return valueESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASUREMENT__VALUE:
        return getValue();
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
      case SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASUREMENT__VALUE:
        setValue((Double)newValue);
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
      case SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASUREMENT__VALUE:
        unsetValue();
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
      case SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASUREMENT__VALUE:
        return isSetValue();
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
    result.append(" (value: ");
    if (valueESet) result.append(value); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //DimensionalMeasurementImpl
