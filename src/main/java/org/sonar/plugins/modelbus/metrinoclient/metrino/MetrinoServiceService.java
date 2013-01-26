package org.sonar.plugins.modelbus.metrinoclient.metrino;

import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.Generated;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2012-12-16T21:29:31.013+01:00
 * Generated source version: 2.6.1
 * 
 */
@WebServiceClient(name = "MetrinoServiceService", 
                  wsdlLocation = "file:/home/arsenij/workspace/sonar-modelbus-plugin/src/main/resources/wsdl/metrinoservice.wsdl",
                  targetNamespace = "http://www.modelbus.org/MetrinoService/") 
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2012-12-16T21:29:31.013+01:00", comments = "Apache CXF 2.6.1")
public class MetrinoServiceService extends Service {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2012-12-16T21:29:31.013+01:00")
    public final static URL WSDL_LOCATION;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2012-12-16T21:29:31.013+01:00")
    public final static QName SERVICE = new QName("http://www.modelbus.org/MetrinoService/", "MetrinoServiceService");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2012-12-16T21:29:31.013+01:00")
    public final static QName MetrinoServicePort = new QName("http://www.modelbus.org/MetrinoService/", "MetrinoServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/arsenij/workspace/sonar-modelbus-plugin/src/main/resources/wsdl/metrinoservice.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MetrinoServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/arsenij/workspace/sonar-modelbus-plugin/src/main/resources/wsdl/metrinoservice.wsdl");
        }
        WSDL_LOCATION = url;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2012-12-16T21:29:31.013+01:00")
    public MetrinoServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2012-12-16T21:29:31.013+01:00")
    public MetrinoServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2012-12-16T21:29:31.013+01:00")
    public MetrinoServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2012-12-16T21:29:31.013+01:00")
    public MetrinoServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2012-12-16T21:29:31.013+01:00")
    public MetrinoServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2012-12-16T21:29:31.013+01:00")
    public MetrinoServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns MetrinoService
     */
    @WebEndpoint(name = "MetrinoServicePort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2012-12-16T21:29:31.013+01:00")
    public MetrinoService getMetrinoServicePort() {
        return super.getPort(MetrinoServicePort, MetrinoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MetrinoService
     */
    @WebEndpoint(name = "MetrinoServicePort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2012-12-16T21:29:31.013+01:00")
    public MetrinoService getMetrinoServicePort(WebServiceFeature... features) {
        return super.getPort(MetrinoServicePort, MetrinoService.class, features);
    }

}