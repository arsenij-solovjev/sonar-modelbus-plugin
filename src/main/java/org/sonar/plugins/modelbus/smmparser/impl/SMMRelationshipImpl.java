/**
 */
package org.sonar.plugins.modelbus.smmparser.impl;


import org.eclipse.emf.ecore.EClass;
import org.sonar.plugins.modelbus.smmparser.SMMRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMM Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class SMMRelationshipImpl extends SMMElementImpl implements SMMRelationship {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SMMRelationshipImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.SMM_RELATIONSHIP;
  }

} //SMMRelationshipImpl
