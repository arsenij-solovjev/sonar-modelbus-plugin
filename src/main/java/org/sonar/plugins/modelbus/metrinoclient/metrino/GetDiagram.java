
package org.sonar.plugins.modelbus.metrinoclient.metrino;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDiagram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDiagram">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="metricModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="measurand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="timeChecked" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDiagram_", propOrder = {
    "model",
    "metricModel",
    "measurand",
    "timeChecked"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-12-16T09:29:30+01:00", comments = "JAXB RI v2.2.5")
public class GetDiagram {

    @XmlElementRef(name = "model", namespace = "http://www.modelbus.org/MetrinoService/", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-12-16T09:29:30+01:00", comments = "JAXB RI v2.2.5")
    protected JAXBElement<String> model;
    @XmlElementRef(name = "metricModel", namespace = "http://www.modelbus.org/MetrinoService/", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-12-16T09:29:30+01:00", comments = "JAXB RI v2.2.5")
    protected JAXBElement<String> metricModel;
    @XmlElementRef(name = "measurand", namespace = "http://www.modelbus.org/MetrinoService/", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-12-16T09:29:30+01:00", comments = "JAXB RI v2.2.5")
    protected JAXBElement<String> measurand;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-12-16T09:29:30+01:00", comments = "JAXB RI v2.2.5")
    protected long timeChecked;

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-12-16T09:29:30+01:00", comments = "JAXB RI v2.2.5")
    public JAXBElement<String> getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-12-16T09:29:30+01:00", comments = "JAXB RI v2.2.5")
    public void setModel(JAXBElement<String> value) {
        this.model = value;
    }

    /**
     * Gets the value of the metricModel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-12-16T09:29:30+01:00", comments = "JAXB RI v2.2.5")
    public JAXBElement<String> getMetricModel() {
        return metricModel;
    }

    /**
     * Sets the value of the metricModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-12-16T09:29:30+01:00", comments = "JAXB RI v2.2.5")
    public void setMetricModel(JAXBElement<String> value) {
        this.metricModel = value;
    }

    /**
     * Gets the value of the measurand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-12-16T09:29:30+01:00", comments = "JAXB RI v2.2.5")
    public JAXBElement<String> getMeasurand() {
        return measurand;
    }

    /**
     * Sets the value of the measurand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-12-16T09:29:30+01:00", comments = "JAXB RI v2.2.5")
    public void setMeasurand(JAXBElement<String> value) {
        this.measurand = value;
    }

    /**
     * Gets the value of the timeChecked property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-12-16T09:29:30+01:00", comments = "JAXB RI v2.2.5")
    public long getTimeChecked() {
        return timeChecked;
    }

    /**
     * Sets the value of the timeChecked property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-12-16T09:29:30+01:00", comments = "JAXB RI v2.2.5")
    public void setTimeChecked(long value) {
        this.timeChecked = value;
    }

}
