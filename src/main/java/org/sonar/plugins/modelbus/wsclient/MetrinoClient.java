package org.sonar.plugins.modelbus.wsclient;

import javax.xml.ws.BindingProvider; 
import javax.xml.namespace.QName;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.ws.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.plugins.modelbus.wsclient.metrino.*;

/**
 * SOAP Client that can talk to the
 * 
 * @author arsenij
 * 
 */
public class MetrinoClient {
	
	MetrinoService client;
	
	public MetrinoClient() throws MalformedURLException {
		client = createClient();
	}
	

	public void checkModel(String modelUri, String smmUri){
		client.checkModel(modelUri, smmUri);
	}
	

	private MetrinoService createClient() throws MalformedURLException {
		URL wsdlURL = new URL("http://localhost:9090/metrinoservice?wsdl");
		QName SERVICE_NAME = new QName("http://www.modelbus.org/MetrinoService/",
				"MetrinoServiceService");
		@SuppressWarnings("restriction")
		Service service = MetrinoServiceService.create(wsdlURL, SERVICE_NAME);
		@SuppressWarnings("restriction")
		MetrinoService client = service.getPort(MetrinoService.class);
		return client;
	}

}
