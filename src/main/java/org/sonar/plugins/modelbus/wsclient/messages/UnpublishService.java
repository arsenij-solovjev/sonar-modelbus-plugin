
package org.sonar.plugins.modelbus.wsclient.messages;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session" type="{http://www.modelbus.org/Repository/}Session"/>
 *         &lt;element name="properties" type="{http://www.modelbus.org/Repository/}ServiceProperties"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "session",
    "properties"
})
@XmlRootElement(name = "unpublishService")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
public class UnpublishService {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    protected Session session;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    protected ServiceProperties properties;

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link Session }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    public Session getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link Session }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    public void setSession(Session value) {
        this.session = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProperties }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    public ServiceProperties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProperties }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    public void setProperties(ServiceProperties value) {
        this.properties = value;
    }

}
