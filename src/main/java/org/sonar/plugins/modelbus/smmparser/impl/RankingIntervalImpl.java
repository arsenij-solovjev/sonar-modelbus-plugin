/**
 */
package org.sonar.plugins.modelbus.smmparser.impl;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sonar.plugins.modelbus.smmparser.RankingInterval;
import org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ranking Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.RankingIntervalImpl#getMaximumEndpoint <em>Maximum Endpoint</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.RankingIntervalImpl#isMaximumOpen <em>Maximum Open</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.RankingIntervalImpl#getMinimumEndpoint <em>Minimum Endpoint</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.RankingIntervalImpl#isMinimumOpen <em>Minimum Open</em>}</li>
 *   <li>{@link org.sonar.plugins.modelbus.smmparser.impl.RankingIntervalImpl#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RankingIntervalImpl extends SMMElementImpl implements RankingInterval {
	/**
   * The default value of the '{@link #getMaximumEndpoint() <em>Maximum Endpoint</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMaximumEndpoint()
   * @generated
   * @ordered
   */
	protected static final double MAXIMUM_ENDPOINT_EDEFAULT = 0.0;

	/**
   * The cached value of the '{@link #getMaximumEndpoint() <em>Maximum Endpoint</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMaximumEndpoint()
   * @generated
   * @ordered
   */
	protected double maximumEndpoint = MAXIMUM_ENDPOINT_EDEFAULT;

	/**
   * This is true if the Maximum Endpoint attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean maximumEndpointESet;

	/**
   * The default value of the '{@link #isMaximumOpen() <em>Maximum Open</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isMaximumOpen()
   * @generated
   * @ordered
   */
	protected static final boolean MAXIMUM_OPEN_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isMaximumOpen() <em>Maximum Open</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isMaximumOpen()
   * @generated
   * @ordered
   */
	protected boolean maximumOpen = MAXIMUM_OPEN_EDEFAULT;

	/**
   * This is true if the Maximum Open attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean maximumOpenESet;

	/**
   * The default value of the '{@link #getMinimumEndpoint() <em>Minimum Endpoint</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMinimumEndpoint()
   * @generated
   * @ordered
   */
	protected static final double MINIMUM_ENDPOINT_EDEFAULT = 0.0;

	/**
   * The cached value of the '{@link #getMinimumEndpoint() <em>Minimum Endpoint</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMinimumEndpoint()
   * @generated
   * @ordered
   */
	protected double minimumEndpoint = MINIMUM_ENDPOINT_EDEFAULT;

	/**
   * This is true if the Minimum Endpoint attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean minimumEndpointESet;

	/**
   * The default value of the '{@link #isMinimumOpen() <em>Minimum Open</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isMinimumOpen()
   * @generated
   * @ordered
   */
	protected static final boolean MINIMUM_OPEN_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isMinimumOpen() <em>Minimum Open</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isMinimumOpen()
   * @generated
   * @ordered
   */
	protected boolean minimumOpen = MINIMUM_OPEN_EDEFAULT;

	/**
   * This is true if the Minimum Open attribute has been set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	protected boolean minimumOpenESet;

	/**
   * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSymbol()
   * @generated
   * @ordered
   */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSymbol()
   * @generated
   * @ordered
   */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected RankingIntervalImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return org.sonar.plugins.modelbus.smmparser.SoftwareMetricsMetamodel2Package.Literals.RANKING_INTERVAL;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public double getMaximumEndpoint() {
    return maximumEndpoint;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMaximumEndpoint(double newMaximumEndpoint) {
    double oldMaximumEndpoint = maximumEndpoint;
    maximumEndpoint = newMaximumEndpoint;
    boolean oldMaximumEndpointESet = maximumEndpointESet;
    maximumEndpointESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MAXIMUM_ENDPOINT, oldMaximumEndpoint, maximumEndpoint, !oldMaximumEndpointESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetMaximumEndpoint() {
    double oldMaximumEndpoint = maximumEndpoint;
    boolean oldMaximumEndpointESet = maximumEndpointESet;
    maximumEndpoint = MAXIMUM_ENDPOINT_EDEFAULT;
    maximumEndpointESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MAXIMUM_ENDPOINT, oldMaximumEndpoint, MAXIMUM_ENDPOINT_EDEFAULT, oldMaximumEndpointESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetMaximumEndpoint() {
    return maximumEndpointESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isMaximumOpen() {
    return maximumOpen;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMaximumOpen(boolean newMaximumOpen) {
    boolean oldMaximumOpen = maximumOpen;
    maximumOpen = newMaximumOpen;
    boolean oldMaximumOpenESet = maximumOpenESet;
    maximumOpenESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MAXIMUM_OPEN, oldMaximumOpen, maximumOpen, !oldMaximumOpenESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetMaximumOpen() {
    boolean oldMaximumOpen = maximumOpen;
    boolean oldMaximumOpenESet = maximumOpenESet;
    maximumOpen = MAXIMUM_OPEN_EDEFAULT;
    maximumOpenESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MAXIMUM_OPEN, oldMaximumOpen, MAXIMUM_OPEN_EDEFAULT, oldMaximumOpenESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetMaximumOpen() {
    return maximumOpenESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public double getMinimumEndpoint() {
    return minimumEndpoint;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMinimumEndpoint(double newMinimumEndpoint) {
    double oldMinimumEndpoint = minimumEndpoint;
    minimumEndpoint = newMinimumEndpoint;
    boolean oldMinimumEndpointESet = minimumEndpointESet;
    minimumEndpointESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MINIMUM_ENDPOINT, oldMinimumEndpoint, minimumEndpoint, !oldMinimumEndpointESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetMinimumEndpoint() {
    double oldMinimumEndpoint = minimumEndpoint;
    boolean oldMinimumEndpointESet = minimumEndpointESet;
    minimumEndpoint = MINIMUM_ENDPOINT_EDEFAULT;
    minimumEndpointESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MINIMUM_ENDPOINT, oldMinimumEndpoint, MINIMUM_ENDPOINT_EDEFAULT, oldMinimumEndpointESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetMinimumEndpoint() {
    return minimumEndpointESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isMinimumOpen() {
    return minimumOpen;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMinimumOpen(boolean newMinimumOpen) {
    boolean oldMinimumOpen = minimumOpen;
    minimumOpen = newMinimumOpen;
    boolean oldMinimumOpenESet = minimumOpenESet;
    minimumOpenESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MINIMUM_OPEN, oldMinimumOpen, minimumOpen, !oldMinimumOpenESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void unsetMinimumOpen() {
    boolean oldMinimumOpen = minimumOpen;
    boolean oldMinimumOpenESet = minimumOpenESet;
    minimumOpen = MINIMUM_OPEN_EDEFAULT;
    minimumOpenESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MINIMUM_OPEN, oldMinimumOpen, MINIMUM_OPEN_EDEFAULT, oldMinimumOpenESet));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isSetMinimumOpen() {
    return minimumOpenESet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSymbol() {
    return symbol;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSymbol(String newSymbol) {
    String oldSymbol = symbol;
    symbol = newSymbol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__SYMBOL, oldSymbol, symbol));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MAXIMUM_ENDPOINT:
        return getMaximumEndpoint();
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MAXIMUM_OPEN:
        return isMaximumOpen();
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MINIMUM_ENDPOINT:
        return getMinimumEndpoint();
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MINIMUM_OPEN:
        return isMinimumOpen();
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__SYMBOL:
        return getSymbol();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MAXIMUM_ENDPOINT:
        setMaximumEndpoint((Double)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MAXIMUM_OPEN:
        setMaximumOpen((Boolean)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MINIMUM_ENDPOINT:
        setMinimumEndpoint((Double)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MINIMUM_OPEN:
        setMinimumOpen((Boolean)newValue);
        return;
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__SYMBOL:
        setSymbol((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MAXIMUM_ENDPOINT:
        unsetMaximumEndpoint();
        return;
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MAXIMUM_OPEN:
        unsetMaximumOpen();
        return;
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MINIMUM_ENDPOINT:
        unsetMinimumEndpoint();
        return;
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MINIMUM_OPEN:
        unsetMinimumOpen();
        return;
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__SYMBOL:
        setSymbol(SYMBOL_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID) {
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MAXIMUM_ENDPOINT:
        return isSetMaximumEndpoint();
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MAXIMUM_OPEN:
        return isSetMaximumOpen();
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MINIMUM_ENDPOINT:
        return isSetMinimumEndpoint();
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__MINIMUM_OPEN:
        return isSetMinimumOpen();
      case SoftwareMetricsMetamodel2Package.RANKING_INTERVAL__SYMBOL:
        return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (maximumEndpoint: ");
    if (maximumEndpointESet) result.append(maximumEndpoint); else result.append("<unset>");
    result.append(", maximumOpen: ");
    if (maximumOpenESet) result.append(maximumOpen); else result.append("<unset>");
    result.append(", minimumEndpoint: ");
    if (minimumEndpointESet) result.append(minimumEndpoint); else result.append("<unset>");
    result.append(", minimumOpen: ");
    if (minimumOpenESet) result.append(minimumOpen); else result.append("<unset>");
    result.append(", symbol: ");
    result.append(symbol);
    result.append(')');
    return result.toString();
  }

} //RankingIntervalImpl
