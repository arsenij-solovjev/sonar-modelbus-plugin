/**
 */
package org.sonar.plugins.modelbus.smmparser.impl;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.sonar.plugins.modelbus.smmparser.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareMetricsMetamodel2FactoryImpl extends EFactoryImpl implements SoftwareMetricsMetamodel2Factory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static SoftwareMetricsMetamodel2Factory init() {
    try {
      SoftwareMetricsMetamodel2Factory theSoftwareMetricsMetamodel2Factory = (SoftwareMetricsMetamodel2Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.omg.org/ADM/SMM2"); 
      if (theSoftwareMetricsMetamodel2Factory != null) {
        return theSoftwareMetricsMetamodel2Factory;
      }
    } catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SoftwareMetricsMetamodel2FactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SoftwareMetricsMetamodel2FactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case SoftwareMetricsMetamodel2Package.AGGREGATED_MEASUREMENT: return createAggregatedMeasurement();
      case SoftwareMetricsMetamodel2Package.BINARY_MEASURE: return createBinaryMeasure();
      case SoftwareMetricsMetamodel2Package.BINARY_MEASUREMENT: return createBinaryMeasurement();
      case SoftwareMetricsMetamodel2Package.CATEGORY_RELATIONSHIP: return createCategoryRelationship();
      case SoftwareMetricsMetamodel2Package.CHARACTERISTIC: return createCharacteristic();
      case SoftwareMetricsMetamodel2Package.COLLECTIVE_MEASURE: return createCollectiveMeasure();
      case SoftwareMetricsMetamodel2Package.COLLECTIVE_MEASUREMENT: return createCollectiveMeasurement();
      case SoftwareMetricsMetamodel2Package.COUNT: return createCount();
      case SoftwareMetricsMetamodel2Package.COUNTING: return createCounting();
      case SoftwareMetricsMetamodel2Package.DATE: return createDate();
      case SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASURE: return createDimensionalMeasure();
      case SoftwareMetricsMetamodel2Package.DIRECT_MEASURE: return createDirectMeasure();
      case SoftwareMetricsMetamodel2Package.DIRECT_MEASUREMENT: return createDirectMeasurement();
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT: return createDocumentRoot();
      case SoftwareMetricsMetamodel2Package.GRADE: return createGrade();
      case SoftwareMetricsMetamodel2Package.NAMED_MEASURE: return createNamedMeasure();
      case SoftwareMetricsMetamodel2Package.NAMED_MEASUREMENT: return createNamedMeasurement();
      case SoftwareMetricsMetamodel2Package.OBSERVATION: return createObservation();
      case SoftwareMetricsMetamodel2Package.RANKING: return createRanking();
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL: return createRankingInterval();
      case SoftwareMetricsMetamodel2Package.RATIO_MEASURE: return createRatioMeasure();
      case SoftwareMetricsMetamodel2Package.RATIO_MEASUREMENT: return createRatioMeasurement();
      case SoftwareMetricsMetamodel2Package.RESCALED_MEASURE: return createRescaledMeasure();
      case SoftwareMetricsMetamodel2Package.RE_SCALED_MEASUREMENT: return createReScaledMeasurement();
      case SoftwareMetricsMetamodel2Package.SCOPE: return createScope();
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY: return createSMMCategory();
      case SoftwareMetricsMetamodel2Package.SMM_MODEL: return createSMMModel();
      case SoftwareMetricsMetamodel2Package.TIMESTAMP: return createTimestamp();
      case SoftwareMetricsMetamodel2Package.SMM_NAMED_ELEMENT: return createSMMNamedElement();
      case SoftwareMetricsMetamodel2Package.MEASURE_UTIL: return createMeasureUtil();
      case SoftwareMetricsMetamodel2Package.AUDIT: return createAudit();
      case SoftwareMetricsMetamodel2Package.MEASURE_AGGREGATION: return createMeasureAggregation();
      case SoftwareMetricsMetamodel2Package.MEASUREMENT_AGGREGATION: return createMeasurementAggregation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
      case SoftwareMetricsMetamodel2Package.ACCUMULATOR:
        return createAccumulatorFromString(eDataType, initialValue);
      case SoftwareMetricsMetamodel2Package.ACCUMULATOR_OBJECT:
        return createAccumulatorObjectFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
      case SoftwareMetricsMetamodel2Package.ACCUMULATOR:
        return convertAccumulatorToString(eDataType, instanceValue);
      case SoftwareMetricsMetamodel2Package.ACCUMULATOR_OBJECT:
        return convertAccumulatorObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AggregatedMeasurement createAggregatedMeasurement() {
    AggregatedMeasurementImpl aggregatedMeasurement = new AggregatedMeasurementImpl();
    return aggregatedMeasurement;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BinaryMeasure createBinaryMeasure() {
    BinaryMeasureImpl binaryMeasure = new BinaryMeasureImpl();
    return binaryMeasure;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BinaryMeasurement createBinaryMeasurement() {
    BinaryMeasurementImpl binaryMeasurement = new BinaryMeasurementImpl();
    return binaryMeasurement;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CategoryRelationship createCategoryRelationship() {
    CategoryRelationshipImpl categoryRelationship = new CategoryRelationshipImpl();
    return categoryRelationship;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Characteristic createCharacteristic() {
    CharacteristicImpl characteristic = new CharacteristicImpl();
    return characteristic;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CollectiveMeasure createCollectiveMeasure() {
    CollectiveMeasureImpl collectiveMeasure = new CollectiveMeasureImpl();
    return collectiveMeasure;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CollectiveMeasurement createCollectiveMeasurement() {
    CollectiveMeasurementImpl collectiveMeasurement = new CollectiveMeasurementImpl();
    return collectiveMeasurement;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Count createCount() {
    CountImpl count = new CountImpl();
    return count;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Counting createCounting() {
    CountingImpl counting = new CountingImpl();
    return counting;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Date createDate() {
    DateImpl date = new DateImpl();
    return date;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DimensionalMeasure createDimensionalMeasure() {
    DimensionalMeasureImpl dimensionalMeasure = new DimensionalMeasureImpl();
    return dimensionalMeasure;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DirectMeasure createDirectMeasure() {
    DirectMeasureImpl directMeasure = new DirectMeasureImpl();
    return directMeasure;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DirectMeasurement createDirectMeasurement() {
    DirectMeasurementImpl directMeasurement = new DirectMeasurementImpl();
    return directMeasurement;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DocumentRoot createDocumentRoot() {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Grade createGrade() {
    GradeImpl grade = new GradeImpl();
    return grade;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NamedMeasure createNamedMeasure() {
    NamedMeasureImpl namedMeasure = new NamedMeasureImpl();
    return namedMeasure;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NamedMeasurement createNamedMeasurement() {
    NamedMeasurementImpl namedMeasurement = new NamedMeasurementImpl();
    return namedMeasurement;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Observation createObservation() {
    ObservationImpl observation = new ObservationImpl();
    return observation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Ranking createRanking() {
    RankingImpl ranking = new RankingImpl();
    return ranking;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RankingInterval createRankingInterval() {
    RankingIntervalImpl rankingInterval = new RankingIntervalImpl();
    return rankingInterval;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RatioMeasure createRatioMeasure() {
    RatioMeasureImpl ratioMeasure = new RatioMeasureImpl();
    return ratioMeasure;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RatioMeasurement createRatioMeasurement() {
    RatioMeasurementImpl ratioMeasurement = new RatioMeasurementImpl();
    return ratioMeasurement;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RescaledMeasure createRescaledMeasure() {
    RescaledMeasureImpl rescaledMeasure = new RescaledMeasureImpl();
    return rescaledMeasure;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ReScaledMeasurement createReScaledMeasurement() {
    ReScaledMeasurementImpl reScaledMeasurement = new ReScaledMeasurementImpl();
    return reScaledMeasurement;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Scope createScope() {
    ScopeImpl scope = new ScopeImpl();
    return scope;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SMMCategory createSMMCategory() {
    SMMCategoryImpl smmCategory = new SMMCategoryImpl();
    return smmCategory;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SMMModel createSMMModel() {
    SMMModelImpl smmModel = new SMMModelImpl();
    return smmModel;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Timestamp createTimestamp() {
    TimestampImpl timestamp = new TimestampImpl();
    return timestamp;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SMMNamedElement createSMMNamedElement() {
    SMMNamedElementImpl smmNamedElement = new SMMNamedElementImpl();
    return smmNamedElement;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MeasureUtil createMeasureUtil() {
    MeasureUtilImpl measureUtil = new MeasureUtilImpl();
    return measureUtil;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Audit createAudit() {
    AuditImpl audit = new AuditImpl();
    return audit;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MeasureAggregation createMeasureAggregation() {
    MeasureAggregationImpl measureAggregation = new MeasureAggregationImpl();
    return measureAggregation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MeasurementAggregation createMeasurementAggregation() {
    MeasurementAggregationImpl measurementAggregation = new MeasurementAggregationImpl();
    return measurementAggregation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Accumulator createAccumulatorFromString(EDataType eDataType, String initialValue) {
    Accumulator result = Accumulator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertAccumulatorToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Accumulator createAccumulatorObjectFromString(EDataType eDataType, String initialValue) {
    return createAccumulatorFromString(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.ACCUMULATOR, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertAccumulatorObjectToString(EDataType eDataType, Object instanceValue) {
    return convertAccumulatorToString(org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.ACCUMULATOR, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SoftwareMetricsMetamodel2Package getSoftwareMetricsMetamodel2Package() {
    return (SoftwareMetricsMetamodel2Package)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static SoftwareMetricsMetamodel2Package getPackage() {
    return SoftwareMetricsMetamodel2Package.eINSTANCE;
  }

} //SoftwareMetricsMetamodel2FactoryImpl
