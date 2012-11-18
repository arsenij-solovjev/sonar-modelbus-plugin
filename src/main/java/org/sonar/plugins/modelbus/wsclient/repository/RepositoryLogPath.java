
package org.sonar.plugins.modelbus.wsclient.repository;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepositoryLogPath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepositoryLogPath">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="action" type="{http://www.modelbus.org/Repository/}RepositoryNodeChangeType" />
 *       &lt;attribute name="copiedFromPath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="copiedFromRevision" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepositoryLogPath")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
public class RepositoryLogPath {

    @XmlAttribute(name = "path")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    protected String path;
    @XmlAttribute(name = "action")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    protected RepositoryNodeChangeType action;
    @XmlAttribute(name = "copiedFromPath")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    protected String copiedFromPath;
    @XmlAttribute(name = "copiedFromRevision")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    protected Long copiedFromRevision;

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link RepositoryNodeChangeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    public RepositoryNodeChangeType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepositoryNodeChangeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    public void setAction(RepositoryNodeChangeType value) {
        this.action = value;
    }

    /**
     * Gets the value of the copiedFromPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    public String getCopiedFromPath() {
        return copiedFromPath;
    }

    /**
     * Sets the value of the copiedFromPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    public void setCopiedFromPath(String value) {
        this.copiedFromPath = value;
    }

    /**
     * Gets the value of the copiedFromRevision property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    public Long getCopiedFromRevision() {
        return copiedFromRevision;
    }

    /**
     * Sets the value of the copiedFromRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
    public void setCopiedFromRevision(Long value) {
        this.copiedFromRevision = value;
    }

}
