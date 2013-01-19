
package org.sonar.plugins.modelbus.metrinoclient.metrino;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.modelbus.metrinoservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDiagram_QNAME = new QName("http://www.modelbus.org/MetrinoService/", "getDiagram");
    private final static QName _SatisfiesAllConstraintsResponse_QNAME = new QName("http://www.modelbus.org/MetrinoService/", "satisfiesAllConstraintsResponse");
    private final static QName _CheckModelResponse_QNAME = new QName("http://www.modelbus.org/MetrinoService/", "checkModelResponse");
    private final static QName _CheckModel_QNAME = new QName("http://www.modelbus.org/MetrinoService/", "checkModel");
    private final static QName _SatisfiesAllConstraints_QNAME = new QName("http://www.modelbus.org/MetrinoService/", "satisfiesAllConstraints");
    private final static QName _GetDiagramResponse_QNAME = new QName("http://www.modelbus.org/MetrinoService/", "getDiagramResponse");
    private final static QName _GetDiagramMeasurand_QNAME = new QName("http://www.modelbus.org/MetrinoService/", "measurand");
    private final static QName _GetDiagramModel_QNAME = new QName("http://www.modelbus.org/MetrinoService/", "model");
    private final static QName _GetDiagramMetricModel_QNAME = new QName("http://www.modelbus.org/MetrinoService/", "metricModel");
    private final static QName _GetDiagramResponseImageStream_QNAME = new QName("", "imageStream");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.modelbus.metrinoservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckModel }
     * 
     */
    public CheckModel createCheckModel() {
        return new CheckModel();
    }

    /**
     * Create an instance of {@link GetDiagramResponse }
     * 
     */
    public GetDiagramResponse createGetDiagramResponse() {
        return new GetDiagramResponse();
    }

    /**
     * Create an instance of {@link SatisfiesAllConstraints }
     * 
     */
    public SatisfiesAllConstraints createSatisfiesAllConstraints() {
        return new SatisfiesAllConstraints();
    }

    /**
     * Create an instance of {@link GetDiagram }
     * 
     */
    public GetDiagram createGetDiagram() {
        return new GetDiagram();
    }

    /**
     * Create an instance of {@link SatisfiesAllConstraintsResponse }
     * 
     */
    public SatisfiesAllConstraintsResponse createSatisfiesAllConstraintsResponse() {
        return new SatisfiesAllConstraintsResponse();
    }

    /**
     * Create an instance of {@link CheckModelResponse }
     * 
     */
    public CheckModelResponse createCheckModelResponse() {
        return new CheckModelResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDiagram }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/MetrinoService/", name = "getDiagram")
    public JAXBElement<GetDiagram> createGetDiagram(GetDiagram value) {
        return new JAXBElement<GetDiagram>(_GetDiagram_QNAME, GetDiagram.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SatisfiesAllConstraintsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/MetrinoService/", name = "satisfiesAllConstraintsResponse")
    public JAXBElement<SatisfiesAllConstraintsResponse> createSatisfiesAllConstraintsResponse(SatisfiesAllConstraintsResponse value) {
        return new JAXBElement<SatisfiesAllConstraintsResponse>(_SatisfiesAllConstraintsResponse_QNAME, SatisfiesAllConstraintsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckModelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/MetrinoService/", name = "checkModelResponse")
    public JAXBElement<CheckModelResponse> createCheckModelResponse(CheckModelResponse value) {
        return new JAXBElement<CheckModelResponse>(_CheckModelResponse_QNAME, CheckModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/MetrinoService/", name = "checkModel")
    public JAXBElement<CheckModel> createCheckModel(CheckModel value) {
        return new JAXBElement<CheckModel>(_CheckModel_QNAME, CheckModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SatisfiesAllConstraints }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/MetrinoService/", name = "satisfiesAllConstraints")
    public JAXBElement<SatisfiesAllConstraints> createSatisfiesAllConstraints(SatisfiesAllConstraints value) {
        return new JAXBElement<SatisfiesAllConstraints>(_SatisfiesAllConstraints_QNAME, SatisfiesAllConstraints.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDiagramResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/MetrinoService/", name = "getDiagramResponse")
    public JAXBElement<GetDiagramResponse> createGetDiagramResponse(GetDiagramResponse value) {
        return new JAXBElement<GetDiagramResponse>(_GetDiagramResponse_QNAME, GetDiagramResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/MetrinoService/", name = "measurand", scope = GetDiagram.class)
    public JAXBElement<String> createGetDiagramMeasurand(String value) {
        return new JAXBElement<String>(_GetDiagramMeasurand_QNAME, String.class, GetDiagram.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/MetrinoService/", name = "model", scope = GetDiagram.class)
    public JAXBElement<String> createGetDiagramModel(String value) {
        return new JAXBElement<String>(_GetDiagramModel_QNAME, String.class, GetDiagram.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/MetrinoService/", name = "metricModel", scope = GetDiagram.class)
    public JAXBElement<String> createGetDiagramMetricModel(String value) {
        return new JAXBElement<String>(_GetDiagramMetricModel_QNAME, String.class, GetDiagram.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/MetrinoService/", name = "model", scope = CheckModel.class)
    public JAXBElement<String> createCheckModelModel(String value) {
        return new JAXBElement<String>(_GetDiagramModel_QNAME, String.class, CheckModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/MetrinoService/", name = "metricModel", scope = CheckModel.class)
    public JAXBElement<String> createCheckModelMetricModel(String value) {
        return new JAXBElement<String>(_GetDiagramMetricModel_QNAME, String.class, CheckModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/MetrinoService/", name = "model", scope = SatisfiesAllConstraints.class)
    public JAXBElement<String> createSatisfiesAllConstraintsModel(String value) {
        return new JAXBElement<String>(_GetDiagramModel_QNAME, String.class, SatisfiesAllConstraints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/MetrinoService/", name = "metricModel", scope = SatisfiesAllConstraints.class)
    public JAXBElement<String> createSatisfiesAllConstraintsMetricModel(String value) {
        return new JAXBElement<String>(_GetDiagramMetricModel_QNAME, String.class, SatisfiesAllConstraints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "imageStream", scope = GetDiagramResponse.class)
    public JAXBElement<byte[]> createGetDiagramResponseImageStream(byte[] value) {
        return new JAXBElement<byte[]>(_GetDiagramResponseImageStream_QNAME, byte[].class, GetDiagramResponse.class, ((byte[]) value));
    }

}
