
package com.ee.cne.ws.getctxwithoperations.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An abstract base type for all Responses, used to abstract and enforce the inclusion of a Header.
 * 
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eiMessageContext2" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageContext2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", namespace = "http://www.everythingeverywhere.com/common/message/Response/v1.0", propOrder = {
    "eiMessageContext2"
})
@XmlSeeAlso({
    GetContextWithOperationsResponse.class
})
public class Response {

    @XmlElement(namespace = "", required = true)
    protected EIMessageContext2 eiMessageContext2;

    /**
     * Gets the value of the eiMessageContext2 property.
     * 
     * @return
     *     possible object is
     *     {@link EIMessageContext2 }
     *     
     */
    public EIMessageContext2 getEiMessageContext2() {
        return eiMessageContext2;
    }

    /**
     * Sets the value of the eiMessageContext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIMessageContext2 }
     *     
     */
    public void setEiMessageContext2(EIMessageContext2 value) {
        this.eiMessageContext2 = value;
    }

}
