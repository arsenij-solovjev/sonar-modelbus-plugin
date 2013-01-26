/**
 */
package SoftwareMetricsMetamodel2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.Audit#getMeasure <em>Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getAudit()
 * @model
 * @generated
 */
public interface Audit extends SMMNamedElement {
	/**
   * Returns the value of the '<em><b>Measure</b></em>' reference list.
   * The list contents are of type {@link SoftwareMetricsMetamodel2.Measure}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Measure</em>' reference list.
   * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getAudit_Measure()
   * @model
   * @generated
   */
	EList<Measure> getMeasure();

} // Audit
