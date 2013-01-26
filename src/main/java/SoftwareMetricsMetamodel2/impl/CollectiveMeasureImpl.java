/**
 */
package SoftwareMetricsMetamodel2.impl;

import SoftwareMetricsMetamodel2.Accumulator;
import SoftwareMetricsMetamodel2.CollectiveMeasure;
import SoftwareMetricsMetamodel2.DimensionalMeasure;
import SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collective Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.CollectiveMeasureImpl#getAccumulator <em>Accumulator</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.CollectiveMeasureImpl#getBaseMeasure <em>Base Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectiveMeasureImpl extends DimensionalMeasureImpl implements CollectiveMeasure {
	/**
   * The default value of the '{@link #getAccumulator() <em>Accumulator</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAccumulator()
   * @generated
   * @ordered
   */
	protected static final Accumulator ACCUMULATOR_EDEFAULT = Accumulator.SUM;

	/**
   * The cached value of the '{@link #getAccumulator() <em>Accumulator</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAccumulator()
   * @generated
   * @ordered
   */
	protected Accumulator accumulator = ACCUMULATOR_EDEFAULT;

	/**
   * This is true if the Accumulator attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean accumulatorESet;

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
	protected CollectiveMeasureImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SoftwareMetricsMetamodel2Package.Literals.COLLECTIVE_MEASURE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Accumulator getAccumulator() {
    return accumulator;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAccumulator(Accumulator newAccumulator) {
    Accumulator oldAccumulator = accumulator;
    accumulator = newAccumulator == null ? ACCUMULATOR_EDEFAULT : newAccumulator;
    boolean oldAccumulatorESet = accumulatorESet;
    accumulatorESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.COLLECTIVE_MEASURE__ACCUMULATOR, oldAccumulator, accumulator, !oldAccumulatorESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetAccumulator() {
    Accumulator oldAccumulator = accumulator;
    boolean oldAccumulatorESet = accumulatorESet;
    accumulator = ACCUMULATOR_EDEFAULT;
    accumulatorESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoftwareMetricsMetamodel2Package.COLLECTIVE_MEASURE__ACCUMULATOR, oldAccumulator, ACCUMULATOR_EDEFAULT, oldAccumulatorESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetAccumulator() {
    return accumulatorESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.COLLECTIVE_MEASURE__BASE_MEASURE, oldBaseMeasure, baseMeasure));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void containRelation() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.COLLECTIVE_MEASURE__ACCUMULATOR:
        return getAccumulator();
      case SoftwareMetricsMetamodel2Package.COLLECTIVE_MEASURE__BASE_MEASURE:
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
      case SoftwareMetricsMetamodel2Package.COLLECTIVE_MEASURE__ACCUMULATOR:
        setAccumulator((Accumulator)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.COLLECTIVE_MEASURE__BASE_MEASURE:
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
      case SoftwareMetricsMetamodel2Package.COLLECTIVE_MEASURE__ACCUMULATOR:
        unsetAccumulator();
        return;
      case SoftwareMetricsMetamodel2Package.COLLECTIVE_MEASURE__BASE_MEASURE:
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
      case SoftwareMetricsMetamodel2Package.COLLECTIVE_MEASURE__ACCUMULATOR:
        return isSetAccumulator();
      case SoftwareMetricsMetamodel2Package.COLLECTIVE_MEASURE__BASE_MEASURE:
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
    result.append(" (accumulator: ");
    if (accumulatorESet) result.append(accumulator); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //CollectiveMeasureImpl
