
package org.sonar.plugins.modelbus.wsclient.messages;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepositoryNodeChangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RepositoryNodeChangeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADDED"/>
 *     &lt;enumeration value="DELETED"/>
 *     &lt;enumeration value="REPLACED"/>
 *     &lt;enumeration value="MODIFIED"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RepositoryNodeChangeType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
public enum RepositoryNodeChangeType {

    ADDED,
    DELETED,
    REPLACED,
    MODIFIED,
    NONE;

    public String value() {
        return name();
    }

    public static RepositoryNodeChangeType fromValue(String v) {
        return valueOf(v);
    }

}
