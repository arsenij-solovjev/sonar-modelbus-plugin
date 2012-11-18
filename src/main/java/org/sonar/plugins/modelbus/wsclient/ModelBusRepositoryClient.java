package org.sonar.plugins.modelbus.wsclient;

import javax.xml.ws.BindingProvider;
import javax.xml.namespace.QName;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.ws.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.plugins.modelbus.wsclient.repository.AuthenticateResponse;
import org.sonar.plugins.modelbus.wsclient.repository.Repository;
import org.sonar.plugins.modelbus.wsclient.repository.RepositoryServiceService;

/**
 * SOAP Client that can talk to the
 * 
 * @author arsenij
 * 
 */
public class ModelBusRepositoryClient {
	Logger logger = LoggerFactory.getLogger(getClass());

	public static void main(String[] args) {
		ModelBusRepositoryClient wsc = new ModelBusRepositoryClient();
		wsc.run();
	}

	private void run() {
		try {

			Repository client = createClient();

			String result = client.authenticate("modelbus", "modelbus");
			logger.info("My first log: " + result);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

	private Repository createClient() throws MalformedURLException {
		URL wsdlURL = new URL("http://127.0.1.1:8080/modelbusrepository?wsdl");
		QName SERVICE_NAME = new QName("http://www.modelbus.org/Repository/",
				"RepositoryServiceService");
		@SuppressWarnings("restriction")
		Service service = RepositoryServiceService.create(wsdlURL, SERVICE_NAME);
		@SuppressWarnings("restriction")
		Repository client = service.getPort(Repository.class);
		return client;
	}

}
