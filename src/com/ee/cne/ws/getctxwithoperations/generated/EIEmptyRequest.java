
package com.ee.cne.ws.getctxwithoperations.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EIEmptyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EIEmptyRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eiMessageContext" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageContext"/>
 *         &lt;element name="data" type="{http://messaging.ei.tmobile.net/datatypes}EIEmpty"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EIEmptyRequest", propOrder = {
    "eiMessageContext",
    "data"
})
public class EIEmptyRequest {

    @XmlElement(required = true)
    protected EIMessageContext eiMessageContext;
    @XmlElement(required = true)
    protected EIEmpty data;

    /**
     * Gets the value of the eiMessageContext property.
     * 
     * @return
     *     possible object is
     *     {@link EIMessageContext }
     *     
     */
    public EIMessageContext getEiMessageContext() {
        return eiMessageContext;
    }

    /**
     * Sets the value of the eiMessageContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIMessageContext }
     *     
     */
    public void setEiMessageContext(EIMessageContext value) {
        this.eiMessageContext = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link EIEmpty }
     *     
     */
    public EIEmpty getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIEmpty }
     *     
     */
    public void setData(EIEmpty value) {
        this.data = value;
    }

}
