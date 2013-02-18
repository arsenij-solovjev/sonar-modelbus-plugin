package org.sonar.plugins.modelbus.metrinoclient;

import javax.xml.namespace.QName;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.ws.Service;
import org.sonar.plugins.modelbus.metrinoclient.metrino.*;

/**
 * SOAP Client that can talk to the
 * 
 * @author arsenij
 * 
 */
public abstract class MetrinoSoapClient {
	
	private static MetrinoService client;
	
		
	public static MetrinoService getInstance() {
		if(client==null) {
			client = createClient();
		}
		return client;
	}
	

	private static MetrinoService createClient() {
		URL wsdlURL;
		try {
			wsdlURL = new URL("http://localhost:9090/metrinoservice?wsdl");
			QName SERVICE_NAME = new QName("http://www.modelbus.org/MetrinoService/", "MetrinoServiceService");
			Service service = MetrinoServiceService.create(wsdlURL, SERVICE_NAME);
			MetrinoService client = service.getPort(MetrinoService.class);
			return client;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
