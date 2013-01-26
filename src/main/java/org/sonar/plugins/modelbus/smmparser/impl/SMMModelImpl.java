/**
 */
package org.sonar.plugins.modelbus.smmparser.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sonar.plugins.modelbus.smmparser.SMMElement;
import org.sonar.plugins.modelbus.smmparser.SMMModel;
import org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMM Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.SMMModelImpl#getSMMElement <em>SMM Element</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.SMMModelImpl#getMetaModelPackageURI <em>Meta Model Package URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMMModelImpl extends SMMElementImpl implements SMMModel {
	/**
   * The cached value of the '{@link #getSMMElement() <em>SMM Element</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSMMElement()
   * @generated
   * @ordered
   */
	protected EList<SMMElement> sMMElement;

	/**
   * The default value of the '{@link #getMetaModelPackageURI() <em>Meta Model Package URI</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMetaModelPackageURI()
   * @generated
   * @ordered
   */
	protected static final String META_MODEL_PACKAGE_URI_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getMetaModelPackageURI() <em>Meta Model Package URI</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMetaModelPackageURI()
   * @generated
   * @ordered
   */
	protected String metaModelPackageURI = META_MODEL_PACKAGE_URI_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SMMModelImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.SMM_MODEL;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SMMElement> getSMMElement() {
    if (sMMElement == null) {
      sMMElement = new EObjectContainmentWithInverseEList<SMMElement>(SMMElement.class, this, SoftwareMetricsMetamodel2Package.SMM_MODEL__SMM_ELEMENT, SoftwareMetricsMetamodel2Package.SMM_ELEMENT__PARENT);
    }
    return sMMElement;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getMetaModelPackageURI() {
    return metaModelPackageURI;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMetaModelPackageURI(String newMetaModelPackageURI) {
    String oldMetaModelPackageURI = metaModelPackageURI;
    metaModelPackageURI = newMetaModelPackageURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.SMM_MODEL__META_MODEL_PACKAGE_URI, oldMetaModelPackageURI, metaModelPackageURI));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.SMM_MODEL__SMM_ELEMENT:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSMMElement()).basicAdd(otherEnd, msgs);
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
      case SoftwareMetricsMetamodel2Package.SMM_MODEL__SMM_ELEMENT:
        return ((InternalEList<?>)getSMMElement()).basicRemove(otherEnd, msgs);
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
      case SoftwareMetricsMetamodel2Package.SMM_MODEL__SMM_ELEMENT:
        return getSMMElement();
      case SoftwareMetricsMetamodel2Package.SMM_MODEL__META_MODEL_PACKAGE_URI:
        return getMetaModelPackageURI();
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
      case SoftwareMetricsMetamodel2Package.SMM_MODEL__SMM_ELEMENT:
        getSMMElement().clear();
        getSMMElement().addAll((Collection<? extends SMMElement>)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.SMM_MODEL__META_MODEL_PACKAGE_URI:
        setMetaModelPackageURI((String)newValue);
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
      case SoftwareMetricsMetamodel2Package.SMM_MODEL__SMM_ELEMENT:
        getSMMElement().clear();
        return;
      case SoftwareMetricsMetamodel2Package.SMM_MODEL__META_MODEL_PACKAGE_URI:
        setMetaModelPackageURI(META_MODEL_PACKAGE_URI_EDEFAULT);
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
      case SoftwareMetricsMetamodel2Package.SMM_MODEL__SMM_ELEMENT:
        return sMMElement != null && !sMMElement.isEmpty();
      case SoftwareMetricsMetamodel2Package.SMM_MODEL__META_MODEL_PACKAGE_URI:
        return META_MODEL_PACKAGE_URI_EDEFAULT == null ? metaModelPackageURI != null : !META_MODEL_PACKAGE_URI_EDEFAULT.equals(metaModelPackageURI);
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
    result.append(" (metaModelPackageURI: ");
    result.append(metaModelPackageURI);
    result.append(')');
    return result.toString();
  }

} //SMMModelImpl
