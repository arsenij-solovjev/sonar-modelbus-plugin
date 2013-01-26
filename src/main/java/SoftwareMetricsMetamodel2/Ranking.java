/**
 */
package SoftwareMetricsMetamodel2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ranking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.Ranking#getInterval <em>Interval</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.Ranking#getBaseMeasure <em>Base Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getRanking()
 * @model extendedMetaData="name='Ranking' kind='elementOnly'"
 * @generated
 */
public interface Ranking extends Measure {
	/**
   * Returns the value of the '<em><b>Interval</b></em>' reference list.
   * The list contents are of type {@link SoftwareMetricsMetamodel2.RankingInterval}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Interval</em>' reference list.
   * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getRanking_Interval()
   * @model resolveProxies="false" required="true"
   *        extendedMetaData="kind='element' name='interval' namespace='##targetNamespace'"
   * @generated
   */
	EList<RankingInterval> getInterval();

	/**
   	 * Returns the value of the '<em><b>Base Measure</b></em>' reference.
   	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 * @return the value of the '<em>Base Measure</em>' reference.
   	 * @see #setBaseMeasure(DimensionalMeasure)
   	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getRanking_BaseMeasure()
   	 * @model resolveProxies="false"
   	 *        extendedMetaData="kind='element' name='baseMeasure' namespace='##targetNamespace'"
   	 * @generated
   	 */
	DimensionalMeasure getBaseMeasure();

	/**
   	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.Ranking#getBaseMeasure <em>Base Measure</em>}' reference.
   	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 * @param value the new value of the '<em>Base Measure</em>' reference.
   	 * @see #getBaseMeasure()
   	 * @generated
   	 */
	void setBaseMeasure(DimensionalMeasure value);

} // Ranking
