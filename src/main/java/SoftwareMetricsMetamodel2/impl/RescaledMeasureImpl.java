/**
 */
package SoftwareMetricsMetamodel2.impl;

import SoftwareMetricsMetamodel2.DimensionalMeasure;
import SoftwareMetricsMetamodel2.RescaledMeasure;
import SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rescaled Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.RescaledMeasureImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.RescaledMeasureImpl#getBaseMeasure <em>Base Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RescaledMeasureImpl extends DimensionalMeasureImpl implements RescaledMeasure {
	/**
   * The default value of the '{@link #getFormula() <em>Formula</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFormula()
   * @generated
   * @ordered
   */
	protected static final String FORMULA_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFormula() <em>Formula</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFormula()
   * @generated
   * @ordered
   */
	protected String formula = FORMULA_EDEFAULT;

	/**
   * The cached value of the '{@link #getBaseMeasure() <em>Base Measure</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBaseMeasure()
   * @generated
   * @ordered
   */
	protected DimensionalMeasure baseMeasure;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected RescaledMeasureImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SoftwareMetricsMetamodel2Package.Literals.RESCALED_MEASURE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getFormula() {
    return formula;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFormula(String newFormula) {
    String oldFormula = formula;
    formula = newFormula;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.RESCALED_MEASURE__FORMULA, oldFormula, formula));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DimensionalMeasure getBaseMeasure() {
    return baseMeasure;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBaseMeasure(DimensionalMeasure newBaseMeasure) {
    DimensionalMeasure oldBaseMeasure = baseMeasure;
    baseMeasure = newBaseMeasure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.RESCALED_MEASURE__BASE_MEASURE, oldBaseMeasure, baseMeasure));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.RESCALED_MEASURE__FORMULA:
        return getFormula();
      case SoftwareMetricsMetamodel2Package.RESCALED_MEASURE__BASE_MEASURE:
        return getBaseMeasure();
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
      case SoftwareMetricsMetamodel2Package.RESCALED_MEASURE__FORMULA:
        setFormula((String)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.RESCALED_MEASURE__BASE_MEASURE:
        setBaseMeasure((DimensionalMeasure)newValue);
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
      case SoftwareMetricsMetamodel2Package.RESCALED_MEASURE__FORMULA:
        setFormula(FORMULA_EDEFAULT);
        return;
      case SoftwareMetricsMetamodel2Package.RESCALED_MEASURE__BASE_MEASURE:
        setBaseMeasure((DimensionalMeasure)null);
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
      case SoftwareMetricsMetamodel2Package.RESCALED_MEASURE__FORMULA:
        return FORMULA_EDEFAULT == null ? formula != null : !FORMULA_EDEFAULT.equals(formula);
      case SoftwareMetricsMetamodel2Package.RESCALED_MEASURE__BASE_MEASURE:
        return baseMeasure != null;
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
    result.append(" (formula: ");
    result.append(formula);
    result.append(')');
    return result.toString();
  }

} //RescaledMeasureImpl
