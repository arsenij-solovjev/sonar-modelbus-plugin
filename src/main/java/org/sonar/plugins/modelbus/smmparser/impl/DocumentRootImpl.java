/**
 */
package org.sonar.plugins.modelbus.smmparser.impl;


import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sonar.plugins.modelbus.smmparser.AggregatedMeasurement;
import org.sonar.plugins.modelbus.smmparser.BinaryMeasure;
import org.sonar.plugins.modelbus.smmparser.BinaryMeasurement;
import org.sonar.plugins.modelbus.smmparser.CategoryRelationship;
import org.sonar.plugins.modelbus.smmparser.Characteristic;
import org.sonar.plugins.modelbus.smmparser.CollectiveMeasure;
import org.sonar.plugins.modelbus.smmparser.CollectiveMeasurement;
import org.sonar.plugins.modelbus.smmparser.Count;
import org.sonar.plugins.modelbus.smmparser.Counting;
import org.sonar.plugins.modelbus.smmparser.Date;
import org.sonar.plugins.modelbus.smmparser.DimensionalMeasure;
import org.sonar.plugins.modelbus.smmparser.DimensionalMeasurement;
import org.sonar.plugins.modelbus.smmparser.DirectMeasure;
import org.sonar.plugins.modelbus.smmparser.DirectMeasurement;
import org.sonar.plugins.modelbus.smmparser.DocumentRoot;
import org.sonar.plugins.modelbus.smmparser.Grade;
import org.sonar.plugins.modelbus.smmparser.Measure;
import org.sonar.plugins.modelbus.smmparser.MeasureRelationship;
import org.sonar.plugins.modelbus.smmparser.Measurement;
import org.sonar.plugins.modelbus.smmparser.MeasurementRelation;
import org.sonar.plugins.modelbus.smmparser.NamedMeasure;
import org.sonar.plugins.modelbus.smmparser.NamedMeasurement;
import org.sonar.plugins.modelbus.smmparser.Observation;
import org.sonar.plugins.modelbus.smmparser.Ranking;
import org.sonar.plugins.modelbus.smmparser.RankingInterval;
import org.sonar.plugins.modelbus.smmparser.RatioMeasure;
import org.sonar.plugins.modelbus.smmparser.RatioMeasurement;
import org.sonar.plugins.modelbus.smmparser.ReScaledMeasurement;
import org.sonar.plugins.modelbus.smmparser.RescaledMeasure;
import org.sonar.plugins.modelbus.smmparser.SMMCategory;
import org.sonar.plugins.modelbus.smmparser.SMMElement;
import org.sonar.plugins.modelbus.smmparser.SMMModel;
import org.sonar.plugins.modelbus.smmparser.SMMRelationship;
import org.sonar.plugins.modelbus.smmparser.Scope;
import org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package;
import org.sonar.plugins.modelbus.smmparser.Timestamp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getAggregatedMeasurement <em>Aggregated Measurement</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getBinaryMeasure <em>Binary Measure</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getBinaryMeasurement <em>Binary Measurement</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getCategoryRelationship <em>Category Relationship</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getCollectiveMeasure <em>Collective Measure</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getCollectiveMeasurement <em>Collective Measurement</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getCounting <em>Counting</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getDimensionalMeasure <em>Dimensional Measure</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getDimensionalMeasurement <em>Dimensional Measurement</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getDirectMeasure <em>Direct Measure</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getDirectMeasurement <em>Direct Measurement</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getMeasurementRelation <em>Measurement Relation</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getMeasureRelationship <em>Measure Relationship</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getNamedMeasure <em>Named Measure</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getNamedMeasurement <em>Named Measurement</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getRanking <em>Ranking</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getRankingInterval <em>Ranking Interval</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getRatioMeasure <em>Ratio Measure</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getRatioMeasurment <em>Ratio Measurment</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getRescaledMeasure <em>Rescaled Measure</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getReScaledMeasurement <em>Re Scaled Measurement</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getSMMCategory <em>SMM Category</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getSMMElement <em>SMM Element</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getSMMModel <em>SMM Model</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getSMMRelationship <em>SMM Relationship</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.DocumentRootImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
   * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMixed()
   * @generated
   * @ordered
   */
	protected FeatureMap mixed;

	/**
   * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getXMLNSPrefixMap()
   * @generated
   * @ordered
   */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
   * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getXSISchemaLocation()
   * @generated
   * @ordered
   */
	protected EMap<String, String> xSISchemaLocation;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DocumentRootImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FeatureMap getMixed() {
    if (mixed == null) {
      mixed = new BasicFeatureMap(this, SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MIXED);
    }
    return mixed;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMap<String, String> getXMLNSPrefixMap() {
    if (xMLNSPrefixMap == null) {
      xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    }
    return xMLNSPrefixMap;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMap<String, String> getXSISchemaLocation() {
    if (xSISchemaLocation == null) {
      xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    }
    return xSISchemaLocation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AggregatedMeasurement getAggregatedMeasurement() {
    return (AggregatedMeasurement)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__AGGREGATED_MEASUREMENT, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAggregatedMeasurement(AggregatedMeasurement newAggregatedMeasurement, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__AGGREGATED_MEASUREMENT, newAggregatedMeasurement, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAggregatedMeasurement(AggregatedMeasurement newAggregatedMeasurement) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__AGGREGATED_MEASUREMENT, newAggregatedMeasurement);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BinaryMeasure getBinaryMeasure() {
    return (BinaryMeasure)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__BINARY_MEASURE, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetBinaryMeasure(BinaryMeasure newBinaryMeasure, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__BINARY_MEASURE, newBinaryMeasure, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBinaryMeasure(BinaryMeasure newBinaryMeasure) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__BINARY_MEASURE, newBinaryMeasure);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BinaryMeasurement getBinaryMeasurement() {
    return (BinaryMeasurement)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__BINARY_MEASUREMENT, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetBinaryMeasurement(BinaryMeasurement newBinaryMeasurement, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__BINARY_MEASUREMENT, newBinaryMeasurement, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBinaryMeasurement(BinaryMeasurement newBinaryMeasurement) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__BINARY_MEASUREMENT, newBinaryMeasurement);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CategoryRelationship getCategoryRelationship() {
    return (CategoryRelationship)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__CATEGORY_RELATIONSHIP, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetCategoryRelationship(CategoryRelationship newCategoryRelationship, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__CATEGORY_RELATIONSHIP, newCategoryRelationship, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCategoryRelationship(CategoryRelationship newCategoryRelationship) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__CATEGORY_RELATIONSHIP, newCategoryRelationship);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Characteristic getCharacteristic() {
    return (Characteristic)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__CHARACTERISTIC, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetCharacteristic(Characteristic newCharacteristic, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__CHARACTERISTIC, newCharacteristic, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCharacteristic(Characteristic newCharacteristic) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__CHARACTERISTIC, newCharacteristic);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CollectiveMeasure getCollectiveMeasure() {
    return (CollectiveMeasure)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__COLLECTIVE_MEASURE, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetCollectiveMeasure(CollectiveMeasure newCollectiveMeasure, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__COLLECTIVE_MEASURE, newCollectiveMeasure, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCollectiveMeasure(CollectiveMeasure newCollectiveMeasure) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__COLLECTIVE_MEASURE, newCollectiveMeasure);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CollectiveMeasurement getCollectiveMeasurement() {
    return (CollectiveMeasurement)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__COLLECTIVE_MEASUREMENT, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetCollectiveMeasurement(CollectiveMeasurement newCollectiveMeasurement, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__COLLECTIVE_MEASUREMENT, newCollectiveMeasurement, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCollectiveMeasurement(CollectiveMeasurement newCollectiveMeasurement) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__COLLECTIVE_MEASUREMENT, newCollectiveMeasurement);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Count getCount() {
    return (Count)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__COUNT, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetCount(Count newCount, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__COUNT, newCount, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCount(Count newCount) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__COUNT, newCount);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Counting getCounting() {
    return (Counting)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__COUNTING, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetCounting(Counting newCounting, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__COUNTING, newCounting, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCounting(Counting newCounting) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__COUNTING, newCounting);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Date getDate() {
    return (Date)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__DATE, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDate(Date newDate, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__DATE, newDate, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDate(Date newDate) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__DATE, newDate);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DimensionalMeasure getDimensionalMeasure() {
    return (DimensionalMeasure)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__DIMENSIONAL_MEASURE, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDimensionalMeasure(DimensionalMeasure newDimensionalMeasure, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__DIMENSIONAL_MEASURE, newDimensionalMeasure, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDimensionalMeasure(DimensionalMeasure newDimensionalMeasure) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__DIMENSIONAL_MEASURE, newDimensionalMeasure);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DimensionalMeasurement getDimensionalMeasurement() {
    return (DimensionalMeasurement)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__DIMENSIONAL_MEASUREMENT, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDimensionalMeasurement(DimensionalMeasurement newDimensionalMeasurement, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__DIMENSIONAL_MEASUREMENT, newDimensionalMeasurement, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDimensionalMeasurement(DimensionalMeasurement newDimensionalMeasurement) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__DIMENSIONAL_MEASUREMENT, newDimensionalMeasurement);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DirectMeasure getDirectMeasure() {
    return (DirectMeasure)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__DIRECT_MEASURE, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDirectMeasure(DirectMeasure newDirectMeasure, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__DIRECT_MEASURE, newDirectMeasure, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDirectMeasure(DirectMeasure newDirectMeasure) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__DIRECT_MEASURE, newDirectMeasure);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DirectMeasurement getDirectMeasurement() {
    return (DirectMeasurement)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__DIRECT_MEASUREMENT, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDirectMeasurement(DirectMeasurement newDirectMeasurement, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__DIRECT_MEASUREMENT, newDirectMeasurement, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDirectMeasurement(DirectMeasurement newDirectMeasurement) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__DIRECT_MEASUREMENT, newDirectMeasurement);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Grade getGrade() {
    return (Grade)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__GRADE, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetGrade(Grade newGrade, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__GRADE, newGrade, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setGrade(Grade newGrade) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__GRADE, newGrade);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Measure getMeasure() {
    return (Measure)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__MEASURE, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMeasure(Measure newMeasure, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__MEASURE, newMeasure, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMeasure(Measure newMeasure) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__MEASURE, newMeasure);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Measurement getMeasurement() {
    return (Measurement)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__MEASUREMENT, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMeasurement(Measurement newMeasurement, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__MEASUREMENT, newMeasurement, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMeasurement(Measurement newMeasurement) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__MEASUREMENT, newMeasurement);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MeasurementRelation getMeasurementRelation() {
    return (MeasurementRelation)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__MEASUREMENT_RELATION, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMeasurementRelation(MeasurementRelation newMeasurementRelation, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__MEASUREMENT_RELATION, newMeasurementRelation, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMeasurementRelation(MeasurementRelation newMeasurementRelation) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__MEASUREMENT_RELATION, newMeasurementRelation);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MeasureRelationship getMeasureRelationship() {
    return (MeasureRelationship)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__MEASURE_RELATIONSHIP, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetMeasureRelationship(MeasureRelationship newMeasureRelationship, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__MEASURE_RELATIONSHIP, newMeasureRelationship, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMeasureRelationship(MeasureRelationship newMeasureRelationship) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__MEASURE_RELATIONSHIP, newMeasureRelationship);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NamedMeasure getNamedMeasure() {
    return (NamedMeasure)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__NAMED_MEASURE, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetNamedMeasure(NamedMeasure newNamedMeasure, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__NAMED_MEASURE, newNamedMeasure, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setNamedMeasure(NamedMeasure newNamedMeasure) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__NAMED_MEASURE, newNamedMeasure);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NamedMeasurement getNamedMeasurement() {
    return (NamedMeasurement)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__NAMED_MEASUREMENT, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetNamedMeasurement(NamedMeasurement newNamedMeasurement, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__NAMED_MEASUREMENT, newNamedMeasurement, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setNamedMeasurement(NamedMeasurement newNamedMeasurement) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__NAMED_MEASUREMENT, newNamedMeasurement);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Observation getObservation() {
    return (Observation)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__OBSERVATION, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetObservation(Observation newObservation, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__OBSERVATION, newObservation, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setObservation(Observation newObservation) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__OBSERVATION, newObservation);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Ranking getRanking() {
    return (Ranking)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__RANKING, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetRanking(Ranking newRanking, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__RANKING, newRanking, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRanking(Ranking newRanking) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__RANKING, newRanking);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RankingInterval getRankingInterval() {
    return (RankingInterval)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__RANKING_INTERVAL, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetRankingInterval(RankingInterval newRankingInterval, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__RANKING_INTERVAL, newRankingInterval, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRankingInterval(RankingInterval newRankingInterval) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__RANKING_INTERVAL, newRankingInterval);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RatioMeasure getRatioMeasure() {
    return (RatioMeasure)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__RATIO_MEASURE, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetRatioMeasure(RatioMeasure newRatioMeasure, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__RATIO_MEASURE, newRatioMeasure, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRatioMeasure(RatioMeasure newRatioMeasure) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__RATIO_MEASURE, newRatioMeasure);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RatioMeasurement getRatioMeasurment() {
    return (RatioMeasurement)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__RATIO_MEASURMENT, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetRatioMeasurment(RatioMeasurement newRatioMeasurment, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__RATIO_MEASURMENT, newRatioMeasurment, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRatioMeasurment(RatioMeasurement newRatioMeasurment) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__RATIO_MEASURMENT, newRatioMeasurment);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RescaledMeasure getRescaledMeasure() {
    return (RescaledMeasure)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__RESCALED_MEASURE, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetRescaledMeasure(RescaledMeasure newRescaledMeasure, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__RESCALED_MEASURE, newRescaledMeasure, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRescaledMeasure(RescaledMeasure newRescaledMeasure) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__RESCALED_MEASURE, newRescaledMeasure);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ReScaledMeasurement getReScaledMeasurement() {
    return (ReScaledMeasurement)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__RE_SCALED_MEASUREMENT, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetReScaledMeasurement(ReScaledMeasurement newReScaledMeasurement, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__RE_SCALED_MEASUREMENT, newReScaledMeasurement, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setReScaledMeasurement(ReScaledMeasurement newReScaledMeasurement) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__RE_SCALED_MEASUREMENT, newReScaledMeasurement);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Scope getScope() {
    return (Scope)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__SCOPE, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetScope(Scope newScope, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__SCOPE, newScope, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setScope(Scope newScope) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__SCOPE, newScope);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SMMCategory getSMMCategory() {
    return (SMMCategory)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__SMM_CATEGORY, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSMMCategory(SMMCategory newSMMCategory, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__SMM_CATEGORY, newSMMCategory, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSMMCategory(SMMCategory newSMMCategory) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__SMM_CATEGORY, newSMMCategory);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SMMElement getSMMElement() {
    return (SMMElement)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__SMM_ELEMENT, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSMMElement(SMMElement newSMMElement, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__SMM_ELEMENT, newSMMElement, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSMMElement(SMMElement newSMMElement) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__SMM_ELEMENT, newSMMElement);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SMMModel getSMMModel() {
    return (SMMModel)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__SMM_MODEL, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSMMModel(SMMModel newSMMModel, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__SMM_MODEL, newSMMModel, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSMMModel(SMMModel newSMMModel) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__SMM_MODEL, newSMMModel);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SMMRelationship getSMMRelationship() {
    return (SMMRelationship)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__SMM_RELATIONSHIP, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSMMRelationship(SMMRelationship newSMMRelationship, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__SMM_RELATIONSHIP, newSMMRelationship, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSMMRelationship(SMMRelationship newSMMRelationship) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__SMM_RELATIONSHIP, newSMMRelationship);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Timestamp getTimestamp() {
    return (Timestamp)getMixed().get(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__TIMESTAMP, true);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTimestamp(Timestamp newTimestamp, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__TIMESTAMP, newTimestamp, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTimestamp(Timestamp newTimestamp) {
    ((FeatureMap.Internal)getMixed()).set(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.DOCUMENT_ROOT__TIMESTAMP, newTimestamp);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MIXED:
        return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__AGGREGATED_MEASUREMENT:
        return basicSetAggregatedMeasurement(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__BINARY_MEASURE:
        return basicSetBinaryMeasure(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__BINARY_MEASUREMENT:
        return basicSetBinaryMeasurement(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__CATEGORY_RELATIONSHIP:
        return basicSetCategoryRelationship(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__CHARACTERISTIC:
        return basicSetCharacteristic(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COLLECTIVE_MEASURE:
        return basicSetCollectiveMeasure(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COLLECTIVE_MEASUREMENT:
        return basicSetCollectiveMeasurement(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COUNT:
        return basicSetCount(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COUNTING:
        return basicSetCounting(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DATE:
        return basicSetDate(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIMENSIONAL_MEASURE:
        return basicSetDimensionalMeasure(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIMENSIONAL_MEASUREMENT:
        return basicSetDimensionalMeasurement(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIRECT_MEASURE:
        return basicSetDirectMeasure(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIRECT_MEASUREMENT:
        return basicSetDirectMeasurement(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__GRADE:
        return basicSetGrade(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASURE:
        return basicSetMeasure(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASUREMENT:
        return basicSetMeasurement(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASUREMENT_RELATION:
        return basicSetMeasurementRelation(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASURE_RELATIONSHIP:
        return basicSetMeasureRelationship(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__NAMED_MEASURE:
        return basicSetNamedMeasure(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__NAMED_MEASUREMENT:
        return basicSetNamedMeasurement(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__OBSERVATION:
        return basicSetObservation(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RANKING:
        return basicSetRanking(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RANKING_INTERVAL:
        return basicSetRankingInterval(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RATIO_MEASURE:
        return basicSetRatioMeasure(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RATIO_MEASURMENT:
        return basicSetRatioMeasurment(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RESCALED_MEASURE:
        return basicSetRescaledMeasure(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RE_SCALED_MEASUREMENT:
        return basicSetReScaledMeasurement(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SCOPE:
        return basicSetScope(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_CATEGORY:
        return basicSetSMMCategory(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_ELEMENT:
        return basicSetSMMElement(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_MODEL:
        return basicSetSMMModel(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_RELATIONSHIP:
        return basicSetSMMRelationship(null, msgs);
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__TIMESTAMP:
        return basicSetTimestamp(null, msgs);
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
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MIXED:
        if (coreType) return getMixed();
        return ((FeatureMap.Internal)getMixed()).getWrapper();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        if (coreType) return getXMLNSPrefixMap();
        else return getXMLNSPrefixMap().map();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        if (coreType) return getXSISchemaLocation();
        else return getXSISchemaLocation().map();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__AGGREGATED_MEASUREMENT:
        return getAggregatedMeasurement();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__BINARY_MEASURE:
        return getBinaryMeasure();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__BINARY_MEASUREMENT:
        return getBinaryMeasurement();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__CATEGORY_RELATIONSHIP:
        return getCategoryRelationship();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__CHARACTERISTIC:
        return getCharacteristic();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COLLECTIVE_MEASURE:
        return getCollectiveMeasure();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COLLECTIVE_MEASUREMENT:
        return getCollectiveMeasurement();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COUNT:
        return getCount();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COUNTING:
        return getCounting();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DATE:
        return getDate();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIMENSIONAL_MEASURE:
        return getDimensionalMeasure();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIMENSIONAL_MEASUREMENT:
        return getDimensionalMeasurement();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIRECT_MEASURE:
        return getDirectMeasure();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIRECT_MEASUREMENT:
        return getDirectMeasurement();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__GRADE:
        return getGrade();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASURE:
        return getMeasure();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASUREMENT:
        return getMeasurement();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASUREMENT_RELATION:
        return getMeasurementRelation();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASURE_RELATIONSHIP:
        return getMeasureRelationship();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__NAMED_MEASURE:
        return getNamedMeasure();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__NAMED_MEASUREMENT:
        return getNamedMeasurement();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__OBSERVATION:
        return getObservation();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RANKING:
        return getRanking();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RANKING_INTERVAL:
        return getRankingInterval();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RATIO_MEASURE:
        return getRatioMeasure();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RATIO_MEASURMENT:
        return getRatioMeasurment();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RESCALED_MEASURE:
        return getRescaledMeasure();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RE_SCALED_MEASUREMENT:
        return getReScaledMeasurement();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SCOPE:
        return getScope();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_CATEGORY:
        return getSMMCategory();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_ELEMENT:
        return getSMMElement();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_MODEL:
        return getSMMModel();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_RELATIONSHIP:
        return getSMMRelationship();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__TIMESTAMP:
        return getTimestamp();
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
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal)getMixed()).set(newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__AGGREGATED_MEASUREMENT:
        setAggregatedMeasurement((AggregatedMeasurement)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__BINARY_MEASURE:
        setBinaryMeasure((BinaryMeasure)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__BINARY_MEASUREMENT:
        setBinaryMeasurement((BinaryMeasurement)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__CATEGORY_RELATIONSHIP:
        setCategoryRelationship((CategoryRelationship)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__CHARACTERISTIC:
        setCharacteristic((Characteristic)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COLLECTIVE_MEASURE:
        setCollectiveMeasure((CollectiveMeasure)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COLLECTIVE_MEASUREMENT:
        setCollectiveMeasurement((CollectiveMeasurement)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COUNT:
        setCount((Count)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COUNTING:
        setCounting((Counting)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DATE:
        setDate((Date)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIMENSIONAL_MEASURE:
        setDimensionalMeasure((DimensionalMeasure)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIMENSIONAL_MEASUREMENT:
        setDimensionalMeasurement((DimensionalMeasurement)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIRECT_MEASURE:
        setDirectMeasure((DirectMeasure)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIRECT_MEASUREMENT:
        setDirectMeasurement((DirectMeasurement)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__GRADE:
        setGrade((Grade)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASURE:
        setMeasure((Measure)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASUREMENT:
        setMeasurement((Measurement)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASUREMENT_RELATION:
        setMeasurementRelation((MeasurementRelation)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASURE_RELATIONSHIP:
        setMeasureRelationship((MeasureRelationship)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__NAMED_MEASURE:
        setNamedMeasure((NamedMeasure)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__NAMED_MEASUREMENT:
        setNamedMeasurement((NamedMeasurement)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__OBSERVATION:
        setObservation((Observation)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RANKING:
        setRanking((Ranking)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RANKING_INTERVAL:
        setRankingInterval((RankingInterval)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RATIO_MEASURE:
        setRatioMeasure((RatioMeasure)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RATIO_MEASURMENT:
        setRatioMeasurment((RatioMeasurement)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RESCALED_MEASURE:
        setRescaledMeasure((RescaledMeasure)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RE_SCALED_MEASUREMENT:
        setReScaledMeasurement((ReScaledMeasurement)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SCOPE:
        setScope((Scope)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_CATEGORY:
        setSMMCategory((SMMCategory)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_ELEMENT:
        setSMMElement((SMMElement)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_MODEL:
        setSMMModel((SMMModel)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_RELATIONSHIP:
        setSMMRelationship((SMMRelationship)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__TIMESTAMP:
        setTimestamp((Timestamp)newValue);
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
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MIXED:
        getMixed().clear();
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__AGGREGATED_MEASUREMENT:
        setAggregatedMeasurement((AggregatedMeasurement)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__BINARY_MEASURE:
        setBinaryMeasure((BinaryMeasure)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__BINARY_MEASUREMENT:
        setBinaryMeasurement((BinaryMeasurement)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__CATEGORY_RELATIONSHIP:
        setCategoryRelationship((CategoryRelationship)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__CHARACTERISTIC:
        setCharacteristic((Characteristic)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COLLECTIVE_MEASURE:
        setCollectiveMeasure((CollectiveMeasure)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COLLECTIVE_MEASUREMENT:
        setCollectiveMeasurement((CollectiveMeasurement)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COUNT:
        setCount((Count)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COUNTING:
        setCounting((Counting)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DATE:
        setDate((Date)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIMENSIONAL_MEASURE:
        setDimensionalMeasure((DimensionalMeasure)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIMENSIONAL_MEASUREMENT:
        setDimensionalMeasurement((DimensionalMeasurement)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIRECT_MEASURE:
        setDirectMeasure((DirectMeasure)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIRECT_MEASUREMENT:
        setDirectMeasurement((DirectMeasurement)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__GRADE:
        setGrade((Grade)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASURE:
        setMeasure((Measure)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASUREMENT:
        setMeasurement((Measurement)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASUREMENT_RELATION:
        setMeasurementRelation((MeasurementRelation)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASURE_RELATIONSHIP:
        setMeasureRelationship((MeasureRelationship)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__NAMED_MEASURE:
        setNamedMeasure((NamedMeasure)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__NAMED_MEASUREMENT:
        setNamedMeasurement((NamedMeasurement)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__OBSERVATION:
        setObservation((Observation)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RANKING:
        setRanking((Ranking)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RANKING_INTERVAL:
        setRankingInterval((RankingInterval)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RATIO_MEASURE:
        setRatioMeasure((RatioMeasure)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RATIO_MEASURMENT:
        setRatioMeasurment((RatioMeasurement)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RESCALED_MEASURE:
        setRescaledMeasure((RescaledMeasure)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RE_SCALED_MEASUREMENT:
        setReScaledMeasurement((ReScaledMeasurement)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SCOPE:
        setScope((Scope)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_CATEGORY:
        setSMMCategory((SMMCategory)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_ELEMENT:
        setSMMElement((SMMElement)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_MODEL:
        setSMMModel((SMMModel)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_RELATIONSHIP:
        setSMMRelationship((SMMRelationship)null);
        return;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__TIMESTAMP:
        setTimestamp((Timestamp)null);
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
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MIXED:
        return mixed != null && !mixed.isEmpty();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__AGGREGATED_MEASUREMENT:
        return getAggregatedMeasurement() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__BINARY_MEASURE:
        return getBinaryMeasure() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__BINARY_MEASUREMENT:
        return getBinaryMeasurement() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__CATEGORY_RELATIONSHIP:
        return getCategoryRelationship() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__CHARACTERISTIC:
        return getCharacteristic() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COLLECTIVE_MEASURE:
        return getCollectiveMeasure() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COLLECTIVE_MEASUREMENT:
        return getCollectiveMeasurement() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COUNT:
        return getCount() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__COUNTING:
        return getCounting() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DATE:
        return getDate() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIMENSIONAL_MEASURE:
        return getDimensionalMeasure() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIMENSIONAL_MEASUREMENT:
        return getDimensionalMeasurement() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIRECT_MEASURE:
        return getDirectMeasure() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__DIRECT_MEASUREMENT:
        return getDirectMeasurement() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__GRADE:
        return getGrade() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASURE:
        return getMeasure() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASUREMENT:
        return getMeasurement() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASUREMENT_RELATION:
        return getMeasurementRelation() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__MEASURE_RELATIONSHIP:
        return getMeasureRelationship() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__NAMED_MEASURE:
        return getNamedMeasure() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__NAMED_MEASUREMENT:
        return getNamedMeasurement() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__OBSERVATION:
        return getObservation() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RANKING:
        return getRanking() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RANKING_INTERVAL:
        return getRankingInterval() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RATIO_MEASURE:
        return getRatioMeasure() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RATIO_MEASURMENT:
        return getRatioMeasurment() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RESCALED_MEASURE:
        return getRescaledMeasure() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__RE_SCALED_MEASUREMENT:
        return getReScaledMeasurement() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SCOPE:
        return getScope() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_CATEGORY:
        return getSMMCategory() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_ELEMENT:
        return getSMMElement() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_MODEL:
        return getSMMModel() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__SMM_RELATIONSHIP:
        return getSMMRelationship() != null;
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT__TIMESTAMP:
        return getTimestamp() != null;
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
    result.append(" (mixed: ");
    result.append(mixed);
    result.append(')');
    return result.toString();
  }

} //DocumentRootImpl
