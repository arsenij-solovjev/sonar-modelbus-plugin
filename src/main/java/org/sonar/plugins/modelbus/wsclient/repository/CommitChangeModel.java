
package org.sonar.plugins.modelbus.wsclient.repository;

import javax.activation.DataHandler;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="messageID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="changeModelContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
    "messageID",
    "modelUri",
    "changeModelContent"
})
@XmlRootElement(name = "commitChangeModel")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
public class CommitChangeModel {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    protected Session session;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    protected String messageID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    protected String modelUri;
    @XmlElement(required = true)
    @XmlMimeType("application/octet-stream")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    protected DataHandler changeModelContent;

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
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the modelUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    public String getModelUri() {
        return modelUri;
    }

    /**
     * Sets the value of the modelUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    public void setModelUri(String value) {
        this.modelUri = value;
    }

    /**
     * Gets the value of the changeModelContent property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    public DataHandler getChangeModelContent() {
        return changeModelContent;
    }

    /**
     * Sets the value of the changeModelContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    public void setChangeModelContent(DataHandler value) {
        this.changeModelContent = value;
    }

}
