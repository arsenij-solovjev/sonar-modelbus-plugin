/**
 */
package org.sonar.plugins.modelbus.smmparser.impl;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sonar.plugins.modelbus.smmparser.BinaryMeasurement;
import org.sonar.plugins.modelbus.smmparser.DimensionalMeasurement;
import org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.BinaryMeasurementImpl#isIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.BinaryMeasurementImpl#getBaseMeasurement1 <em>Base Measurement1</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.BinaryMeasurementImpl#getBaseMeasurement2 <em>Base Measurement2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryMeasurementImpl extends DimensionalMeasurementImpl implements BinaryMeasurement {
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
   * The cached value of the '{@link #getBaseMeasurement1() <em>Base Measurement1</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBaseMeasurement1()
   * @generated
   * @ordered
   */
	protected DimensionalMeasurement baseMeasurement1;

	/**
   * The cached value of the '{@link #getBaseMeasurement2() <em>Base Measurement2</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBaseMeasurement2()
   * @generated
   * @ordered
   */
	protected DimensionalMeasurement baseMeasurement2;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected BinaryMeasurementImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.BINARY_MEASUREMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.BINARY_MEASUREMENT__IS_BASE_SUPPLIED, oldIsBaseSupplied, isBaseSupplied, !oldIsBaseSuppliedESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoftwareMetricsMetamodel2Package.BINARY_MEASUREMENT__IS_BASE_SUPPLIED, oldIsBaseSupplied, IS_BASE_SUPPLIED_EDEFAULT, oldIsBaseSuppliedESet));
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
	public DimensionalMeasurement getBaseMeasurement1() {
    return baseMeasurement1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBaseMeasurement1(DimensionalMeasurement newBaseMeasurement1) {
    DimensionalMeasurement oldBaseMeasurement1 = baseMeasurement1;
    baseMeasurement1 = newBaseMeasurement1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.BINARY_MEASUREMENT__BASE_MEASUREMENT1, oldBaseMeasurement1, baseMeasurement1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DimensionalMeasurement getBaseMeasurement2() {
    return baseMeasurement2;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBaseMeasurement2(DimensionalMeasurement newBaseMeasurement2) {
    DimensionalMeasurement oldBaseMeasurement2 = baseMeasurement2;
    baseMeasurement2 = newBaseMeasurement2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.BINARY_MEASUREMENT__BASE_MEASUREMENT2, oldBaseMeasurement2, baseMeasurement2));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.BINARY_MEASUREMENT__IS_BASE_SUPPLIED:
        return isIsBaseSupplied();
      case SoftwareMetricsMetamodel2Package.BINARY_MEASUREMENT__BASE_MEASUREMENT1:
        return getBaseMeasurement1();
      case SoftwareMetricsMetamodel2Package.BINARY_MEASUREMENT__BASE_MEASUREMENT2:
        return getBaseMeasurement2();
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
      case SoftwareMetricsMetamodel2Package.BINARY_MEASUREMENT__IS_BASE_SUPPLIED:
        setIsBaseSupplied((Boolean)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.BINARY_MEASUREMENT__BASE_MEASUREMENT1:
        setBaseMeasurement1((DimensionalMeasurement)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.BINARY_MEASUREMENT__BASE_MEASUREMENT2:
        setBaseMeasurement2((DimensionalMeasurement)newValue);
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
      case SoftwareMetricsMetamodel2Package.BINARY_MEASUREMENT__IS_BASE_SUPPLIED:
        unsetIsBaseSupplied();
        return;
      case SoftwareMetricsMetamodel2Package.BINARY_MEASUREMENT__BASE_MEASUREMENT1:
        setBaseMeasurement1((DimensionalMeasurement)null);
        return;
      case SoftwareMetricsMetamodel2Package.BINARY_MEASUREMENT__BASE_MEASUREMENT2:
        setBaseMeasurement2((DimensionalMeasurement)null);
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
      case SoftwareMetricsMetamodel2Package.BINARY_MEASUREMENT__IS_BASE_SUPPLIED:
        return isSetIsBaseSupplied();
      case SoftwareMetricsMetamodel2Package.BINARY_MEASUREMENT__BASE_MEASUREMENT1:
        return baseMeasurement1 != null;
      case SoftwareMetricsMetamodel2Package.BINARY_MEASUREMENT__BASE_MEASUREMENT2:
        return baseMeasurement2 != null;
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

} //BinaryMeasurementImpl
