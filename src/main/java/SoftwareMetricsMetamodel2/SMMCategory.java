/**
 */
package SoftwareMetricsMetamodel2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMM Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.SMMCategory#getCategory <em>Category</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.SMMCategory#getCategoryElement <em>Category Element</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.SMMCategory#getMeasureElement <em>Measure Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getSMMCategory()
 * @model extendedMetaData="name='SMM_Category' kind='elementOnly'"
 * @generated
 */
public interface SMMCategory extends SMMNamedElement {
	/**
   * Returns the value of the '<em><b>Category</b></em>' reference list.
   * The list contents are of type {@link SoftwareMetricsMetamodel2.SMMCategory}.
   * It is bidirectional and its opposite is '{@link SoftwareMetricsMetamodel2.SMMCategory#getCategoryElement <em>Category Element</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' reference list.
   * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getSMMCategory_Category()
   * @see SoftwareMetricsMetamodel2.SMMCategory#getCategoryElement
   * @model opposite="categoryElement" ordered="false"
   *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
   * @generated
   */
	EList<SMMCategory> getCategory();

	/**
   	 * Returns the value of the '<em><b>Category Element</b></em>' reference list.
   	 * The list contents are of type {@link SoftwareMetricsMetamodel2.SMMCategory}.
   	 * It is bidirectional and its opposite is '{@link SoftwareMetricsMetamodel2.SMMCategory#getCategory <em>Category</em>}'.
   	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 * @return the value of the '<em>Category Element</em>' reference list.
   	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getSMMCategory_CategoryElement()
   	 * @see SoftwareMetricsMetamodel2.SMMCategory#getCategory
   	 * @model opposite="category" ordered="false"
   	 * @generated
   	 */
	EList<SMMCategory> getCategoryElement();

	/**
   	 * Returns the value of the '<em><b>Measure Element</b></em>' reference list.
   	 * The list contents are of type {@link SoftwareMetricsMetamodel2.Measure}.
   	 * It is bidirectional and its opposite is '{@link SoftwareMetricsMetamodel2.Measure#getCategory <em>Category</em>}'.
   	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 * @return the value of the '<em>Measure Element</em>' reference list.
   	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getSMMCategory_MeasureElement()
   	 * @see SoftwareMetricsMetamodel2.Measure#getCategory
   	 * @model opposite="category" ordered="false"
   	 * @generated
   	 */
	EList<Measure> getMeasureElement();

} // SMMCategory
