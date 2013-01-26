/**
 */
package SoftwareMetricsMetamodel2.util;

import SoftwareMetricsMetamodel2.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package
 * @generated
 */
public class SoftwareMetricsMetamodel2Switch<T> extends Switch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static SoftwareMetricsMetamodel2Package modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SoftwareMetricsMetamodel2Switch() {
    if (modelPackage == null) {
      modelPackage = SoftwareMetricsMetamodel2Package.eINSTANCE;
    }
  }

	/**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case SoftwareMetricsMetamodel2Package.AGGREGATED_MEASUREMENT: {
        AggregatedMeasurement aggregatedMeasurement = (AggregatedMeasurement)theEObject;
        T result = caseAggregatedMeasurement(aggregatedMeasurement);
        if (result == null) result = caseDimensionalMeasurement(aggregatedMeasurement);
        if (result == null) result = caseMeasurement(aggregatedMeasurement);
        if (result == null) result = caseSMMElement(aggregatedMeasurement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.BINARY_MEASURE: {
        BinaryMeasure binaryMeasure = (BinaryMeasure)theEObject;
        T result = caseBinaryMeasure(binaryMeasure);
        if (result == null) result = caseDimensionalMeasure(binaryMeasure);
        if (result == null) result = caseMeasure(binaryMeasure);
        if (result == null) result = caseSMMNamedElement(binaryMeasure);
        if (result == null) result = caseSMMElement(binaryMeasure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.BINARY_MEASUREMENT: {
        BinaryMeasurement binaryMeasurement = (BinaryMeasurement)theEObject;
        T result = caseBinaryMeasurement(binaryMeasurement);
        if (result == null) result = caseDimensionalMeasurement(binaryMeasurement);
        if (result == null) result = caseMeasurement(binaryMeasurement);
        if (result == null) result = caseSMMElement(binaryMeasurement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.CATEGORY_RELATIONSHIP: {
        CategoryRelationship categoryRelationship = (CategoryRelationship)theEObject;
        T result = caseCategoryRelationship(categoryRelationship);
        if (result == null) result = caseSMMRelationship(categoryRelationship);
        if (result == null) result = caseSMMElement(categoryRelationship);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.CHARACTERISTIC: {
        Characteristic characteristic = (Characteristic)theEObject;
        T result = caseCharacteristic(characteristic);
        if (result == null) result = caseSMMNamedElement(characteristic);
        if (result == null) result = caseSMMElement(characteristic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.COLLECTIVE_MEASURE: {
        CollectiveMeasure collectiveMeasure = (CollectiveMeasure)theEObject;
        T result = caseCollectiveMeasure(collectiveMeasure);
        if (result == null) result = caseDimensionalMeasure(collectiveMeasure);
        if (result == null) result = caseMeasure(collectiveMeasure);
        if (result == null) result = caseSMMNamedElement(collectiveMeasure);
        if (result == null) result = caseSMMElement(collectiveMeasure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.COLLECTIVE_MEASUREMENT: {
        CollectiveMeasurement collectiveMeasurement = (CollectiveMeasurement)theEObject;
        T result = caseCollectiveMeasurement(collectiveMeasurement);
        if (result == null) result = caseDimensionalMeasurement(collectiveMeasurement);
        if (result == null) result = caseMeasurement(collectiveMeasurement);
        if (result == null) result = caseSMMElement(collectiveMeasurement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.COUNT: {
        Count count = (Count)theEObject;
        T result = caseCount(count);
        if (result == null) result = caseDirectMeasurement(count);
        if (result == null) result = caseDimensionalMeasurement(count);
        if (result == null) result = caseMeasurement(count);
        if (result == null) result = caseSMMElement(count);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.COUNTING: {
        Counting counting = (Counting)theEObject;
        T result = caseCounting(counting);
        if (result == null) result = caseDirectMeasure(counting);
        if (result == null) result = caseDimensionalMeasure(counting);
        if (result == null) result = caseMeasure(counting);
        if (result == null) result = caseSMMNamedElement(counting);
        if (result == null) result = caseSMMElement(counting);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.DATE: {
        Date date = (Date)theEObject;
        T result = caseDate(date);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASURE: {
        DimensionalMeasure dimensionalMeasure = (DimensionalMeasure)theEObject;
        T result = caseDimensionalMeasure(dimensionalMeasure);
        if (result == null) result = caseMeasure(dimensionalMeasure);
        if (result == null) result = caseSMMNamedElement(dimensionalMeasure);
        if (result == null) result = caseSMMElement(dimensionalMeasure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.DIMENSIONAL_MEASUREMENT: {
        DimensionalMeasurement dimensionalMeasurement = (DimensionalMeasurement)theEObject;
        T result = caseDimensionalMeasurement(dimensionalMeasurement);
        if (result == null) result = caseMeasurement(dimensionalMeasurement);
        if (result == null) result = caseSMMElement(dimensionalMeasurement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.DIRECT_MEASURE: {
        DirectMeasure directMeasure = (DirectMeasure)theEObject;
        T result = caseDirectMeasure(directMeasure);
        if (result == null) result = caseDimensionalMeasure(directMeasure);
        if (result == null) result = caseMeasure(directMeasure);
        if (result == null) result = caseSMMNamedElement(directMeasure);
        if (result == null) result = caseSMMElement(directMeasure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.DIRECT_MEASUREMENT: {
        DirectMeasurement directMeasurement = (DirectMeasurement)theEObject;
        T result = caseDirectMeasurement(directMeasurement);
        if (result == null) result = caseDimensionalMeasurement(directMeasurement);
        if (result == null) result = caseMeasurement(directMeasurement);
        if (result == null) result = caseSMMElement(directMeasurement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.DOCUMENT_ROOT: {
        DocumentRoot documentRoot = (DocumentRoot)theEObject;
        T result = caseDocumentRoot(documentRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.GRADE: {
        Grade grade = (Grade)theEObject;
        T result = caseGrade(grade);
        if (result == null) result = caseMeasurement(grade);
        if (result == null) result = caseSMMElement(grade);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.MEASURE: {
        Measure measure = (Measure)theEObject;
        T result = caseMeasure(measure);
        if (result == null) result = caseSMMNamedElement(measure);
        if (result == null) result = caseSMMElement(measure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.MEASUREMENT: {
        Measurement measurement = (Measurement)theEObject;
        T result = caseMeasurement(measurement);
        if (result == null) result = caseSMMElement(measurement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.MEASUREMENT_RELATION: {
        MeasurementRelation measurementRelation = (MeasurementRelation)theEObject;
        T result = caseMeasurementRelation(measurementRelation);
        if (result == null) result = caseSMMRelationship(measurementRelation);
        if (result == null) result = caseSMMElement(measurementRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.MEASURE_RELATIONSHIP: {
        MeasureRelationship measureRelationship = (MeasureRelationship)theEObject;
        T result = caseMeasureRelationship(measureRelationship);
        if (result == null) result = caseSMMRelationship(measureRelationship);
        if (result == null) result = caseSMMElement(measureRelationship);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.NAMED_MEASURE: {
        NamedMeasure namedMeasure = (NamedMeasure)theEObject;
        T result = caseNamedMeasure(namedMeasure);
        if (result == null) result = caseDimensionalMeasure(namedMeasure);
        if (result == null) result = caseMeasure(namedMeasure);
        if (result == null) result = caseSMMNamedElement(namedMeasure);
        if (result == null) result = caseSMMElement(namedMeasure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.NAMED_MEASUREMENT: {
        NamedMeasurement namedMeasurement = (NamedMeasurement)theEObject;
        T result = caseNamedMeasurement(namedMeasurement);
        if (result == null) result = caseDimensionalMeasurement(namedMeasurement);
        if (result == null) result = caseMeasurement(namedMeasurement);
        if (result == null) result = caseSMMElement(namedMeasurement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.OBSERVATION: {
        Observation observation = (Observation)theEObject;
        T result = caseObservation(observation);
        if (result == null) result = caseSMMElement(observation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.RANKING: {
        Ranking ranking = (Ranking)theEObject;
        T result = caseRanking(ranking);
        if (result == null) result = caseMeasure(ranking);
        if (result == null) result = caseSMMNamedElement(ranking);
        if (result == null) result = caseSMMElement(ranking);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL: {
        RankingInterval rankingInterval = (RankingInterval)theEObject;
        T result = caseRankingInterval(rankingInterval);
        if (result == null) result = caseSMMElement(rankingInterval);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.RATIO_MEASURE: {
        RatioMeasure ratioMeasure = (RatioMeasure)theEObject;
        T result = caseRatioMeasure(ratioMeasure);
        if (result == null) result = caseBinaryMeasure(ratioMeasure);
        if (result == null) result = caseDimensionalMeasure(ratioMeasure);
        if (result == null) result = caseMeasure(ratioMeasure);
        if (result == null) result = caseSMMNamedElement(ratioMeasure);
        if (result == null) result = caseSMMElement(ratioMeasure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.RATIO_MEASUREMENT: {
        RatioMeasurement ratioMeasurement = (RatioMeasurement)theEObject;
        T result = caseRatioMeasurement(ratioMeasurement);
        if (result == null) result = caseBinaryMeasurement(ratioMeasurement);
        if (result == null) result = caseDimensionalMeasurement(ratioMeasurement);
        if (result == null) result = caseMeasurement(ratioMeasurement);
        if (result == null) result = caseSMMElement(ratioMeasurement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.RESCALED_MEASURE: {
        RescaledMeasure rescaledMeasure = (RescaledMeasure)theEObject;
        T result = caseRescaledMeasure(rescaledMeasure);
        if (result == null) result = caseDimensionalMeasure(rescaledMeasure);
        if (result == null) result = caseMeasure(rescaledMeasure);
        if (result == null) result = caseSMMNamedElement(rescaledMeasure);
        if (result == null) result = caseSMMElement(rescaledMeasure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.RE_SCALED_MEASUREMENT: {
        ReScaledMeasurement reScaledMeasurement = (ReScaledMeasurement)theEObject;
        T result = caseReScaledMeasurement(reScaledMeasurement);
        if (result == null) result = caseDimensionalMeasurement(reScaledMeasurement);
        if (result == null) result = caseMeasurement(reScaledMeasurement);
        if (result == null) result = caseSMMElement(reScaledMeasurement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.SCOPE: {
        Scope scope = (Scope)theEObject;
        T result = caseScope(scope);
        if (result == null) result = caseSMMNamedElement(scope);
        if (result == null) result = caseSMMElement(scope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.SMM_CATEGORY: {
        SMMCategory smmCategory = (SMMCategory)theEObject;
        T result = caseSMMCategory(smmCategory);
        if (result == null) result = caseSMMNamedElement(smmCategory);
        if (result == null) result = caseSMMElement(smmCategory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.SMM_ELEMENT: {
        SMMElement smmElement = (SMMElement)theEObject;
        T result = caseSMMElement(smmElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.SMM_MODEL: {
        SMMModel smmModel = (SMMModel)theEObject;
        T result = caseSMMModel(smmModel);
        if (result == null) result = caseSMMElement(smmModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.SMM_RELATIONSHIP: {
        SMMRelationship smmRelationship = (SMMRelationship)theEObject;
        T result = caseSMMRelationship(smmRelationship);
        if (result == null) result = caseSMMElement(smmRelationship);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.TIMESTAMP: {
        Timestamp timestamp = (Timestamp)theEObject;
        T result = caseTimestamp(timestamp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.SMM_NAMED_ELEMENT: {
        SMMNamedElement smmNamedElement = (SMMNamedElement)theEObject;
        T result = caseSMMNamedElement(smmNamedElement);
        if (result == null) result = caseSMMElement(smmNamedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.MEASURE_UTIL: {
        MeasureUtil measureUtil = (MeasureUtil)theEObject;
        T result = caseMeasureUtil(measureUtil);
        if (result == null) result = caseSMMElement(measureUtil);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.AUDIT: {
        Audit audit = (Audit)theEObject;
        T result = caseAudit(audit);
        if (result == null) result = caseSMMNamedElement(audit);
        if (result == null) result = caseSMMElement(audit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.MEASURE_AGGREGATION: {
        MeasureAggregation measureAggregation = (MeasureAggregation)theEObject;
        T result = caseMeasureAggregation(measureAggregation);
        if (result == null) result = caseMeasureRelationship(measureAggregation);
        if (result == null) result = caseSMMRelationship(measureAggregation);
        if (result == null) result = caseSMMElement(measureAggregation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoftwareMetricsMetamodel2Package.MEASUREMENT_AGGREGATION: {
        MeasurementAggregation measurementAggregation = (MeasurementAggregation)theEObject;
        T result = caseMeasurementAggregation(measurementAggregation);
        if (result == null) result = caseMeasurementRelation(measurementAggregation);
        if (result == null) result = caseSMMRelationship(measurementAggregation);
        if (result == null) result = caseSMMElement(measurementAggregation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Aggregated Measurement</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aggregated Measurement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAggregatedMeasurement(AggregatedMeasurement object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Binary Measure</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Measure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBinaryMeasure(BinaryMeasure object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Binary Measurement</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Measurement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBinaryMeasurement(BinaryMeasurement object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Category Relationship</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Category Relationship</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCategoryRelationship(CategoryRelationship object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Characteristic</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Characteristic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCharacteristic(Characteristic object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Collective Measure</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collective Measure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCollectiveMeasure(CollectiveMeasure object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Collective Measurement</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collective Measurement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCollectiveMeasurement(CollectiveMeasurement object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Count</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Count</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCount(Count object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Counting</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Counting</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCounting(Counting object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDate(Date object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Dimensional Measure</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dimensional Measure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDimensionalMeasure(DimensionalMeasure object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Dimensional Measurement</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dimensional Measurement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDimensionalMeasurement(DimensionalMeasurement object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Direct Measure</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direct Measure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDirectMeasure(DirectMeasure object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Direct Measurement</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direct Measurement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDirectMeasurement(DirectMeasurement object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDocumentRoot(DocumentRoot object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Grade</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grade</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGrade(Grade object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Measure</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Measure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMeasure(Measure object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Measurement</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Measurement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMeasurement(Measurement object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Measurement Relation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Measurement Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMeasurementRelation(MeasurementRelation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Measure Relationship</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Measure Relationship</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMeasureRelationship(MeasureRelationship object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Named Measure</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Measure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNamedMeasure(NamedMeasure object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Named Measurement</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Measurement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNamedMeasurement(NamedMeasurement object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseObservation(Observation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Ranking</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ranking</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRanking(Ranking object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Ranking Interval</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ranking Interval</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRankingInterval(RankingInterval object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Ratio Measure</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ratio Measure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRatioMeasure(RatioMeasure object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Ratio Measurement</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ratio Measurement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRatioMeasurement(RatioMeasurement object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Rescaled Measure</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rescaled Measure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRescaledMeasure(RescaledMeasure object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Re Scaled Measurement</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Re Scaled Measurement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseReScaledMeasurement(ReScaledMeasurement object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseScope(Scope object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>SMM Category</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMM Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSMMCategory(SMMCategory object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>SMM Element</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMM Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSMMElement(SMMElement object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>SMM Model</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMM Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSMMModel(SMMModel object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>SMM Relationship</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMM Relationship</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSMMRelationship(SMMRelationship object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Timestamp</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timestamp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTimestamp(Timestamp object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>SMM Named Element</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMM Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSMMNamedElement(SMMNamedElement object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Measure Util</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Measure Util</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMeasureUtil(MeasureUtil object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Audit</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Audit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAudit(Audit object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Measure Aggregation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Measure Aggregation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMeasureAggregation(MeasureAggregation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Measurement Aggregation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Measurement Aggregation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMeasurementAggregation(MeasurementAggregation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
	@Override
	public T defaultCase(EObject object) {
    return null;
  }

} //SoftwareMetricsMetamodel2Switch
