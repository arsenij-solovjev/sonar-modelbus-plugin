/**
 */
package org.sonar.plugins.modelbus.smmparser;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.CategoryRelationship#getName <em>Name</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.CategoryRelationship#getTo <em>To</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.CategoryRelationship#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getCategoryRelationship()
 * @model extendedMetaData="name='Category_Relationship' kind='elementOnly'"
 * @generated
 */
public interface CategoryRelationship extends SMMRelationship {
	/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getCategoryRelationship_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.CategoryRelationship#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   	 * Returns the value of the '<em><b>To</b></em>' reference.
   	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 * @return the value of the '<em>To</em>' reference.
   	 * @see #setTo(SMMCategory)
   	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getCategoryRelationship_To()
   	 * @model resolveProxies="false" required="true"
   	 *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace'"
   	 * @generated
   	 */
	SMMCategory getTo();

	/**
   	 * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.CategoryRelationship#getTo <em>To</em>}' reference.
   	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 * @param value the new value of the '<em>To</em>' reference.
   	 * @see #getTo()
   	 * @generated
   	 */
	void setTo(SMMCategory value);

	/**
   	 	 * Returns the value of the '<em><b>From</b></em>' reference.
   	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 * @return the value of the '<em>From</em>' reference.
   	 	 * @see #setFrom(SMMCategory)
   	 	 * @see org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package#getCategoryRelationship_From()
   	 	 * @model resolveProxies="false" required="true"
   	 	 *        extendedMetaData="kind='element' name='from' namespace='##targetNamespace'"
   	 	 * @generated
   	 	 */
	SMMCategory getFrom();

	/**
   	 	 * Sets the value of the '{@link org.sonar.plugins.modelbus.smmparser.CategoryRelationship#getFrom <em>From</em>}' reference.
   	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 * @param value the new value of the '<em>From</em>' reference.
   	 	 * @see #getFrom()
   	 	 * @generated
   	 	 */
	void setFrom(SMMCategory value);

} // CategoryRelationship
