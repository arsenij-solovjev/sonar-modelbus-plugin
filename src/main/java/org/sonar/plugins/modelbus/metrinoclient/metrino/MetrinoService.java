package org.sonar.plugins.modelbus.metrinoclient.metrino;

import javax.annotation.Generated;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2012-12-16T21:29:31+01:00
 * Generated source version: 2.6.1
 * 
 */
@WebService(targetNamespace = "http://www.modelbus.org/MetrinoService/", name = "MetrinoService")
@XmlSeeAlso({ObjectFactory.class})
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2012-12-16T21:29:31+01:00", comments = "Apache CXF 2.6.1")
public interface MetrinoService {

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "satisfiesAllConstraints", targetNamespace = "http://www.modelbus.org/MetrinoService/", className = "org.sonar.plugins.modelbus.wsclient.metrino.SatisfiesAllConstraints")
    @WebMethod(action = "http://www.modelbus.org/MetrinoService/satisfiesAllConstraints")
    @ResponseWrapper(localName = "satisfiesAllConstraintsResponse", targetNamespace = "http://www.modelbus.org/MetrinoService/", className = "org.sonar.plugins.modelbus.wsclient.metrino.SatisfiesAllConstraintsResponse")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2012-12-16T21:29:31+01:00")
    public boolean satisfiesAllConstraints(
        @WebParam(name = "model", targetNamespace = "http://www.modelbus.org/MetrinoService/")
        java.lang.String model,
        @WebParam(name = "metricModel", targetNamespace = "http://www.modelbus.org/MetrinoService/")
        java.lang.String metricModel
    );

    @WebResult(name = "imageStream", targetNamespace = "")
    @RequestWrapper(localName = "getDiagram", targetNamespace = "http://www.modelbus.org/MetrinoService/", className = "org.sonar.plugins.modelbus.wsclient.metrino.GetDiagram")
    @WebMethod(action = "http://www.modelbus.org/MetrinoService/getDiagram")
    @ResponseWrapper(localName = "getDiagramResponse", targetNamespace = "http://www.modelbus.org/MetrinoService/", className = "org.sonar.plugins.modelbus.wsclient.metrino.GetDiagramResponse")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2012-12-16T21:29:31+01:00")
    public byte[] getDiagram(
        @WebParam(name = "model", targetNamespace = "http://www.modelbus.org/MetrinoService/")
        java.lang.String model,
        @WebParam(name = "metricModel", targetNamespace = "http://www.modelbus.org/MetrinoService/")
        java.lang.String metricModel,
        @WebParam(name = "measurand", targetNamespace = "http://www.modelbus.org/MetrinoService/")
        java.lang.String measurand,
        @WebParam(name = "timeChecked", targetNamespace = "http://www.modelbus.org/MetrinoService/")
        long timeChecked
    );

    @RequestWrapper(localName = "checkModel", targetNamespace = "http://www.modelbus.org/MetrinoService/", className = "org.sonar.plugins.modelbus.wsclient.metrino.CheckModel")
    @WebMethod(action = "http://www.modelbus.org/MetrinoService/checkModel")
    @ResponseWrapper(localName = "checkModelResponse", targetNamespace = "http://www.modelbus.org/MetrinoService/", className = "org.sonar.plugins.modelbus.wsclient.metrino.CheckModelResponse")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2012-12-16T21:29:31+01:00")
    public void checkModel(
        @WebParam(name = "model", targetNamespace = "http://www.modelbus.org/MetrinoService/")
        java.lang.String model,
        @WebParam(name = "metricModel", targetNamespace = "http://www.modelbus.org/MetrinoService/")
        java.lang.String metricModel
    );
}