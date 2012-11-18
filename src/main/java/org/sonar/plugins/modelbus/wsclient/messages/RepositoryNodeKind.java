
package org.sonar.plugins.modelbus.wsclient.messages;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepositoryNodeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RepositoryNodeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="FILE"/>
 *     &lt;enumeration value="DIR"/>
 *     &lt;enumeration value="MODEL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RepositoryNodeKind")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-11-17T09:23:46+01:00", comments = "JAXB RI v2.2.5")
public enum RepositoryNodeKind {

    NONE,
    FILE,
    DIR,
    MODEL,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static RepositoryNodeKind fromValue(String v) {
        return valueOf(v);
    }

}
