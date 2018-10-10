
package com.ee.cne.ws.getctxwithoperations.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetContextWithOperationsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetContextWithOperationsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.everythingeverywhere.com/common/message/Request/v1.0}Request">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contextToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetContextWithOperationsRequest", namespace = "http://www.everythingeverywhere.com/crm/customer/service/GetContextWithOperations/GetContextWithOperationsRequest/v1.0", propOrder = {
    "message"
})
public class GetContextWithOperationsRequest
    extends Request
{

    @XmlElement(namespace = "", required = true)
    protected GetContextWithOperationsRequest.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link GetContextWithOperationsRequest.Message }
     *     
     */
    public GetContextWithOperationsRequest.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetContextWithOperationsRequest.Message }
     *     
     */
    public void setMessage(GetContextWithOperationsRequest.Message value) {
        this.message = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="contextToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contextToken"
    })
    public static class Message {

        @XmlElement(namespace = "", required = true)
        protected String contextToken;

        /**
         * Gets the value of the contextToken property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContextToken() {
            return contextToken;
        }

        /**
         * Sets the value of the contextToken property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContextToken(String value) {
            this.contextToken = value;
        }

    }

}
