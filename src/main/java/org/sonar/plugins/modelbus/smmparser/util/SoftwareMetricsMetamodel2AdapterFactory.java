/**
 */
package org.sonar.plugins.modelbus.smmparser.util;


import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.sonar.plugins.modelbus.smmparser.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package
 * @generated
 */
public class SoftwareMetricsMetamodel2AdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static SoftwareMetricsMetamodel2Package modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SoftwareMetricsMetamodel2AdapterFactory() {
    if (modelPackage == null) {
      modelPackage = SoftwareMetricsMetamodel2Package.eINSTANCE;
    }
  }

	/**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
	@Override
	public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

	/**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SoftwareMetricsMetamodel2Switch<Adapter> modelSwitch =
		new SoftwareMetricsMetamodel2Switch<Adapter>() {
      @Override
      public Adapter caseAggregatedMeasurement(AggregatedMeasurement object) {
        return createAggregatedMeasurementAdapter();
      }
      @Override
      public Adapter caseBinaryMeasure(BinaryMeasure object) {
        return createBinaryMeasureAdapter();
      }
      @Override
      public Adapter caseBinaryMeasurement(BinaryMeasurement object) {
        return createBinaryMeasurementAdapter();
      }
      @Override
      public Adapter caseCategoryRelationship(CategoryRelationship object) {
        return createCategoryRelationshipAdapter();
      }
      @Override
      public Adapter caseCharacteristic(Characteristic object) {
        return createCharacteristicAdapter();
      }
      @Override
      public Adapter caseCollectiveMeasure(CollectiveMeasure object) {
        return createCollectiveMeasureAdapter();
      }
      @Override
      public Adapter caseCollectiveMeasurement(CollectiveMeasurement object) {
        return createCollectiveMeasurementAdapter();
      }
      @Override
      public Adapter caseCount(Count object) {
        return createCountAdapter();
      }
      @Override
      public Adapter caseCounting(Counting object) {
        return createCountingAdapter();
      }
      @Override
      public Adapter caseDate(Date object) {
        return createDateAdapter();
      }
      @Override
      public Adapter caseDimensionalMeasure(DimensionalMeasure object) {
        return createDimensionalMeasureAdapter();
      }
      @Override
      public Adapter caseDimensionalMeasurement(DimensionalMeasurement object) {
        return createDimensionalMeasurementAdapter();
      }
      @Override
      public Adapter caseDirectMeasure(DirectMeasure object) {
        return createDirectMeasureAdapter();
      }
      @Override
      public Adapter caseDirectMeasurement(DirectMeasurement object) {
        return createDirectMeasurementAdapter();
      }
      @Override
      public Adapter caseDocumentRoot(DocumentRoot object) {
        return createDocumentRootAdapter();
      }
      @Override
      public Adapter caseGrade(Grade object) {
        return createGradeAdapter();
      }
      @Override
      public Adapter caseMeasure(Measure object) {
        return createMeasureAdapter();
      }
      @Override
      public Adapter caseMeasurement(Measurement object) {
        return createMeasurementAdapter();
      }
      @Override
      public Adapter caseMeasurementRelation(MeasurementRelation object) {
        return createMeasurementRelationAdapter();
      }
      @Override
      public Adapter caseMeasureRelationship(MeasureRelationship object) {
        return createMeasureRelationshipAdapter();
      }
      @Override
      public Adapter caseNamedMeasure(NamedMeasure object) {
        return createNamedMeasureAdapter();
      }
      @Override
      public Adapter caseNamedMeasurement(NamedMeasurement object) {
        return createNamedMeasurementAdapter();
      }
      @Override
      public Adapter caseObservation(Observation object) {
        return createObservationAdapter();
      }
      @Override
      public Adapter caseRanking(Ranking object) {
        return createRankingAdapter();
      }
      @Override
      public Adapter caseRankingInterval(RankingInterval object) {
        return createRankingIntervalAdapter();
      }
      @Override
      public Adapter caseRatioMeasure(RatioMeasure object) {
        return createRatioMeasureAdapter();
      }
      @Override
      public Adapter caseRatioMeasurement(RatioMeasurement object) {
        return createRatioMeasurementAdapter();
      }
      @Override
      public Adapter caseRescaledMeasure(RescaledMeasure object) {
        return createRescaledMeasureAdapter();
      }
      @Override
      public Adapter caseReScaledMeasurement(ReScaledMeasurement object) {
        return createReScaledMeasurementAdapter();
      }
      @Override
      public Adapter caseScope(Scope object) {
        return createScopeAdapter();
      }
      @Override
      public Adapter caseSMMCategory(SMMCategory object) {
        return createSMMCategoryAdapter();
      }
      @Override
      public Adapter caseSMMElement(SMMElement object) {
        return createSMMElementAdapter();
      }
      @Override
      public Adapter caseSMMModel(SMMModel object) {
        return createSMMModelAdapter();
      }
      @Override
      public Adapter caseSMMRelationship(SMMRelationship object) {
        return createSMMRelationshipAdapter();
      }
      @Override
      public Adapter caseTimestamp(Timestamp object) {
        return createTimestampAdapter();
      }
      @Override
      public Adapter caseSMMNamedElement(SMMNamedElement object) {
        return createSMMNamedElementAdapter();
      }
      @Override
      public Adapter caseMeasureUtil(MeasureUtil object) {
        return createMeasureUtilAdapter();
      }
      @Override
      public Adapter caseAudit(Audit object) {
        return createAuditAdapter();
      }
      @Override
      public Adapter caseMeasureAggregation(MeasureAggregation object) {
        return createMeasureAggregationAdapter();
      }
      @Override
      public Adapter caseMeasurementAggregation(MeasurementAggregation object) {
        return createMeasurementAggregationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

	/**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
	@Override
	public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.AggregatedMeasurement <em>Aggregated Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.AggregatedMeasurement
   * @generated
   */
	public Adapter createAggregatedMeasurementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.BinaryMeasure <em>Binary Measure</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.BinaryMeasure
   * @generated
   */
	public Adapter createBinaryMeasureAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.BinaryMeasurement <em>Binary Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.BinaryMeasurement
   * @generated
   */
	public Adapter createBinaryMeasurementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.CategoryRelationship <em>Category Relationship</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.CategoryRelationship
   * @generated
   */
	public Adapter createCategoryRelationshipAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.Characteristic <em>Characteristic</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.Characteristic
   * @generated
   */
	public Adapter createCharacteristicAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.CollectiveMeasure <em>Collective Measure</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.CollectiveMeasure
   * @generated
   */
	public Adapter createCollectiveMeasureAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.CollectiveMeasurement <em>Collective Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.CollectiveMeasurement
   * @generated
   */
	public Adapter createCollectiveMeasurementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.Count <em>Count</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.Count
   * @generated
   */
	public Adapter createCountAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.Counting <em>Counting</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.Counting
   * @generated
   */
	public Adapter createCountingAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.Date
   * @generated
   */
	public Adapter createDateAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.DimensionalMeasure <em>Dimensional Measure</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.DimensionalMeasure
   * @generated
   */
	public Adapter createDimensionalMeasureAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.DimensionalMeasurement <em>Dimensional Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.DimensionalMeasurement
   * @generated
   */
	public Adapter createDimensionalMeasurementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.DirectMeasure <em>Direct Measure</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.DirectMeasure
   * @generated
   */
	public Adapter createDirectMeasureAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.DirectMeasurement <em>Direct Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.DirectMeasurement
   * @generated
   */
	public Adapter createDirectMeasurementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.DocumentRoot
   * @generated
   */
	public Adapter createDocumentRootAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.Grade <em>Grade</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.Grade
   * @generated
   */
	public Adapter createGradeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.Measure <em>Measure</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.Measure
   * @generated
   */
	public Adapter createMeasureAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.Measurement <em>Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.Measurement
   * @generated
   */
	public Adapter createMeasurementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.MeasurementRelation <em>Measurement Relation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.MeasurementRelation
   * @generated
   */
	public Adapter createMeasurementRelationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.MeasureRelationship <em>Measure Relationship</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.MeasureRelationship
   * @generated
   */
	public Adapter createMeasureRelationshipAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.NamedMeasure <em>Named Measure</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.NamedMeasure
   * @generated
   */
	public Adapter createNamedMeasureAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.NamedMeasurement <em>Named Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.NamedMeasurement
   * @generated
   */
	public Adapter createNamedMeasurementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.Observation <em>Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.Observation
   * @generated
   */
	public Adapter createObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.Ranking <em>Ranking</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.Ranking
   * @generated
   */
	public Adapter createRankingAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.RankingInterval <em>Ranking Interval</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.RankingInterval
   * @generated
   */
	public Adapter createRankingIntervalAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.RatioMeasure <em>Ratio Measure</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.RatioMeasure
   * @generated
   */
	public Adapter createRatioMeasureAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.RatioMeasurement <em>Ratio Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.RatioMeasurement
   * @generated
   */
	public Adapter createRatioMeasurementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.RescaledMeasure <em>Rescaled Measure</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.RescaledMeasure
   * @generated
   */
	public Adapter createRescaledMeasureAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.ReScaledMeasurement <em>Re Scaled Measurement</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.ReScaledMeasurement
   * @generated
   */
	public Adapter createReScaledMeasurementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.Scope
   * @generated
   */
	public Adapter createScopeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.SMMCategory <em>SMM Category</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.SMMCategory
   * @generated
   */
	public Adapter createSMMCategoryAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.SMMElement <em>SMM Element</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.SMMElement
   * @generated
   */
	public Adapter createSMMElementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.SMMModel <em>SMM Model</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.SMMModel
   * @generated
   */
	public Adapter createSMMModelAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.SMMRelationship <em>SMM Relationship</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.SMMRelationship
   * @generated
   */
	public Adapter createSMMRelationshipAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.Timestamp <em>Timestamp</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.Timestamp
   * @generated
   */
	public Adapter createTimestampAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.SMMNamedElement <em>SMM Named Element</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.SMMNamedElement
   * @generated
   */
	public Adapter createSMMNamedElementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.MeasureUtil <em>Measure Util</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.MeasureUtil
   * @generated
   */
	public Adapter createMeasureUtilAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.Audit <em>Audit</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.Audit
   * @generated
   */
	public Adapter createAuditAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.MeasureAggregation <em>Measure Aggregation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.MeasureAggregation
   * @generated
   */
	public Adapter createMeasureAggregationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.sonar.plugins.modelbus.smmparser.MeasurementAggregation <em>Measurement Aggregation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sonar.plugins.modelbus.smmparser.MeasurementAggregation
   * @generated
   */
	public Adapter createMeasurementAggregationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
	public Adapter createEObjectAdapter() {
    return null;
  }

} //SoftwareMetricsMetamodel2AdapterFactory
