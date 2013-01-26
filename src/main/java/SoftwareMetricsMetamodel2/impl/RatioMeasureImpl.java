/**
 */
package SoftwareMetricsMetamodel2.impl;

import SoftwareMetricsMetamodel2.RatioMeasure;
import SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ratio Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.RatioMeasureImpl#getFunctor1 <em>Functor1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RatioMeasureImpl extends BinaryMeasureImpl implements RatioMeasure {
	/**
   * The default value of the '{@link #getFunctor1() <em>Functor1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFunctor1()
   * @generated
   * @ordered
   */
	protected static final String FUNCTOR1_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getFunctor1() <em>Functor1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFunctor1()
   * @generated
   * @ordered
   */
	protected String functor1 = FUNCTOR1_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected RatioMeasureImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SoftwareMetricsMetamodel2Package.Literals.RATIO_MEASURE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getFunctor1() {
    return functor1;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFunctor1(String newFunctor1) {
    String oldFunctor1 = functor1;
    functor1 = newFunctor1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.RATIO_MEASURE__FUNCTOR1, oldFunctor1, functor1));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.RATIO_MEASURE__FUNCTOR1:
        return getFunctor1();
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
      case SoftwareMetricsMetamodel2Package.RATIO_MEASURE__FUNCTOR1:
        setFunctor1((String)newValue);
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
      case SoftwareMetricsMetamodel2Package.RATIO_MEASURE__FUNCTOR1:
        setFunctor1(FUNCTOR1_EDEFAULT);
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
      case SoftwareMetricsMetamodel2Package.RATIO_MEASURE__FUNCTOR1:
        return FUNCTOR1_EDEFAULT == null ? functor1 != null : !FUNCTOR1_EDEFAULT.equals(functor1);
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
    result.append(" (functor1: ");
    result.append(functor1);
    result.append(')');
    return result.toString();
  }

} //RatioMeasureImpl
