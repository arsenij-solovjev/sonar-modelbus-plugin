/**
 */
package SoftwareMetricsMetamodel2.impl;

import SoftwareMetricsMetamodel2.Characteristic;
import SoftwareMetricsMetamodel2.Measure;
import SoftwareMetricsMetamodel2.MeasureUtil;
import SoftwareMetricsMetamodel2.Measurement;
import SoftwareMetricsMetamodel2.SMMCategory;
import SoftwareMetricsMetamodel2.Scope;
import SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.MeasureImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.MeasureImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.MeasureImpl#getEquivalentFrom <em>Equivalent From</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.MeasureImpl#getRefinement <em>Refinement</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.MeasureImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.MeasureImpl#getUtil <em>Util</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.MeasureImpl#isDirectInvoke <em>Direct Invoke</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.MeasureImpl#getTrait <em>Trait</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.impl.MeasureImpl#getMeasurement <em>Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MeasureImpl extends SMMNamedElementImpl implements Measure {
	/**
   * The default value of the '{@link #getLibrary() <em>Library</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLibrary()
   * @generated
   * @ordered
   */
	protected static final String LIBRARY_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getLibrary() <em>Library</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLibrary()
   * @generated
   * @ordered
   */
	protected String library = LIBRARY_EDEFAULT;

	/**
   * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
	protected EList<SMMCategory> category;

	/**
   * The cached value of the '{@link #getEquivalentFrom() <em>Equivalent From</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEquivalentFrom()
   * @generated
   * @ordered
   */
	protected EList<Measure> equivalentFrom;

	/**
   * The cached value of the '{@link #getRefinement() <em>Refinement</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRefinement()
   * @generated
   * @ordered
   */
	protected EList<Measure> refinement;

	/**
   * The cached value of the '{@link #getScope() <em>Scope</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getScope()
   * @generated
   * @ordered
   */
	protected Scope scope;

	/**
   * The cached value of the '{@link #getUtil() <em>Util</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUtil()
   * @generated
   * @ordered
   */
	protected EList<MeasureUtil> util;

	/**
   * The default value of the '{@link #isDirectInvoke() <em>Direct Invoke</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isDirectInvoke()
   * @generated
   * @ordered
   */
	protected static final boolean DIRECT_INVOKE_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isDirectInvoke() <em>Direct Invoke</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isDirectInvoke()
   * @generated
   * @ordered
   */
	protected boolean directInvoke = DIRECT_INVOKE_EDEFAULT;

	/**
   * The cached value of the '{@link #getTrait() <em>Trait</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTrait()
   * @generated
   * @ordered
   */
	protected Characteristic trait;

	/**
   * The cached value of the '{@link #getMeasurement() <em>Measurement</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMeasurement()
   * @generated
   * @ordered
   */
	protected EList<Measurement> measurement;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MeasureImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SoftwareMetricsMetamodel2Package.Literals.MEASURE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getLibrary() {
    return library;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLibrary(String newLibrary) {
    String oldLibrary = library;
    library = newLibrary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.MEASURE__LIBRARY, oldLibrary, library));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SMMCategory> getCategory() {
    if (category == null) {
      category = new EObjectWithInverseEList.ManyInverse<SMMCategory>(SMMCategory.class, this, SoftwareMetricsMetamodel2Package.MEASURE__CATEGORY, SoftwareMetricsMetamodel2Package.SMM_CATEGORY__MEASURE_ELEMENT);
    }
    return category;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Measure> getEquivalentFrom() {
    if (equivalentFrom == null) {
      equivalentFrom = new EObjectEList<Measure>(Measure.class, this, SoftwareMetricsMetamodel2Package.MEASURE__EQUIVALENT_FROM);
    }
    return equivalentFrom;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Measure> getRefinement() {
    if (refinement == null) {
      refinement = new EObjectEList<Measure>(Measure.class, this, SoftwareMetricsMetamodel2Package.MEASURE__REFINEMENT);
    }
    return refinement;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Scope getScope() {
    return scope;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setScope(Scope newScope) {
    Scope oldScope = scope;
    scope = newScope;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.MEASURE__SCOPE, oldScope, scope));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<MeasureUtil> getUtil() {
    if (util == null) {
      util = new EObjectResolvingEList<MeasureUtil>(MeasureUtil.class, this, SoftwareMetricsMetamodel2Package.MEASURE__UTIL);
    }
    return util;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isDirectInvoke() {
    return directInvoke;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDirectInvoke(boolean newDirectInvoke) {
    boolean oldDirectInvoke = directInvoke;
    directInvoke = newDirectInvoke;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.MEASURE__DIRECT_INVOKE, oldDirectInvoke, directInvoke));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Characteristic getTrait() {
    if (trait != null && trait.eIsProxy()) {
      InternalEObject oldTrait = (InternalEObject)trait;
      trait = (Characteristic)eResolveProxy(oldTrait);
      if (trait != oldTrait) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwareMetricsMetamodel2Package.MEASURE__TRAIT, oldTrait, trait));
      }
    }
    return trait;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Characteristic basicGetTrait() {
    return trait;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTrait(Characteristic newTrait) {
    Characteristic oldTrait = trait;
    trait = newTrait;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.MEASURE__TRAIT, oldTrait, trait));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Measurement> getMeasurement() {
    if (measurement == null) {
      measurement = new EObjectWithInverseResolvingEList<Measurement>(Measurement.class, this, SoftwareMetricsMetamodel2Package.MEASURE__MEASUREMENT, SoftwareMetricsMetamodel2Package.MEASUREMENT__MEASURE);
    }
    return measurement;
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
      case SoftwareMetricsMetamodel2Package.MEASURE__CATEGORY:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategory()).basicAdd(otherEnd, msgs);
      case SoftwareMetricsMetamodel2Package.MEASURE__MEASUREMENT:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurement()).basicAdd(otherEnd, msgs);
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
      case SoftwareMetricsMetamodel2Package.MEASURE__CATEGORY:
        return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
      case SoftwareMetricsMetamodel2Package.MEASURE__MEASUREMENT:
        return ((InternalEList<?>)getMeasurement()).basicRemove(otherEnd, msgs);
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
      case SoftwareMetricsMetamodel2Package.MEASURE__LIBRARY:
        return getLibrary();
      case SoftwareMetricsMetamodel2Package.MEASURE__CATEGORY:
        return getCategory();
      case SoftwareMetricsMetamodel2Package.MEASURE__EQUIVALENT_FROM:
        return getEquivalentFrom();
      case SoftwareMetricsMetamodel2Package.MEASURE__REFINEMENT:
        return getRefinement();
      case SoftwareMetricsMetamodel2Package.MEASURE__SCOPE:
        return getScope();
      case SoftwareMetricsMetamodel2Package.MEASURE__UTIL:
        return getUtil();
      case SoftwareMetricsMetamodel2Package.MEASURE__DIRECT_INVOKE:
        return isDirectInvoke();
      case SoftwareMetricsMetamodel2Package.MEASURE__TRAIT:
        if (resolve) return getTrait();
        return basicGetTrait();
      case SoftwareMetricsMetamodel2Package.MEASURE__MEASUREMENT:
        return getMeasurement();
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
      case SoftwareMetricsMetamodel2Package.MEASURE__LIBRARY:
        setLibrary((String)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.MEASURE__CATEGORY:
        getCategory().clear();
        getCategory().addAll((Collection<? extends SMMCategory>)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.MEASURE__EQUIVALENT_FROM:
        getEquivalentFrom().clear();
        getEquivalentFrom().addAll((Collection<? extends Measure>)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.MEASURE__REFINEMENT:
        getRefinement().clear();
        getRefinement().addAll((Collection<? extends Measure>)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.MEASURE__SCOPE:
        setScope((Scope)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.MEASURE__UTIL:
        getUtil().clear();
        getUtil().addAll((Collection<? extends MeasureUtil>)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.MEASURE__DIRECT_INVOKE:
        setDirectInvoke((Boolean)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.MEASURE__TRAIT:
        setTrait((Characteristic)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.MEASURE__MEASUREMENT:
        getMeasurement().clear();
        getMeasurement().addAll((Collection<? extends Measurement>)newValue);
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
      case SoftwareMetricsMetamodel2Package.MEASURE__LIBRARY:
        setLibrary(LIBRARY_EDEFAULT);
        return;
      case SoftwareMetricsMetamodel2Package.MEASURE__CATEGORY:
        getCategory().clear();
        return;
      case SoftwareMetricsMetamodel2Package.MEASURE__EQUIVALENT_FROM:
        getEquivalentFrom().clear();
        return;
      case SoftwareMetricsMetamodel2Package.MEASURE__REFINEMENT:
        getRefinement().clear();
        return;
      case SoftwareMetricsMetamodel2Package.MEASURE__SCOPE:
        setScope((Scope)null);
        return;
      case SoftwareMetricsMetamodel2Package.MEASURE__UTIL:
        getUtil().clear();
        return;
      case SoftwareMetricsMetamodel2Package.MEASURE__DIRECT_INVOKE:
        setDirectInvoke(DIRECT_INVOKE_EDEFAULT);
        return;
      case SoftwareMetricsMetamodel2Package.MEASURE__TRAIT:
        setTrait((Characteristic)null);
        return;
      case SoftwareMetricsMetamodel2Package.MEASURE__MEASUREMENT:
        getMeasurement().clear();
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
      case SoftwareMetricsMetamodel2Package.MEASURE__LIBRARY:
        return LIBRARY_EDEFAULT == null ? library != null : !LIBRARY_EDEFAULT.equals(library);
      case SoftwareMetricsMetamodel2Package.MEASURE__CATEGORY:
        return category != null && !category.isEmpty();
      case SoftwareMetricsMetamodel2Package.MEASURE__EQUIVALENT_FROM:
        return equivalentFrom != null && !equivalentFrom.isEmpty();
      case SoftwareMetricsMetamodel2Package.MEASURE__REFINEMENT:
        return refinement != null && !refinement.isEmpty();
      case SoftwareMetricsMetamodel2Package.MEASURE__SCOPE:
        return scope != null;
      case SoftwareMetricsMetamodel2Package.MEASURE__UTIL:
        return util != null && !util.isEmpty();
      case SoftwareMetricsMetamodel2Package.MEASURE__DIRECT_INVOKE:
        return directInvoke != DIRECT_INVOKE_EDEFAULT;
      case SoftwareMetricsMetamodel2Package.MEASURE__TRAIT:
        return trait != null;
      case SoftwareMetricsMetamodel2Package.MEASURE__MEASUREMENT:
        return measurement != null && !measurement.isEmpty();
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
    result.append(" (library: ");
    result.append(library);
    result.append(", directInvoke: ");
    result.append(directInvoke);
    result.append(')');
    return result.toString();
  }

} //MeasureImpl
