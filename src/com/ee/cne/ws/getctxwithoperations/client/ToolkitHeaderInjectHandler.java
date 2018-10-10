package com.ee.cne.ws.getctxwithoperations.client;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.Set;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class ToolkitHeaderInjectHandler implements SOAPHandler<SOAPMessageContext> {
	// private static final Logger log =
	// Logger.getLogger(ToolkitHeaderInjectHandler.class);

	@Override
	public boolean handleMessage(SOAPMessageContext context) {

		System.out.println("Client : handleMessage()......");
		Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		try {
			SOAPMessage soapMsg = context.getMessage();

			if (isRequest) {
				// soapMsg.writeTo(System.out);
				SOAPEnvelope soapEnv = soapMsg.getSOAPPart().getEnvelope();
				SOAPHeader soapHeader = soapEnv.getHeader();
				SOAPBody soapBody = soapEnv.getBody();
				if (soapHeader == null) {
					soapHeader = soapEnv.addHeader();
				}

				SOAPElement trackingHeader = soapHeader.addChildElement(soapEnv.createName("trackingHeader", "ns7",
						"http://www.everythingeverywhere.com/common/message/SoapHeader/v1.0"));

				Node node = (Node) soapBody
						.getElementsByTagNameNS("http://messaging.ei.tmobile.net/datatypes", "requestId").item(0);
				String requestId = node.getChildNodes().item(0).getNodeValue();
				SOAPElement requestIdNode = trackingHeader.addChildElement("requestId");
				requestIdNode.setValue(requestId);

				GregorianCalendar gcal = GregorianCalendar.from(LocalDateTime.now().atZone(ZoneId.systemDefault()));
				XMLGregorianCalendar dateTimeNow = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);

				SOAPElement timestampNode = trackingHeader.addChildElement("timestamp");
				timestampNode.setValue(dateTimeNow.toString());

				soapMsg.saveChanges();
				System.out.println("\n\n************* VALUE :: " + node.getChildNodes().item(0).getNodeValue());

				soapMsg.writeTo(System.out);
			}

			// Printing Request/Response

		} catch (SOAPException | IOException | DatatypeConfigurationException e) {
			System.out.println("Exception :: " + e.getMessage());
		}

		return true;

	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		System.out.println("Client : handleFault()......");
		return true;
	}

	@Override
	public void close(MessageContext context) {
		System.out.println("\nClient : close()......");
	}

	@Override
	public Set<QName> getHeaders() {
		System.out.println("Client : getHeaders()......");
		return null;
	}

}