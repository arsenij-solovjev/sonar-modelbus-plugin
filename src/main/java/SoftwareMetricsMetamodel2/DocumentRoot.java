/**
 */
package SoftwareMetricsMetamodel2;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getAggregatedMeasurement <em>Aggregated Measurement</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getBinaryMeasure <em>Binary Measure</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getBinaryMeasurement <em>Binary Measurement</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getCategoryRelationship <em>Category Relationship</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getCollectiveMeasure <em>Collective Measure</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getCollectiveMeasurement <em>Collective Measurement</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getCount <em>Count</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getCounting <em>Counting</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getDate <em>Date</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getDimensionalMeasure <em>Dimensional Measure</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getDimensionalMeasurement <em>Dimensional Measurement</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getDirectMeasure <em>Direct Measure</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getDirectMeasurement <em>Direct Measurement</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getGrade <em>Grade</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getMeasure <em>Measure</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getMeasurementRelation <em>Measurement Relation</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getMeasureRelationship <em>Measure Relationship</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getNamedMeasure <em>Named Measure</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getNamedMeasurement <em>Named Measurement</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getObservation <em>Observation</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getRanking <em>Ranking</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getRankingInterval <em>Ranking Interval</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getRatioMeasure <em>Ratio Measure</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getRatioMeasurment <em>Ratio Measurment</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getRescaledMeasure <em>Rescaled Measure</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getReScaledMeasurement <em>Re Scaled Measurement</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getScope <em>Scope</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getSMMCategory <em>SMM Category</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getSMMElement <em>SMM Element</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getSMMModel <em>SMM Model</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getSMMRelationship <em>SMM Relationship</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.DocumentRoot#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 * </p>
 *
 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
   * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Mixed</em>' attribute list.
   * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_Mixed()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='elementWildcard' name=':mixed'"
   * @generated
   */
	FeatureMap getMixed();

	/**
   	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
   	 * The key is of type {@link java.lang.String},
   	 * and the value is of type {@link java.lang.String},
   	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
   	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_XMLNSPrefixMap()
   	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
   	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
   	 * @generated
   	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
   	 	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
   	 	 * The key is of type {@link java.lang.String},
   	 	 * and the value is of type {@link java.lang.String},
   	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 * @return the value of the '<em>XSI Schema Location</em>' map.
   	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_XSISchemaLocation()
   	 	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
   	 	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
   	 	 * @generated
   	 	 */
	EMap<String, String> getXSISchemaLocation();

	/**
   	 	 	 * Returns the value of the '<em><b>Aggregated Measurement</b></em>' containment reference.
   	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregated Measurement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 * @return the value of the '<em>Aggregated Measurement</em>' containment reference.
   	 	 	 * @see #setAggregatedMeasurement(AggregatedMeasurement)
   	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_AggregatedMeasurement()
   	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 *        extendedMetaData="kind='element' name='AggregatedMeasurement' namespace='##targetNamespace'"
   	 	 	 * @generated
   	 	 	 */
	AggregatedMeasurement getAggregatedMeasurement();

	/**
   	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getAggregatedMeasurement <em>Aggregated Measurement</em>}' containment reference.
   	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 * @param value the new value of the '<em>Aggregated Measurement</em>' containment reference.
   	 	 	 * @see #getAggregatedMeasurement()
   	 	 	 * @generated
   	 	 	 */
	void setAggregatedMeasurement(AggregatedMeasurement value);

	/**
   	 	 	 	 * Returns the value of the '<em><b>Binary Measure</b></em>' containment reference.
   	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 * @return the value of the '<em>Binary Measure</em>' containment reference.
   	 	 	 	 * @see #setBinaryMeasure(BinaryMeasure)
   	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_BinaryMeasure()
   	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 *        extendedMetaData="kind='element' name='BinaryMeasure' namespace='##targetNamespace'"
   	 	 	 	 * @generated
   	 	 	 	 */
	BinaryMeasure getBinaryMeasure();

	/**
   	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getBinaryMeasure <em>Binary Measure</em>}' containment reference.
   	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 * @param value the new value of the '<em>Binary Measure</em>' containment reference.
   	 	 	 	 * @see #getBinaryMeasure()
   	 	 	 	 * @generated
   	 	 	 	 */
	void setBinaryMeasure(BinaryMeasure value);

	/**
   	 	 	 	 	 * Returns the value of the '<em><b>Binary Measurement</b></em>' containment reference.
   	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Measurement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 * @return the value of the '<em>Binary Measurement</em>' containment reference.
   	 	 	 	 	 * @see #setBinaryMeasurement(BinaryMeasurement)
   	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_BinaryMeasurement()
   	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 *        extendedMetaData="kind='element' name='BinaryMeasurement' namespace='##targetNamespace'"
   	 	 	 	 	 * @generated
   	 	 	 	 	 */
	BinaryMeasurement getBinaryMeasurement();

	/**
   	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getBinaryMeasurement <em>Binary Measurement</em>}' containment reference.
   	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 * @param value the new value of the '<em>Binary Measurement</em>' containment reference.
   	 	 	 	 	 * @see #getBinaryMeasurement()
   	 	 	 	 	 * @generated
   	 	 	 	 	 */
	void setBinaryMeasurement(BinaryMeasurement value);

	/**
   	 	 	 	 	 	 * Returns the value of the '<em><b>Category Relationship</b></em>' containment reference.
   	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Relationship</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 * @return the value of the '<em>Category Relationship</em>' containment reference.
   	 	 	 	 	 	 * @see #setCategoryRelationship(CategoryRelationship)
   	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_CategoryRelationship()
   	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 *        extendedMetaData="kind='element' name='Category_Relationship' namespace='##targetNamespace'"
   	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 */
	CategoryRelationship getCategoryRelationship();

	/**
   	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getCategoryRelationship <em>Category Relationship</em>}' containment reference.
   	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 * @param value the new value of the '<em>Category Relationship</em>' containment reference.
   	 	 	 	 	 	 * @see #getCategoryRelationship()
   	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 */
	void setCategoryRelationship(CategoryRelationship value);

	/**
   	 	 	 	 	 	 	 * Returns the value of the '<em><b>Characteristic</b></em>' containment reference.
   	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 * @return the value of the '<em>Characteristic</em>' containment reference.
   	 	 	 	 	 	 	 * @see #setCharacteristic(Characteristic)
   	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_Characteristic()
   	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='Characteristic' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 */
	Characteristic getCharacteristic();

	/**
   	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getCharacteristic <em>Characteristic</em>}' containment reference.
   	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 * @param value the new value of the '<em>Characteristic</em>' containment reference.
   	 	 	 	 	 	 	 * @see #getCharacteristic()
   	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 */
	void setCharacteristic(Characteristic value);

	/**
   	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Collective Measure</b></em>' containment reference.
   	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collective Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 * @return the value of the '<em>Collective Measure</em>' containment reference.
   	 	 	 	 	 	 	 	 * @see #setCollectiveMeasure(CollectiveMeasure)
   	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_CollectiveMeasure()
   	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='CollectiveMeasure' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 */
	CollectiveMeasure getCollectiveMeasure();

	/**
   	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getCollectiveMeasure <em>Collective Measure</em>}' containment reference.
   	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Collective Measure</em>' containment reference.
   	 	 	 	 	 	 	 	 * @see #getCollectiveMeasure()
   	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 */
	void setCollectiveMeasure(CollectiveMeasure value);

	/**
   	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Collective Measurement</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collective Measurement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Collective Measurement</em>' containment reference.
   	 	 	 	 	 	 	 	 	 * @see #setCollectiveMeasurement(CollectiveMeasurement)
   	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_CollectiveMeasurement()
   	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='CollectiveMeasurement' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 */
	CollectiveMeasurement getCollectiveMeasurement();

	/**
   	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getCollectiveMeasurement <em>Collective Measurement</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Collective Measurement</em>' containment reference.
   	 	 	 	 	 	 	 	 	 * @see #getCollectiveMeasurement()
   	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 */
	void setCollectiveMeasurement(CollectiveMeasurement value);

	/**
   	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Count</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 * @see #setCount(Count)
   	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_Count()
   	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='Count' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 */
	Count getCount();

	/**
   	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getCount <em>Count</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Count</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 * @see #getCount()
   	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 */
	void setCount(Count value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Counting</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counting</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Counting</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 * @see #setCounting(Counting)
   	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_Counting()
   	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='Counting' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 */
	Counting getCounting();

	/**
   	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getCounting <em>Counting</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Counting</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 * @see #getCounting()
   	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 */
	void setCounting(Counting value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Date</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 * @see #setDate(Date)
   	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_Date()
   	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='Date' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 */
	Date getDate();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getDate <em>Date</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Date</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 * @see #getDate()
   	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 */
	void setDate(Date value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Dimensional Measure</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensional Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Dimensional Measure</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setDimensionalMeasure(DimensionalMeasure)
   	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_DimensionalMeasure()
   	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='DimensionalMeasure' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 */
	DimensionalMeasure getDimensionalMeasure();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getDimensionalMeasure <em>Dimensional Measure</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Dimensional Measure</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getDimensionalMeasure()
   	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setDimensionalMeasure(DimensionalMeasure value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Dimensional Measurement</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensional Measurement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Dimensional Measurement</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setDimensionalMeasurement(DimensionalMeasurement)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_DimensionalMeasurement()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='DimensionalMeasurement' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	DimensionalMeasurement getDimensionalMeasurement();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getDimensionalMeasurement <em>Dimensional Measurement</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Dimensional Measurement</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getDimensionalMeasurement()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setDimensionalMeasurement(DimensionalMeasurement value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Direct Measure</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direct Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Direct Measure</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setDirectMeasure(DirectMeasure)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_DirectMeasure()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='DirectMeasure' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	DirectMeasure getDirectMeasure();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getDirectMeasure <em>Direct Measure</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Direct Measure</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getDirectMeasure()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setDirectMeasure(DirectMeasure value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Direct Measurement</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direct Measurement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Direct Measurement</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setDirectMeasurement(DirectMeasurement)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_DirectMeasurement()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='DirectMeasurement' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	DirectMeasurement getDirectMeasurement();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getDirectMeasurement <em>Direct Measurement</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Direct Measurement</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getDirectMeasurement()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setDirectMeasurement(DirectMeasurement value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Grade</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grade</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Grade</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setGrade(Grade)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_Grade()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='Grade' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	Grade getGrade();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getGrade <em>Grade</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Grade</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getGrade()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setGrade(Grade value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Measure</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Measure</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setMeasure(Measure)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_Measure()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='Measure' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	Measure getMeasure();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getMeasure <em>Measure</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Measure</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getMeasure()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setMeasure(Measure value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Measurement</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Measurement</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setMeasurement(Measurement)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_Measurement()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='Measurement' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	Measurement getMeasurement();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getMeasurement <em>Measurement</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Measurement</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getMeasurement()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setMeasurement(Measurement value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Measurement Relation</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Relation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Measurement Relation</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setMeasurementRelation(MeasurementRelation)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_MeasurementRelation()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='MeasurementRelation' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	MeasurementRelation getMeasurementRelation();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getMeasurementRelation <em>Measurement Relation</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Measurement Relation</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getMeasurementRelation()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setMeasurementRelation(MeasurementRelation value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Measure Relationship</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Relationship</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Measure Relationship</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setMeasureRelationship(MeasureRelationship)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_MeasureRelationship()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='MeasureRelationship' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	MeasureRelationship getMeasureRelationship();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getMeasureRelationship <em>Measure Relationship</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Measure Relationship</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getMeasureRelationship()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setMeasureRelationship(MeasureRelationship value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Named Measure</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Named Measure</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setNamedMeasure(NamedMeasure)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_NamedMeasure()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='NamedMeasure' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	NamedMeasure getNamedMeasure();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getNamedMeasure <em>Named Measure</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Named Measure</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getNamedMeasure()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setNamedMeasure(NamedMeasure value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Named Measurement</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Measurement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Named Measurement</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setNamedMeasurement(NamedMeasurement)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_NamedMeasurement()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='NamedMeasurement' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	NamedMeasurement getNamedMeasurement();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getNamedMeasurement <em>Named Measurement</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Named Measurement</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getNamedMeasurement()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setNamedMeasurement(NamedMeasurement value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Observation</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Observation</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setObservation(Observation)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_Observation()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='Observation' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	Observation getObservation();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getObservation <em>Observation</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Observation</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getObservation()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setObservation(Observation value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Ranking</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranking</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Ranking</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setRanking(Ranking)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_Ranking()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='Ranking' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	Ranking getRanking();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getRanking <em>Ranking</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Ranking</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getRanking()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setRanking(Ranking value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Ranking Interval</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranking Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Ranking Interval</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setRankingInterval(RankingInterval)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_RankingInterval()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='RankingInterval' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	RankingInterval getRankingInterval();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getRankingInterval <em>Ranking Interval</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Ranking Interval</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getRankingInterval()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setRankingInterval(RankingInterval value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Ratio Measure</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Ratio Measure</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setRatioMeasure(RatioMeasure)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_RatioMeasure()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='RatioMeasure' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	RatioMeasure getRatioMeasure();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getRatioMeasure <em>Ratio Measure</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Ratio Measure</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getRatioMeasure()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setRatioMeasure(RatioMeasure value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Ratio Measurment</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio Measurment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Ratio Measurment</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setRatioMeasurment(RatioMeasurement)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_RatioMeasurment()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='RatioMeasurment' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	RatioMeasurement getRatioMeasurment();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getRatioMeasurment <em>Ratio Measurment</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Ratio Measurment</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getRatioMeasurment()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setRatioMeasurment(RatioMeasurement value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Rescaled Measure</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rescaled Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Rescaled Measure</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setRescaledMeasure(RescaledMeasure)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_RescaledMeasure()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='RescaledMeasure' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	RescaledMeasure getRescaledMeasure();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getRescaledMeasure <em>Rescaled Measure</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Rescaled Measure</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getRescaledMeasure()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setRescaledMeasure(RescaledMeasure value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Re Scaled Measurement</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Re Scaled Measurement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Re Scaled Measurement</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setReScaledMeasurement(ReScaledMeasurement)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_ReScaledMeasurement()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='ReScaledMeasurement' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	ReScaledMeasurement getReScaledMeasurement();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getReScaledMeasurement <em>Re Scaled Measurement</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Re Scaled Measurement</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getReScaledMeasurement()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setReScaledMeasurement(ReScaledMeasurement value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Scope</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setScope(Scope)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_Scope()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='Scope' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	Scope getScope();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getScope <em>Scope</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Scope</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getScope()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setScope(Scope value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>SMM Category</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SMM Category</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>SMM Category</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setSMMCategory(SMMCategory)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_SMMCategory()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='SMM_Category' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	SMMCategory getSMMCategory();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getSMMCategory <em>SMM Category</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>SMM Category</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getSMMCategory()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setSMMCategory(SMMCategory value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>SMM Element</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SMM Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>SMM Element</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setSMMElement(SMMElement)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_SMMElement()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='SMM_Element' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	SMMElement getSMMElement();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getSMMElement <em>SMM Element</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>SMM Element</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getSMMElement()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setSMMElement(SMMElement value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>SMM Model</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SMM Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>SMM Model</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setSMMModel(SMMModel)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_SMMModel()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='SMM_Model' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	SMMModel getSMMModel();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getSMMModel <em>SMM Model</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>SMM Model</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getSMMModel()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setSMMModel(SMMModel value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>SMM Relationship</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SMM Relationship</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>SMM Relationship</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setSMMRelationship(SMMRelationship)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_SMMRelationship()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='SMM_Relationship' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	SMMRelationship getSMMRelationship();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getSMMRelationship <em>SMM Relationship</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>SMM Relationship</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getSMMRelationship()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setSMMRelationship(SMMRelationship value);

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Returns the value of the '<em><b>Timestamp</b></em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @return the value of the '<em>Timestamp</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #setTimestamp(Timestamp)
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getDocumentRoot_Timestamp()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 *        extendedMetaData="kind='element' name='Timestamp' namespace='##targetNamespace'"
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	Timestamp getTimestamp();

	/**
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.DocumentRoot#getTimestamp <em>Timestamp</em>}' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @param value the new value of the '<em>Timestamp</em>' containment reference.
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @see #getTimestamp()
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 * @generated
   	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 */
	void setTimestamp(Timestamp value);

} // DocumentRoot
