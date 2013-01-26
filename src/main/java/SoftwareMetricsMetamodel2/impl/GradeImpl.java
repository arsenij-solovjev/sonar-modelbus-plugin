/**
 */
package SoftwareMetricsMetamodel2.impl;

import SoftwareMetricsMetamodel2.DimensionalMeasurement;
import SoftwareMetricsMetamodel2.Grade;
import SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.GradeImpl#isIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.GradeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.GradeImpl#getBaseMeasurement <em>Base Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GradeImpl extends MeasurementImpl implements Grade {
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
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected static final String VALUE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected String value = VALUE_EDEFAULT;

	/**
   * The cached value of the '{@link #getBaseMeasurement() <em>Base Measurement</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBaseMeasurement()
   * @generated
   * @ordered
   */
	protected DimensionalMeasurement baseMeasurement;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected GradeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SoftwareMetricsMetamodel2Package.Literals.GRADE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.GRADE__IS_BASE_SUPPLIED, oldIsBaseSupplied, isBaseSupplied, !oldIsBaseSuppliedESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoftwareMetricsMetamodel2Package.GRADE__IS_BASE_SUPPLIED, oldIsBaseSupplied, IS_BASE_SUPPLIED_EDEFAULT, oldIsBaseSuppliedESet));
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
	public String getValue() {
    return value;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setValue(String newValue) {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.GRADE__VALUE, oldValue, value));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DimensionalMeasurement getBaseMeasurement() {
    return baseMeasurement;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBaseMeasurement(DimensionalMeasurement newBaseMeasurement) {
    DimensionalMeasurement oldBaseMeasurement = baseMeasurement;
    baseMeasurement = newBaseMeasurement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.GRADE__BASE_MEASUREMENT, oldBaseMeasurement, baseMeasurement));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.GRADE__IS_BASE_SUPPLIED:
        return isIsBaseSupplied();
      case SoftwareMetricsMetamodel2Package.GRADE__VALUE:
        return getValue();
      case SoftwareMetricsMetamodel2Package.GRADE__BASE_MEASUREMENT:
        return getBaseMeasurement();
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
      case SoftwareMetricsMetamodel2Package.GRADE__IS_BASE_SUPPLIED:
        setIsBaseSupplied((Boolean)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.GRADE__VALUE:
        setValue((String)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.GRADE__BASE_MEASUREMENT:
        setBaseMeasurement((DimensionalMeasurement)newValue);
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
      case SoftwareMetricsMetamodel2Package.GRADE__IS_BASE_SUPPLIED:
        unsetIsBaseSupplied();
        return;
      case SoftwareMetricsMetamodel2Package.GRADE__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case SoftwareMetricsMetamodel2Package.GRADE__BASE_MEASUREMENT:
        setBaseMeasurement((DimensionalMeasurement)null);
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
      case SoftwareMetricsMetamodel2Package.GRADE__IS_BASE_SUPPLIED:
        return isSetIsBaseSupplied();
      case SoftwareMetricsMetamodel2Package.GRADE__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case SoftwareMetricsMetamodel2Package.GRADE__BASE_MEASUREMENT:
        return baseMeasurement != null;
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
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //GradeImpl
