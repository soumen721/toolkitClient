
package com.ee.cne.ws.getctxwithoperations.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetContextWithOperationsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetContextWithOperationsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.everythingeverywhere.com/common/message/Response/v1.0}Response">
 *       &lt;sequence>
 *         &lt;element name="message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contextFields" type="{http://www.everythingeverywhere.com/crm/customer/service/GetContextWithOperations/GetContextWithOperationsResponse/v1.0}contextFields"/>
 *                   &lt;element name="operations" type="{http://www.everythingeverywhere.com/crm/customer/service/GetContextWithOperations/GetContextWithOperationsResponse/v1.0}operations" minOccurs="0"/>
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
@XmlType(name = "GetContextWithOperationsResponse", namespace = "http://www.everythingeverywhere.com/crm/customer/service/GetContextWithOperations/GetContextWithOperationsResponse/v1.0", propOrder = {
    "message"
})
public class GetContextWithOperationsResponse
    extends Response
{

    @XmlElement(namespace = "", required = true)
    protected GetContextWithOperationsResponse.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link GetContextWithOperationsResponse.Message }
     *     
     */
    public GetContextWithOperationsResponse.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetContextWithOperationsResponse.Message }
     *     
     */
    public void setMessage(GetContextWithOperationsResponse.Message value) {
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
     *         &lt;element name="contextFields" type="{http://www.everythingeverywhere.com/crm/customer/service/GetContextWithOperations/GetContextWithOperationsResponse/v1.0}contextFields"/>
     *         &lt;element name="operations" type="{http://www.everythingeverywhere.com/crm/customer/service/GetContextWithOperations/GetContextWithOperationsResponse/v1.0}operations" minOccurs="0"/>
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
        "contextFields",
        "operations"
    })
    public static class Message {

        @XmlElement(namespace = "", required = true)
        protected ContextFields contextFields;
        @XmlElement(namespace = "")
        protected Operations operations;

        /**
         * Gets the value of the contextFields property.
         * 
         * @return
         *     possible object is
         *     {@link ContextFields }
         *     
         */
        public ContextFields getContextFields() {
            return contextFields;
        }

        /**
         * Sets the value of the contextFields property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContextFields }
         *     
         */
        public void setContextFields(ContextFields value) {
            this.contextFields = value;
        }

        /**
         * Gets the value of the operations property.
         * 
         * @return
         *     possible object is
         *     {@link Operations }
         *     
         */
        public Operations getOperations() {
            return operations;
        }

        /**
         * Sets the value of the operations property.
         * 
         * @param value
         *     allowed object is
         *     {@link Operations }
         *     
         */
        public void setOperations(Operations value) {
            this.operations = value;
        }

    }

}
