/**
 */
package SoftwareMetricsMetamodel2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ranking Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SoftwareMetricsMetamodel2.RankingInterval#getMaximumEndpoint <em>Maximum Endpoint</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.RankingInterval#isMaximumOpen <em>Maximum Open</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.RankingInterval#getMinimumEndpoint <em>Minimum Endpoint</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.RankingInterval#isMinimumOpen <em>Minimum Open</em>}</li>
 *   <li>{@link SoftwareMetricsMetamodel2.RankingInterval#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getRankingInterval()
 * @model extendedMetaData="name='RankingInterval' kind='elementOnly'"
 * @generated
 */
public interface RankingInterval extends SMMElement {
	/**
   * Returns the value of the '<em><b>Maximum Endpoint</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Endpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Maximum Endpoint</em>' attribute.
   * @see #isSetMaximumEndpoint()
   * @see #unsetMaximumEndpoint()
   * @see #setMaximumEndpoint(double)
   * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getRankingInterval_MaximumEndpoint()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
   *        extendedMetaData="kind='element' name='maximumEndpoint' namespace='##targetNamespace'"
   * @generated
   */
	double getMaximumEndpoint();

	/**
   * Sets the value of the '{@link SoftwareMetricsMetamodel2.RankingInterval#getMaximumEndpoint <em>Maximum Endpoint</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maximum Endpoint</em>' attribute.
   * @see #isSetMaximumEndpoint()
   * @see #unsetMaximumEndpoint()
   * @see #getMaximumEndpoint()
   * @generated
   */
	void setMaximumEndpoint(double value);

	/**
   * Unsets the value of the '{@link SoftwareMetricsMetamodel2.RankingInterval#getMaximumEndpoint <em>Maximum Endpoint</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetMaximumEndpoint()
   * @see #getMaximumEndpoint()
   * @see #setMaximumEndpoint(double)
   * @generated
   */
	void unsetMaximumEndpoint();

	/**
   * Returns whether the value of the '{@link SoftwareMetricsMetamodel2.RankingInterval#getMaximumEndpoint <em>Maximum Endpoint</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Maximum Endpoint</em>' attribute is set.
   * @see #unsetMaximumEndpoint()
   * @see #getMaximumEndpoint()
   * @see #setMaximumEndpoint(double)
   * @generated
   */
	boolean isSetMaximumEndpoint();

	/**
   	 * Returns the value of the '<em><b>Maximum Open</b></em>' attribute.
   	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 * @return the value of the '<em>Maximum Open</em>' attribute.
   	 * @see #isSetMaximumOpen()
   	 * @see #unsetMaximumOpen()
   	 * @see #setMaximumOpen(boolean)
   	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getRankingInterval_MaximumOpen()
   	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   	 *        extendedMetaData="kind='element' name='maximumOpen' namespace='##targetNamespace'"
   	 * @generated
   	 */
	boolean isMaximumOpen();

	/**
   	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.RankingInterval#isMaximumOpen <em>Maximum Open</em>}' attribute.
   	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 * @param value the new value of the '<em>Maximum Open</em>' attribute.
   	 * @see #isSetMaximumOpen()
   	 * @see #unsetMaximumOpen()
   	 * @see #isMaximumOpen()
   	 * @generated
   	 */
	void setMaximumOpen(boolean value);

	/**
   	 * Unsets the value of the '{@link SoftwareMetricsMetamodel2.RankingInterval#isMaximumOpen <em>Maximum Open</em>}' attribute.
   	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 * @see #isSetMaximumOpen()
   	 * @see #isMaximumOpen()
   	 * @see #setMaximumOpen(boolean)
   	 * @generated
   	 */
	void unsetMaximumOpen();

	/**
   	 * Returns whether the value of the '{@link SoftwareMetricsMetamodel2.RankingInterval#isMaximumOpen <em>Maximum Open</em>}' attribute is set.
   	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 * @return whether the value of the '<em>Maximum Open</em>' attribute is set.
   	 * @see #unsetMaximumOpen()
   	 * @see #isMaximumOpen()
   	 * @see #setMaximumOpen(boolean)
   	 * @generated
   	 */
	boolean isSetMaximumOpen();

	/**
   	 	 * Returns the value of the '<em><b>Minimum Endpoint</b></em>' attribute.
   	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Endpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 * @return the value of the '<em>Minimum Endpoint</em>' attribute.
   	 	 * @see #isSetMinimumEndpoint()
   	 	 * @see #unsetMinimumEndpoint()
   	 	 * @see #setMinimumEndpoint(double)
   	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getRankingInterval_MinimumEndpoint()
   	 	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
   	 	 *        extendedMetaData="kind='element' name='minimumEndpoint' namespace='##targetNamespace'"
   	 	 * @generated
   	 	 */
	double getMinimumEndpoint();

	/**
   	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.RankingInterval#getMinimumEndpoint <em>Minimum Endpoint</em>}' attribute.
   	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 * @param value the new value of the '<em>Minimum Endpoint</em>' attribute.
   	 	 * @see #isSetMinimumEndpoint()
   	 	 * @see #unsetMinimumEndpoint()
   	 	 * @see #getMinimumEndpoint()
   	 	 * @generated
   	 	 */
	void setMinimumEndpoint(double value);

	/**
   	 	 * Unsets the value of the '{@link SoftwareMetricsMetamodel2.RankingInterval#getMinimumEndpoint <em>Minimum Endpoint</em>}' attribute.
   	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 * @see #isSetMinimumEndpoint()
   	 	 * @see #getMinimumEndpoint()
   	 	 * @see #setMinimumEndpoint(double)
   	 	 * @generated
   	 	 */
	void unsetMinimumEndpoint();

	/**
   	 	 * Returns whether the value of the '{@link SoftwareMetricsMetamodel2.RankingInterval#getMinimumEndpoint <em>Minimum Endpoint</em>}' attribute is set.
   	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 * @return whether the value of the '<em>Minimum Endpoint</em>' attribute is set.
   	 	 * @see #unsetMinimumEndpoint()
   	 	 * @see #getMinimumEndpoint()
   	 	 * @see #setMinimumEndpoint(double)
   	 	 * @generated
   	 	 */
	boolean isSetMinimumEndpoint();

	/**
   	 	 	 * Returns the value of the '<em><b>Minimum Open</b></em>' attribute.
   	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 * @return the value of the '<em>Minimum Open</em>' attribute.
   	 	 	 * @see #isSetMinimumOpen()
   	 	 	 * @see #unsetMinimumOpen()
   	 	 	 * @see #setMinimumOpen(boolean)
   	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getRankingInterval_MinimumOpen()
   	 	 	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   	 	 	 *        extendedMetaData="kind='element' name='minimumOpen' namespace='##targetNamespace'"
   	 	 	 * @generated
   	 	 	 */
	boolean isMinimumOpen();

	/**
   	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.RankingInterval#isMinimumOpen <em>Minimum Open</em>}' attribute.
   	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 * @param value the new value of the '<em>Minimum Open</em>' attribute.
   	 	 	 * @see #isSetMinimumOpen()
   	 	 	 * @see #unsetMinimumOpen()
   	 	 	 * @see #isMinimumOpen()
   	 	 	 * @generated
   	 	 	 */
	void setMinimumOpen(boolean value);

	/**
   	 	 	 * Unsets the value of the '{@link SoftwareMetricsMetamodel2.RankingInterval#isMinimumOpen <em>Minimum Open</em>}' attribute.
   	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 * @see #isSetMinimumOpen()
   	 	 	 * @see #isMinimumOpen()
   	 	 	 * @see #setMinimumOpen(boolean)
   	 	 	 * @generated
   	 	 	 */
	void unsetMinimumOpen();

	/**
   	 	 	 * Returns whether the value of the '{@link SoftwareMetricsMetamodel2.RankingInterval#isMinimumOpen <em>Minimum Open</em>}' attribute is set.
   	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 * @return whether the value of the '<em>Minimum Open</em>' attribute is set.
   	 	 	 * @see #unsetMinimumOpen()
   	 	 	 * @see #isMinimumOpen()
   	 	 	 * @see #setMinimumOpen(boolean)
   	 	 	 * @generated
   	 	 	 */
	boolean isSetMinimumOpen();

	/**
   	 	 	 	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
   	 	 	 	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   	 	 	 	 * @return the value of the '<em>Symbol</em>' attribute.
   	 	 	 	 * @see #setSymbol(String)
   	 	 	 	 * @see SoftwareMetricsMetamodel2.SoftwareMetricsMetamodel2Package#getRankingInterval_Symbol()
   	 	 	 	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   	 	 	 	 *        extendedMetaData="kind='element' name='symbol' namespace='##targetNamespace'"
   	 	 	 	 * @generated
   	 	 	 	 */
	String getSymbol();

	/**
   	 	 	 	 * Sets the value of the '{@link SoftwareMetricsMetamodel2.RankingInterval#getSymbol <em>Symbol</em>}' attribute.
   	 	 	 	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   	 	 	 	 * @param value the new value of the '<em>Symbol</em>' attribute.
   	 	 	 	 * @see #getSymbol()
   	 	 	 	 * @generated
   	 	 	 	 */
	void setSymbol(String value);

} // RankingInterval
