/**
 */
package org.sonar.plugins.modelbus.smmparser.impl;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sonar.plugins.modelbus.smmparser.CategoryRelationship;
import org.sonar.plugins.modelbus.smmparser.SMMCategory;
import org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.CategoryRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.CategoryRelationshipImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.CategoryRelationshipImpl#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryRelationshipImpl extends SMMRelationshipImpl implements CategoryRelationship {
	/**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected static final String NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected String name = NAME_EDEFAULT;

	/**
   * The cached value of the '{@link #getTo() <em>To</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
	protected SMMCategory to;

	/**
   * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
	protected SMMCategory from;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CategoryRelationshipImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.CATEGORY_RELATIONSHIP;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getName() {
    return name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.CATEGORY_RELATIONSHIP__NAME, oldName, name));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SMMCategory getTo() {
    return to;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTo(SMMCategory newTo) {
    SMMCategory oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.CATEGORY_RELATIONSHIP__TO, oldTo, to));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SMMCategory getFrom() {
    return from;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFrom(SMMCategory newFrom) {
    SMMCategory oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.CATEGORY_RELATIONSHIP__FROM, oldFrom, from));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.CATEGORY_RELATIONSHIP__NAME:
        return getName();
      case SoftwareMetricsMetamodel2Package.CATEGORY_RELATIONSHIP__TO:
        return getTo();
      case SoftwareMetricsMetamodel2Package.CATEGORY_RELATIONSHIP__FROM:
        return getFrom();
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
      case SoftwareMetricsMetamodel2Package.CATEGORY_RELATIONSHIP__NAME:
        setName((String)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.CATEGORY_RELATIONSHIP__TO:
        setTo((SMMCategory)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.CATEGORY_RELATIONSHIP__FROM:
        setFrom((SMMCategory)newValue);
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
      case SoftwareMetricsMetamodel2Package.CATEGORY_RELATIONSHIP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SoftwareMetricsMetamodel2Package.CATEGORY_RELATIONSHIP__TO:
        setTo((SMMCategory)null);
        return;
      case SoftwareMetricsMetamodel2Package.CATEGORY_RELATIONSHIP__FROM:
        setFrom((SMMCategory)null);
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
      case SoftwareMetricsMetamodel2Package.CATEGORY_RELATIONSHIP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SoftwareMetricsMetamodel2Package.CATEGORY_RELATIONSHIP__TO:
        return to != null;
      case SoftwareMetricsMetamodel2Package.CATEGORY_RELATIONSHIP__FROM:
        return from != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //CategoryRelationshipImpl
