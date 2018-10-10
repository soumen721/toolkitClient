
package com.ee.cne.ws.getctxwithoperations.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contextFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contextFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextField" type="{http://www.everythingeverywhere.com/crm/customer/service/GetContextWithOperations/GetContextWithOperationsResponse/v1.0}contextField" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contextFields", namespace = "http://www.everythingeverywhere.com/crm/customer/service/GetContextWithOperations/GetContextWithOperationsResponse/v1.0", propOrder = {
    "contextField"
})
public class ContextFields {

    @XmlElement(namespace = "", required = true)
    protected List<ContextField> contextField;

    /**
     * Gets the value of the contextField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contextField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContextField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextField }
     * 
     * 
     */
    public List<ContextField> getContextField() {
        if (contextField == null) {
            contextField = new ArrayList<ContextField>();
        }
        return this.contextField;
    }

}
