
package com.ee.cne.ws.getctxwithoperations.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 			    Defines variables which can be used in the placeholders of the description elements. Simplifies
 * 			    the translation process of error messages. Be aware that the names of the values are not globally
 * 			    unique, that means when you want to merge different description elements where placeholders refer
 * 			    to the same placeholder name but coming from different exceptions you have the responsibility to
 * 			    rename one of the variables.
 * 			    
 * 			    Values must contain a name attribute (name of the placeholder) and are of a certain type.
 * 			    Please note that you should usually chose the stringValue just when different formattings for
 * 			    the localization could be required a extra datatype is offered, namely for time, date, dateTime
 * 			    and floats.
 * 			
 * 
 * <p>Java class for EIPlaceholderValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EIPlaceholderValue">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" default="string">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="boolean"/>
 *             &lt;enumeration value="int"/>
 *             &lt;enumeration value="float"/>
 *             &lt;enumeration value="string"/>
 *             &lt;enumeration value="date"/>
 *             &lt;enumeration value="dateTime"/>
 *             &lt;enumeration value="time"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EIPlaceholderValue", propOrder = {
    "value"
})
public class EIPlaceholderValue {

    @XmlValue
    protected String value;
    @XmlAttribute(namespace = "http://messaging.ei.tmobile.net/datatypes", required = true)
    protected String name;
    @XmlAttribute(namespace = "http://messaging.ei.tmobile.net/datatypes")
    protected String type;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "string";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
