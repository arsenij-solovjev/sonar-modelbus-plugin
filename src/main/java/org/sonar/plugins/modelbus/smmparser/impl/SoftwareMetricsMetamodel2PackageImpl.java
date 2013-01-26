/**
 */
package org.sonar.plugins.modelbus.smmparser.impl;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.sonar.plugins.modelbus.smmparser.Accumulator;
import org.sonar.plugins.modelbus.smmparser.AggregatedMeasurement;
import org.sonar.plugins.modelbus.smmparser.Audit;
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
import org.sonar.plugins.modelbus.smmparser.MeasureAggregation;
import org.sonar.plugins.modelbus.smmparser.MeasureRelationship;
import org.sonar.plugins.modelbus.smmparser.MeasureUtil;
import org.sonar.plugins.modelbus.smmparser.Measurement;
import org.sonar.plugins.modelbus.smmparser.MeasurementAggregation;
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
import org.sonar.plugins.modelbus.smmparser.SMMNamedElement;
import org.sonar.plugins.modelbus.smmparser.SMMRelationship;
import org.sonar.plugins.modelbus.smmparser.Scope;
import org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Factory;
import org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package;
import org.sonar.plugins.modelbus.smmparser.Timestamp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareMetricsMetamodel2PackageImpl extends EPackageImpl implements SoftwareMetricsMetamodel2Package {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass aggregatedMeasurementEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass binaryMeasureEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass binaryMeasurementEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass categoryRelationshipEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass characteristicEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass collectiveMeasureEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass collectiveMeasurementEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass countEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass countingEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass dateEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass dimensionalMeasureEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass dimensionalMeasurementEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass directMeasureEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass directMeasurementEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass documentRootEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass gradeEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass measureEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass measurementEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass measurementRelationEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass measureRelationshipEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass namedMeasureEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass namedMeasurementEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass observationEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass rankingEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass rankingIntervalEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass ratioMeasureEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass ratioMeasurementEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass rescaledMeasureEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass reScaledMeasurementEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass scopeEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass smmCategoryEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass smmElementEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass smmModelEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass smmRelationshipEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass timestampEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass smmNamedElementEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass measureUtilEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass auditEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass measureAggregationEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass measurementAggregationEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EEnum accumulatorEEnum = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EDataType accumulatorObjectEDataType = null;

	/**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#eNS_URI
   * @see #init()
   * @generated
   */
	private SoftwareMetricsMetamodel2PackageImpl() {
    super(eNS_URI, SoftwareMetricsMetamodel2Factory.eINSTANCE);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static boolean isInited = false;

	/**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SoftwareMetricsMetamodel2Package#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
	public static SoftwareMetricsMetamodel2Package init() {
    if (isInited) return (SoftwareMetricsMetamodel2Package)EPackage.Registry.INSTANCE.getEPackage(SoftwareMetricsMetamodel2Package.eNS_URI);

    // Obtain or create and register package
    SoftwareMetricsMetamodel2PackageImpl theSoftwareMetricsMetamodel2Package = (SoftwareMetricsMetamodel2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SoftwareMetricsMetamodel2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SoftwareMetricsMetamodel2PackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSoftwareMetricsMetamodel2Package.createPackageContents();

    // Initialize created meta-data
    theSoftwareMetricsMetamodel2Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSoftwareMetricsMetamodel2Package.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SoftwareMetricsMetamodel2Package.eNS_URI, theSoftwareMetricsMetamodel2Package);
    return theSoftwareMetricsMetamodel2Package;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAggregatedMeasurement() {
    return aggregatedMeasurementEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getAggregatedMeasurement_IsBaseSupplied() {
    return (EAttribute)aggregatedMeasurementEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getAggregatedMeasurement_BaseMeasurement() {
    return (EReference)aggregatedMeasurementEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getBinaryMeasure() {
    return binaryMeasureEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getBinaryMeasure_Functor() {
    return (EAttribute)binaryMeasureEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getBinaryMeasure_BaseMeasure1() {
    return (EReference)binaryMeasureEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getBinaryMeasure_BaseMeasure2() {
    return (EReference)binaryMeasureEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getBinaryMeasurement() {
    return binaryMeasurementEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getBinaryMeasurement_IsBaseSupplied() {
    return (EAttribute)binaryMeasurementEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getBinaryMeasurement_BaseMeasurement1() {
    return (EReference)binaryMeasurementEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getBinaryMeasurement_BaseMeasurement2() {
    return (EReference)binaryMeasurementEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getCategoryRelationship() {
    return categoryRelationshipEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getCategoryRelationship_Name() {
    return (EAttribute)categoryRelationshipEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getCategoryRelationship_To() {
    return (EReference)categoryRelationshipEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getCategoryRelationship_From() {
    return (EReference)categoryRelationshipEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getCharacteristic() {
    return characteristicEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getCharacteristic_Measure() {
    return (EReference)characteristicEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getCollectiveMeasure() {
    return collectiveMeasureEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getCollectiveMeasure_Accumulator() {
    return (EAttribute)collectiveMeasureEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getCollectiveMeasure_BaseMeasure() {
    return (EReference)collectiveMeasureEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getCollectiveMeasurement() {
    return collectiveMeasurementEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getCollectiveMeasurement_Accumulator() {
    return (EAttribute)collectiveMeasurementEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getCollectiveMeasurement_IsBaseSupplied() {
    return (EAttribute)collectiveMeasurementEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getCollectiveMeasurement_BaseMeasurement() {
    return (EReference)collectiveMeasurementEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getCount() {
    return countEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getCounting() {
    return countingEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDate() {
    return dateEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getDate_Value() {
    return (EAttribute)dateEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDimensionalMeasure() {
    return dimensionalMeasureEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getDimensionalMeasure_Unit() {
    return (EAttribute)dimensionalMeasureEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getDimensionalMeasure_LowerThreshold() {
    return (EAttribute)dimensionalMeasureEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getDimensionalMeasure_UpperThreshold() {
    return (EAttribute)dimensionalMeasureEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDimensionalMeasurement() {
    return dimensionalMeasurementEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getDimensionalMeasurement_Value() {
    return (EAttribute)dimensionalMeasurementEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDirectMeasure() {
    return directMeasureEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getDirectMeasure_Operation() {
    return (EAttribute)directMeasureEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDirectMeasurement() {
    return directMeasurementEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDocumentRoot() {
    return documentRootEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getDocumentRoot_Mixed() {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_XSISchemaLocation() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_AggregatedMeasurement() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_BinaryMeasure() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_BinaryMeasurement() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_CategoryRelationship() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_Characteristic() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_CollectiveMeasure() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_CollectiveMeasurement() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_Count() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_Counting() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_Date() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_DimensionalMeasure() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_DimensionalMeasurement() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_DirectMeasure() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_DirectMeasurement() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_Grade() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_Measure() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_Measurement() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_MeasurementRelation() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_MeasureRelationship() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_NamedMeasure() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_NamedMeasurement() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_Observation() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_Ranking() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_RankingInterval() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_RatioMeasure() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_RatioMeasurment() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_RescaledMeasure() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_ReScaledMeasurement() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_Scope() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_SMMCategory() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_SMMElement() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_SMMModel() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_SMMRelationship() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDocumentRoot_Timestamp() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getGrade() {
    return gradeEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getGrade_IsBaseSupplied() {
    return (EAttribute)gradeEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getGrade_Value() {
    return (EAttribute)gradeEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getGrade_BaseMeasurement() {
    return (EReference)gradeEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getMeasure() {
    return measureEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getMeasure_Library() {
    return (EAttribute)measureEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getMeasure_Category() {
    return (EReference)measureEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getMeasure_EquivalentFrom() {
    return (EReference)measureEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getMeasure_Refinement() {
    return (EReference)measureEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getMeasure_Scope() {
    return (EReference)measureEClass.getEStructuralFeatures().get(4);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getMeasure_Util() {
    return (EReference)measureEClass.getEStructuralFeatures().get(5);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getMeasure_DirectInvoke() {
    return (EAttribute)measureEClass.getEStructuralFeatures().get(6);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getMeasure_Trait() {
    return (EReference)measureEClass.getEStructuralFeatures().get(7);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getMeasure_Measurement() {
    return (EReference)measureEClass.getEStructuralFeatures().get(8);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getMeasurement() {
    return measurementEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getMeasurement_Error() {
    return (EAttribute)measurementEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getMeasurement_Observation() {
    return (EReference)measurementEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getMeasurement_Measure() {
    return (EReference)measurementEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getMeasurement_Measurand() {
    return (EReference)measurementEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getMeasurementRelation() {
    return measurementRelationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getMeasurementRelation_Name() {
    return (EAttribute)measurementRelationEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getMeasurementRelation_From() {
    return (EReference)measurementRelationEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getMeasurementRelation_To() {
    return (EReference)measurementRelationEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getMeasureRelationship() {
    return measureRelationshipEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getMeasureRelationship_Name() {
    return (EAttribute)measureRelationshipEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getMeasureRelationship_From() {
    return (EReference)measureRelationshipEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getMeasureRelationship_To() {
    return (EReference)measureRelationshipEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getNamedMeasure() {
    return namedMeasureEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getNamedMeasure_Name1() {
    return (EAttribute)namedMeasureEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getNamedMeasurement() {
    return namedMeasurementEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getObservation() {
    return observationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getObservation_Observer() {
    return (EAttribute)observationEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getObservation_Tool() {
    return (EAttribute)observationEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObservation_WhenObserved() {
    return (EReference)observationEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getRanking() {
    return rankingEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getRanking_Interval() {
    return (EReference)rankingEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getRanking_BaseMeasure() {
    return (EReference)rankingEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getRankingInterval() {
    return rankingIntervalEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getRankingInterval_MaximumEndpoint() {
    return (EAttribute)rankingIntervalEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getRankingInterval_MaximumOpen() {
    return (EAttribute)rankingIntervalEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getRankingInterval_MinimumEndpoint() {
    return (EAttribute)rankingIntervalEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getRankingInterval_MinimumOpen() {
    return (EAttribute)rankingIntervalEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getRankingInterval_Symbol() {
    return (EAttribute)rankingIntervalEClass.getEStructuralFeatures().get(4);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getRatioMeasure() {
    return ratioMeasureEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getRatioMeasure_Functor1() {
    return (EAttribute)ratioMeasureEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getRatioMeasurement() {
    return ratioMeasurementEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getRescaledMeasure() {
    return rescaledMeasureEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getRescaledMeasure_Formula() {
    return (EAttribute)rescaledMeasureEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getRescaledMeasure_BaseMeasure() {
    return (EReference)rescaledMeasureEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getReScaledMeasurement() {
    return reScaledMeasurementEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getReScaledMeasurement_IsBaseSupplied() {
    return (EAttribute)reScaledMeasurementEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getReScaledMeasurement_BaseMeasurement() {
    return (EReference)reScaledMeasurementEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getScope() {
    return scopeEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getScope_Class() {
    return (EAttribute)scopeEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getScope_Enumerated() {
    return (EAttribute)scopeEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getScope_Recognizer() {
    return (EAttribute)scopeEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getSMMCategory() {
    return smmCategoryEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSMMCategory_Category() {
    return (EReference)smmCategoryEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSMMCategory_CategoryElement() {
    return (EReference)smmCategoryEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSMMCategory_MeasureElement() {
    return (EReference)smmCategoryEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getSMMElement() {
    return smmElementEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSMMElement_Parent() {
    return (EReference)smmElementEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getSMMElement_Description() {
    return (EAttribute)smmElementEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getSMMModel() {
    return smmModelEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSMMModel_SMMElement() {
    return (EReference)smmModelEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getSMMModel_MetaModelPackageURI() {
    return (EAttribute)smmModelEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getSMMRelationship() {
    return smmRelationshipEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getTimestamp() {
    return timestampEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getSMMNamedElement() {
    return smmNamedElementEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getSMMNamedElement_Name() {
    return (EAttribute)smmNamedElementEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getMeasureUtil() {
    return measureUtilEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getMeasureUtil_Operation() {
    return (EAttribute)measureUtilEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAudit() {
    return auditEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getAudit_Measure() {
    return (EReference)auditEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getMeasureAggregation() {
    return measureAggregationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getMeasurementAggregation() {
    return measurementAggregationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EEnum getAccumulator() {
    return accumulatorEEnum;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EDataType getAccumulatorObject() {
    return accumulatorObjectEDataType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SoftwareMetricsMetamodel2Factory getSoftwareMetricsMetamodel2Factory() {
    return (SoftwareMetricsMetamodel2Factory)getEFactoryInstance();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isCreated = false;

	/**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    aggregatedMeasurementEClass = createEClass(AGGREGATED_MEASUREMENT);
    createEAttribute(aggregatedMeasurementEClass, AGGREGATED_MEASUREMENT__IS_BASE_SUPPLIED);
    createEReference(aggregatedMeasurementEClass, AGGREGATED_MEASUREMENT__BASE_MEASUREMENT);

    binaryMeasureEClass = createEClass(BINARY_MEASURE);
    createEAttribute(binaryMeasureEClass, BINARY_MEASURE__FUNCTOR);
    createEReference(binaryMeasureEClass, BINARY_MEASURE__BASE_MEASURE1);
    createEReference(binaryMeasureEClass, BINARY_MEASURE__BASE_MEASURE2);

    binaryMeasurementEClass = createEClass(BINARY_MEASUREMENT);
    createEAttribute(binaryMeasurementEClass, BINARY_MEASUREMENT__IS_BASE_SUPPLIED);
    createEReference(binaryMeasurementEClass, BINARY_MEASUREMENT__BASE_MEASUREMENT1);
    createEReference(binaryMeasurementEClass, BINARY_MEASUREMENT__BASE_MEASUREMENT2);

    categoryRelationshipEClass = createEClass(CATEGORY_RELATIONSHIP);
    createEAttribute(categoryRelationshipEClass, CATEGORY_RELATIONSHIP__NAME);
    createEReference(categoryRelationshipEClass, CATEGORY_RELATIONSHIP__TO);
    createEReference(categoryRelationshipEClass, CATEGORY_RELATIONSHIP__FROM);

    characteristicEClass = createEClass(CHARACTERISTIC);
    createEReference(characteristicEClass, CHARACTERISTIC__MEASURE);

    collectiveMeasureEClass = createEClass(COLLECTIVE_MEASURE);
    createEAttribute(collectiveMeasureEClass, COLLECTIVE_MEASURE__ACCUMULATOR);
    createEReference(collectiveMeasureEClass, COLLECTIVE_MEASURE__BASE_MEASURE);

    collectiveMeasurementEClass = createEClass(COLLECTIVE_MEASUREMENT);
    createEAttribute(collectiveMeasurementEClass, COLLECTIVE_MEASUREMENT__ACCUMULATOR);
    createEAttribute(collectiveMeasurementEClass, COLLECTIVE_MEASUREMENT__IS_BASE_SUPPLIED);
    createEReference(collectiveMeasurementEClass, COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT);

    countEClass = createEClass(COUNT);

    countingEClass = createEClass(COUNTING);

    dateEClass = createEClass(DATE);
    createEAttribute(dateEClass, DATE__VALUE);

    dimensionalMeasureEClass = createEClass(DIMENSIONAL_MEASURE);
    createEAttribute(dimensionalMeasureEClass, DIMENSIONAL_MEASURE__UNIT);
    createEAttribute(dimensionalMeasureEClass, DIMENSIONAL_MEASURE__LOWER_THRESHOLD);
    createEAttribute(dimensionalMeasureEClass, DIMENSIONAL_MEASURE__UPPER_THRESHOLD);

    dimensionalMeasurementEClass = createEClass(DIMENSIONAL_MEASUREMENT);
    createEAttribute(dimensionalMeasurementEClass, DIMENSIONAL_MEASUREMENT__VALUE);

    directMeasureEClass = createEClass(DIRECT_MEASURE);
    createEAttribute(directMeasureEClass, DIRECT_MEASURE__OPERATION);

    directMeasurementEClass = createEClass(DIRECT_MEASUREMENT);

    documentRootEClass = createEClass(DOCUMENT_ROOT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__AGGREGATED_MEASUREMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__BINARY_MEASURE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__BINARY_MEASUREMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CATEGORY_RELATIONSHIP);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CHARACTERISTIC);
    createEReference(documentRootEClass, DOCUMENT_ROOT__COLLECTIVE_MEASURE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__COLLECTIVE_MEASUREMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__COUNT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__COUNTING);
    createEReference(documentRootEClass, DOCUMENT_ROOT__DATE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__DIMENSIONAL_MEASURE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__DIMENSIONAL_MEASUREMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__DIRECT_MEASURE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__DIRECT_MEASUREMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__GRADE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__MEASURE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__MEASUREMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__MEASUREMENT_RELATION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__MEASURE_RELATIONSHIP);
    createEReference(documentRootEClass, DOCUMENT_ROOT__NAMED_MEASURE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__NAMED_MEASUREMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__OBSERVATION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__RANKING);
    createEReference(documentRootEClass, DOCUMENT_ROOT__RANKING_INTERVAL);
    createEReference(documentRootEClass, DOCUMENT_ROOT__RATIO_MEASURE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__RATIO_MEASURMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__RESCALED_MEASURE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__RE_SCALED_MEASUREMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SCOPE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SMM_CATEGORY);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SMM_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SMM_MODEL);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SMM_RELATIONSHIP);
    createEReference(documentRootEClass, DOCUMENT_ROOT__TIMESTAMP);

    gradeEClass = createEClass(GRADE);
    createEAttribute(gradeEClass, GRADE__IS_BASE_SUPPLIED);
    createEAttribute(gradeEClass, GRADE__VALUE);
    createEReference(gradeEClass, GRADE__BASE_MEASUREMENT);

    measureEClass = createEClass(MEASURE);
    createEAttribute(measureEClass, MEASURE__LIBRARY);
    createEReference(measureEClass, MEASURE__CATEGORY);
    createEReference(measureEClass, MEASURE__EQUIVALENT_FROM);
    createEReference(measureEClass, MEASURE__REFINEMENT);
    createEReference(measureEClass, MEASURE__SCOPE);
    createEReference(measureEClass, MEASURE__UTIL);
    createEAttribute(measureEClass, MEASURE__DIRECT_INVOKE);
    createEReference(measureEClass, MEASURE__TRAIT);
    createEReference(measureEClass, MEASURE__MEASUREMENT);

    measurementEClass = createEClass(MEASUREMENT);
    createEAttribute(measurementEClass, MEASUREMENT__ERROR);
    createEReference(measurementEClass, MEASUREMENT__OBSERVATION);
    createEReference(measurementEClass, MEASUREMENT__MEASURE);
    createEReference(measurementEClass, MEASUREMENT__MEASURAND);

    measurementRelationEClass = createEClass(MEASUREMENT_RELATION);
    createEAttribute(measurementRelationEClass, MEASUREMENT_RELATION__NAME);
    createEReference(measurementRelationEClass, MEASUREMENT_RELATION__FROM);
    createEReference(measurementRelationEClass, MEASUREMENT_RELATION__TO);

    measureRelationshipEClass = createEClass(MEASURE_RELATIONSHIP);
    createEAttribute(measureRelationshipEClass, MEASURE_RELATIONSHIP__NAME);
    createEReference(measureRelationshipEClass, MEASURE_RELATIONSHIP__FROM);
    createEReference(measureRelationshipEClass, MEASURE_RELATIONSHIP__TO);

    namedMeasureEClass = createEClass(NAMED_MEASURE);
    createEAttribute(namedMeasureEClass, NAMED_MEASURE__NAME1);

    namedMeasurementEClass = createEClass(NAMED_MEASUREMENT);

    observationEClass = createEClass(OBSERVATION);
    createEAttribute(observationEClass, OBSERVATION__OBSERVER);
    createEAttribute(observationEClass, OBSERVATION__TOOL);
    createEReference(observationEClass, OBSERVATION__WHEN_OBSERVED);

    rankingEClass = createEClass(RANKING);
    createEReference(rankingEClass, RANKING__INTERVAL);
    createEReference(rankingEClass, RANKING__BASE_MEASURE);

    rankingIntervalEClass = createEClass(RANKING_INTERVAL);
    createEAttribute(rankingIntervalEClass, RANKING_INTERVAL__MAXIMUM_ENDPOINT);
    createEAttribute(rankingIntervalEClass, RANKING_INTERVAL__MAXIMUM_OPEN);
    createEAttribute(rankingIntervalEClass, RANKING_INTERVAL__MINIMUM_ENDPOINT);
    createEAttribute(rankingIntervalEClass, RANKING_INTERVAL__MINIMUM_OPEN);
    createEAttribute(rankingIntervalEClass, RANKING_INTERVAL__SYMBOL);

    ratioMeasureEClass = createEClass(RATIO_MEASURE);
    createEAttribute(ratioMeasureEClass, RATIO_MEASURE__FUNCTOR1);

    ratioMeasurementEClass = createEClass(RATIO_MEASUREMENT);

    rescaledMeasureEClass = createEClass(RESCALED_MEASURE);
    createEAttribute(rescaledMeasureEClass, RESCALED_MEASURE__FORMULA);
    createEReference(rescaledMeasureEClass, RESCALED_MEASURE__BASE_MEASURE);

    reScaledMeasurementEClass = createEClass(RE_SCALED_MEASUREMENT);
    createEAttribute(reScaledMeasurementEClass, RE_SCALED_MEASUREMENT__IS_BASE_SUPPLIED);
    createEReference(reScaledMeasurementEClass, RE_SCALED_MEASUREMENT__BASE_MEASUREMENT);

    scopeEClass = createEClass(SCOPE);
    createEAttribute(scopeEClass, SCOPE__CLASS);
    createEAttribute(scopeEClass, SCOPE__ENUMERATED);
    createEAttribute(scopeEClass, SCOPE__RECOGNIZER);

    smmCategoryEClass = createEClass(SMM_CATEGORY);
    createEReference(smmCategoryEClass, SMM_CATEGORY__CATEGORY);
    createEReference(smmCategoryEClass, SMM_CATEGORY__CATEGORY_ELEMENT);
    createEReference(smmCategoryEClass, SMM_CATEGORY__MEASURE_ELEMENT);

    smmElementEClass = createEClass(SMM_ELEMENT);
    createEReference(smmElementEClass, SMM_ELEMENT__PARENT);
    createEAttribute(smmElementEClass, SMM_ELEMENT__DESCRIPTION);

    smmModelEClass = createEClass(SMM_MODEL);
    createEReference(smmModelEClass, SMM_MODEL__SMM_ELEMENT);
    createEAttribute(smmModelEClass, SMM_MODEL__META_MODEL_PACKAGE_URI);

    smmRelationshipEClass = createEClass(SMM_RELATIONSHIP);

    timestampEClass = createEClass(TIMESTAMP);

    smmNamedElementEClass = createEClass(SMM_NAMED_ELEMENT);
    createEAttribute(smmNamedElementEClass, SMM_NAMED_ELEMENT__NAME);

    measureUtilEClass = createEClass(MEASURE_UTIL);
    createEAttribute(measureUtilEClass, MEASURE_UTIL__OPERATION);

    auditEClass = createEClass(AUDIT);
    createEReference(auditEClass, AUDIT__MEASURE);

    measureAggregationEClass = createEClass(MEASURE_AGGREGATION);

    measurementAggregationEClass = createEClass(MEASUREMENT_AGGREGATION);

    // Create enums
    accumulatorEEnum = createEEnum(ACCUMULATOR);

    // Create data types
    accumulatorObjectEDataType = createEDataType(ACCUMULATOR_OBJECT);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isInitialized = false;

	/**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

    // Create type parameters


    // Set bounds for type parameters

    // Add supertypes to classes
    aggregatedMeasurementEClass.getESuperTypes().add(this.getDimensionalMeasurement());
    binaryMeasureEClass.getESuperTypes().add(this.getDimensionalMeasure());
    binaryMeasurementEClass.getESuperTypes().add(this.getDimensionalMeasurement());
    categoryRelationshipEClass.getESuperTypes().add(this.getSMMRelationship());
    characteristicEClass.getESuperTypes().add(this.getSMMNamedElement());
    collectiveMeasureEClass.getESuperTypes().add(this.getDimensionalMeasure());
    collectiveMeasurementEClass.getESuperTypes().add(this.getDimensionalMeasurement());
    countEClass.getESuperTypes().add(this.getDirectMeasurement());
    countingEClass.getESuperTypes().add(this.getDirectMeasure());
    dimensionalMeasureEClass.getESuperTypes().add(this.getMeasure());
    dimensionalMeasurementEClass.getESuperTypes().add(this.getMeasurement());
    directMeasureEClass.getESuperTypes().add(this.getDimensionalMeasure());
    directMeasurementEClass.getESuperTypes().add(this.getDimensionalMeasurement());
    gradeEClass.getESuperTypes().add(this.getMeasurement());
    measureEClass.getESuperTypes().add(this.getSMMNamedElement());
    measurementEClass.getESuperTypes().add(this.getSMMElement());
    measurementRelationEClass.getESuperTypes().add(this.getSMMRelationship());
    measureRelationshipEClass.getESuperTypes().add(this.getSMMRelationship());
    namedMeasureEClass.getESuperTypes().add(this.getDimensionalMeasure());
    namedMeasurementEClass.getESuperTypes().add(this.getDimensionalMeasurement());
    observationEClass.getESuperTypes().add(this.getSMMElement());
    rankingEClass.getESuperTypes().add(this.getMeasure());
    rankingIntervalEClass.getESuperTypes().add(this.getSMMElement());
    ratioMeasureEClass.getESuperTypes().add(this.getBinaryMeasure());
    ratioMeasurementEClass.getESuperTypes().add(this.getBinaryMeasurement());
    rescaledMeasureEClass.getESuperTypes().add(this.getDimensionalMeasure());
    reScaledMeasurementEClass.getESuperTypes().add(this.getDimensionalMeasurement());
    scopeEClass.getESuperTypes().add(this.getSMMNamedElement());
    smmCategoryEClass.getESuperTypes().add(this.getSMMNamedElement());
    smmModelEClass.getESuperTypes().add(this.getSMMElement());
    smmRelationshipEClass.getESuperTypes().add(this.getSMMElement());
    smmNamedElementEClass.getESuperTypes().add(this.getSMMElement());
    measureUtilEClass.getESuperTypes().add(this.getSMMElement());
    auditEClass.getESuperTypes().add(this.getSMMNamedElement());
    measureAggregationEClass.getESuperTypes().add(this.getMeasureRelationship());
    measurementAggregationEClass.getESuperTypes().add(this.getMeasurementRelation());

    // Initialize classes and features; add operations and parameters
    initEClass(aggregatedMeasurementEClass, AggregatedMeasurement.class, "AggregatedMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAggregatedMeasurement_IsBaseSupplied(), theXMLTypePackage.getBoolean(), "isBaseSupplied", null, 1, 1, AggregatedMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAggregatedMeasurement_BaseMeasurement(), this.getDimensionalMeasurement(), null, "baseMeasurement", null, 0, -1, AggregatedMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(binaryMeasureEClass, BinaryMeasure.class, "BinaryMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBinaryMeasure_Functor(), theXMLTypePackage.getString(), "functor", null, 1, 1, BinaryMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryMeasure_BaseMeasure1(), this.getDimensionalMeasure(), null, "baseMeasure1", null, 1, 1, BinaryMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getBinaryMeasure_BaseMeasure2(), this.getDimensionalMeasure(), null, "baseMeasure2", null, 1, 1, BinaryMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(binaryMeasurementEClass, BinaryMeasurement.class, "BinaryMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBinaryMeasurement_IsBaseSupplied(), theXMLTypePackage.getBoolean(), "isBaseSupplied", null, 1, 1, BinaryMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryMeasurement_BaseMeasurement1(), this.getDimensionalMeasurement(), null, "baseMeasurement1", null, 0, 1, BinaryMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryMeasurement_BaseMeasurement2(), this.getDimensionalMeasurement(), null, "baseMeasurement2", null, 0, 1, BinaryMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(categoryRelationshipEClass, CategoryRelationship.class, "CategoryRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCategoryRelationship_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, CategoryRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCategoryRelationship_To(), this.getSMMCategory(), null, "to", null, 1, 1, CategoryRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCategoryRelationship_From(), this.getSMMCategory(), null, "from", null, 1, 1, CategoryRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(characteristicEClass, Characteristic.class, "Characteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCharacteristic_Measure(), this.getMeasure(), null, "measure", null, 0, -1, Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(collectiveMeasureEClass, CollectiveMeasure.class, "CollectiveMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCollectiveMeasure_Accumulator(), this.getAccumulator(), "accumulator", "sum", 1, 1, CollectiveMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCollectiveMeasure_BaseMeasure(), this.getDimensionalMeasure(), null, "baseMeasure", null, 1, 1, CollectiveMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    addEOperation(collectiveMeasureEClass, null, "containRelation", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(collectiveMeasurementEClass, CollectiveMeasurement.class, "CollectiveMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCollectiveMeasurement_Accumulator(), this.getAccumulator(), "accumulator", "sum", 1, 1, CollectiveMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCollectiveMeasurement_IsBaseSupplied(), theXMLTypePackage.getBoolean(), "isBaseSupplied", null, 1, 1, CollectiveMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCollectiveMeasurement_BaseMeasurement(), this.getDimensionalMeasurement(), null, "baseMeasurement", null, 0, -1, CollectiveMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(countEClass, Count.class, "Count", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(countingEClass, Counting.class, "Counting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDate_Value(), ecorePackage.getELong(), "value", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dimensionalMeasureEClass, DimensionalMeasure.class, "DimensionalMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDimensionalMeasure_Unit(), theXMLTypePackage.getString(), "unit", null, 1, 1, DimensionalMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDimensionalMeasure_LowerThreshold(), ecorePackage.getEDouble(), "lowerThreshold", null, 0, 1, DimensionalMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDimensionalMeasure_UpperThreshold(), ecorePackage.getEDouble(), "upperThreshold", null, 0, 1, DimensionalMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dimensionalMeasurementEClass, DimensionalMeasurement.class, "DimensionalMeasurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDimensionalMeasurement_Value(), theXMLTypePackage.getDouble(), "value", null, 0, 1, DimensionalMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(directMeasureEClass, DirectMeasure.class, "DirectMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDirectMeasure_Operation(), theXMLTypePackage.getString(), "operation", null, 1, 1, DirectMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(directMeasurementEClass, DirectMeasurement.class, "DirectMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_AggregatedMeasurement(), this.getAggregatedMeasurement(), null, "aggregatedMeasurement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_BinaryMeasure(), this.getBinaryMeasure(), null, "binaryMeasure", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_BinaryMeasurement(), this.getBinaryMeasurement(), null, "binaryMeasurement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CategoryRelationship(), this.getCategoryRelationship(), null, "categoryRelationship", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Characteristic(), this.getCharacteristic(), null, "characteristic", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CollectiveMeasure(), this.getCollectiveMeasure(), null, "collectiveMeasure", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CollectiveMeasurement(), this.getCollectiveMeasurement(), null, "collectiveMeasurement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Count(), this.getCount(), null, "count", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Counting(), this.getCounting(), null, "counting", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Date(), this.getDate(), null, "date", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_DimensionalMeasure(), this.getDimensionalMeasure(), null, "dimensionalMeasure", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_DimensionalMeasurement(), this.getDimensionalMeasurement(), null, "dimensionalMeasurement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_DirectMeasure(), this.getDirectMeasure(), null, "directMeasure", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_DirectMeasurement(), this.getDirectMeasurement(), null, "directMeasurement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Grade(), this.getGrade(), null, "grade", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Measure(), this.getMeasure(), null, "measure", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Measurement(), this.getMeasurement(), null, "measurement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_MeasurementRelation(), this.getMeasurementRelation(), null, "measurementRelation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_MeasureRelationship(), this.getMeasureRelationship(), null, "measureRelationship", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_NamedMeasure(), this.getNamedMeasure(), null, "namedMeasure", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_NamedMeasurement(), this.getNamedMeasurement(), null, "namedMeasurement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Observation(), this.getObservation(), null, "observation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Ranking(), this.getRanking(), null, "ranking", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_RankingInterval(), this.getRankingInterval(), null, "rankingInterval", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_RatioMeasure(), this.getRatioMeasure(), null, "ratioMeasure", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_RatioMeasurment(), this.getRatioMeasurement(), null, "ratioMeasurment", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_RescaledMeasure(), this.getRescaledMeasure(), null, "rescaledMeasure", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_ReScaledMeasurement(), this.getReScaledMeasurement(), null, "reScaledMeasurement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Scope(), this.getScope(), null, "scope", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SMMCategory(), this.getSMMCategory(), null, "sMMCategory", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SMMElement(), this.getSMMElement(), null, "sMMElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SMMModel(), this.getSMMModel(), null, "sMMModel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SMMRelationship(), this.getSMMRelationship(), null, "sMMRelationship", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Timestamp(), this.getTimestamp(), null, "timestamp", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(gradeEClass, Grade.class, "Grade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGrade_IsBaseSupplied(), theXMLTypePackage.getBoolean(), "isBaseSupplied", null, 1, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGrade_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGrade_BaseMeasurement(), this.getDimensionalMeasurement(), null, "baseMeasurement", null, 0, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(measureEClass, Measure.class, "Measure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMeasure_Library(), theXMLTypePackage.getString(), "library", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMeasure_Category(), this.getSMMCategory(), this.getSMMCategory_MeasureElement(), "category", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMeasure_EquivalentFrom(), this.getMeasure(), null, "equivalentFrom", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMeasure_Refinement(), this.getMeasure(), null, "refinement", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMeasure_Scope(), this.getScope(), null, "scope", null, 1, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMeasure_Util(), this.getMeasureUtil(), null, "util", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMeasure_DirectInvoke(), ecorePackage.getEBoolean(), "directInvoke", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMeasure_Trait(), this.getCharacteristic(), null, "trait", null, 1, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getMeasure_Measurement(), this.getMeasurement(), this.getMeasurement_Measure(), "measurement", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(measurementEClass, Measurement.class, "Measurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMeasurement_Error(), theXMLTypePackage.getString(), "error", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMeasurement_Observation(), this.getObservation(), null, "observation", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getMeasurement_Measure(), this.getMeasure(), this.getMeasure_Measurement(), "measure", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMeasurement_Measurand(), ecorePackage.getEObject(), null, "measurand", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(measurementRelationEClass, MeasurementRelation.class, "MeasurementRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMeasurementRelation_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, MeasurementRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMeasurementRelation_From(), this.getMeasurement(), null, "from", null, 1, 1, MeasurementRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getMeasurementRelation_To(), this.getMeasurement(), null, "to", null, 1, 1, MeasurementRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(measureRelationshipEClass, MeasureRelationship.class, "MeasureRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMeasureRelationship_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, MeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMeasureRelationship_From(), this.getMeasure(), null, "from", null, 1, 1, MeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getMeasureRelationship_To(), this.getMeasure(), null, "to", null, 1, 1, MeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(namedMeasureEClass, NamedMeasure.class, "NamedMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedMeasure_Name1(), theXMLTypePackage.getString(), "name1", null, 1, 1, NamedMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedMeasurementEClass, NamedMeasurement.class, "NamedMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(observationEClass, Observation.class, "Observation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObservation_Observer(), theXMLTypePackage.getString(), "observer", null, 0, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObservation_Tool(), theXMLTypePackage.getString(), "tool", null, 0, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObservation_WhenObserved(), this.getDate(), null, "whenObserved", null, 0, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rankingEClass, Ranking.class, "Ranking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRanking_Interval(), this.getRankingInterval(), null, "interval", null, 1, -1, Ranking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRanking_BaseMeasure(), this.getDimensionalMeasure(), null, "baseMeasure", null, 0, 1, Ranking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rankingIntervalEClass, RankingInterval.class, "RankingInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRankingInterval_MaximumEndpoint(), theXMLTypePackage.getDouble(), "maximumEndpoint", null, 1, 1, RankingInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRankingInterval_MaximumOpen(), theXMLTypePackage.getBoolean(), "maximumOpen", null, 0, 1, RankingInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRankingInterval_MinimumEndpoint(), theXMLTypePackage.getDouble(), "minimumEndpoint", null, 1, 1, RankingInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRankingInterval_MinimumOpen(), theXMLTypePackage.getBoolean(), "minimumOpen", null, 0, 1, RankingInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRankingInterval_Symbol(), theXMLTypePackage.getString(), "symbol", null, 1, 1, RankingInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ratioMeasureEClass, RatioMeasure.class, "RatioMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRatioMeasure_Functor1(), theXMLTypePackage.getString(), "functor1", null, 1, 1, RatioMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ratioMeasurementEClass, RatioMeasurement.class, "RatioMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rescaledMeasureEClass, RescaledMeasure.class, "RescaledMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRescaledMeasure_Formula(), theXMLTypePackage.getString(), "formula", null, 1, 1, RescaledMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRescaledMeasure_BaseMeasure(), this.getDimensionalMeasure(), null, "baseMeasure", null, 1, 1, RescaledMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reScaledMeasurementEClass, ReScaledMeasurement.class, "ReScaledMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReScaledMeasurement_IsBaseSupplied(), theXMLTypePackage.getBoolean(), "isBaseSupplied", null, 1, 1, ReScaledMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReScaledMeasurement_BaseMeasurement(), this.getDimensionalMeasurement(), null, "baseMeasurement", null, 1, 1, ReScaledMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scopeEClass, Scope.class, "Scope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScope_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScope_Enumerated(), theXMLTypePackage.getBoolean(), "enumerated", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScope_Recognizer(), theXMLTypePackage.getString(), "recognizer", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smmCategoryEClass, SMMCategory.class, "SMMCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMMCategory_Category(), this.getSMMCategory(), this.getSMMCategory_CategoryElement(), "category", null, 0, -1, SMMCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getSMMCategory_CategoryElement(), this.getSMMCategory(), this.getSMMCategory_Category(), "categoryElement", null, 0, -1, SMMCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getSMMCategory_MeasureElement(), this.getMeasure(), this.getMeasure_Category(), "measureElement", null, 0, -1, SMMCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(smmElementEClass, SMMElement.class, "SMMElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMMElement_Parent(), this.getSMMModel(), this.getSMMModel_SMMElement(), "parent", null, 0, 1, SMMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getSMMElement_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, SMMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smmModelEClass, SMMModel.class, "SMMModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMMModel_SMMElement(), this.getSMMElement(), this.getSMMElement_Parent(), "sMMElement", null, 1, -1, SMMModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getSMMModel_MetaModelPackageURI(), theXMLTypePackage.getString(), "metaModelPackageURI", null, 0, 1, SMMModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smmRelationshipEClass, SMMRelationship.class, "SMMRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(timestampEClass, Timestamp.class, "Timestamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smmNamedElementEClass, SMMNamedElement.class, "SMMNamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSMMNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, SMMNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(measureUtilEClass, MeasureUtil.class, "MeasureUtil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMeasureUtil_Operation(), ecorePackage.getEString(), "operation", null, 0, 1, MeasureUtil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(auditEClass, Audit.class, "Audit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAudit_Measure(), this.getMeasure(), null, "measure", null, 0, -1, Audit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(measureAggregationEClass, MeasureAggregation.class, "MeasureAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(measurementAggregationEClass, MeasurementAggregation.class, "MeasurementAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(accumulatorEEnum, Accumulator.class, "Accumulator");
    addEEnumLiteral(accumulatorEEnum, Accumulator.SUM);
    addEEnumLiteral(accumulatorEEnum, Accumulator.MAXIMUM);
    addEEnumLiteral(accumulatorEEnum, Accumulator.MINIMUM);
    addEEnumLiteral(accumulatorEEnum, Accumulator.AVERAGE);

    // Initialize data types
        initEDataType(accumulatorObjectEDataType, Accumulator.class, "AccumulatorObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
  }

	/**
   * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createExtendedMetaDataAnnotations() {
    String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "qualified", "false"
       });
    addAnnotation
      (accumulatorEEnum, 
       source, 
       new String[] 
       {
       "name", "Accumulator"
       });
    addAnnotation
      (accumulatorObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "Accumulator:Object",			 "baseType", "Accumulator"
       });
    addAnnotation
      (aggregatedMeasurementEClass, 
       source, 
       new String[] 
       {
       "name", "AggregatedMeasurement",			 "kind", "elementOnly"
       });
    addAnnotation
      (getAggregatedMeasurement_IsBaseSupplied(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "isBaseSupplied",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getAggregatedMeasurement_BaseMeasurement(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "baseMeasurement",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (binaryMeasureEClass, 
       source, 
       new String[] 
       {
       "name", "BinaryMeasure",			 "kind", "elementOnly"
       });
    addAnnotation
      (getBinaryMeasure_Functor(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "functor",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getBinaryMeasure_BaseMeasure1(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "baseMeasure1",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getBinaryMeasure_BaseMeasure2(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "baseMeasure2",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (binaryMeasurementEClass, 
       source, 
       new String[] 
       {
       "name", "BinaryMeasurement",			 "kind", "elementOnly"
       });
    addAnnotation
      (getBinaryMeasurement_IsBaseSupplied(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "isBaseSupplied",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getBinaryMeasurement_BaseMeasurement1(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "baseMeasurement1",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getBinaryMeasurement_BaseMeasurement2(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "baseMeasurement2",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (categoryRelationshipEClass, 
       source, 
       new String[] 
       {
       "name", "Category_Relationship",			 "kind", "elementOnly"
       });
    addAnnotation
      (getCategoryRelationship_Name(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "name",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getCategoryRelationship_To(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "to",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getCategoryRelationship_From(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "from",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (characteristicEClass, 
       source, 
       new String[] 
       {
       "name", "Characteristic",			 "kind", "elementOnly"
       });
    addAnnotation
      (getCharacteristic_Measure(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "Measure",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (collectiveMeasureEClass, 
       source, 
       new String[] 
       {
       "name", "CollectiveMeasure",			 "kind", "elementOnly"
       });
    addAnnotation
      (getCollectiveMeasure_Accumulator(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "accumulator",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getCollectiveMeasure_BaseMeasure(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "baseMeasure",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (collectiveMeasurementEClass, 
       source, 
       new String[] 
       {
       "name", "CollectiveMeasurement",			 "kind", "elementOnly"
       });
    addAnnotation
      (getCollectiveMeasurement_Accumulator(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "accumulator",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getCollectiveMeasurement_IsBaseSupplied(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "isBaseSupplied",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getCollectiveMeasurement_BaseMeasurement(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "baseMeasurement",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (countEClass, 
       source, 
       new String[] 
       {
       "name", "Count",			 "kind", "elementOnly"
       });
    addAnnotation
      (countingEClass, 
       source, 
       new String[] 
       {
       "name", "Counting",			 "kind", "elementOnly"
       });
    addAnnotation
      (dateEClass, 
       source, 
       new String[] 
       {
       "name", "Date",			 "kind", "empty"
       });
    addAnnotation
      (dimensionalMeasureEClass, 
       source, 
       new String[] 
       {
       "name", "DimensionalMeasure",			 "kind", "elementOnly"
       });
    addAnnotation
      (getDimensionalMeasure_Unit(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "unit",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (dimensionalMeasurementEClass, 
       source, 
       new String[] 
       {
       "name", "DimensionalMeasurement",			 "kind", "elementOnly"
       });
    addAnnotation
      (getDimensionalMeasurement_Value(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "value",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (directMeasureEClass, 
       source, 
       new String[] 
       {
       "name", "DirectMeasure",			 "kind", "elementOnly"
       });
    addAnnotation
      (getDirectMeasure_Operation(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "operation",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (directMeasurementEClass, 
       source, 
       new String[] 
       {
       "name", "DirectMeasurement",			 "kind", "elementOnly"
       });
    addAnnotation
      (documentRootEClass, 
       source, 
       new String[] 
       {
       "name", "",			 "kind", "mixed"
       });
    addAnnotation
      (getDocumentRoot_Mixed(), 
       source, 
       new String[] 
       {
       "kind", "elementWildcard",			 "name", ":mixed"
       });
    addAnnotation
      (getDocumentRoot_XMLNSPrefixMap(), 
       source, 
       new String[] 
       {
       "kind", "attribute",			 "name", "xmlns:prefix"
       });
    addAnnotation
      (getDocumentRoot_XSISchemaLocation(), 
       source, 
       new String[] 
       {
       "kind", "attribute",			 "name", "xsi:schemaLocation"
       });
    addAnnotation
      (getDocumentRoot_AggregatedMeasurement(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "AggregatedMeasurement",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_BinaryMeasure(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "BinaryMeasure",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_BinaryMeasurement(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "BinaryMeasurement",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_CategoryRelationship(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "Category_Relationship",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_Characteristic(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "Characteristic",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_CollectiveMeasure(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "CollectiveMeasure",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_CollectiveMeasurement(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "CollectiveMeasurement",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_Count(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "Count",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_Counting(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "Counting",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_Date(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "Date",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_DimensionalMeasure(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "DimensionalMeasure",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_DimensionalMeasurement(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "DimensionalMeasurement",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_DirectMeasure(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "DirectMeasure",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_DirectMeasurement(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "DirectMeasurement",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_Grade(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "Grade",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_Measure(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "Measure",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_Measurement(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "Measurement",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_MeasurementRelation(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "MeasurementRelation",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_MeasureRelationship(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "MeasureRelationship",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_NamedMeasure(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "NamedMeasure",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_NamedMeasurement(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "NamedMeasurement",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_Observation(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "Observation",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_Ranking(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "Ranking",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_RankingInterval(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "RankingInterval",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_RatioMeasure(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "RatioMeasure",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_RatioMeasurment(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "RatioMeasurment",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_RescaledMeasure(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "RescaledMeasure",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_ReScaledMeasurement(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "ReScaledMeasurement",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_Scope(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "Scope",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_SMMCategory(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "SMM_Category",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_SMMElement(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "SMM_Element",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_SMMModel(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "SMM_Model",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_SMMRelationship(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "SMM_Relationship",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getDocumentRoot_Timestamp(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "Timestamp",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (gradeEClass, 
       source, 
       new String[] 
       {
       "name", "Grade",			 "kind", "elementOnly"
       });
    addAnnotation
      (getGrade_IsBaseSupplied(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "isBaseSupplied",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getGrade_Value(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "value",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getGrade_BaseMeasurement(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "baseMeasurement",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (measureEClass, 
       source, 
       new String[] 
       {
       "documentation", "This class models the specification of measures either by name, by representing derivations of base measures, or by representing method operations directly applied to the measured object.  For example,  McCabe\u2019s cyclomatic complexity could be specified by its name, McCabe\u2019s cyclomatic complexity, by a direct measurement operation or by rescaling counts of either independent paths or choice points.\r\n\r\nThe essential semantic requirements for the measure metaclass is that it meaningfully identifies the measure applied to produce a given measurement.\r\n\r\nThe scope of a measure, found by self.characterizes.scope, is the EntitySet that is the domain for this measure.\r\n"
       });
    addAnnotation
      (measureEClass, 
       source, 
       new String[] 
       {
       "name", "Measure",			 "kind", "elementOnly"
       });
    addAnnotation
      (getMeasure_Library(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "library",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getMeasure_Category(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "category",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getMeasure_EquivalentFrom(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "equivalentFrom",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getMeasure_Refinement(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "refinement",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getMeasure_Scope(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "scope",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (measurementEClass, 
       source, 
       new String[] 
       {
       "name", "Measurement",			 "kind", "elementOnly"
       });
    addAnnotation
      (getMeasurement_Error(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "error",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getMeasurement_Observation(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "observation",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getMeasurement_Measure(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "measure",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (measurementRelationEClass, 
       source, 
       new String[] 
       {
       "name", "MeasurementRelation",			 "kind", "elementOnly"
       });
    addAnnotation
      (getMeasurementRelation_Name(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "name",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getMeasurementRelation_From(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "from",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getMeasurementRelation_To(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "to",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (measureRelationshipEClass, 
       source, 
       new String[] 
       {
       "name", "MeasureRelationship",			 "kind", "elementOnly"
       });
    addAnnotation
      (getMeasureRelationship_Name(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "name",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getMeasureRelationship_From(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "from",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getMeasureRelationship_To(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "to",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (namedMeasureEClass, 
       source, 
       new String[] 
       {
       "name", "NamedMeasure",			 "kind", "elementOnly"
       });
    addAnnotation
      (getNamedMeasure_Name1(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "name",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (namedMeasurementEClass, 
       source, 
       new String[] 
       {
       "name", "NamedMeasurement",			 "kind", "elementOnly"
       });
    addAnnotation
      (observationEClass, 
       source, 
       new String[] 
       {
       "name", "Observation",			 "kind", "elementOnly"
       });
    addAnnotation
      (getObservation_Observer(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "observer",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getObservation_Tool(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "tool",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getObservation_WhenObserved(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "whenObserved",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (rankingEClass, 
       source, 
       new String[] 
       {
       "name", "Ranking",			 "kind", "elementOnly"
       });
    addAnnotation
      (getRanking_Interval(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "interval",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getRanking_BaseMeasure(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "baseMeasure",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (rankingIntervalEClass, 
       source, 
       new String[] 
       {
       "name", "RankingInterval",			 "kind", "elementOnly"
       });
    addAnnotation
      (getRankingInterval_MaximumEndpoint(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "maximumEndpoint",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getRankingInterval_MaximumOpen(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "maximumOpen",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getRankingInterval_MinimumEndpoint(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "minimumEndpoint",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getRankingInterval_MinimumOpen(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "minimumOpen",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getRankingInterval_Symbol(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "symbol",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (ratioMeasureEClass, 
       source, 
       new String[] 
       {
       "name", "RatioMeasure",			 "kind", "elementOnly"
       });
    addAnnotation
      (getRatioMeasure_Functor1(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "functor",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (ratioMeasurementEClass, 
       source, 
       new String[] 
       {
       "name", "RatioMeasurment",			 "kind", "elementOnly"
       });
    addAnnotation
      (rescaledMeasureEClass, 
       source, 
       new String[] 
       {
       "name", "RescaledMeasure",			 "kind", "elementOnly"
       });
    addAnnotation
      (getRescaledMeasure_Formula(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "formula",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getRescaledMeasure_BaseMeasure(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "baseMeasure",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (reScaledMeasurementEClass, 
       source, 
       new String[] 
       {
       "name", "ReScaledMeasurement",			 "kind", "elementOnly"
       });
    addAnnotation
      (getReScaledMeasurement_IsBaseSupplied(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "isBaseSupplied",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getReScaledMeasurement_BaseMeasurement(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "baseMeasurement",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (scopeEClass, 
       source, 
       new String[] 
       {
       "name", "Scope",			 "kind", "elementOnly"
       });
    addAnnotation
      (getScope_Class(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "class",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getScope_Enumerated(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "enumerated",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (getScope_Recognizer(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "recognizer",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (smmCategoryEClass, 
       source, 
       new String[] 
       {
       "name", "SMM_Category",			 "kind", "elementOnly"
       });
    addAnnotation
      (getSMMCategory_Category(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "category",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (smmElementEClass, 
       source, 
       new String[] 
       {
       "name", "SMM_Element",			 "kind", "empty"
       });
    addAnnotation
      (smmModelEClass, 
       source, 
       new String[] 
       {
       "name", "SMM_Model",			 "kind", "elementOnly"
       });
    addAnnotation
      (getSMMModel_SMMElement(), 
       source, 
       new String[] 
       {
       "kind", "element",			 "name", "SMM_Element",			 "namespace", "##targetNamespace"
       });
    addAnnotation
      (smmRelationshipEClass, 
       source, 
       new String[] 
       {
       "name", "SMM_Relationship",			 "kind", "empty"
       });
    addAnnotation
      (timestampEClass, 
       source, 
       new String[] 
       {
       "name", "Timestamp",			 "kind", "empty"
       });
  }

} //SoftwareMetricsMetamodel2PackageImpl
