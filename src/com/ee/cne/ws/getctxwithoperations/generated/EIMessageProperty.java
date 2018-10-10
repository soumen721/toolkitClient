
package com.ee.cne.ws.getctxwithoperations.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 	         Properties are less frequent used message context extensions. These might just be valuable
 * 	         for certain situations or systems. They do furthermore add the flexibility to define the content
 * 	         on a more semantical basis then on a syntactical bases.
 * 	         SOA Backplane will control the use of these properties by maintaining a list of valid attributes
 * 	         and their description. Properties in calls will be checked against this list. Having such a control
 * 	         prevents defining a property more than once (same meaning but different spelling) and puts hold
 * 	         on wrongly using the technical arguments.
 * 	         Service providers should ignore unknown attributes unless the mustUnderstand attribute is set.
 * 	     
 * 
 * <p>Java class for EIMessageProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EIMessageProperty">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="policy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mustUnderstand" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="boolean"/>
 *             &lt;enumeration value="byte"/>
 *             &lt;enumeration value="short"/>
 *             &lt;enumeration value="int"/>
 *             &lt;enumeration value="long"/>
 *             &lt;enumeration value="float"/>
 *             &lt;enumeration value="double"/>
 *             &lt;enumeration value="string"/>
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
@XmlType(name = "EIMessageProperty", propOrder = {
    "value"
})
public class EIMessageProperty {

    @XmlValue
    protected String value;
    @XmlAttribute(namespace = "http://messaging.ei.tmobile.net/datatypes", required = true)
    protected String name;
    @XmlAttribute(namespace = "http://messaging.ei.tmobile.net/datatypes")
    protected String policy;
    @XmlAttribute(namespace = "http://messaging.ei.tmobile.net/datatypes")
    protected Boolean mustUnderstand;
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
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicy(String value) {
        this.policy = value;
    }

    /**
     * Gets the value of the mustUnderstand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getMustUnderstand() {
        if (mustUnderstand == null) {
            return false;
        } else {
            return mustUnderstand;
        }
    }

    /**
     * Sets the value of the mustUnderstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustUnderstand(Boolean value) {
        this.mustUnderstand = value;
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
        return type;
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
