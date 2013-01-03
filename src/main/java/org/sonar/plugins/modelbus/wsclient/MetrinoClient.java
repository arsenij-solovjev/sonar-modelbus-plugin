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
	
	public static void main(String[] args) {
		MetrinoClient wsc = new MetrinoClient();
		wsc.run();
	}

	private void run() {
		try {

			MetrinoService client = createClient();
			client.checkModel("www.modelbus.org/system/model/user.ecore", 
					"www.berlin.de/nothing/to/do/SampleMetrics.smm");

//			String result = client.authenticate("modelbus", "modelbus");
//			logger.info("My first log: " + result);
//			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private MetrinoService createClient() throws MalformedURLException {
		URL wsdlURL = new URL("http://openstoryboards.org:9090/metrino?wsdl");
		QName SERVICE_NAME = new QName("http://www.modelbus.org/MetrinoService/",
				"MetrinoServiceService");
		@SuppressWarnings("restriction")
		Service service = MetrinoServiceService.create(wsdlURL, SERVICE_NAME);
		@SuppressWarnings("restriction")
		MetrinoService client = service.getPort(MetrinoService.class);
		return client;
	}

}
