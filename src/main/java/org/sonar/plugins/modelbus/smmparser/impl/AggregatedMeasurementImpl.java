/**
 */
package org.sonar.plugins.modelbus.smmparser.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectEList;
import org.sonar.plugins.modelbus.smmparser.AggregatedMeasurement;
import org.sonar.plugins.modelbus.smmparser.DimensionalMeasurement;
import org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregated Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.AggregatedMeasurementImpl#isIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.AggregatedMeasurementImpl#getBaseMeasurement <em>Base Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregatedMeasurementImpl extends DimensionalMeasurementImpl implements AggregatedMeasurement {
	/**
   * The default value of the '{@link #isIsBaseSupplied() <em>Is Base Supplied</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isIsBaseSupplied()
   * @generated
   * @ordered
   */
	protected static final boolean IS_BASE_SUPPLIED_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isIsBaseSupplied() <em>Is Base Supplied</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isIsBaseSupplied()
   * @generated
   * @ordered
   */
	protected boolean isBaseSupplied = IS_BASE_SUPPLIED_EDEFAULT;

	/**
   * This is true if the Is Base Supplied attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean isBaseSuppliedESet;

	/**
   * The cached value of the '{@link #getBaseMeasurement() <em>Base Measurement</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBaseMeasurement()
   * @generated
   * @ordered
   */
	protected EList<DimensionalMeasurement> baseMeasurement;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AggregatedMeasurementImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.AGGREGATED_MEASUREMENT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isIsBaseSupplied() {
    return isBaseSupplied;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setIsBaseSupplied(boolean newIsBaseSupplied) {
    boolean oldIsBaseSupplied = isBaseSupplied;
    isBaseSupplied = newIsBaseSupplied;
    boolean oldIsBaseSuppliedESet = isBaseSuppliedESet;
    isBaseSuppliedESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.AGGREGATED_MEASUREMENT__IS_BASE_SUPPLIED, oldIsBaseSupplied, isBaseSupplied, !oldIsBaseSuppliedESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetIsBaseSupplied() {
    boolean oldIsBaseSupplied = isBaseSupplied;
    boolean oldIsBaseSuppliedESet = isBaseSuppliedESet;
    isBaseSupplied = IS_BASE_SUPPLIED_EDEFAULT;
    isBaseSuppliedESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoftwareMetricsMetamodel2Package.AGGREGATED_MEASUREMENT__IS_BASE_SUPPLIED, oldIsBaseSupplied, IS_BASE_SUPPLIED_EDEFAULT, oldIsBaseSuppliedESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetIsBaseSupplied() {
    return isBaseSuppliedESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<DimensionalMeasurement> getBaseMeasurement() {
    if (baseMeasurement == null) {
      baseMeasurement = new EObjectEList<DimensionalMeasurement>(DimensionalMeasurement.class, this, SoftwareMetricsMetamodel2Package.AGGREGATED_MEASUREMENT__BASE_MEASUREMENT);
    }
    return baseMeasurement;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.AGGREGATED_MEASUREMENT__IS_BASE_SUPPLIED:
        return isIsBaseSupplied();
      case SoftwareMetricsMetamodel2Package.AGGREGATED_MEASUREMENT__BASE_MEASUREMENT:
        return getBaseMeasurement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.AGGREGATED_MEASUREMENT__IS_BASE_SUPPLIED:
        setIsBaseSupplied((Boolean)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.AGGREGATED_MEASUREMENT__BASE_MEASUREMENT:
        getBaseMeasurement().clear();
        getBaseMeasurement().addAll((Collection<? extends DimensionalMeasurement>)newValue);
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
      case SoftwareMetricsMetamodel2Package.AGGREGATED_MEASUREMENT__IS_BASE_SUPPLIED:
        unsetIsBaseSupplied();
        return;
      case SoftwareMetricsMetamodel2Package.AGGREGATED_MEASUREMENT__BASE_MEASUREMENT:
        getBaseMeasurement().clear();
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
      case SoftwareMetricsMetamodel2Package.AGGREGATED_MEASUREMENT__IS_BASE_SUPPLIED:
        return isSetIsBaseSupplied();
      case SoftwareMetricsMetamodel2Package.AGGREGATED_MEASUREMENT__BASE_MEASUREMENT:
        return baseMeasurement != null && !baseMeasurement.isEmpty();
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
    result.append(" (isBaseSupplied: ");
    if (isBaseSuppliedESet) result.append(isBaseSupplied); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //AggregatedMeasurementImpl
