/**
 */
package SoftwareMetricsMetamodel2.impl;

import SoftwareMetricsMetamodel2.Audit;
import SoftwareMetricsMetamodel2.Measure;
import SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.AuditImpl#getMeasure <em>Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuditImpl extends SMMNamedElementImpl implements Audit {
	/**
   * The cached value of the '{@link #getMeasure() <em>Measure</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMeasure()
   * @generated
   * @ordered
   */
	protected EList<Measure> measure;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AuditImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SoftwareMetricsMetamodel2Package.Literals.AUDIT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Measure> getMeasure() {
    if (measure == null) {
      measure = new EObjectResolvingEList<Measure>(Measure.class, this, SoftwareMetricsMetamodel2Package.AUDIT__MEASURE);
    }
    return measure;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.AUDIT__MEASURE:
        return getMeasure();
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
      case SoftwareMetricsMetamodel2Package.AUDIT__MEASURE:
        getMeasure().clear();
        getMeasure().addAll((Collection<? extends Measure>)newValue);
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
      case SoftwareMetricsMetamodel2Package.AUDIT__MEASURE:
        getMeasure().clear();
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
      case SoftwareMetricsMetamodel2Package.AUDIT__MEASURE:
        return measure != null && !measure.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AuditImpl
