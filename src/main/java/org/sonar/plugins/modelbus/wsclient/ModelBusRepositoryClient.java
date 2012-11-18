package org.sonar.plugins.modelbus.wsclient;


import javax.xml.ws.BindingProvider;
import javax.xml.namespace.QName;

import java.net.URL;
import javax.xml.ws.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.plugins.modelbus.wsclient.repository.AuthenticateResponse;
import org.sonar.plugins.modelbus.wsclient.repository.Repository;
import org.sonar.plugins.modelbus.wsclient.repository.RepositoryServiceService;

public class ModelBusRepositoryClient {
	Logger logger = LoggerFactory.getLogger(getClass());
	
		   public static void main(String[] args) {
		      if (args.length != 1) {
		         System.out.println("Usage: WSClient &lt;search item>");
		         System.exit(-1);
		      }

		      ModelBusRepositoryClient wsc = new ModelBusRepositoryClient();
		      wsc.run();
		   }

		   private void run() {
		      try {

		    	  URL wsdlURL = new URL("http://localhost/hello?wsdl");
		    	  QName SERVICE_NAME = new QName("http://apache.org/hello_world_soap_http", "SOAPService");
		    	  Service service = RepositoryServiceService.create(wsdlURL, SERVICE_NAME);
		    	  Repository client = service.getPort(Repository.class);
		    	  String result = client.authenticate("modelbus", "modelbus");
		    	  logger.info("My first log: " + result); 
		    	  System.out.println(result);
		      } catch (Exception e) {
		         System.out.println("Exception: " + e.getMessage());
		      }
		   }
		   
		   

}
