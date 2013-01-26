/**
 */
package SoftwareMetricsMetamodel2.impl;

import SoftwareMetricsMetamodel2.Measure;
import SoftwareMetricsMetamodel2.Measurement;
import SoftwareMetricsMetamodel2.Observation;
import SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.MeasurementImpl#getError <em>Error</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.MeasurementImpl#getObservation <em>Observation</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.MeasurementImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.MeasurementImpl#getMeasurand <em>Measurand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MeasurementImpl extends SMMElementImpl implements Measurement {
	/**
   * The default value of the '{@link #getError() <em>Error</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getError()
   * @generated
   * @ordered
   */
	protected static final String ERROR_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getError() <em>Error</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getError()
   * @generated
   * @ordered
   */
	protected String error = ERROR_EDEFAULT;

	/**
   * The cached value of the '{@link #getObservation() <em>Observation</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getObservation()
   * @generated
   * @ordered
   */
	protected Observation observation;

	/**
   * The cached value of the '{@link #getMeasure() <em>Measure</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMeasure()
   * @generated
   * @ordered
   */
	protected Measure measure;

	/**
   * The cached value of the '{@link #getMeasurand() <em>Measurand</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMeasurand()
   * @generated
   * @ordered
   */
	protected EObject measurand;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MeasurementImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SoftwareMetricsMetamodel2Package.Literals.MEASUREMENT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getError() {
    return error;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setError(String newError) {
    String oldError = error;
    error = newError;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.MEASUREMENT__ERROR, oldError, error));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Observation getObservation() {
    return observation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setObservation(Observation newObservation) {
    Observation oldObservation = observation;
    observation = newObservation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.MEASUREMENT__OBSERVATION, oldObservation, observation));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Measure getMeasure() {
    return measure;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMeasure(Measure newMeasure, NotificationChain msgs) {
    Measure oldMeasure = measure;
    measure = newMeasure;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.MEASUREMENT__MEASURE, oldMeasure, newMeasure);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMeasure(Measure newMeasure) {
    if (newMeasure != measure) {
      NotificationChain msgs = null;
      if (measure != null)
        msgs = ((InternalEObject)measure).eInverseRemove(this, SoftwareMetricsMetamodel2Package.MEASURE__MEASUREMENT, Measure.class, msgs);
      if (newMeasure != null)
        msgs = ((InternalEObject)newMeasure).eInverseAdd(this, SoftwareMetricsMetamodel2Package.MEASURE__MEASUREMENT, Measure.class, msgs);
      msgs = basicSetMeasure(newMeasure, msgs);
      if (msgs != null) msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.MEASUREMENT__MEASURE, newMeasure, newMeasure));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EObject getMeasurand() {
    if (measurand != null && measurand.eIsProxy()) {
      InternalEObject oldMeasurand = (InternalEObject)measurand;
      measurand = eResolveProxy(oldMeasurand);
      if (measurand != oldMeasurand) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwareMetricsMetamodel2Package.MEASUREMENT__MEASURAND, oldMeasurand, measurand));
      }
    }
    return measurand;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EObject basicGetMeasurand() {
    return measurand;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMeasurand(EObject newMeasurand) {
    EObject oldMeasurand = measurand;
    measurand = newMeasurand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.MEASUREMENT__MEASURAND, oldMeasurand, measurand));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.MEASUREMENT__MEASURE:
        if (measure != null)
          msgs = ((InternalEObject)measure).eInverseRemove(this, SoftwareMetricsMetamodel2Package.MEASURE__MEASUREMENT, Measure.class, msgs);
        return basicSetMeasure((Measure)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.MEASUREMENT__MEASURE:
        return basicSetMeasure(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.MEASUREMENT__ERROR:
        return getError();
      case SoftwareMetricsMetamodel2Package.MEASUREMENT__OBSERVATION:
        return getObservation();
      case SoftwareMetricsMetamodel2Package.MEASUREMENT__MEASURE:
        return getMeasure();
      case SoftwareMetricsMetamodel2Package.MEASUREMENT__MEASURAND:
        if (resolve) return getMeasurand();
        return basicGetMeasurand();
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
      case SoftwareMetricsMetamodel2Package.MEASUREMENT__ERROR:
        setError((String)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.MEASUREMENT__OBSERVATION:
        setObservation((Observation)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.MEASUREMENT__MEASURE:
        setMeasure((Measure)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.MEASUREMENT__MEASURAND:
        setMeasurand((EObject)newValue);
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
      case SoftwareMetricsMetamodel2Package.MEASUREMENT__ERROR:
        setError(ERROR_EDEFAULT);
        return;
      case SoftwareMetricsMetamodel2Package.MEASUREMENT__OBSERVATION:
        setObservation((Observation)null);
        return;
      case SoftwareMetricsMetamodel2Package.MEASUREMENT__MEASURE:
        setMeasure((Measure)null);
        return;
      case SoftwareMetricsMetamodel2Package.MEASUREMENT__MEASURAND:
        setMeasurand((EObject)null);
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
      case SoftwareMetricsMetamodel2Package.MEASUREMENT__ERROR:
        return ERROR_EDEFAULT == null ? error != null : !ERROR_EDEFAULT.equals(error);
      case SoftwareMetricsMetamodel2Package.MEASUREMENT__OBSERVATION:
        return observation != null;
      case SoftwareMetricsMetamodel2Package.MEASUREMENT__MEASURE:
        return measure != null;
      case SoftwareMetricsMetamodel2Package.MEASUREMENT__MEASURAND:
        return measurand != null;
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
    result.append(" (error: ");
    result.append(error);
    result.append(')');
    return result.toString();
  }

} //MeasurementImpl
