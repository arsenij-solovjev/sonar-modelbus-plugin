/**
 */
package org.sonar.plugins.modelbus.smmparser.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sonar.plugins.modelbus.smmparser.Measure;
import org.sonar.plugins.modelbus.smmparser.SMMCategory;
import org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMM Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.SMMCategoryImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.SMMCategoryImpl#getCategoryElement <em>Category Element</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.SMMCategoryImpl#getMeasureElement <em>Measure Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMMCategoryImpl extends SMMNamedElementImpl implements SMMCategory {
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
   * The cached value of the '{@link #getCategoryElement() <em>Category Element</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCategoryElement()
   * @generated
   * @ordered
   */
	protected EList<SMMCategory> categoryElement;

	/**
   * The cached value of the '{@link #getMeasureElement() <em>Measure Element</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMeasureElement()
   * @generated
   * @ordered
   */
	protected EList<Measure> measureElement;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SMMCategoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.SMM_CATEGORY;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SMMCategory> getCategory() {
    if (category == null) {
      category = new EObjectWithInverseResolvingEList.ManyInverse<SMMCategory>(SMMCategory.class, this, SoftwareMetricsMetamodel2Package.SMM_CATEGORY__CATEGORY, SoftwareMetricsMetamodel2Package.SMM_CATEGORY__CATEGORY_ELEMENT);
    }
    return category;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SMMCategory> getCategoryElement() {
    if (categoryElement == null) {
      categoryElement = new EObjectWithInverseResolvingEList.ManyInverse<SMMCategory>(SMMCategory.class, this, SoftwareMetricsMetamodel2Package.SMM_CATEGORY__CATEGORY_ELEMENT, SoftwareMetricsMetamodel2Package.SMM_CATEGORY__CATEGORY);
    }
    return categoryElement;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Measure> getMeasureElement() {
    if (measureElement == null) {
      measureElement = new EObjectWithInverseResolvingEList.ManyInverse<Measure>(Measure.class, this, SoftwareMetricsMetamodel2Package.SMM_CATEGORY__MEASURE_ELEMENT, SoftwareMetricsMetamodel2Package.MEASURE__CATEGORY);
    }
    return measureElement;
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
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY__CATEGORY:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategory()).basicAdd(otherEnd, msgs);
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY__CATEGORY_ELEMENT:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategoryElement()).basicAdd(otherEnd, msgs);
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY__MEASURE_ELEMENT:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasureElement()).basicAdd(otherEnd, msgs);
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
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY__CATEGORY:
        return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY__CATEGORY_ELEMENT:
        return ((InternalEList<?>)getCategoryElement()).basicRemove(otherEnd, msgs);
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY__MEASURE_ELEMENT:
        return ((InternalEList<?>)getMeasureElement()).basicRemove(otherEnd, msgs);
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
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY__CATEGORY:
        return getCategory();
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY__CATEGORY_ELEMENT:
        return getCategoryElement();
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY__MEASURE_ELEMENT:
        return getMeasureElement();
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
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY__CATEGORY:
        getCategory().clear();
        getCategory().addAll((Collection<? extends SMMCategory>)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY__CATEGORY_ELEMENT:
        getCategoryElement().clear();
        getCategoryElement().addAll((Collection<? extends SMMCategory>)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY__MEASURE_ELEMENT:
        getMeasureElement().clear();
        getMeasureElement().addAll((Collection<? extends Measure>)newValue);
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
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY__CATEGORY:
        getCategory().clear();
        return;
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY__CATEGORY_ELEMENT:
        getCategoryElement().clear();
        return;
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY__MEASURE_ELEMENT:
        getMeasureElement().clear();
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
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY__CATEGORY:
        return category != null && !category.isEmpty();
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY__CATEGORY_ELEMENT:
        return categoryElement != null && !categoryElement.isEmpty();
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY__MEASURE_ELEMENT:
        return measureElement != null && !measureElement.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SMMCategoryImpl
