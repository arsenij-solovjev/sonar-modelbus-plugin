/**
 */
package SoftwareMetricsMetamodel2.impl;

import SoftwareMetricsMetamodel2.DimensionalMeasure;
import SoftwareMetricsMetamodel2.Ranking;
import SoftwareMetricsMetamodel2.RankingInterval;
import SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ranking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.RankingImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.RankingImpl#getBaseMeasure <em>Base Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RankingImpl extends MeasureImpl implements Ranking {
	/**
   * The cached value of the '{@link #getInterval() <em>Interval</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInterval()
   * @generated
   * @ordered
   */
	protected EList<RankingInterval> interval;

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
	protected RankingImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SoftwareMetricsMetamodel2Package.Literals.RANKING;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<RankingInterval> getInterval() {
    if (interval == null) {
      interval = new EObjectEList<RankingInterval>(RankingInterval.class, this, SoftwareMetricsMetamodel2Package.RANKING__INTERVAL);
    }
    return interval;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.RANKING__BASE_MEASURE, oldBaseMeasure, baseMeasure));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.RANKING__INTERVAL:
        return getInterval();
      case SoftwareMetricsMetamodel2Package.RANKING__BASE_MEASURE:
        return getBaseMeasure();
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
      case SoftwareMetricsMetamodel2Package.RANKING__INTERVAL:
        getInterval().clear();
        getInterval().addAll((Collection<? extends RankingInterval>)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.RANKING__BASE_MEASURE:
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
      case SoftwareMetricsMetamodel2Package.RANKING__INTERVAL:
        getInterval().clear();
        return;
      case SoftwareMetricsMetamodel2Package.RANKING__BASE_MEASURE:
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
      case SoftwareMetricsMetamodel2Package.RANKING__INTERVAL:
        return interval != null && !interval.isEmpty();
      case SoftwareMetricsMetamodel2Package.RANKING__BASE_MEASURE:
        return baseMeasure != null;
    }
    return super.eIsSet(featureID);
  }

} //RankingImpl
