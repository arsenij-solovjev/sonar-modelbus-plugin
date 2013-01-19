
package org.sonar.plugins.modelbus.metrinoclient.metrino;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDiagramResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDiagramResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imageStream" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDiagramResponse", propOrder = {
    "imageStream"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-12-16T09:29:30+01:00", comments = "JAXB RI v2.2.5")
public class GetDiagramResponse {

    @XmlElementRef(name = "imageStream", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-12-16T09:29:30+01:00", comments = "JAXB RI v2.2.5")
    protected JAXBElement<byte[]> imageStream;

    /**
     * Gets the value of the imageStream property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-12-16T09:29:30+01:00", comments = "JAXB RI v2.2.5")
    public JAXBElement<byte[]> getImageStream() {
        return imageStream;
    }

    /**
     * Sets the value of the imageStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-12-16T09:29:30+01:00", comments = "JAXB RI v2.2.5")
    public void setImageStream(JAXBElement<byte[]> value) {
        this.imageStream = value;
    }

}
