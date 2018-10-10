package com.ericsson.toolkit.client;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.UUID;

import com.ee.cne.ws.getctxwithoperations.client.ToolkitLoginInfo;
import com.ee.cne.ws.getctxwithoperations.generated.BusinessFault;
import com.ee.cne.ws.getctxwithoperations.generated.ContextField;
import com.ee.cne.ws.getctxwithoperations.generated.EIMessageContext2;
import com.ee.cne.ws.getctxwithoperations.generated.GetContextWithOperations;
import com.ee.cne.ws.getctxwithoperations.generated.GetContextWithOperationsRequest;
import com.ee.cne.ws.getctxwithoperations.generated.GetContextWithOperationsResponse;
import com.ee.cne.ws.getctxwithoperations.generated.GetContextWithOperationsService;
import com.ee.cne.ws.getctxwithoperations.generated.ObjectFactory;
import com.ee.cne.ws.getctxwithoperations.generated.TechnicalFault;
import com.ee.cne.ws.getctxwithoperations.generated.GetContextWithOperationsRequest.Message;

public class ToolkitClientTest {

	public static void main(String[] args) throws MalformedURLException {
		ToolkitClientTest.fetchToolkitAuthenticationDetails("sadsadsa");

	}

	public static ToolkitLoginInfo fetchToolkitAuthenticationDetails(String contextKeyParamName)
			throws MalformedURLException {

		// call web-service
		ToolkitLoginInfo toolkitLoginInfo = null;
		String correlationId = UUID.randomUUID().toString();
		GetContextWithOperationsResponse serviceResponse = null;
		GetContextWithOperationsRequest serviceRequest = new ObjectFactory().createGetContextWithOperationsRequest();

		// Set the request parameters
		Message message = new Message();
		message.setContextToken(contextKeyParamName);
		serviceRequest.setMessage(message);

		EIMessageContext2 messageContext = new EIMessageContext2();
		messageContext.setCorrelationId(correlationId);
		messageContext.setRequestId(correlationId);
		messageContext.setSender("EEA-JBOSS");
		serviceRequest.setEiMessageContext2(messageContext);

		try {

			URL wsdlURL = new URL("http://localhost:8081/mockGetContextWithOperationsSoapBinding?WSDL");
			System.out.println("WSDL URL :: " + wsdlURL.toURI().toString());
			GetContextWithOperationsService service = new GetContextWithOperationsService(wsdlURL);
			GetContextWithOperations ctxport = service.getGetContextWithOperations10();
			serviceResponse = ctxport.getContextWithOperations(serviceRequest);

			if (serviceResponse != null && serviceResponse.getMessage() != null) {
				toolkitLoginInfo = new ToolkitLoginInfo();

				if (serviceResponse.getMessage().getContextFields() != null
						&& serviceResponse.getMessage().getContextFields().getContextField() != null) {

					ContextField uId = serviceResponse.getMessage().getContextFields().getContextField().stream()
							.filter(e -> "user.username".equals(e.getFieldName())).findFirst().orElseGet(null);

					ContextField msisdn = serviceResponse.getMessage().getContextFields().getContextField().stream()
							.filter(e -> "customer.customerDetails.msisdn".equals(e.getFieldName())).findFirst()
							.orElseGet(null);

					toolkitLoginInfo.setUid(uId.getFieldValue());
					toolkitLoginInfo.setMsisdn(msisdn.getFieldValue());
				}

				if (serviceResponse.getMessage().getContextFields() != null
						&& serviceResponse.getMessage().getContextFields().getContextField() != null) {

					toolkitLoginInfo.setRoleList(serviceResponse.getMessage().getOperations().getOperation());
				}
			} else {
				throw new BusinessFault("No valid Response Found");
			}

		} catch (BusinessFault | TechnicalFault | URISyntaxException exc) {

			System.out.println("An error occured while calling service getGetContextWithOperations"+ exc);
		}

		return toolkitLoginInfo;
	}
}
