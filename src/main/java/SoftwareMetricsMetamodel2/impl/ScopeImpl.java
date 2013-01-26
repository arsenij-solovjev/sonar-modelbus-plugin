/**
 */
package SoftwareMetricsMetamodel2.impl;

import SoftwareMetricsMetamodel2.Scope;
import SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.ScopeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.ScopeImpl#isEnumerated <em>Enumerated</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.ScopeImpl#getRecognizer <em>Recognizer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopeImpl extends SMMNamedElementImpl implements Scope {
	/**
   * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
	protected static final String CLASS_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
	protected String class_ = CLASS_EDEFAULT;

	/**
   * The default value of the '{@link #isEnumerated() <em>Enumerated</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isEnumerated()
   * @generated
   * @ordered
   */
	protected static final boolean ENUMERATED_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isEnumerated() <em>Enumerated</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isEnumerated()
   * @generated
   * @ordered
   */
	protected boolean enumerated = ENUMERATED_EDEFAULT;

	/**
   * This is true if the Enumerated attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean enumeratedESet;

	/**
   * The default value of the '{@link #getRecognizer() <em>Recognizer</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRecognizer()
   * @generated
   * @ordered
   */
	protected static final String RECOGNIZER_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getRecognizer() <em>Recognizer</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRecognizer()
   * @generated
   * @ordered
   */
	protected String recognizer = RECOGNIZER_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ScopeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SoftwareMetricsMetamodel2Package.Literals.SCOPE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getClass_() {
    return class_;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setClass(String newClass) {
    String oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.SCOPE__CLASS, oldClass, class_));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isEnumerated() {
    return enumerated;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setEnumerated(boolean newEnumerated) {
    boolean oldEnumerated = enumerated;
    enumerated = newEnumerated;
    boolean oldEnumeratedESet = enumeratedESet;
    enumeratedESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.SCOPE__ENUMERATED, oldEnumerated, enumerated, !oldEnumeratedESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetEnumerated() {
    boolean oldEnumerated = enumerated;
    boolean oldEnumeratedESet = enumeratedESet;
    enumerated = ENUMERATED_EDEFAULT;
    enumeratedESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoftwareMetricsMetamodel2Package.SCOPE__ENUMERATED, oldEnumerated, ENUMERATED_EDEFAULT, oldEnumeratedESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetEnumerated() {
    return enumeratedESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getRecognizer() {
    return recognizer;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRecognizer(String newRecognizer) {
    String oldRecognizer = recognizer;
    recognizer = newRecognizer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.SCOPE__RECOGNIZER, oldRecognizer, recognizer));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.SCOPE__CLASS:
        return getClass_();
      case SoftwareMetricsMetamodel2Package.SCOPE__ENUMERATED:
        return isEnumerated();
      case SoftwareMetricsMetamodel2Package.SCOPE__RECOGNIZER:
        return getRecognizer();
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
      case SoftwareMetricsMetamodel2Package.SCOPE__CLASS:
        setClass((String)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.SCOPE__ENUMERATED:
        setEnumerated((Boolean)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.SCOPE__RECOGNIZER:
        setRecognizer((String)newValue);
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
      case SoftwareMetricsMetamodel2Package.SCOPE__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case SoftwareMetricsMetamodel2Package.SCOPE__ENUMERATED:
        unsetEnumerated();
        return;
      case SoftwareMetricsMetamodel2Package.SCOPE__RECOGNIZER:
        setRecognizer(RECOGNIZER_EDEFAULT);
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
      case SoftwareMetricsMetamodel2Package.SCOPE__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
      case SoftwareMetricsMetamodel2Package.SCOPE__ENUMERATED:
        return isSetEnumerated();
      case SoftwareMetricsMetamodel2Package.SCOPE__RECOGNIZER:
        return RECOGNIZER_EDEFAULT == null ? recognizer != null : !RECOGNIZER_EDEFAULT.equals(recognizer);
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
    result.append(" (class: ");
    result.append(class_);
    result.append(", enumerated: ");
    if (enumeratedESet) result.append(enumerated); else result.append("<unset>");
    result.append(", recognizer: ");
    result.append(recognizer);
    result.append(')');
    return result.toString();
  }

} //ScopeImpl
