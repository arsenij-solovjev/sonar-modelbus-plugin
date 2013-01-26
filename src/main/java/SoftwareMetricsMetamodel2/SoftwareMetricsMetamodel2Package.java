/**
 */
package SoftwareMetricsMetamodel2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Factory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface SoftwareMetricsMetamodel2Package extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "SoftwareMetricsMetamodel2";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://www.omg.org/ADM/SMM2";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "SoftwareMetricsMetamodel2";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	SoftwareMetricsMetamodel2Package eINSTANCE = SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl.init();

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.SMMElementImpl <em>SMM Element</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.SMMElementImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getSMMElement()
   * @generated
   */
	int SMM_ELEMENT = 31;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_ELEMENT__PARENT = 0;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_ELEMENT__DESCRIPTION = 1;

	/**
   * The number of structural features of the '<em>SMM Element</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_ELEMENT_FEATURE_COUNT = 2;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.MeasurementImpl <em>Measurement</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.MeasurementImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getMeasurement()
   * @generated
   */
	int MEASUREMENT = 17;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASUREMENT__PARENT = SMM_ELEMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASUREMENT__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Error</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASUREMENT__ERROR = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Observation</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASUREMENT__OBSERVATION = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Measure</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASUREMENT__MEASURE = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
   * The feature id for the '<em><b>Measurand</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASUREMENT__MEASURAND = SMM_ELEMENT_FEATURE_COUNT + 3;

	/**
   * The number of structural features of the '<em>Measurement</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASUREMENT_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 4;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.DimensionalMeasurementImpl <em>Dimensional Measurement</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.DimensionalMeasurementImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getDimensionalMeasurement()
   * @generated
   */
	int DIMENSIONAL_MEASUREMENT = 11;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASUREMENT__PARENT = MEASUREMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASUREMENT__DESCRIPTION = MEASUREMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Error</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASUREMENT__ERROR = MEASUREMENT__ERROR;

	/**
   * The feature id for the '<em><b>Observation</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASUREMENT__OBSERVATION = MEASUREMENT__OBSERVATION;

	/**
   * The feature id for the '<em><b>Measure</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASUREMENT__MEASURE = MEASUREMENT__MEASURE;

	/**
   * The feature id for the '<em><b>Measurand</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASUREMENT__MEASURAND = MEASUREMENT__MEASURAND;

	/**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASUREMENT__VALUE = MEASUREMENT_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Dimensional Measurement</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASUREMENT_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.AggregatedMeasurementImpl <em>Aggregated Measurement</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.AggregatedMeasurementImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getAggregatedMeasurement()
   * @generated
   */
	int AGGREGATED_MEASUREMENT = 0;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_MEASUREMENT__PARENT = DIMENSIONAL_MEASUREMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_MEASUREMENT__DESCRIPTION = DIMENSIONAL_MEASUREMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Error</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
   * The feature id for the '<em><b>Observation</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_MEASUREMENT__OBSERVATION = DIMENSIONAL_MEASUREMENT__OBSERVATION;

	/**
   * The feature id for the '<em><b>Measure</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_MEASUREMENT__MEASURE = DIMENSIONAL_MEASUREMENT__MEASURE;

	/**
   * The feature id for the '<em><b>Measurand</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_MEASUREMENT__MEASURAND = DIMENSIONAL_MEASUREMENT__MEASURAND;

	/**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
   * The feature id for the '<em><b>Is Base Supplied</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_MEASUREMENT__IS_BASE_SUPPLIED = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Base Measurement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_MEASUREMENT__BASE_MEASUREMENT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Aggregated Measurement</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.SMMNamedElementImpl <em>SMM Named Element</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.SMMNamedElementImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getSMMNamedElement()
   * @generated
   */
	int SMM_NAMED_ELEMENT = 35;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_NAMED_ELEMENT__PARENT = SMM_ELEMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_NAMED_ELEMENT__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_NAMED_ELEMENT__NAME = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>SMM Named Element</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_NAMED_ELEMENT_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.MeasureImpl <em>Measure</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.MeasureImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getMeasure()
   * @generated
   */
	int MEASURE = 16;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE__PARENT = SMM_NAMED_ELEMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE__DESCRIPTION = SMM_NAMED_ELEMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE__NAME = SMM_NAMED_ELEMENT__NAME;

	/**
   * The feature id for the '<em><b>Library</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE__LIBRARY = SMM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE__CATEGORY = SMM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE__EQUIVALENT_FROM = SMM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
   * The feature id for the '<em><b>Refinement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE__REFINEMENT = SMM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
   * The feature id for the '<em><b>Scope</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE__SCOPE = SMM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
   * The feature id for the '<em><b>Util</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE__UTIL = SMM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
   * The feature id for the '<em><b>Direct Invoke</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE__DIRECT_INVOKE = SMM_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
   * The feature id for the '<em><b>Trait</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE__TRAIT = SMM_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
   * The feature id for the '<em><b>Measurement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE__MEASUREMENT = SMM_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
   * The number of structural features of the '<em>Measure</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_FEATURE_COUNT = SMM_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.DimensionalMeasureImpl <em>Dimensional Measure</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.DimensionalMeasureImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getDimensionalMeasure()
   * @generated
   */
	int DIMENSIONAL_MEASURE = 10;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASURE__PARENT = MEASURE__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASURE__DESCRIPTION = MEASURE__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASURE__NAME = MEASURE__NAME;

	/**
   * The feature id for the '<em><b>Library</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASURE__LIBRARY = MEASURE__LIBRARY;

	/**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASURE__CATEGORY = MEASURE__CATEGORY;

	/**
   * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASURE__EQUIVALENT_FROM = MEASURE__EQUIVALENT_FROM;

	/**
   * The feature id for the '<em><b>Refinement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASURE__REFINEMENT = MEASURE__REFINEMENT;

	/**
   * The feature id for the '<em><b>Scope</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASURE__SCOPE = MEASURE__SCOPE;

	/**
   * The feature id for the '<em><b>Util</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASURE__UTIL = MEASURE__UTIL;

	/**
   * The feature id for the '<em><b>Direct Invoke</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASURE__DIRECT_INVOKE = MEASURE__DIRECT_INVOKE;

	/**
   * The feature id for the '<em><b>Trait</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASURE__TRAIT = MEASURE__TRAIT;

	/**
   * The feature id for the '<em><b>Measurement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASURE__MEASUREMENT = MEASURE__MEASUREMENT;

	/**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASURE__UNIT = MEASURE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Lower Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASURE__LOWER_THRESHOLD = MEASURE_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Upper Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASURE__UPPER_THRESHOLD = MEASURE_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>Dimensional Measure</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIMENSIONAL_MEASURE_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 3;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.BinaryMeasureImpl <em>Binary Measure</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.BinaryMeasureImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getBinaryMeasure()
   * @generated
   */
	int BINARY_MEASURE = 1;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASURE__PARENT = DIMENSIONAL_MEASURE__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASURE__DESCRIPTION = DIMENSIONAL_MEASURE__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
   * The feature id for the '<em><b>Library</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASURE__LIBRARY = DIMENSIONAL_MEASURE__LIBRARY;

	/**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
   * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
   * The feature id for the '<em><b>Refinement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASURE__REFINEMENT = DIMENSIONAL_MEASURE__REFINEMENT;

	/**
   * The feature id for the '<em><b>Scope</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
   * The feature id for the '<em><b>Util</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASURE__UTIL = DIMENSIONAL_MEASURE__UTIL;

	/**
   * The feature id for the '<em><b>Direct Invoke</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASURE__DIRECT_INVOKE = DIMENSIONAL_MEASURE__DIRECT_INVOKE;

	/**
   * The feature id for the '<em><b>Trait</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
   * The feature id for the '<em><b>Measurement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASURE__MEASUREMENT = DIMENSIONAL_MEASURE__MEASUREMENT;

	/**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
   * The feature id for the '<em><b>Lower Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASURE__LOWER_THRESHOLD = DIMENSIONAL_MEASURE__LOWER_THRESHOLD;

	/**
   * The feature id for the '<em><b>Upper Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASURE__UPPER_THRESHOLD = DIMENSIONAL_MEASURE__UPPER_THRESHOLD;

	/**
   * The feature id for the '<em><b>Functor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASURE__FUNCTOR = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Base Measure1</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASURE__BASE_MEASURE1 = DIMENSIONAL_MEASURE_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Base Measure2</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASURE__BASE_MEASURE2 = DIMENSIONAL_MEASURE_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>Binary Measure</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 3;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.BinaryMeasurementImpl <em>Binary Measurement</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.BinaryMeasurementImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getBinaryMeasurement()
   * @generated
   */
	int BINARY_MEASUREMENT = 2;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASUREMENT__PARENT = DIMENSIONAL_MEASUREMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASUREMENT__DESCRIPTION = DIMENSIONAL_MEASUREMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Error</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
   * The feature id for the '<em><b>Observation</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASUREMENT__OBSERVATION = DIMENSIONAL_MEASUREMENT__OBSERVATION;

	/**
   * The feature id for the '<em><b>Measure</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASUREMENT__MEASURE = DIMENSIONAL_MEASUREMENT__MEASURE;

	/**
   * The feature id for the '<em><b>Measurand</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASUREMENT__MEASURAND = DIMENSIONAL_MEASUREMENT__MEASURAND;

	/**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
   * The feature id for the '<em><b>Is Base Supplied</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASUREMENT__IS_BASE_SUPPLIED = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Base Measurement1</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASUREMENT__BASE_MEASUREMENT1 = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Base Measurement2</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASUREMENT__BASE_MEASUREMENT2 = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>Binary Measurement</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BINARY_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 3;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.SMMRelationshipImpl <em>SMM Relationship</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.SMMRelationshipImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getSMMRelationship()
   * @generated
   */
	int SMM_RELATIONSHIP = 33;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_RELATIONSHIP__PARENT = SMM_ELEMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_RELATIONSHIP__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
   * The number of structural features of the '<em>SMM Relationship</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_RELATIONSHIP_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.CategoryRelationshipImpl <em>Category Relationship</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.CategoryRelationshipImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getCategoryRelationship()
   * @generated
   */
	int CATEGORY_RELATIONSHIP = 3;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CATEGORY_RELATIONSHIP__PARENT = SMM_RELATIONSHIP__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CATEGORY_RELATIONSHIP__DESCRIPTION = SMM_RELATIONSHIP__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CATEGORY_RELATIONSHIP__NAME = SMM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CATEGORY_RELATIONSHIP__TO = SMM_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CATEGORY_RELATIONSHIP__FROM = SMM_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>Category Relationship</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CATEGORY_RELATIONSHIP_FEATURE_COUNT = SMM_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.CharacteristicImpl <em>Characteristic</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.CharacteristicImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getCharacteristic()
   * @generated
   */
	int CHARACTERISTIC = 4;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CHARACTERISTIC__PARENT = SMM_NAMED_ELEMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CHARACTERISTIC__DESCRIPTION = SMM_NAMED_ELEMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CHARACTERISTIC__NAME = SMM_NAMED_ELEMENT__NAME;

	/**
   * The feature id for the '<em><b>Measure</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CHARACTERISTIC__MEASURE = SMM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Characteristic</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CHARACTERISTIC_FEATURE_COUNT = SMM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.CollectiveMeasureImpl <em>Collective Measure</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.CollectiveMeasureImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getCollectiveMeasure()
   * @generated
   */
	int COLLECTIVE_MEASURE = 5;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASURE__PARENT = DIMENSIONAL_MEASURE__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASURE__DESCRIPTION = DIMENSIONAL_MEASURE__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
   * The feature id for the '<em><b>Library</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASURE__LIBRARY = DIMENSIONAL_MEASURE__LIBRARY;

	/**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
   * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
   * The feature id for the '<em><b>Refinement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASURE__REFINEMENT = DIMENSIONAL_MEASURE__REFINEMENT;

	/**
   * The feature id for the '<em><b>Scope</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
   * The feature id for the '<em><b>Util</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASURE__UTIL = DIMENSIONAL_MEASURE__UTIL;

	/**
   * The feature id for the '<em><b>Direct Invoke</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASURE__DIRECT_INVOKE = DIMENSIONAL_MEASURE__DIRECT_INVOKE;

	/**
   * The feature id for the '<em><b>Trait</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
   * The feature id for the '<em><b>Measurement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASURE__MEASUREMENT = DIMENSIONAL_MEASURE__MEASUREMENT;

	/**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
   * The feature id for the '<em><b>Lower Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASURE__LOWER_THRESHOLD = DIMENSIONAL_MEASURE__LOWER_THRESHOLD;

	/**
   * The feature id for the '<em><b>Upper Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASURE__UPPER_THRESHOLD = DIMENSIONAL_MEASURE__UPPER_THRESHOLD;

	/**
   * The feature id for the '<em><b>Accumulator</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASURE__ACCUMULATOR = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Base Measure</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASURE__BASE_MEASURE = DIMENSIONAL_MEASURE_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Collective Measure</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.CollectiveMeasurementImpl <em>Collective Measurement</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.CollectiveMeasurementImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getCollectiveMeasurement()
   * @generated
   */
	int COLLECTIVE_MEASUREMENT = 6;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASUREMENT__PARENT = DIMENSIONAL_MEASUREMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASUREMENT__DESCRIPTION = DIMENSIONAL_MEASUREMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Error</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
   * The feature id for the '<em><b>Observation</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASUREMENT__OBSERVATION = DIMENSIONAL_MEASUREMENT__OBSERVATION;

	/**
   * The feature id for the '<em><b>Measure</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASUREMENT__MEASURE = DIMENSIONAL_MEASUREMENT__MEASURE;

	/**
   * The feature id for the '<em><b>Measurand</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASUREMENT__MEASURAND = DIMENSIONAL_MEASUREMENT__MEASURAND;

	/**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
   * The feature id for the '<em><b>Accumulator</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASUREMENT__ACCUMULATOR = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Is Base Supplied</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASUREMENT__IS_BASE_SUPPLIED = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Base Measurement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>Collective Measurement</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLLECTIVE_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 3;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.DirectMeasurementImpl <em>Direct Measurement</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.DirectMeasurementImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getDirectMeasurement()
   * @generated
   */
	int DIRECT_MEASUREMENT = 13;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASUREMENT__PARENT = DIMENSIONAL_MEASUREMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASUREMENT__DESCRIPTION = DIMENSIONAL_MEASUREMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Error</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
   * The feature id for the '<em><b>Observation</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASUREMENT__OBSERVATION = DIMENSIONAL_MEASUREMENT__OBSERVATION;

	/**
   * The feature id for the '<em><b>Measure</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASUREMENT__MEASURE = DIMENSIONAL_MEASUREMENT__MEASURE;

	/**
   * The feature id for the '<em><b>Measurand</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASUREMENT__MEASURAND = DIMENSIONAL_MEASUREMENT__MEASURAND;

	/**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
   * The number of structural features of the '<em>Direct Measurement</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.CountImpl <em>Count</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.CountImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getCount()
   * @generated
   */
	int COUNT = 7;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNT__PARENT = DIRECT_MEASUREMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNT__DESCRIPTION = DIRECT_MEASUREMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Error</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNT__ERROR = DIRECT_MEASUREMENT__ERROR;

	/**
   * The feature id for the '<em><b>Observation</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNT__OBSERVATION = DIRECT_MEASUREMENT__OBSERVATION;

	/**
   * The feature id for the '<em><b>Measure</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNT__MEASURE = DIRECT_MEASUREMENT__MEASURE;

	/**
   * The feature id for the '<em><b>Measurand</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNT__MEASURAND = DIRECT_MEASUREMENT__MEASURAND;

	/**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNT__VALUE = DIRECT_MEASUREMENT__VALUE;

	/**
   * The number of structural features of the '<em>Count</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNT_FEATURE_COUNT = DIRECT_MEASUREMENT_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.DirectMeasureImpl <em>Direct Measure</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.DirectMeasureImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getDirectMeasure()
   * @generated
   */
	int DIRECT_MEASURE = 12;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASURE__PARENT = DIMENSIONAL_MEASURE__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASURE__DESCRIPTION = DIMENSIONAL_MEASURE__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
   * The feature id for the '<em><b>Library</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASURE__LIBRARY = DIMENSIONAL_MEASURE__LIBRARY;

	/**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
   * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
   * The feature id for the '<em><b>Refinement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASURE__REFINEMENT = DIMENSIONAL_MEASURE__REFINEMENT;

	/**
   * The feature id for the '<em><b>Scope</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
   * The feature id for the '<em><b>Util</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASURE__UTIL = DIMENSIONAL_MEASURE__UTIL;

	/**
   * The feature id for the '<em><b>Direct Invoke</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASURE__DIRECT_INVOKE = DIMENSIONAL_MEASURE__DIRECT_INVOKE;

	/**
   * The feature id for the '<em><b>Trait</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
   * The feature id for the '<em><b>Measurement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASURE__MEASUREMENT = DIMENSIONAL_MEASURE__MEASUREMENT;

	/**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
   * The feature id for the '<em><b>Lower Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASURE__LOWER_THRESHOLD = DIMENSIONAL_MEASURE__LOWER_THRESHOLD;

	/**
   * The feature id for the '<em><b>Upper Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASURE__UPPER_THRESHOLD = DIMENSIONAL_MEASURE__UPPER_THRESHOLD;

	/**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASURE__OPERATION = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Direct Measure</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIRECT_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.CountingImpl <em>Counting</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.CountingImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getCounting()
   * @generated
   */
	int COUNTING = 8;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTING__PARENT = DIRECT_MEASURE__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTING__DESCRIPTION = DIRECT_MEASURE__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTING__NAME = DIRECT_MEASURE__NAME;

	/**
   * The feature id for the '<em><b>Library</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTING__LIBRARY = DIRECT_MEASURE__LIBRARY;

	/**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTING__CATEGORY = DIRECT_MEASURE__CATEGORY;

	/**
   * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTING__EQUIVALENT_FROM = DIRECT_MEASURE__EQUIVALENT_FROM;

	/**
   * The feature id for the '<em><b>Refinement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTING__REFINEMENT = DIRECT_MEASURE__REFINEMENT;

	/**
   * The feature id for the '<em><b>Scope</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTING__SCOPE = DIRECT_MEASURE__SCOPE;

	/**
   * The feature id for the '<em><b>Util</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTING__UTIL = DIRECT_MEASURE__UTIL;

	/**
   * The feature id for the '<em><b>Direct Invoke</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTING__DIRECT_INVOKE = DIRECT_MEASURE__DIRECT_INVOKE;

	/**
   * The feature id for the '<em><b>Trait</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTING__TRAIT = DIRECT_MEASURE__TRAIT;

	/**
   * The feature id for the '<em><b>Measurement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTING__MEASUREMENT = DIRECT_MEASURE__MEASUREMENT;

	/**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTING__UNIT = DIRECT_MEASURE__UNIT;

	/**
   * The feature id for the '<em><b>Lower Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTING__LOWER_THRESHOLD = DIRECT_MEASURE__LOWER_THRESHOLD;

	/**
   * The feature id for the '<em><b>Upper Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTING__UPPER_THRESHOLD = DIRECT_MEASURE__UPPER_THRESHOLD;

	/**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTING__OPERATION = DIRECT_MEASURE__OPERATION;

	/**
   * The number of structural features of the '<em>Counting</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTING_FEATURE_COUNT = DIRECT_MEASURE_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.DateImpl <em>Date</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.DateImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getDate()
   * @generated
   */
	int DATE = 9;

	/**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATE__VALUE = 0;

	/**
   * The number of structural features of the '<em>Date</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATE_FEATURE_COUNT = 1;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.DocumentRootImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getDocumentRoot()
   * @generated
   */
	int DOCUMENT_ROOT = 14;

	/**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
   * The feature id for the '<em><b>Aggregated Measurement</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__AGGREGATED_MEASUREMENT = 3;

	/**
   * The feature id for the '<em><b>Binary Measure</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__BINARY_MEASURE = 4;

	/**
   * The feature id for the '<em><b>Binary Measurement</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__BINARY_MEASUREMENT = 5;

	/**
   * The feature id for the '<em><b>Category Relationship</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__CATEGORY_RELATIONSHIP = 6;

	/**
   * The feature id for the '<em><b>Characteristic</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__CHARACTERISTIC = 7;

	/**
   * The feature id for the '<em><b>Collective Measure</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__COLLECTIVE_MEASURE = 8;

	/**
   * The feature id for the '<em><b>Collective Measurement</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__COLLECTIVE_MEASUREMENT = 9;

	/**
   * The feature id for the '<em><b>Count</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__COUNT = 10;

	/**
   * The feature id for the '<em><b>Counting</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__COUNTING = 11;

	/**
   * The feature id for the '<em><b>Date</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__DATE = 12;

	/**
   * The feature id for the '<em><b>Dimensional Measure</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__DIMENSIONAL_MEASURE = 13;

	/**
   * The feature id for the '<em><b>Dimensional Measurement</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__DIMENSIONAL_MEASUREMENT = 14;

	/**
   * The feature id for the '<em><b>Direct Measure</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__DIRECT_MEASURE = 15;

	/**
   * The feature id for the '<em><b>Direct Measurement</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__DIRECT_MEASUREMENT = 16;

	/**
   * The feature id for the '<em><b>Grade</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__GRADE = 17;

	/**
   * The feature id for the '<em><b>Measure</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__MEASURE = 18;

	/**
   * The feature id for the '<em><b>Measurement</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__MEASUREMENT = 19;

	/**
   * The feature id for the '<em><b>Measurement Relation</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__MEASUREMENT_RELATION = 20;

	/**
   * The feature id for the '<em><b>Measure Relationship</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__MEASURE_RELATIONSHIP = 21;

	/**
   * The feature id for the '<em><b>Named Measure</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__NAMED_MEASURE = 22;

	/**
   * The feature id for the '<em><b>Named Measurement</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__NAMED_MEASUREMENT = 23;

	/**
   * The feature id for the '<em><b>Observation</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__OBSERVATION = 24;

	/**
   * The feature id for the '<em><b>Ranking</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__RANKING = 25;

	/**
   * The feature id for the '<em><b>Ranking Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__RANKING_INTERVAL = 26;

	/**
   * The feature id for the '<em><b>Ratio Measure</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__RATIO_MEASURE = 27;

	/**
   * The feature id for the '<em><b>Ratio Measurment</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__RATIO_MEASURMENT = 28;

	/**
   * The feature id for the '<em><b>Rescaled Measure</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__RESCALED_MEASURE = 29;

	/**
   * The feature id for the '<em><b>Re Scaled Measurement</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__RE_SCALED_MEASUREMENT = 30;

	/**
   * The feature id for the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__SCOPE = 31;

	/**
   * The feature id for the '<em><b>SMM Category</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__SMM_CATEGORY = 32;

	/**
   * The feature id for the '<em><b>SMM Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__SMM_ELEMENT = 33;

	/**
   * The feature id for the '<em><b>SMM Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__SMM_MODEL = 34;

	/**
   * The feature id for the '<em><b>SMM Relationship</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__SMM_RELATIONSHIP = 35;

	/**
   * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__TIMESTAMP = 36;

	/**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT_FEATURE_COUNT = 37;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.GradeImpl <em>Grade</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.GradeImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getGrade()
   * @generated
   */
	int GRADE = 15;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GRADE__PARENT = MEASUREMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GRADE__DESCRIPTION = MEASUREMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Error</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GRADE__ERROR = MEASUREMENT__ERROR;

	/**
   * The feature id for the '<em><b>Observation</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GRADE__OBSERVATION = MEASUREMENT__OBSERVATION;

	/**
   * The feature id for the '<em><b>Measure</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GRADE__MEASURE = MEASUREMENT__MEASURE;

	/**
   * The feature id for the '<em><b>Measurand</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GRADE__MEASURAND = MEASUREMENT__MEASURAND;

	/**
   * The feature id for the '<em><b>Is Base Supplied</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GRADE__IS_BASE_SUPPLIED = MEASUREMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GRADE__VALUE = MEASUREMENT_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Base Measurement</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GRADE__BASE_MEASUREMENT = MEASUREMENT_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>Grade</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GRADE_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 3;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.MeasurementRelationImpl <em>Measurement Relation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.MeasurementRelationImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getMeasurementRelation()
   * @generated
   */
	int MEASUREMENT_RELATION = 18;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASUREMENT_RELATION__PARENT = SMM_RELATIONSHIP__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASUREMENT_RELATION__DESCRIPTION = SMM_RELATIONSHIP__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASUREMENT_RELATION__NAME = SMM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASUREMENT_RELATION__FROM = SMM_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASUREMENT_RELATION__TO = SMM_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>Measurement Relation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASUREMENT_RELATION_FEATURE_COUNT = SMM_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.MeasureRelationshipImpl <em>Measure Relationship</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.MeasureRelationshipImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getMeasureRelationship()
   * @generated
   */
	int MEASURE_RELATIONSHIP = 19;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_RELATIONSHIP__PARENT = SMM_RELATIONSHIP__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_RELATIONSHIP__DESCRIPTION = SMM_RELATIONSHIP__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_RELATIONSHIP__NAME = SMM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_RELATIONSHIP__FROM = SMM_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_RELATIONSHIP__TO = SMM_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>Measure Relationship</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_RELATIONSHIP_FEATURE_COUNT = SMM_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.NamedMeasureImpl <em>Named Measure</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.NamedMeasureImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getNamedMeasure()
   * @generated
   */
	int NAMED_MEASURE = 20;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASURE__PARENT = DIMENSIONAL_MEASURE__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASURE__DESCRIPTION = DIMENSIONAL_MEASURE__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
   * The feature id for the '<em><b>Library</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASURE__LIBRARY = DIMENSIONAL_MEASURE__LIBRARY;

	/**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
   * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
   * The feature id for the '<em><b>Refinement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASURE__REFINEMENT = DIMENSIONAL_MEASURE__REFINEMENT;

	/**
   * The feature id for the '<em><b>Scope</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
   * The feature id for the '<em><b>Util</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASURE__UTIL = DIMENSIONAL_MEASURE__UTIL;

	/**
   * The feature id for the '<em><b>Direct Invoke</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASURE__DIRECT_INVOKE = DIMENSIONAL_MEASURE__DIRECT_INVOKE;

	/**
   * The feature id for the '<em><b>Trait</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
   * The feature id for the '<em><b>Measurement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASURE__MEASUREMENT = DIMENSIONAL_MEASURE__MEASUREMENT;

	/**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
   * The feature id for the '<em><b>Lower Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASURE__LOWER_THRESHOLD = DIMENSIONAL_MEASURE__LOWER_THRESHOLD;

	/**
   * The feature id for the '<em><b>Upper Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASURE__UPPER_THRESHOLD = DIMENSIONAL_MEASURE__UPPER_THRESHOLD;

	/**
   * The feature id for the '<em><b>Name1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASURE__NAME1 = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Named Measure</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.NamedMeasurementImpl <em>Named Measurement</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.NamedMeasurementImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getNamedMeasurement()
   * @generated
   */
	int NAMED_MEASUREMENT = 21;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASUREMENT__PARENT = DIMENSIONAL_MEASUREMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASUREMENT__DESCRIPTION = DIMENSIONAL_MEASUREMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Error</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
   * The feature id for the '<em><b>Observation</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASUREMENT__OBSERVATION = DIMENSIONAL_MEASUREMENT__OBSERVATION;

	/**
   * The feature id for the '<em><b>Measure</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASUREMENT__MEASURE = DIMENSIONAL_MEASUREMENT__MEASURE;

	/**
   * The feature id for the '<em><b>Measurand</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASUREMENT__MEASURAND = DIMENSIONAL_MEASUREMENT__MEASURAND;

	/**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
   * The number of structural features of the '<em>Named Measurement</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.ObservationImpl <em>Observation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.ObservationImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getObservation()
   * @generated
   */
	int OBSERVATION = 22;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBSERVATION__PARENT = SMM_ELEMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBSERVATION__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Observer</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBSERVATION__OBSERVER = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Tool</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBSERVATION__TOOL = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>When Observed</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBSERVATION__WHEN_OBSERVED = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>Observation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBSERVATION_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 3;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.RankingImpl <em>Ranking</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.RankingImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getRanking()
   * @generated
   */
	int RANKING = 23;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING__PARENT = MEASURE__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING__DESCRIPTION = MEASURE__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING__NAME = MEASURE__NAME;

	/**
   * The feature id for the '<em><b>Library</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING__LIBRARY = MEASURE__LIBRARY;

	/**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING__CATEGORY = MEASURE__CATEGORY;

	/**
   * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING__EQUIVALENT_FROM = MEASURE__EQUIVALENT_FROM;

	/**
   * The feature id for the '<em><b>Refinement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING__REFINEMENT = MEASURE__REFINEMENT;

	/**
   * The feature id for the '<em><b>Scope</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING__SCOPE = MEASURE__SCOPE;

	/**
   * The feature id for the '<em><b>Util</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING__UTIL = MEASURE__UTIL;

	/**
   * The feature id for the '<em><b>Direct Invoke</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING__DIRECT_INVOKE = MEASURE__DIRECT_INVOKE;

	/**
   * The feature id for the '<em><b>Trait</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING__TRAIT = MEASURE__TRAIT;

	/**
   * The feature id for the '<em><b>Measurement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING__MEASUREMENT = MEASURE__MEASUREMENT;

	/**
   * The feature id for the '<em><b>Interval</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING__INTERVAL = MEASURE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Base Measure</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING__BASE_MEASURE = MEASURE_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Ranking</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.RankingIntervalImpl <em>Ranking Interval</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.RankingIntervalImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getRankingInterval()
   * @generated
   */
	int RANKING_INTERVAL = 24;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING_INTERVAL__PARENT = SMM_ELEMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING_INTERVAL__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Maximum Endpoint</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING_INTERVAL__MAXIMUM_ENDPOINT = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Maximum Open</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING_INTERVAL__MAXIMUM_OPEN = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Minimum Endpoint</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING_INTERVAL__MINIMUM_ENDPOINT = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
   * The feature id for the '<em><b>Minimum Open</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING_INTERVAL__MINIMUM_OPEN = SMM_ELEMENT_FEATURE_COUNT + 3;

	/**
   * The feature id for the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING_INTERVAL__SYMBOL = SMM_ELEMENT_FEATURE_COUNT + 4;

	/**
   * The number of structural features of the '<em>Ranking Interval</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RANKING_INTERVAL_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 5;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.RatioMeasureImpl <em>Ratio Measure</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.RatioMeasureImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getRatioMeasure()
   * @generated
   */
	int RATIO_MEASURE = 25;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE__PARENT = BINARY_MEASURE__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE__DESCRIPTION = BINARY_MEASURE__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE__NAME = BINARY_MEASURE__NAME;

	/**
   * The feature id for the '<em><b>Library</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE__LIBRARY = BINARY_MEASURE__LIBRARY;

	/**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE__CATEGORY = BINARY_MEASURE__CATEGORY;

	/**
   * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE__EQUIVALENT_FROM = BINARY_MEASURE__EQUIVALENT_FROM;

	/**
   * The feature id for the '<em><b>Refinement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE__REFINEMENT = BINARY_MEASURE__REFINEMENT;

	/**
   * The feature id for the '<em><b>Scope</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE__SCOPE = BINARY_MEASURE__SCOPE;

	/**
   * The feature id for the '<em><b>Util</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE__UTIL = BINARY_MEASURE__UTIL;

	/**
   * The feature id for the '<em><b>Direct Invoke</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE__DIRECT_INVOKE = BINARY_MEASURE__DIRECT_INVOKE;

	/**
   * The feature id for the '<em><b>Trait</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE__TRAIT = BINARY_MEASURE__TRAIT;

	/**
   * The feature id for the '<em><b>Measurement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE__MEASUREMENT = BINARY_MEASURE__MEASUREMENT;

	/**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE__UNIT = BINARY_MEASURE__UNIT;

	/**
   * The feature id for the '<em><b>Lower Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE__LOWER_THRESHOLD = BINARY_MEASURE__LOWER_THRESHOLD;

	/**
   * The feature id for the '<em><b>Upper Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE__UPPER_THRESHOLD = BINARY_MEASURE__UPPER_THRESHOLD;

	/**
   * The feature id for the '<em><b>Functor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE__FUNCTOR = BINARY_MEASURE__FUNCTOR;

	/**
   * The feature id for the '<em><b>Base Measure1</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE__BASE_MEASURE1 = BINARY_MEASURE__BASE_MEASURE1;

	/**
   * The feature id for the '<em><b>Base Measure2</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE__BASE_MEASURE2 = BINARY_MEASURE__BASE_MEASURE2;

	/**
   * The feature id for the '<em><b>Functor1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE__FUNCTOR1 = BINARY_MEASURE_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Ratio Measure</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASURE_FEATURE_COUNT = BINARY_MEASURE_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.RatioMeasurementImpl <em>Ratio Measurement</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.RatioMeasurementImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getRatioMeasurement()
   * @generated
   */
	int RATIO_MEASUREMENT = 26;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASUREMENT__PARENT = BINARY_MEASUREMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASUREMENT__DESCRIPTION = BINARY_MEASUREMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Error</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASUREMENT__ERROR = BINARY_MEASUREMENT__ERROR;

	/**
   * The feature id for the '<em><b>Observation</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASUREMENT__OBSERVATION = BINARY_MEASUREMENT__OBSERVATION;

	/**
   * The feature id for the '<em><b>Measure</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASUREMENT__MEASURE = BINARY_MEASUREMENT__MEASURE;

	/**
   * The feature id for the '<em><b>Measurand</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASUREMENT__MEASURAND = BINARY_MEASUREMENT__MEASURAND;

	/**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASUREMENT__VALUE = BINARY_MEASUREMENT__VALUE;

	/**
   * The feature id for the '<em><b>Is Base Supplied</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASUREMENT__IS_BASE_SUPPLIED = BINARY_MEASUREMENT__IS_BASE_SUPPLIED;

	/**
   * The feature id for the '<em><b>Base Measurement1</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASUREMENT__BASE_MEASUREMENT1 = BINARY_MEASUREMENT__BASE_MEASUREMENT1;

	/**
   * The feature id for the '<em><b>Base Measurement2</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASUREMENT__BASE_MEASUREMENT2 = BINARY_MEASUREMENT__BASE_MEASUREMENT2;

	/**
   * The number of structural features of the '<em>Ratio Measurement</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RATIO_MEASUREMENT_FEATURE_COUNT = BINARY_MEASUREMENT_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.RescaledMeasureImpl <em>Rescaled Measure</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.RescaledMeasureImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getRescaledMeasure()
   * @generated
   */
	int RESCALED_MEASURE = 27;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESCALED_MEASURE__PARENT = DIMENSIONAL_MEASURE__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESCALED_MEASURE__DESCRIPTION = DIMENSIONAL_MEASURE__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESCALED_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
   * The feature id for the '<em><b>Library</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESCALED_MEASURE__LIBRARY = DIMENSIONAL_MEASURE__LIBRARY;

	/**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESCALED_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
   * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESCALED_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
   * The feature id for the '<em><b>Refinement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESCALED_MEASURE__REFINEMENT = DIMENSIONAL_MEASURE__REFINEMENT;

	/**
   * The feature id for the '<em><b>Scope</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESCALED_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
   * The feature id for the '<em><b>Util</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESCALED_MEASURE__UTIL = DIMENSIONAL_MEASURE__UTIL;

	/**
   * The feature id for the '<em><b>Direct Invoke</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESCALED_MEASURE__DIRECT_INVOKE = DIMENSIONAL_MEASURE__DIRECT_INVOKE;

	/**
   * The feature id for the '<em><b>Trait</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESCALED_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
   * The feature id for the '<em><b>Measurement</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESCALED_MEASURE__MEASUREMENT = DIMENSIONAL_MEASURE__MEASUREMENT;

	/**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESCALED_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
   * The feature id for the '<em><b>Lower Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESCALED_MEASURE__LOWER_THRESHOLD = DIMENSIONAL_MEASURE__LOWER_THRESHOLD;

	/**
   * The feature id for the '<em><b>Upper Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESCALED_MEASURE__UPPER_THRESHOLD = DIMENSIONAL_MEASURE__UPPER_THRESHOLD;

	/**
   * The feature id for the '<em><b>Formula</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESCALED_MEASURE__FORMULA = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Base Measure</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESCALED_MEASURE__BASE_MEASURE = DIMENSIONAL_MEASURE_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Rescaled Measure</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESCALED_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.ReScaledMeasurementImpl <em>Re Scaled Measurement</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.ReScaledMeasurementImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getReScaledMeasurement()
   * @generated
   */
	int RE_SCALED_MEASUREMENT = 28;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RE_SCALED_MEASUREMENT__PARENT = DIMENSIONAL_MEASUREMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RE_SCALED_MEASUREMENT__DESCRIPTION = DIMENSIONAL_MEASUREMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Error</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RE_SCALED_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
   * The feature id for the '<em><b>Observation</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RE_SCALED_MEASUREMENT__OBSERVATION = DIMENSIONAL_MEASUREMENT__OBSERVATION;

	/**
   * The feature id for the '<em><b>Measure</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RE_SCALED_MEASUREMENT__MEASURE = DIMENSIONAL_MEASUREMENT__MEASURE;

	/**
   * The feature id for the '<em><b>Measurand</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RE_SCALED_MEASUREMENT__MEASURAND = DIMENSIONAL_MEASUREMENT__MEASURAND;

	/**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RE_SCALED_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
   * The feature id for the '<em><b>Is Base Supplied</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RE_SCALED_MEASUREMENT__IS_BASE_SUPPLIED = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Base Measurement</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RE_SCALED_MEASUREMENT__BASE_MEASUREMENT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Re Scaled Measurement</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RE_SCALED_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.ScopeImpl <em>Scope</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.ScopeImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getScope()
   * @generated
   */
	int SCOPE = 29;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCOPE__PARENT = SMM_NAMED_ELEMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCOPE__DESCRIPTION = SMM_NAMED_ELEMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCOPE__NAME = SMM_NAMED_ELEMENT__NAME;

	/**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCOPE__CLASS = SMM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Enumerated</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCOPE__ENUMERATED = SMM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Recognizer</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCOPE__RECOGNIZER = SMM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>Scope</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCOPE_FEATURE_COUNT = SMM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.SMMCategoryImpl <em>SMM Category</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.SMMCategoryImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getSMMCategory()
   * @generated
   */
	int SMM_CATEGORY = 30;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_CATEGORY__PARENT = SMM_NAMED_ELEMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_CATEGORY__DESCRIPTION = SMM_NAMED_ELEMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_CATEGORY__NAME = SMM_NAMED_ELEMENT__NAME;

	/**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_CATEGORY__CATEGORY = SMM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Category Element</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_CATEGORY__CATEGORY_ELEMENT = SMM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Measure Element</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_CATEGORY__MEASURE_ELEMENT = SMM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>SMM Category</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_CATEGORY_FEATURE_COUNT = SMM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.SMMModelImpl <em>SMM Model</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.SMMModelImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getSMMModel()
   * @generated
   */
	int SMM_MODEL = 32;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_MODEL__PARENT = SMM_ELEMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_MODEL__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>SMM Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_MODEL__SMM_ELEMENT = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Meta Model Package URI</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_MODEL__META_MODEL_PACKAGE_URI = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>SMM Model</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SMM_MODEL_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.TimestampImpl <em>Timestamp</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.TimestampImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getTimestamp()
   * @generated
   */
	int TIMESTAMP = 34;

	/**
   * The number of structural features of the '<em>Timestamp</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TIMESTAMP_FEATURE_COUNT = 0;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.MeasureUtilImpl <em>Measure Util</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.MeasureUtilImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getMeasureUtil()
   * @generated
   */
	int MEASURE_UTIL = 36;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_UTIL__PARENT = SMM_ELEMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_UTIL__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_UTIL__OPERATION = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Measure Util</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_UTIL_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.AuditImpl <em>Audit</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.AuditImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getAudit()
   * @generated
   */
	int AUDIT = 37;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AUDIT__PARENT = SMM_NAMED_ELEMENT__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AUDIT__DESCRIPTION = SMM_NAMED_ELEMENT__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AUDIT__NAME = SMM_NAMED_ELEMENT__NAME;

	/**
   * The feature id for the '<em><b>Measure</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AUDIT__MEASURE = SMM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Audit</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AUDIT_FEATURE_COUNT = SMM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.MeasureAggregationImpl <em>Measure Aggregation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.MeasureAggregationImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getMeasureAggregation()
   * @generated
   */
	int MEASURE_AGGREGATION = 38;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_AGGREGATION__PARENT = MEASURE_RELATIONSHIP__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_AGGREGATION__DESCRIPTION = MEASURE_RELATIONSHIP__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_AGGREGATION__NAME = MEASURE_RELATIONSHIP__NAME;

	/**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_AGGREGATION__FROM = MEASURE_RELATIONSHIP__FROM;

	/**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_AGGREGATION__TO = MEASURE_RELATIONSHIP__TO;

	/**
   * The number of structural features of the '<em>Measure Aggregation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_AGGREGATION_FEATURE_COUNT = MEASURE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.impl.MeasurementAggregationImpl <em>Measurement Aggregation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.impl.MeasurementAggregationImpl
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getMeasurementAggregation()
   * @generated
   */
	int MEASUREMENT_AGGREGATION = 39;

	/**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASUREMENT_AGGREGATION__PARENT = MEASUREMENT_RELATION__PARENT;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASUREMENT_AGGREGATION__DESCRIPTION = MEASUREMENT_RELATION__DESCRIPTION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASUREMENT_AGGREGATION__NAME = MEASUREMENT_RELATION__NAME;

	/**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASUREMENT_AGGREGATION__FROM = MEASUREMENT_RELATION__FROM;

	/**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASUREMENT_AGGREGATION__TO = MEASUREMENT_RELATION__TO;

	/**
   * The number of structural features of the '<em>Measurement Aggregation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASUREMENT_AGGREGATION_FEATURE_COUNT = MEASUREMENT_RELATION_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link SoftwareMetricsMetamodel2.Accumulator <em>Accumulator</em>}' enum.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.Accumulator
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getAccumulator()
   * @generated
   */
	int ACCUMULATOR = 40;

	/**
   * The meta object id for the '<em>Accumulator Object</em>' data type.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see SoftwareMetricsMetamodel2.Accumulator
   * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getAccumulatorObject()
   * @generated
   */
	int ACCUMULATOR_OBJECT = 41;


	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.AggregatedMeasurement <em>Aggregated Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aggregated Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.AggregatedMeasurement
   * @generated
   */
	EClass getAggregatedMeasurement();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.AggregatedMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Base Supplied</em>'.
   * @see SoftwareMetricsMetamodel2.AggregatedMeasurement#isIsBaseSupplied()
   * @see #getAggregatedMeasurement()
   * @generated
   */
	EAttribute getAggregatedMeasurement_IsBaseSupplied();

	/**
   * Returns the meta object for the reference list '{@link SoftwareMetricsMetamodel2.AggregatedMeasurement#getBaseMeasurement <em>Base Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Base Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.AggregatedMeasurement#getBaseMeasurement()
   * @see #getAggregatedMeasurement()
   * @generated
   */
	EReference getAggregatedMeasurement_BaseMeasurement();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.BinaryMeasure <em>Binary Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Measure</em>'.
   * @see SoftwareMetricsMetamodel2.BinaryMeasure
   * @generated
   */
	EClass getBinaryMeasure();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.BinaryMeasure#getFunctor <em>Functor</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Functor</em>'.
   * @see SoftwareMetricsMetamodel2.BinaryMeasure#getFunctor()
   * @see #getBinaryMeasure()
   * @generated
   */
	EAttribute getBinaryMeasure_Functor();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.BinaryMeasure#getBaseMeasure1 <em>Base Measure1</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base Measure1</em>'.
   * @see SoftwareMetricsMetamodel2.BinaryMeasure#getBaseMeasure1()
   * @see #getBinaryMeasure()
   * @generated
   */
	EReference getBinaryMeasure_BaseMeasure1();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.BinaryMeasure#getBaseMeasure2 <em>Base Measure2</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base Measure2</em>'.
   * @see SoftwareMetricsMetamodel2.BinaryMeasure#getBaseMeasure2()
   * @see #getBinaryMeasure()
   * @generated
   */
	EReference getBinaryMeasure_BaseMeasure2();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.BinaryMeasurement <em>Binary Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.BinaryMeasurement
   * @generated
   */
	EClass getBinaryMeasurement();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.BinaryMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Base Supplied</em>'.
   * @see SoftwareMetricsMetamodel2.BinaryMeasurement#isIsBaseSupplied()
   * @see #getBinaryMeasurement()
   * @generated
   */
	EAttribute getBinaryMeasurement_IsBaseSupplied();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.BinaryMeasurement#getBaseMeasurement1 <em>Base Measurement1</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base Measurement1</em>'.
   * @see SoftwareMetricsMetamodel2.BinaryMeasurement#getBaseMeasurement1()
   * @see #getBinaryMeasurement()
   * @generated
   */
	EReference getBinaryMeasurement_BaseMeasurement1();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.BinaryMeasurement#getBaseMeasurement2 <em>Base Measurement2</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base Measurement2</em>'.
   * @see SoftwareMetricsMetamodel2.BinaryMeasurement#getBaseMeasurement2()
   * @see #getBinaryMeasurement()
   * @generated
   */
	EReference getBinaryMeasurement_BaseMeasurement2();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.CategoryRelationship <em>Category Relationship</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Category Relationship</em>'.
   * @see SoftwareMetricsMetamodel2.CategoryRelationship
   * @generated
   */
	EClass getCategoryRelationship();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.CategoryRelationship#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see SoftwareMetricsMetamodel2.CategoryRelationship#getName()
   * @see #getCategoryRelationship()
   * @generated
   */
	EAttribute getCategoryRelationship_Name();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.CategoryRelationship#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see SoftwareMetricsMetamodel2.CategoryRelationship#getTo()
   * @see #getCategoryRelationship()
   * @generated
   */
	EReference getCategoryRelationship_To();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.CategoryRelationship#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see SoftwareMetricsMetamodel2.CategoryRelationship#getFrom()
   * @see #getCategoryRelationship()
   * @generated
   */
	EReference getCategoryRelationship_From();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.Characteristic <em>Characteristic</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Characteristic</em>'.
   * @see SoftwareMetricsMetamodel2.Characteristic
   * @generated
   */
	EClass getCharacteristic();

	/**
   * Returns the meta object for the reference list '{@link SoftwareMetricsMetamodel2.Characteristic#getMeasure <em>Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Measure</em>'.
   * @see SoftwareMetricsMetamodel2.Characteristic#getMeasure()
   * @see #getCharacteristic()
   * @generated
   */
	EReference getCharacteristic_Measure();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.CollectiveMeasure <em>Collective Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collective Measure</em>'.
   * @see SoftwareMetricsMetamodel2.CollectiveMeasure
   * @generated
   */
	EClass getCollectiveMeasure();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.CollectiveMeasure#getAccumulator <em>Accumulator</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Accumulator</em>'.
   * @see SoftwareMetricsMetamodel2.CollectiveMeasure#getAccumulator()
   * @see #getCollectiveMeasure()
   * @generated
   */
	EAttribute getCollectiveMeasure_Accumulator();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.CollectiveMeasure#getBaseMeasure <em>Base Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base Measure</em>'.
   * @see SoftwareMetricsMetamodel2.CollectiveMeasure#getBaseMeasure()
   * @see #getCollectiveMeasure()
   * @generated
   */
	EReference getCollectiveMeasure_BaseMeasure();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.CollectiveMeasurement <em>Collective Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collective Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.CollectiveMeasurement
   * @generated
   */
	EClass getCollectiveMeasurement();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.CollectiveMeasurement#getAccumulator <em>Accumulator</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Accumulator</em>'.
   * @see SoftwareMetricsMetamodel2.CollectiveMeasurement#getAccumulator()
   * @see #getCollectiveMeasurement()
   * @generated
   */
	EAttribute getCollectiveMeasurement_Accumulator();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.CollectiveMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Base Supplied</em>'.
   * @see SoftwareMetricsMetamodel2.CollectiveMeasurement#isIsBaseSupplied()
   * @see #getCollectiveMeasurement()
   * @generated
   */
	EAttribute getCollectiveMeasurement_IsBaseSupplied();

	/**
   * Returns the meta object for the reference list '{@link SoftwareMetricsMetamodel2.CollectiveMeasurement#getBaseMeasurement <em>Base Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Base Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.CollectiveMeasurement#getBaseMeasurement()
   * @see #getCollectiveMeasurement()
   * @generated
   */
	EReference getCollectiveMeasurement_BaseMeasurement();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.Count <em>Count</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Count</em>'.
   * @see SoftwareMetricsMetamodel2.Count
   * @generated
   */
	EClass getCount();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.Counting <em>Counting</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Counting</em>'.
   * @see SoftwareMetricsMetamodel2.Counting
   * @generated
   */
	EClass getCounting();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date</em>'.
   * @see SoftwareMetricsMetamodel2.Date
   * @generated
   */
	EClass getDate();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.Date#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see SoftwareMetricsMetamodel2.Date#getValue()
   * @see #getDate()
   * @generated
   */
	EAttribute getDate_Value();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.DimensionalMeasure <em>Dimensional Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dimensional Measure</em>'.
   * @see SoftwareMetricsMetamodel2.DimensionalMeasure
   * @generated
   */
	EClass getDimensionalMeasure();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.DimensionalMeasure#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see SoftwareMetricsMetamodel2.DimensionalMeasure#getUnit()
   * @see #getDimensionalMeasure()
   * @generated
   */
	EAttribute getDimensionalMeasure_Unit();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.DimensionalMeasure#getLowerThreshold <em>Lower Threshold</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower Threshold</em>'.
   * @see SoftwareMetricsMetamodel2.DimensionalMeasure#getLowerThreshold()
   * @see #getDimensionalMeasure()
   * @generated
   */
	EAttribute getDimensionalMeasure_LowerThreshold();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.DimensionalMeasure#getUpperThreshold <em>Upper Threshold</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper Threshold</em>'.
   * @see SoftwareMetricsMetamodel2.DimensionalMeasure#getUpperThreshold()
   * @see #getDimensionalMeasure()
   * @generated
   */
	EAttribute getDimensionalMeasure_UpperThreshold();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.DimensionalMeasurement <em>Dimensional Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dimensional Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.DimensionalMeasurement
   * @generated
   */
	EClass getDimensionalMeasurement();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.DimensionalMeasurement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see SoftwareMetricsMetamodel2.DimensionalMeasurement#getValue()
   * @see #getDimensionalMeasurement()
   * @generated
   */
	EAttribute getDimensionalMeasurement_Value();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.DirectMeasure <em>Direct Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Measure</em>'.
   * @see SoftwareMetricsMetamodel2.DirectMeasure
   * @generated
   */
	EClass getDirectMeasure();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.DirectMeasure#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see SoftwareMetricsMetamodel2.DirectMeasure#getOperation()
   * @see #getDirectMeasure()
   * @generated
   */
	EAttribute getDirectMeasure_Operation();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.DirectMeasurement <em>Direct Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.DirectMeasurement
   * @generated
   */
	EClass getDirectMeasurement();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot
   * @generated
   */
	EClass getDocumentRoot();

	/**
   * Returns the meta object for the attribute list '{@link SoftwareMetricsMetamodel2.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
	EAttribute getDocumentRoot_Mixed();

	/**
   * Returns the meta object for the map '{@link SoftwareMetricsMetamodel2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
   * Returns the meta object for the map '{@link SoftwareMetricsMetamodel2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getAggregatedMeasurement <em>Aggregated Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aggregated Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getAggregatedMeasurement()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_AggregatedMeasurement();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getBinaryMeasure <em>Binary Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Measure</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getBinaryMeasure()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_BinaryMeasure();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getBinaryMeasurement <em>Binary Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getBinaryMeasurement()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_BinaryMeasurement();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getCategoryRelationship <em>Category Relationship</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Category Relationship</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getCategoryRelationship()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_CategoryRelationship();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getCharacteristic <em>Characteristic</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Characteristic</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getCharacteristic()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_Characteristic();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getCollectiveMeasure <em>Collective Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Collective Measure</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getCollectiveMeasure()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_CollectiveMeasure();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getCollectiveMeasurement <em>Collective Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Collective Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getCollectiveMeasurement()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_CollectiveMeasurement();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getCount <em>Count</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Count</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getCount()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_Count();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getCounting <em>Counting</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Counting</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getCounting()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_Counting();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Date</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getDate()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_Date();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getDimensionalMeasure <em>Dimensional Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dimensional Measure</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getDimensionalMeasure()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_DimensionalMeasure();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getDimensionalMeasurement <em>Dimensional Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dimensional Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getDimensionalMeasurement()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_DimensionalMeasurement();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getDirectMeasure <em>Direct Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Direct Measure</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getDirectMeasure()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_DirectMeasure();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getDirectMeasurement <em>Direct Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Direct Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getDirectMeasurement()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_DirectMeasurement();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getGrade <em>Grade</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Grade</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getGrade()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_Grade();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getMeasure <em>Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Measure</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getMeasure()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_Measure();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getMeasurement <em>Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getMeasurement()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_Measurement();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getMeasurementRelation <em>Measurement Relation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Measurement Relation</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getMeasurementRelation()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_MeasurementRelation();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getMeasureRelationship <em>Measure Relationship</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Measure Relationship</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getMeasureRelationship()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_MeasureRelationship();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getNamedMeasure <em>Named Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Named Measure</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getNamedMeasure()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_NamedMeasure();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getNamedMeasurement <em>Named Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Named Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getNamedMeasurement()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_NamedMeasurement();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getObservation <em>Observation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Observation</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getObservation()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_Observation();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getRanking <em>Ranking</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ranking</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getRanking()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_Ranking();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getRankingInterval <em>Ranking Interval</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ranking Interval</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getRankingInterval()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_RankingInterval();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getRatioMeasure <em>Ratio Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ratio Measure</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getRatioMeasure()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_RatioMeasure();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getRatioMeasurment <em>Ratio Measurment</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ratio Measurment</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getRatioMeasurment()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_RatioMeasurment();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getRescaledMeasure <em>Rescaled Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rescaled Measure</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getRescaledMeasure()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_RescaledMeasure();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getReScaledMeasurement <em>Re Scaled Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Re Scaled Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getReScaledMeasurement()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_ReScaledMeasurement();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scope</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getScope()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_Scope();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getSMMCategory <em>SMM Category</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>SMM Category</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getSMMCategory()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_SMMCategory();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getSMMElement <em>SMM Element</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>SMM Element</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getSMMElement()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_SMMElement();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getSMMModel <em>SMM Model</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>SMM Model</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getSMMModel()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_SMMModel();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getSMMRelationship <em>SMM Relationship</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>SMM Relationship</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getSMMRelationship()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_SMMRelationship();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.DocumentRoot#getTimestamp <em>Timestamp</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Timestamp</em>'.
   * @see SoftwareMetricsMetamodel2.DocumentRoot#getTimestamp()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_Timestamp();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.Grade <em>Grade</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grade</em>'.
   * @see SoftwareMetricsMetamodel2.Grade
   * @generated
   */
	EClass getGrade();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.Grade#isIsBaseSupplied <em>Is Base Supplied</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Base Supplied</em>'.
   * @see SoftwareMetricsMetamodel2.Grade#isIsBaseSupplied()
   * @see #getGrade()
   * @generated
   */
	EAttribute getGrade_IsBaseSupplied();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.Grade#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see SoftwareMetricsMetamodel2.Grade#getValue()
   * @see #getGrade()
   * @generated
   */
	EAttribute getGrade_Value();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.Grade#getBaseMeasurement <em>Base Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.Grade#getBaseMeasurement()
   * @see #getGrade()
   * @generated
   */
	EReference getGrade_BaseMeasurement();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.Measure <em>Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Measure</em>'.
   * @see SoftwareMetricsMetamodel2.Measure
   * @generated
   */
	EClass getMeasure();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.Measure#getLibrary <em>Library</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Library</em>'.
   * @see SoftwareMetricsMetamodel2.Measure#getLibrary()
   * @see #getMeasure()
   * @generated
   */
	EAttribute getMeasure_Library();

	/**
   * Returns the meta object for the reference list '{@link SoftwareMetricsMetamodel2.Measure#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Category</em>'.
   * @see SoftwareMetricsMetamodel2.Measure#getCategory()
   * @see #getMeasure()
   * @generated
   */
	EReference getMeasure_Category();

	/**
   * Returns the meta object for the reference list '{@link SoftwareMetricsMetamodel2.Measure#getEquivalentFrom <em>Equivalent From</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Equivalent From</em>'.
   * @see SoftwareMetricsMetamodel2.Measure#getEquivalentFrom()
   * @see #getMeasure()
   * @generated
   */
	EReference getMeasure_EquivalentFrom();

	/**
   * Returns the meta object for the reference list '{@link SoftwareMetricsMetamodel2.Measure#getRefinement <em>Refinement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refinement</em>'.
   * @see SoftwareMetricsMetamodel2.Measure#getRefinement()
   * @see #getMeasure()
   * @generated
   */
	EReference getMeasure_Refinement();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.Measure#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Scope</em>'.
   * @see SoftwareMetricsMetamodel2.Measure#getScope()
   * @see #getMeasure()
   * @generated
   */
	EReference getMeasure_Scope();

	/**
   * Returns the meta object for the reference list '{@link SoftwareMetricsMetamodel2.Measure#getUtil <em>Util</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Util</em>'.
   * @see SoftwareMetricsMetamodel2.Measure#getUtil()
   * @see #getMeasure()
   * @generated
   */
	EReference getMeasure_Util();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.Measure#isDirectInvoke <em>Direct Invoke</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direct Invoke</em>'.
   * @see SoftwareMetricsMetamodel2.Measure#isDirectInvoke()
   * @see #getMeasure()
   * @generated
   */
	EAttribute getMeasure_DirectInvoke();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.Measure#getTrait <em>Trait</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Trait</em>'.
   * @see SoftwareMetricsMetamodel2.Measure#getTrait()
   * @see #getMeasure()
   * @generated
   */
	EReference getMeasure_Trait();

	/**
   * Returns the meta object for the reference list '{@link SoftwareMetricsMetamodel2.Measure#getMeasurement <em>Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.Measure#getMeasurement()
   * @see #getMeasure()
   * @generated
   */
	EReference getMeasure_Measurement();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.Measurement <em>Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.Measurement
   * @generated
   */
	EClass getMeasurement();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.Measurement#getError <em>Error</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Error</em>'.
   * @see SoftwareMetricsMetamodel2.Measurement#getError()
   * @see #getMeasurement()
   * @generated
   */
	EAttribute getMeasurement_Error();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.Measurement#getObservation <em>Observation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Observation</em>'.
   * @see SoftwareMetricsMetamodel2.Measurement#getObservation()
   * @see #getMeasurement()
   * @generated
   */
	EReference getMeasurement_Observation();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.Measurement#getMeasure <em>Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Measure</em>'.
   * @see SoftwareMetricsMetamodel2.Measurement#getMeasure()
   * @see #getMeasurement()
   * @generated
   */
	EReference getMeasurement_Measure();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.Measurement#getMeasurand <em>Measurand</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Measurand</em>'.
   * @see SoftwareMetricsMetamodel2.Measurement#getMeasurand()
   * @see #getMeasurement()
   * @generated
   */
	EReference getMeasurement_Measurand();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.MeasurementRelation <em>Measurement Relation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Measurement Relation</em>'.
   * @see SoftwareMetricsMetamodel2.MeasurementRelation
   * @generated
   */
	EClass getMeasurementRelation();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.MeasurementRelation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see SoftwareMetricsMetamodel2.MeasurementRelation#getName()
   * @see #getMeasurementRelation()
   * @generated
   */
	EAttribute getMeasurementRelation_Name();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.MeasurementRelation#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see SoftwareMetricsMetamodel2.MeasurementRelation#getFrom()
   * @see #getMeasurementRelation()
   * @generated
   */
	EReference getMeasurementRelation_From();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.MeasurementRelation#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see SoftwareMetricsMetamodel2.MeasurementRelation#getTo()
   * @see #getMeasurementRelation()
   * @generated
   */
	EReference getMeasurementRelation_To();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.MeasureRelationship <em>Measure Relationship</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Measure Relationship</em>'.
   * @see SoftwareMetricsMetamodel2.MeasureRelationship
   * @generated
   */
	EClass getMeasureRelationship();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.MeasureRelationship#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see SoftwareMetricsMetamodel2.MeasureRelationship#getName()
   * @see #getMeasureRelationship()
   * @generated
   */
	EAttribute getMeasureRelationship_Name();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.MeasureRelationship#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see SoftwareMetricsMetamodel2.MeasureRelationship#getFrom()
   * @see #getMeasureRelationship()
   * @generated
   */
	EReference getMeasureRelationship_From();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.MeasureRelationship#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see SoftwareMetricsMetamodel2.MeasureRelationship#getTo()
   * @see #getMeasureRelationship()
   * @generated
   */
	EReference getMeasureRelationship_To();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.NamedMeasure <em>Named Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Measure</em>'.
   * @see SoftwareMetricsMetamodel2.NamedMeasure
   * @generated
   */
	EClass getNamedMeasure();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.NamedMeasure#getName1 <em>Name1</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name1</em>'.
   * @see SoftwareMetricsMetamodel2.NamedMeasure#getName1()
   * @see #getNamedMeasure()
   * @generated
   */
	EAttribute getNamedMeasure_Name1();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.NamedMeasurement <em>Named Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.NamedMeasurement
   * @generated
   */
	EClass getNamedMeasurement();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.Observation <em>Observation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Observation</em>'.
   * @see SoftwareMetricsMetamodel2.Observation
   * @generated
   */
	EClass getObservation();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.Observation#getObserver <em>Observer</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Observer</em>'.
   * @see SoftwareMetricsMetamodel2.Observation#getObserver()
   * @see #getObservation()
   * @generated
   */
	EAttribute getObservation_Observer();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.Observation#getTool <em>Tool</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tool</em>'.
   * @see SoftwareMetricsMetamodel2.Observation#getTool()
   * @see #getObservation()
   * @generated
   */
	EAttribute getObservation_Tool();

	/**
   * Returns the meta object for the containment reference '{@link SoftwareMetricsMetamodel2.Observation#getWhenObserved <em>When Observed</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When Observed</em>'.
   * @see SoftwareMetricsMetamodel2.Observation#getWhenObserved()
   * @see #getObservation()
   * @generated
   */
	EReference getObservation_WhenObserved();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.Ranking <em>Ranking</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ranking</em>'.
   * @see SoftwareMetricsMetamodel2.Ranking
   * @generated
   */
	EClass getRanking();

	/**
   * Returns the meta object for the reference list '{@link SoftwareMetricsMetamodel2.Ranking#getInterval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Interval</em>'.
   * @see SoftwareMetricsMetamodel2.Ranking#getInterval()
   * @see #getRanking()
   * @generated
   */
	EReference getRanking_Interval();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.Ranking#getBaseMeasure <em>Base Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base Measure</em>'.
   * @see SoftwareMetricsMetamodel2.Ranking#getBaseMeasure()
   * @see #getRanking()
   * @generated
   */
	EReference getRanking_BaseMeasure();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.RankingInterval <em>Ranking Interval</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ranking Interval</em>'.
   * @see SoftwareMetricsMetamodel2.RankingInterval
   * @generated
   */
	EClass getRankingInterval();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.RankingInterval#getMaximumEndpoint <em>Maximum Endpoint</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maximum Endpoint</em>'.
   * @see SoftwareMetricsMetamodel2.RankingInterval#getMaximumEndpoint()
   * @see #getRankingInterval()
   * @generated
   */
	EAttribute getRankingInterval_MaximumEndpoint();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.RankingInterval#isMaximumOpen <em>Maximum Open</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maximum Open</em>'.
   * @see SoftwareMetricsMetamodel2.RankingInterval#isMaximumOpen()
   * @see #getRankingInterval()
   * @generated
   */
	EAttribute getRankingInterval_MaximumOpen();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.RankingInterval#getMinimumEndpoint <em>Minimum Endpoint</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minimum Endpoint</em>'.
   * @see SoftwareMetricsMetamodel2.RankingInterval#getMinimumEndpoint()
   * @see #getRankingInterval()
   * @generated
   */
	EAttribute getRankingInterval_MinimumEndpoint();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.RankingInterval#isMinimumOpen <em>Minimum Open</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minimum Open</em>'.
   * @see SoftwareMetricsMetamodel2.RankingInterval#isMinimumOpen()
   * @see #getRankingInterval()
   * @generated
   */
	EAttribute getRankingInterval_MinimumOpen();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.RankingInterval#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Symbol</em>'.
   * @see SoftwareMetricsMetamodel2.RankingInterval#getSymbol()
   * @see #getRankingInterval()
   * @generated
   */
	EAttribute getRankingInterval_Symbol();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.RatioMeasure <em>Ratio Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ratio Measure</em>'.
   * @see SoftwareMetricsMetamodel2.RatioMeasure
   * @generated
   */
	EClass getRatioMeasure();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.RatioMeasure#getFunctor1 <em>Functor1</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Functor1</em>'.
   * @see SoftwareMetricsMetamodel2.RatioMeasure#getFunctor1()
   * @see #getRatioMeasure()
   * @generated
   */
	EAttribute getRatioMeasure_Functor1();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.RatioMeasurement <em>Ratio Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ratio Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.RatioMeasurement
   * @generated
   */
	EClass getRatioMeasurement();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.RescaledMeasure <em>Rescaled Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rescaled Measure</em>'.
   * @see SoftwareMetricsMetamodel2.RescaledMeasure
   * @generated
   */
	EClass getRescaledMeasure();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.RescaledMeasure#getFormula <em>Formula</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Formula</em>'.
   * @see SoftwareMetricsMetamodel2.RescaledMeasure#getFormula()
   * @see #getRescaledMeasure()
   * @generated
   */
	EAttribute getRescaledMeasure_Formula();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.RescaledMeasure#getBaseMeasure <em>Base Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base Measure</em>'.
   * @see SoftwareMetricsMetamodel2.RescaledMeasure#getBaseMeasure()
   * @see #getRescaledMeasure()
   * @generated
   */
	EReference getRescaledMeasure_BaseMeasure();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.ReScaledMeasurement <em>Re Scaled Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Re Scaled Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.ReScaledMeasurement
   * @generated
   */
	EClass getReScaledMeasurement();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.ReScaledMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Base Supplied</em>'.
   * @see SoftwareMetricsMetamodel2.ReScaledMeasurement#isIsBaseSupplied()
   * @see #getReScaledMeasurement()
   * @generated
   */
	EAttribute getReScaledMeasurement_IsBaseSupplied();

	/**
   * Returns the meta object for the reference '{@link SoftwareMetricsMetamodel2.ReScaledMeasurement#getBaseMeasurement <em>Base Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base Measurement</em>'.
   * @see SoftwareMetricsMetamodel2.ReScaledMeasurement#getBaseMeasurement()
   * @see #getReScaledMeasurement()
   * @generated
   */
	EReference getReScaledMeasurement_BaseMeasurement();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scope</em>'.
   * @see SoftwareMetricsMetamodel2.Scope
   * @generated
   */
	EClass getScope();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.Scope#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see SoftwareMetricsMetamodel2.Scope#getClass_()
   * @see #getScope()
   * @generated
   */
	EAttribute getScope_Class();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.Scope#isEnumerated <em>Enumerated</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enumerated</em>'.
   * @see SoftwareMetricsMetamodel2.Scope#isEnumerated()
   * @see #getScope()
   * @generated
   */
	EAttribute getScope_Enumerated();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.Scope#getRecognizer <em>Recognizer</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recognizer</em>'.
   * @see SoftwareMetricsMetamodel2.Scope#getRecognizer()
   * @see #getScope()
   * @generated
   */
	EAttribute getScope_Recognizer();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.SMMCategory <em>SMM Category</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMM Category</em>'.
   * @see SoftwareMetricsMetamodel2.SMMCategory
   * @generated
   */
	EClass getSMMCategory();

	/**
   * Returns the meta object for the reference list '{@link SoftwareMetricsMetamodel2.SMMCategory#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Category</em>'.
   * @see SoftwareMetricsMetamodel2.SMMCategory#getCategory()
   * @see #getSMMCategory()
   * @generated
   */
	EReference getSMMCategory_Category();

	/**
   * Returns the meta object for the reference list '{@link SoftwareMetricsMetamodel2.SMMCategory#getCategoryElement <em>Category Element</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Category Element</em>'.
   * @see SoftwareMetricsMetamodel2.SMMCategory#getCategoryElement()
   * @see #getSMMCategory()
   * @generated
   */
	EReference getSMMCategory_CategoryElement();

	/**
   * Returns the meta object for the reference list '{@link SoftwareMetricsMetamodel2.SMMCategory#getMeasureElement <em>Measure Element</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Measure Element</em>'.
   * @see SoftwareMetricsMetamodel2.SMMCategory#getMeasureElement()
   * @see #getSMMCategory()
   * @generated
   */
	EReference getSMMCategory_MeasureElement();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.SMMElement <em>SMM Element</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMM Element</em>'.
   * @see SoftwareMetricsMetamodel2.SMMElement
   * @generated
   */
	EClass getSMMElement();

	/**
   * Returns the meta object for the container reference '{@link SoftwareMetricsMetamodel2.SMMElement#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see SoftwareMetricsMetamodel2.SMMElement#getParent()
   * @see #getSMMElement()
   * @generated
   */
	EReference getSMMElement_Parent();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.SMMElement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see SoftwareMetricsMetamodel2.SMMElement#getDescription()
   * @see #getSMMElement()
   * @generated
   */
	EAttribute getSMMElement_Description();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.SMMModel <em>SMM Model</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMM Model</em>'.
   * @see SoftwareMetricsMetamodel2.SMMModel
   * @generated
   */
	EClass getSMMModel();

	/**
   * Returns the meta object for the containment reference list '{@link SoftwareMetricsMetamodel2.SMMModel#getSMMElement <em>SMM Element</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>SMM Element</em>'.
   * @see SoftwareMetricsMetamodel2.SMMModel#getSMMElement()
   * @see #getSMMModel()
   * @generated
   */
	EReference getSMMModel_SMMElement();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.SMMModel#getMetaModelPackageURI <em>Meta Model Package URI</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Meta Model Package URI</em>'.
   * @see SoftwareMetricsMetamodel2.SMMModel#getMetaModelPackageURI()
   * @see #getSMMModel()
   * @generated
   */
	EAttribute getSMMModel_MetaModelPackageURI();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.SMMRelationship <em>SMM Relationship</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMM Relationship</em>'.
   * @see SoftwareMetricsMetamodel2.SMMRelationship
   * @generated
   */
	EClass getSMMRelationship();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.Timestamp <em>Timestamp</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timestamp</em>'.
   * @see SoftwareMetricsMetamodel2.Timestamp
   * @generated
   */
	EClass getTimestamp();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.SMMNamedElement <em>SMM Named Element</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMM Named Element</em>'.
   * @see SoftwareMetricsMetamodel2.SMMNamedElement
   * @generated
   */
	EClass getSMMNamedElement();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.SMMNamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see SoftwareMetricsMetamodel2.SMMNamedElement#getName()
   * @see #getSMMNamedElement()
   * @generated
   */
	EAttribute getSMMNamedElement_Name();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.MeasureUtil <em>Measure Util</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Measure Util</em>'.
   * @see SoftwareMetricsMetamodel2.MeasureUtil
   * @generated
   */
	EClass getMeasureUtil();

	/**
   * Returns the meta object for the attribute '{@link SoftwareMetricsMetamodel2.MeasureUtil#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see SoftwareMetricsMetamodel2.MeasureUtil#getOperation()
   * @see #getMeasureUtil()
   * @generated
   */
	EAttribute getMeasureUtil_Operation();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.Audit <em>Audit</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Audit</em>'.
   * @see SoftwareMetricsMetamodel2.Audit
   * @generated
   */
	EClass getAudit();

	/**
   * Returns the meta object for the reference list '{@link SoftwareMetricsMetamodel2.Audit#getMeasure <em>Measure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Measure</em>'.
   * @see SoftwareMetricsMetamodel2.Audit#getMeasure()
   * @see #getAudit()
   * @generated
   */
	EReference getAudit_Measure();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.MeasureAggregation <em>Measure Aggregation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Measure Aggregation</em>'.
   * @see SoftwareMetricsMetamodel2.MeasureAggregation
   * @generated
   */
	EClass getMeasureAggregation();

	/**
   * Returns the meta object for class '{@link SoftwareMetricsMetamodel2.MeasurementAggregation <em>Measurement Aggregation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Measurement Aggregation</em>'.
   * @see SoftwareMetricsMetamodel2.MeasurementAggregation
   * @generated
   */
	EClass getMeasurementAggregation();

	/**
   * Returns the meta object for enum '{@link SoftwareMetricsMetamodel2.Accumulator <em>Accumulator</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Accumulator</em>'.
   * @see SoftwareMetricsMetamodel2.Accumulator
   * @generated
   */
	EEnum getAccumulator();

	/**
   * Returns the meta object for data type '{@link SoftwareMetricsMetamodel2.Accumulator <em>Accumulator Object</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Accumulator Object</em>'.
   * @see SoftwareMetricsMetamodel2.Accumulator
   * @model instanceClass="SoftwareMetricsMetamodel2.Accumulator"
   *        extendedMetaData="name='Accumulator:Object' baseType='Accumulator'"
   * @generated
   */
	EDataType getAccumulatorObject();

	/**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
	SoftwareMetricsMetamodel2Factory getSoftwareMetricsMetamodel2Factory();

	/**
   * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
   * @generated
   */
	interface Literals {
		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.AggregatedMeasurementImpl <em>Aggregated Measurement</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.AggregatedMeasurementImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getAggregatedMeasurement()
     * @generated
     */
		EClass AGGREGATED_MEASUREMENT = eINSTANCE.getAggregatedMeasurement();

		/**
     * The meta object literal for the '<em><b>Is Base Supplied</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute AGGREGATED_MEASUREMENT__IS_BASE_SUPPLIED = eINSTANCE.getAggregatedMeasurement_IsBaseSupplied();

		/**
     * The meta object literal for the '<em><b>Base Measurement</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference AGGREGATED_MEASUREMENT__BASE_MEASUREMENT = eINSTANCE.getAggregatedMeasurement_BaseMeasurement();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.BinaryMeasureImpl <em>Binary Measure</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.BinaryMeasureImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getBinaryMeasure()
     * @generated
     */
		EClass BINARY_MEASURE = eINSTANCE.getBinaryMeasure();

		/**
     * The meta object literal for the '<em><b>Functor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute BINARY_MEASURE__FUNCTOR = eINSTANCE.getBinaryMeasure_Functor();

		/**
     * The meta object literal for the '<em><b>Base Measure1</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference BINARY_MEASURE__BASE_MEASURE1 = eINSTANCE.getBinaryMeasure_BaseMeasure1();

		/**
     * The meta object literal for the '<em><b>Base Measure2</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference BINARY_MEASURE__BASE_MEASURE2 = eINSTANCE.getBinaryMeasure_BaseMeasure2();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.BinaryMeasurementImpl <em>Binary Measurement</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.BinaryMeasurementImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getBinaryMeasurement()
     * @generated
     */
		EClass BINARY_MEASUREMENT = eINSTANCE.getBinaryMeasurement();

		/**
     * The meta object literal for the '<em><b>Is Base Supplied</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute BINARY_MEASUREMENT__IS_BASE_SUPPLIED = eINSTANCE.getBinaryMeasurement_IsBaseSupplied();

		/**
     * The meta object literal for the '<em><b>Base Measurement1</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference BINARY_MEASUREMENT__BASE_MEASUREMENT1 = eINSTANCE.getBinaryMeasurement_BaseMeasurement1();

		/**
     * The meta object literal for the '<em><b>Base Measurement2</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference BINARY_MEASUREMENT__BASE_MEASUREMENT2 = eINSTANCE.getBinaryMeasurement_BaseMeasurement2();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.CategoryRelationshipImpl <em>Category Relationship</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.CategoryRelationshipImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getCategoryRelationship()
     * @generated
     */
		EClass CATEGORY_RELATIONSHIP = eINSTANCE.getCategoryRelationship();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute CATEGORY_RELATIONSHIP__NAME = eINSTANCE.getCategoryRelationship_Name();

		/**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference CATEGORY_RELATIONSHIP__TO = eINSTANCE.getCategoryRelationship_To();

		/**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference CATEGORY_RELATIONSHIP__FROM = eINSTANCE.getCategoryRelationship_From();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.CharacteristicImpl <em>Characteristic</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.CharacteristicImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getCharacteristic()
     * @generated
     */
		EClass CHARACTERISTIC = eINSTANCE.getCharacteristic();

		/**
     * The meta object literal for the '<em><b>Measure</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference CHARACTERISTIC__MEASURE = eINSTANCE.getCharacteristic_Measure();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.CollectiveMeasureImpl <em>Collective Measure</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.CollectiveMeasureImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getCollectiveMeasure()
     * @generated
     */
		EClass COLLECTIVE_MEASURE = eINSTANCE.getCollectiveMeasure();

		/**
     * The meta object literal for the '<em><b>Accumulator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute COLLECTIVE_MEASURE__ACCUMULATOR = eINSTANCE.getCollectiveMeasure_Accumulator();

		/**
     * The meta object literal for the '<em><b>Base Measure</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference COLLECTIVE_MEASURE__BASE_MEASURE = eINSTANCE.getCollectiveMeasure_BaseMeasure();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.CollectiveMeasurementImpl <em>Collective Measurement</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.CollectiveMeasurementImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getCollectiveMeasurement()
     * @generated
     */
		EClass COLLECTIVE_MEASUREMENT = eINSTANCE.getCollectiveMeasurement();

		/**
     * The meta object literal for the '<em><b>Accumulator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute COLLECTIVE_MEASUREMENT__ACCUMULATOR = eINSTANCE.getCollectiveMeasurement_Accumulator();

		/**
     * The meta object literal for the '<em><b>Is Base Supplied</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute COLLECTIVE_MEASUREMENT__IS_BASE_SUPPLIED = eINSTANCE.getCollectiveMeasurement_IsBaseSupplied();

		/**
     * The meta object literal for the '<em><b>Base Measurement</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT = eINSTANCE.getCollectiveMeasurement_BaseMeasurement();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.CountImpl <em>Count</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.CountImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getCount()
     * @generated
     */
		EClass COUNT = eINSTANCE.getCount();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.CountingImpl <em>Counting</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.CountingImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getCounting()
     * @generated
     */
		EClass COUNTING = eINSTANCE.getCounting();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.DateImpl <em>Date</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.DateImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getDate()
     * @generated
     */
		EClass DATE = eINSTANCE.getDate();

		/**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute DATE__VALUE = eINSTANCE.getDate_Value();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.DimensionalMeasureImpl <em>Dimensional Measure</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.DimensionalMeasureImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getDimensionalMeasure()
     * @generated
     */
		EClass DIMENSIONAL_MEASURE = eINSTANCE.getDimensionalMeasure();

		/**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute DIMENSIONAL_MEASURE__UNIT = eINSTANCE.getDimensionalMeasure_Unit();

		/**
     * The meta object literal for the '<em><b>Lower Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute DIMENSIONAL_MEASURE__LOWER_THRESHOLD = eINSTANCE.getDimensionalMeasure_LowerThreshold();

		/**
     * The meta object literal for the '<em><b>Upper Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute DIMENSIONAL_MEASURE__UPPER_THRESHOLD = eINSTANCE.getDimensionalMeasure_UpperThreshold();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.DimensionalMeasurementImpl <em>Dimensional Measurement</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.DimensionalMeasurementImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getDimensionalMeasurement()
     * @generated
     */
		EClass DIMENSIONAL_MEASUREMENT = eINSTANCE.getDimensionalMeasurement();

		/**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute DIMENSIONAL_MEASUREMENT__VALUE = eINSTANCE.getDimensionalMeasurement_Value();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.DirectMeasureImpl <em>Direct Measure</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.DirectMeasureImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getDirectMeasure()
     * @generated
     */
		EClass DIRECT_MEASURE = eINSTANCE.getDirectMeasure();

		/**
     * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute DIRECT_MEASURE__OPERATION = eINSTANCE.getDirectMeasure_Operation();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.DirectMeasurementImpl <em>Direct Measurement</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.DirectMeasurementImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getDirectMeasurement()
     * @generated
     */
		EClass DIRECT_MEASUREMENT = eINSTANCE.getDirectMeasurement();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.DocumentRootImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getDocumentRoot()
     * @generated
     */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
     * The meta object literal for the '<em><b>Aggregated Measurement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__AGGREGATED_MEASUREMENT = eINSTANCE.getDocumentRoot_AggregatedMeasurement();

		/**
     * The meta object literal for the '<em><b>Binary Measure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__BINARY_MEASURE = eINSTANCE.getDocumentRoot_BinaryMeasure();

		/**
     * The meta object literal for the '<em><b>Binary Measurement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__BINARY_MEASUREMENT = eINSTANCE.getDocumentRoot_BinaryMeasurement();

		/**
     * The meta object literal for the '<em><b>Category Relationship</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__CATEGORY_RELATIONSHIP = eINSTANCE.getDocumentRoot_CategoryRelationship();

		/**
     * The meta object literal for the '<em><b>Characteristic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__CHARACTERISTIC = eINSTANCE.getDocumentRoot_Characteristic();

		/**
     * The meta object literal for the '<em><b>Collective Measure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__COLLECTIVE_MEASURE = eINSTANCE.getDocumentRoot_CollectiveMeasure();

		/**
     * The meta object literal for the '<em><b>Collective Measurement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__COLLECTIVE_MEASUREMENT = eINSTANCE.getDocumentRoot_CollectiveMeasurement();

		/**
     * The meta object literal for the '<em><b>Count</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__COUNT = eINSTANCE.getDocumentRoot_Count();

		/**
     * The meta object literal for the '<em><b>Counting</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__COUNTING = eINSTANCE.getDocumentRoot_Counting();

		/**
     * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__DATE = eINSTANCE.getDocumentRoot_Date();

		/**
     * The meta object literal for the '<em><b>Dimensional Measure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__DIMENSIONAL_MEASURE = eINSTANCE.getDocumentRoot_DimensionalMeasure();

		/**
     * The meta object literal for the '<em><b>Dimensional Measurement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__DIMENSIONAL_MEASUREMENT = eINSTANCE.getDocumentRoot_DimensionalMeasurement();

		/**
     * The meta object literal for the '<em><b>Direct Measure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__DIRECT_MEASURE = eINSTANCE.getDocumentRoot_DirectMeasure();

		/**
     * The meta object literal for the '<em><b>Direct Measurement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__DIRECT_MEASUREMENT = eINSTANCE.getDocumentRoot_DirectMeasurement();

		/**
     * The meta object literal for the '<em><b>Grade</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__GRADE = eINSTANCE.getDocumentRoot_Grade();

		/**
     * The meta object literal for the '<em><b>Measure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__MEASURE = eINSTANCE.getDocumentRoot_Measure();

		/**
     * The meta object literal for the '<em><b>Measurement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__MEASUREMENT = eINSTANCE.getDocumentRoot_Measurement();

		/**
     * The meta object literal for the '<em><b>Measurement Relation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__MEASUREMENT_RELATION = eINSTANCE.getDocumentRoot_MeasurementRelation();

		/**
     * The meta object literal for the '<em><b>Measure Relationship</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__MEASURE_RELATIONSHIP = eINSTANCE.getDocumentRoot_MeasureRelationship();

		/**
     * The meta object literal for the '<em><b>Named Measure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__NAMED_MEASURE = eINSTANCE.getDocumentRoot_NamedMeasure();

		/**
     * The meta object literal for the '<em><b>Named Measurement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__NAMED_MEASUREMENT = eINSTANCE.getDocumentRoot_NamedMeasurement();

		/**
     * The meta object literal for the '<em><b>Observation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__OBSERVATION = eINSTANCE.getDocumentRoot_Observation();

		/**
     * The meta object literal for the '<em><b>Ranking</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__RANKING = eINSTANCE.getDocumentRoot_Ranking();

		/**
     * The meta object literal for the '<em><b>Ranking Interval</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__RANKING_INTERVAL = eINSTANCE.getDocumentRoot_RankingInterval();

		/**
     * The meta object literal for the '<em><b>Ratio Measure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__RATIO_MEASURE = eINSTANCE.getDocumentRoot_RatioMeasure();

		/**
     * The meta object literal for the '<em><b>Ratio Measurment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__RATIO_MEASURMENT = eINSTANCE.getDocumentRoot_RatioMeasurment();

		/**
     * The meta object literal for the '<em><b>Rescaled Measure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__RESCALED_MEASURE = eINSTANCE.getDocumentRoot_RescaledMeasure();

		/**
     * The meta object literal for the '<em><b>Re Scaled Measurement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__RE_SCALED_MEASUREMENT = eINSTANCE.getDocumentRoot_ReScaledMeasurement();

		/**
     * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__SCOPE = eINSTANCE.getDocumentRoot_Scope();

		/**
     * The meta object literal for the '<em><b>SMM Category</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__SMM_CATEGORY = eINSTANCE.getDocumentRoot_SMMCategory();

		/**
     * The meta object literal for the '<em><b>SMM Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__SMM_ELEMENT = eINSTANCE.getDocumentRoot_SMMElement();

		/**
     * The meta object literal for the '<em><b>SMM Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__SMM_MODEL = eINSTANCE.getDocumentRoot_SMMModel();

		/**
     * The meta object literal for the '<em><b>SMM Relationship</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__SMM_RELATIONSHIP = eINSTANCE.getDocumentRoot_SMMRelationship();

		/**
     * The meta object literal for the '<em><b>Timestamp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DOCUMENT_ROOT__TIMESTAMP = eINSTANCE.getDocumentRoot_Timestamp();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.GradeImpl <em>Grade</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.GradeImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getGrade()
     * @generated
     */
		EClass GRADE = eINSTANCE.getGrade();

		/**
     * The meta object literal for the '<em><b>Is Base Supplied</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute GRADE__IS_BASE_SUPPLIED = eINSTANCE.getGrade_IsBaseSupplied();

		/**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute GRADE__VALUE = eINSTANCE.getGrade_Value();

		/**
     * The meta object literal for the '<em><b>Base Measurement</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference GRADE__BASE_MEASUREMENT = eINSTANCE.getGrade_BaseMeasurement();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.MeasureImpl <em>Measure</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.MeasureImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getMeasure()
     * @generated
     */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
     * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute MEASURE__LIBRARY = eINSTANCE.getMeasure_Library();

		/**
     * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference MEASURE__CATEGORY = eINSTANCE.getMeasure_Category();

		/**
     * The meta object literal for the '<em><b>Equivalent From</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference MEASURE__EQUIVALENT_FROM = eINSTANCE.getMeasure_EquivalentFrom();

		/**
     * The meta object literal for the '<em><b>Refinement</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference MEASURE__REFINEMENT = eINSTANCE.getMeasure_Refinement();

		/**
     * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference MEASURE__SCOPE = eINSTANCE.getMeasure_Scope();

		/**
     * The meta object literal for the '<em><b>Util</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference MEASURE__UTIL = eINSTANCE.getMeasure_Util();

		/**
     * The meta object literal for the '<em><b>Direct Invoke</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute MEASURE__DIRECT_INVOKE = eINSTANCE.getMeasure_DirectInvoke();

		/**
     * The meta object literal for the '<em><b>Trait</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference MEASURE__TRAIT = eINSTANCE.getMeasure_Trait();

		/**
     * The meta object literal for the '<em><b>Measurement</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference MEASURE__MEASUREMENT = eINSTANCE.getMeasure_Measurement();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.MeasurementImpl <em>Measurement</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.MeasurementImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getMeasurement()
     * @generated
     */
		EClass MEASUREMENT = eINSTANCE.getMeasurement();

		/**
     * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute MEASUREMENT__ERROR = eINSTANCE.getMeasurement_Error();

		/**
     * The meta object literal for the '<em><b>Observation</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference MEASUREMENT__OBSERVATION = eINSTANCE.getMeasurement_Observation();

		/**
     * The meta object literal for the '<em><b>Measure</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference MEASUREMENT__MEASURE = eINSTANCE.getMeasurement_Measure();

		/**
     * The meta object literal for the '<em><b>Measurand</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference MEASUREMENT__MEASURAND = eINSTANCE.getMeasurement_Measurand();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.MeasurementRelationImpl <em>Measurement Relation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.MeasurementRelationImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getMeasurementRelation()
     * @generated
     */
		EClass MEASUREMENT_RELATION = eINSTANCE.getMeasurementRelation();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute MEASUREMENT_RELATION__NAME = eINSTANCE.getMeasurementRelation_Name();

		/**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference MEASUREMENT_RELATION__FROM = eINSTANCE.getMeasurementRelation_From();

		/**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference MEASUREMENT_RELATION__TO = eINSTANCE.getMeasurementRelation_To();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.MeasureRelationshipImpl <em>Measure Relationship</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.MeasureRelationshipImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getMeasureRelationship()
     * @generated
     */
		EClass MEASURE_RELATIONSHIP = eINSTANCE.getMeasureRelationship();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute MEASURE_RELATIONSHIP__NAME = eINSTANCE.getMeasureRelationship_Name();

		/**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference MEASURE_RELATIONSHIP__FROM = eINSTANCE.getMeasureRelationship_From();

		/**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference MEASURE_RELATIONSHIP__TO = eINSTANCE.getMeasureRelationship_To();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.NamedMeasureImpl <em>Named Measure</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.NamedMeasureImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getNamedMeasure()
     * @generated
     */
		EClass NAMED_MEASURE = eINSTANCE.getNamedMeasure();

		/**
     * The meta object literal for the '<em><b>Name1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute NAMED_MEASURE__NAME1 = eINSTANCE.getNamedMeasure_Name1();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.NamedMeasurementImpl <em>Named Measurement</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.NamedMeasurementImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getNamedMeasurement()
     * @generated
     */
		EClass NAMED_MEASUREMENT = eINSTANCE.getNamedMeasurement();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.ObservationImpl <em>Observation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.ObservationImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getObservation()
     * @generated
     */
		EClass OBSERVATION = eINSTANCE.getObservation();

		/**
     * The meta object literal for the '<em><b>Observer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute OBSERVATION__OBSERVER = eINSTANCE.getObservation_Observer();

		/**
     * The meta object literal for the '<em><b>Tool</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute OBSERVATION__TOOL = eINSTANCE.getObservation_Tool();

		/**
     * The meta object literal for the '<em><b>When Observed</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBSERVATION__WHEN_OBSERVED = eINSTANCE.getObservation_WhenObserved();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.RankingImpl <em>Ranking</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.RankingImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getRanking()
     * @generated
     */
		EClass RANKING = eINSTANCE.getRanking();

		/**
     * The meta object literal for the '<em><b>Interval</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RANKING__INTERVAL = eINSTANCE.getRanking_Interval();

		/**
     * The meta object literal for the '<em><b>Base Measure</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RANKING__BASE_MEASURE = eINSTANCE.getRanking_BaseMeasure();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.RankingIntervalImpl <em>Ranking Interval</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.RankingIntervalImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getRankingInterval()
     * @generated
     */
		EClass RANKING_INTERVAL = eINSTANCE.getRankingInterval();

		/**
     * The meta object literal for the '<em><b>Maximum Endpoint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RANKING_INTERVAL__MAXIMUM_ENDPOINT = eINSTANCE.getRankingInterval_MaximumEndpoint();

		/**
     * The meta object literal for the '<em><b>Maximum Open</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RANKING_INTERVAL__MAXIMUM_OPEN = eINSTANCE.getRankingInterval_MaximumOpen();

		/**
     * The meta object literal for the '<em><b>Minimum Endpoint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RANKING_INTERVAL__MINIMUM_ENDPOINT = eINSTANCE.getRankingInterval_MinimumEndpoint();

		/**
     * The meta object literal for the '<em><b>Minimum Open</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RANKING_INTERVAL__MINIMUM_OPEN = eINSTANCE.getRankingInterval_MinimumOpen();

		/**
     * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RANKING_INTERVAL__SYMBOL = eINSTANCE.getRankingInterval_Symbol();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.RatioMeasureImpl <em>Ratio Measure</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.RatioMeasureImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getRatioMeasure()
     * @generated
     */
		EClass RATIO_MEASURE = eINSTANCE.getRatioMeasure();

		/**
     * The meta object literal for the '<em><b>Functor1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RATIO_MEASURE__FUNCTOR1 = eINSTANCE.getRatioMeasure_Functor1();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.RatioMeasurementImpl <em>Ratio Measurement</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.RatioMeasurementImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getRatioMeasurement()
     * @generated
     */
		EClass RATIO_MEASUREMENT = eINSTANCE.getRatioMeasurement();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.RescaledMeasureImpl <em>Rescaled Measure</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.RescaledMeasureImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getRescaledMeasure()
     * @generated
     */
		EClass RESCALED_MEASURE = eINSTANCE.getRescaledMeasure();

		/**
     * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RESCALED_MEASURE__FORMULA = eINSTANCE.getRescaledMeasure_Formula();

		/**
     * The meta object literal for the '<em><b>Base Measure</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RESCALED_MEASURE__BASE_MEASURE = eINSTANCE.getRescaledMeasure_BaseMeasure();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.ReScaledMeasurementImpl <em>Re Scaled Measurement</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.ReScaledMeasurementImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getReScaledMeasurement()
     * @generated
     */
		EClass RE_SCALED_MEASUREMENT = eINSTANCE.getReScaledMeasurement();

		/**
     * The meta object literal for the '<em><b>Is Base Supplied</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RE_SCALED_MEASUREMENT__IS_BASE_SUPPLIED = eINSTANCE.getReScaledMeasurement_IsBaseSupplied();

		/**
     * The meta object literal for the '<em><b>Base Measurement</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RE_SCALED_MEASUREMENT__BASE_MEASUREMENT = eINSTANCE.getReScaledMeasurement_BaseMeasurement();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.ScopeImpl <em>Scope</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.ScopeImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getScope()
     * @generated
     */
		EClass SCOPE = eINSTANCE.getScope();

		/**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SCOPE__CLASS = eINSTANCE.getScope_Class();

		/**
     * The meta object literal for the '<em><b>Enumerated</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SCOPE__ENUMERATED = eINSTANCE.getScope_Enumerated();

		/**
     * The meta object literal for the '<em><b>Recognizer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SCOPE__RECOGNIZER = eINSTANCE.getScope_Recognizer();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.SMMCategoryImpl <em>SMM Category</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.SMMCategoryImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getSMMCategory()
     * @generated
     */
		EClass SMM_CATEGORY = eINSTANCE.getSMMCategory();

		/**
     * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SMM_CATEGORY__CATEGORY = eINSTANCE.getSMMCategory_Category();

		/**
     * The meta object literal for the '<em><b>Category Element</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SMM_CATEGORY__CATEGORY_ELEMENT = eINSTANCE.getSMMCategory_CategoryElement();

		/**
     * The meta object literal for the '<em><b>Measure Element</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SMM_CATEGORY__MEASURE_ELEMENT = eINSTANCE.getSMMCategory_MeasureElement();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.SMMElementImpl <em>SMM Element</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.SMMElementImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getSMMElement()
     * @generated
     */
		EClass SMM_ELEMENT = eINSTANCE.getSMMElement();

		/**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SMM_ELEMENT__PARENT = eINSTANCE.getSMMElement_Parent();

		/**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SMM_ELEMENT__DESCRIPTION = eINSTANCE.getSMMElement_Description();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.SMMModelImpl <em>SMM Model</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.SMMModelImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getSMMModel()
     * @generated
     */
		EClass SMM_MODEL = eINSTANCE.getSMMModel();

		/**
     * The meta object literal for the '<em><b>SMM Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SMM_MODEL__SMM_ELEMENT = eINSTANCE.getSMMModel_SMMElement();

		/**
     * The meta object literal for the '<em><b>Meta Model Package URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SMM_MODEL__META_MODEL_PACKAGE_URI = eINSTANCE.getSMMModel_MetaModelPackageURI();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.SMMRelationshipImpl <em>SMM Relationship</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.SMMRelationshipImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getSMMRelationship()
     * @generated
     */
		EClass SMM_RELATIONSHIP = eINSTANCE.getSMMRelationship();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.TimestampImpl <em>Timestamp</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.TimestampImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getTimestamp()
     * @generated
     */
		EClass TIMESTAMP = eINSTANCE.getTimestamp();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.SMMNamedElementImpl <em>SMM Named Element</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.SMMNamedElementImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getSMMNamedElement()
     * @generated
     */
		EClass SMM_NAMED_ELEMENT = eINSTANCE.getSMMNamedElement();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SMM_NAMED_ELEMENT__NAME = eINSTANCE.getSMMNamedElement_Name();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.MeasureUtilImpl <em>Measure Util</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.MeasureUtilImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getMeasureUtil()
     * @generated
     */
		EClass MEASURE_UTIL = eINSTANCE.getMeasureUtil();

		/**
     * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute MEASURE_UTIL__OPERATION = eINSTANCE.getMeasureUtil_Operation();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.AuditImpl <em>Audit</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.AuditImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getAudit()
     * @generated
     */
		EClass AUDIT = eINSTANCE.getAudit();

		/**
     * The meta object literal for the '<em><b>Measure</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference AUDIT__MEASURE = eINSTANCE.getAudit_Measure();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.MeasureAggregationImpl <em>Measure Aggregation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.MeasureAggregationImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getMeasureAggregation()
     * @generated
     */
		EClass MEASURE_AGGREGATION = eINSTANCE.getMeasureAggregation();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.impl.MeasurementAggregationImpl <em>Measurement Aggregation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.impl.MeasurementAggregationImpl
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getMeasurementAggregation()
     * @generated
     */
		EClass MEASUREMENT_AGGREGATION = eINSTANCE.getMeasurementAggregation();

		/**
     * The meta object literal for the '{@link SoftwareMetricsMetamodel2.Accumulator <em>Accumulator</em>}' enum.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.Accumulator
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getAccumulator()
     * @generated
     */
		EEnum ACCUMULATOR = eINSTANCE.getAccumulator();

		/**
     * The meta object literal for the '<em>Accumulator Object</em>' data type.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see SoftwareMetricsMetamodel2.Accumulator
     * @see SoftwareMetricsMetamodel2.impl.SoftwareMetricsMetamodel2PackageImpl#getAccumulatorObject()
     * @generated
     */
		EDataType ACCUMULATOR_OBJECT = eINSTANCE.getAccumulatorObject();

	}

} //SoftwareMetricsMetamodel2Package
