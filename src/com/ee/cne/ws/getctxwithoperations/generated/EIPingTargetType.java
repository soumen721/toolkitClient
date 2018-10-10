
package com.ee.cne.ws.getctxwithoperations.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EIPingTargetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EIPingTargetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Client"/>
 *     &lt;enumeration value="Server"/>
 *     &lt;enumeration value="Provider"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EIPingTargetType")
@XmlEnum
public enum EIPingTargetType {

    @XmlEnumValue("Client")
    CLIENT("Client"),
    @XmlEnumValue("Server")
    SERVER("Server"),
    @XmlEnumValue("Provider")
    PROVIDER("Provider");
    private final String value;

    EIPingTargetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EIPingTargetType fromValue(String v) {
        for (EIPingTargetType c: EIPingTargetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
