
package com.ee.cne.ws.getctxwithoperations.generated;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.2.2
 * Tue Oct 09 15:00:26 IST 2018
 * Generated source version: 2.2.2
 * 
 */

@WebFault(name = "businessException", targetNamespace = "http://www.everythingeverywhere.com/common/message/BusinessException/v1.0")
public class BusinessFault extends Exception {
    public static final long serialVersionUID = 20181009150026L;
    
    private com.ee.cne.ws.getctxwithoperations.generated.BusinessException businessException;

    public BusinessFault() {
        super();
    }
    
    public BusinessFault(String message) {
        super(message);
    }
    
    public BusinessFault(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessFault(String message, com.ee.cne.ws.getctxwithoperations.generated.BusinessException businessException) {
        super(message);
        this.businessException = businessException;
    }

    public BusinessFault(String message, com.ee.cne.ws.getctxwithoperations.generated.BusinessException businessException, Throwable cause) {
        super(message, cause);
        this.businessException = businessException;
    }

    public com.ee.cne.ws.getctxwithoperations.generated.BusinessException getFaultInfo() {
        return this.businessException;
    }
}
