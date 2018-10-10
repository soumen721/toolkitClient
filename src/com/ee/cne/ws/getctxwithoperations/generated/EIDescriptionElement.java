
package com.ee.cne.ws.getctxwithoperations.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *        			If used it contains a plain text description of the fault. This description is expected to be
 * 				helpful in explaining the fault to users. There MAY be any number of description elements.
 * 				SOA BP components will always issue their error messages in English.
 * 		        If support for multilingual error messages if desired one may define a description id to
 * 		        enable a lookup for the description text in another language.
 * 		        One may also use placeholders within the text to indicate that a certain variable is used.
 * 		        These placeholder can be inserted in the translatetd text again. The syntax using placeholders 
 * 		        in XML style is favored against the printf style placeholders as the internal application
 * 		        syntax for replacing fragments must not be defined.
 * 		    
 * 
 * <p>Java class for EIDescriptionElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EIDescriptionElement">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute ref="{http://messaging.ei.tmobile.net/datatypes}lang"/>
 *       &lt;attribute name="descId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EIDescriptionElement", propOrder = {
    "value"
})
public class EIDescriptionElement {

    @XmlValue
    protected String value;
    @XmlAttribute(namespace = "http://messaging.ei.tmobile.net/datatypes")
    protected String lang;
    @XmlAttribute(namespace = "http://messaging.ei.tmobile.net/datatypes")
    protected String descId;

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
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        if (lang == null) {
            return "en";
        } else {
            return lang;
        }
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the descId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescId() {
        return descId;
    }

    /**
     * Sets the value of the descId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescId(String value) {
        this.descId = value;
    }

}
