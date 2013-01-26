/**
 */
package org.sonar.plugins.modelbus.smmparser.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sonar.plugins.modelbus.smmparser.Date;
import org.sonar.plugins.modelbus.smmparser.Observation;
import org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.ObservationImpl#getObserver <em>Observer</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.ObservationImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.ObservationImpl#getWhenObserved <em>When Observed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObservationImpl extends SMMElementImpl implements Observation {
	/**
   * The default value of the '{@link #getObserver() <em>Observer</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getObserver()
   * @generated
   * @ordered
   */
	protected static final String OBSERVER_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getObserver() <em>Observer</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getObserver()
   * @generated
   * @ordered
   */
	protected String observer = OBSERVER_EDEFAULT;

	/**
   * The default value of the '{@link #getTool() <em>Tool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTool()
   * @generated
   * @ordered
   */
	protected static final String TOOL_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getTool() <em>Tool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTool()
   * @generated
   * @ordered
   */
	protected String tool = TOOL_EDEFAULT;

	/**
   * The cached value of the '{@link #getWhenObserved() <em>When Observed</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWhenObserved()
   * @generated
   * @ordered
   */
	protected Date whenObserved;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ObservationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.OBSERVATION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getObserver() {
    return observer;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setObserver(String newObserver) {
    String oldObserver = observer;
    observer = newObserver;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.OBSERVATION__OBSERVER, oldObserver, observer));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getTool() {
    return tool;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTool(String newTool) {
    String oldTool = tool;
    tool = newTool;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.OBSERVATION__TOOL, oldTool, tool));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Date getWhenObserved() {
    return whenObserved;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetWhenObserved(Date newWhenObserved, NotificationChain msgs) {
    Date oldWhenObserved = whenObserved;
    whenObserved = newWhenObserved;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.OBSERVATION__WHEN_OBSERVED, oldWhenObserved, newWhenObserved);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setWhenObserved(Date newWhenObserved) {
    if (newWhenObserved != whenObserved) {
      NotificationChain msgs = null;
      if (whenObserved != null)
        msgs = ((InternalEObject)whenObserved).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareMetricsMetamodel2Package.OBSERVATION__WHEN_OBSERVED, null, msgs);
      if (newWhenObserved != null)
        msgs = ((InternalEObject)newWhenObserved).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareMetricsMetamodel2Package.OBSERVATION__WHEN_OBSERVED, null, msgs);
      msgs = basicSetWhenObserved(newWhenObserved, msgs);
      if (msgs != null) msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.OBSERVATION__WHEN_OBSERVED, newWhenObserved, newWhenObserved));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.OBSERVATION__WHEN_OBSERVED:
        return basicSetWhenObserved(null, msgs);
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
      case SoftwareMetricsMetamodel2Package.OBSERVATION__OBSERVER:
        return getObserver();
      case SoftwareMetricsMetamodel2Package.OBSERVATION__TOOL:
        return getTool();
      case SoftwareMetricsMetamodel2Package.OBSERVATION__WHEN_OBSERVED:
        return getWhenObserved();
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
      case SoftwareMetricsMetamodel2Package.OBSERVATION__OBSERVER:
        setObserver((String)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.OBSERVATION__TOOL:
        setTool((String)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.OBSERVATION__WHEN_OBSERVED:
        setWhenObserved((Date)newValue);
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
      case SoftwareMetricsMetamodel2Package.OBSERVATION__OBSERVER:
        setObserver(OBSERVER_EDEFAULT);
        return;
      case SoftwareMetricsMetamodel2Package.OBSERVATION__TOOL:
        setTool(TOOL_EDEFAULT);
        return;
      case SoftwareMetricsMetamodel2Package.OBSERVATION__WHEN_OBSERVED:
        setWhenObserved((Date)null);
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
      case SoftwareMetricsMetamodel2Package.OBSERVATION__OBSERVER:
        return OBSERVER_EDEFAULT == null ? observer != null : !OBSERVER_EDEFAULT.equals(observer);
      case SoftwareMetricsMetamodel2Package.OBSERVATION__TOOL:
        return TOOL_EDEFAULT == null ? tool != null : !TOOL_EDEFAULT.equals(tool);
      case SoftwareMetricsMetamodel2Package.OBSERVATION__WHEN_OBSERVED:
        return whenObserved != null;
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
    result.append(" (observer: ");
    result.append(observer);
    result.append(", tool: ");
    result.append(tool);
    result.append(')');
    return result.toString();
  }

} //ObservationImpl
