
package com.ee.cne.ws.getctxwithoperations.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EIOperationCompleted.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EIOperationCompleted">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="no"/>
 *     &lt;enumeration value="maybe"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EIOperationCompleted")
@XmlEnum
public enum EIOperationCompleted {


    /**
     * 
     * 					    This flag should be issued when it is clear that a operation was not executed. 
     * 					    This might be the case when e.g. the service provider was not reachable.
     * 					
     * 
     */
    @XmlEnumValue("no")
    NO("no"),

    /**
     * 
     * 					   This flag should be used when it is not clear to the sender of the fault if an operation
     * 					   was completed, e.g. when a exception because of an timeout was returned.
     * 					
     * 
     */
    @XmlEnumValue("maybe")
    MAYBE("maybe");
    private final String value;

    EIOperationCompleted(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EIOperationCompleted fromValue(String v) {
        for (EIOperationCompleted c: EIOperationCompleted.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
