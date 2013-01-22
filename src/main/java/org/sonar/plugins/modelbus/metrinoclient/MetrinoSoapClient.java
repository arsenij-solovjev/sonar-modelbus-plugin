package org.sonar.plugins.modelbus.metrinoclient;

import javax.xml.ws.BindingProvider; 
import javax.xml.namespace.QName;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.ws.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.plugins.modelbus.metrinoclient.metrino.*;

/**
 * SOAP Client that can talk to the
 * 
 * @author arsenij
 * 
 */
public class MetrinoSoapClient {
	
	static MetrinoService client;
	
	
	MetrinoSoapClient() {
		client = createClient();
	}
	

	void ccheckModel(String modelUri, String smmUri){
		client.checkModel(modelUri, smmUri);
	}
	

	private static MetrinoService createClient() {
		URL wsdlURL;
		try {
			wsdlURL = new URL("http://localhost:9090/metrinoservice?wsdl");
			QName SERVICE_NAME = new QName("http://www.modelbus.org/MetrinoService/",
					"MetrinoServiceService");
			@SuppressWarnings("restriction")
			Service service = MetrinoServiceService.create(wsdlURL, SERVICE_NAME);
			@SuppressWarnings("restriction")
			MetrinoService client = service.getPort(MetrinoService.class);
			return client;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return null;
	}

}
