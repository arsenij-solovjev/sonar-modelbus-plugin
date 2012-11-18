
package org.sonar.plugins.modelbus.wsclient.repository;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.java.dev.jaxb.array.StringArray;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.modelbus.repository package. 
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

    private final static QName _RepositoryAuthentifcationException_QNAME = new QName("http://www.modelbus.org/Repository/", "RepositoryAuthentifcationException");
    private final static QName _IncludeMergedRevisions_QNAME = new QName("http://www.modelbus.org/Repository/", "includeMergedRevisions");
    private final static QName _InvalidValueException_QNAME = new QName("http://www.modelbus.org/Repository/", "InvalidValueException");
    private final static QName _LockedException_QNAME = new QName("http://www.modelbus.org/Repository/", "LockedException");
    private final static QName _SrcPaths_QNAME = new QName("http://www.modelbus.org/Repository/", "srcPaths");
    private final static QName _RevisionProperties_QNAME = new QName("http://www.modelbus.org/Repository/", "revisionProperties");
    private final static QName _ServiceStatus_QNAME = new QName("http://www.modelbus.org/Repository/", "serviceStatus");
    private final static QName _Session_QNAME = new QName("http://www.modelbus.org/Repository/", "session");
    private final static QName _IncomingReferencesInfos_QNAME = new QName("http://www.modelbus.org/Repository/", "incomingReferencesInfos");
    private final static QName _FileUri_QNAME = new QName("http://www.modelbus.org/Repository/", "fileUri");
    private final static QName _Uri_QNAME = new QName("http://www.modelbus.org/Repository/", "uri");
    private final static QName _Properties_QNAME = new QName("http://www.modelbus.org/Repository/", "properties");
    private final static QName _TargetPaths_QNAME = new QName("http://www.modelbus.org/Repository/", "targetPaths");
    private final static QName _Limit_QNAME = new QName("http://www.modelbus.org/Repository/", "limit");
    private final static QName _GetStatus_QNAME = new QName("http://www.modelbus.org/Repository/", "getStatus");
    private final static QName _InitialModelContent_QNAME = new QName("http://www.modelbus.org/Repository/", "initialModelContent");
    private final static QName _NonExistingResourceException_QNAME = new QName("http://www.modelbus.org/Repository/", "NonExistingResourceException");
    private final static QName _DestPath_QNAME = new QName("http://www.modelbus.org/Repository/", "destPath");
    private final static QName _FragmentFileLocation_QNAME = new QName("http://www.modelbus.org/Repository/", "fragmentFileLocation");
    private final static QName _Username_QNAME = new QName("http://www.modelbus.org/Repository/", "username");
    private final static QName _Revision_QNAME = new QName("http://www.modelbus.org/Repository/", "revision");
    private final static QName _InvalidServiceDescriptionException_QNAME = new QName("http://www.modelbus.org/Repository/", "InvalidServiceDescriptionException");
    private final static QName _StartupDate_QNAME = new QName("http://www.modelbus.org/Repository/", "startupDate");
    private final static QName _Password_QNAME = new QName("http://www.modelbus.org/Repository/", "password");
    private final static QName _MetamodelUri_QNAME = new QName("http://www.modelbus.org/Repository/", "metamodelUri");
    private final static QName _FailWhenDstExists_QNAME = new QName("http://www.modelbus.org/Repository/", "failWhenDstExists");
    private final static QName _Checksum_QNAME = new QName("http://www.modelbus.org/Repository/", "checksum");
    private final static QName _SecureLocation_QNAME = new QName("http://www.modelbus.org/Repository/", "SecureLocation");
    private final static QName _ChangedPath_QNAME = new QName("http://www.modelbus.org/Repository/", "changedPath");
    private final static QName _LogEntries_QNAME = new QName("http://www.modelbus.org/Repository/", "logEntries");
    private final static QName _Location_QNAME = new QName("http://www.modelbus.org/Repository/", "location");
    private final static QName _LockInfos_QNAME = new QName("http://www.modelbus.org/Repository/", "lockInfos");
    private final static QName _Timeout_QNAME = new QName("http://www.modelbus.org/Repository/", "timeout");
    private final static QName _DeletionPaths_QNAME = new QName("http://www.modelbus.org/Repository/", "deletionPaths");
    private final static QName _Successful_QNAME = new QName("http://www.modelbus.org/Repository/", "successful");
    private final static QName _NodeKind_QNAME = new QName("http://www.modelbus.org/Repository/", "nodeKind");
    private final static QName _Entry_QNAME = new QName("http://www.modelbus.org/Repository/", "entry");
    private final static QName _InvalidRevisionException_QNAME = new QName("http://www.modelbus.org/Repository/", "InvalidRevisionException");
    private final static QName _StartRevision_QNAME = new QName("http://www.modelbus.org/Repository/", "startRevision");
    private final static QName _IsMove_QNAME = new QName("http://www.modelbus.org/Repository/", "isMove");
    private final static QName _IncludeCommitMessages_QNAME = new QName("http://www.modelbus.org/Repository/", "includeCommitMessages");
    private final static QName _RepositoryAuthentificationException_QNAME = new QName("http://www.modelbus.org/Repository/", "RepositoryAuthentificationException");
    private final static QName _ChangeModelContent_QNAME = new QName("http://www.modelbus.org/Repository/", "changeModelContent");
    private final static QName _CheckInFileMap_QNAME = new QName("http://www.modelbus.org/Repository/", "checkInFileMap");
    private final static QName _LogMessage_QNAME = new QName("http://www.modelbus.org/Repository/", "logMessage");
    private final static QName _ConstraintViolationException_QNAME = new QName("http://www.modelbus.org/Repository/", "ConstraintViolationException");
    private final static QName _CreateFileMap_QNAME = new QName("http://www.modelbus.org/Repository/", "createFileMap");
    private final static QName _FolderPaths_QNAME = new QName("http://www.modelbus.org/Repository/", "folderPaths");
    private final static QName _ModelUri_QNAME = new QName("http://www.modelbus.org/Repository/", "modelUri");
    private final static QName _Entries_QNAME = new QName("http://www.modelbus.org/Repository/", "entries");
    private final static QName _StrictNode_QNAME = new QName("http://www.modelbus.org/Repository/", "strictNode");
    private final static QName _UnresolvedReferencesException_QNAME = new QName("http://www.modelbus.org/Repository/", "UnresolvedReferencesException");
    private final static QName _EnableDependencies_QNAME = new QName("http://www.modelbus.org/Repository/", "enableDependencies");
    private final static QName _SessionID_QNAME = new QName("http://www.modelbus.org/Repository/", "sessionID");
    private final static QName _MessageID_QNAME = new QName("http://www.modelbus.org/Repository/", "messageID");
    private final static QName _FileContent_QNAME = new QName("http://www.modelbus.org/Repository/", "fileContent");
    private final static QName _DirUri_QNAME = new QName("http://www.modelbus.org/Repository/", "dirUri");
    private final static QName _RepositoryRuntimeException_QNAME = new QName("http://www.modelbus.org/Repository/", "RepositoryRuntimeException");
    private final static QName _Model_QNAME = new QName("http://www.modelbus.org/Repository/", "model");
    private final static QName _IncludeServices_QNAME = new QName("http://www.modelbus.org/Repository/", "includeServices");
    private final static QName _UrlPrefix_QNAME = new QName("http://www.modelbus.org/Repository/", "urlPrefix");
    private final static QName _EndRevision_QNAME = new QName("http://www.modelbus.org/Repository/", "endRevision");
    private final static QName _InitialFileContent_QNAME = new QName("http://www.modelbus.org/Repository/", "initialFileContent");
    private final static QName _Result_QNAME = new QName("http://www.modelbus.org/Repository/", "result");
    private final static QName _FragmentUri_QNAME = new QName("http://www.modelbus.org/Repository/", "fragmentUri");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.modelbus.repository
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RepositoryLogEntryArray }
     * 
     */
    public RepositoryLogEntryArray createRepositoryLogEntryArray() {
        return new RepositoryLogEntryArray();
    }

    /**
     * Create an instance of {@link LockResponse }
     * 
     */
    public LockResponse createLockResponse() {
        return new LockResponse();
    }

    /**
     * Create an instance of {@link Uncontrol }
     * 
     */
    public Uncontrol createUncontrol() {
        return new Uncontrol();
    }

    /**
     * Create an instance of {@link Session }
     * 
     */
    public Session createSession() {
        return new Session();
    }

    /**
     * Create an instance of {@link GetLocksResponse }
     * 
     */
    public GetLocksResponse createGetLocksResponse() {
        return new GetLocksResponse();
    }

    /**
     * Create an instance of {@link LockInfo }
     * 
     */
    public LockInfo createLockInfo() {
        return new LockInfo();
    }

    /**
     * Create an instance of {@link RepositoryException }
     * 
     */
    public RepositoryException createRepositoryException() {
        return new RepositoryException();
    }

    /**
     * Create an instance of {@link Info }
     * 
     */
    public Info createInfo() {
        return new Info();
    }

    /**
     * Create an instance of {@link ControlResponse }
     * 
     */
    public ControlResponse createControlResponse() {
        return new ControlResponse();
    }

    /**
     * Create an instance of {@link CommitChangeModel }
     * 
     */
    public CommitChangeModel createCommitChangeModel() {
        return new CommitChangeModel();
    }

    /**
     * Create an instance of {@link UnlockResponse }
     * 
     */
    public UnlockResponse createUnlockResponse() {
        return new UnlockResponse();
    }

    /**
     * Create an instance of {@link CommitChangeModelResponse }
     * 
     */
    public CommitChangeModelResponse createCommitChangeModelResponse() {
        return new CommitChangeModelResponse();
    }

    /**
     * Create an instance of {@link Copy }
     * 
     */
    public Copy createCopy() {
        return new Copy();
    }

    /**
     * Create an instance of {@link Unlock }
     * 
     */
    public Unlock createUnlock() {
        return new Unlock();
    }

    /**
     * Create an instance of {@link GetDir }
     * 
     */
    public GetDir createGetDir() {
        return new GetDir();
    }

    /**
     * Create an instance of {@link IncomingReferencesInfoArray }
     * 
     */
    public IncomingReferencesInfoArray createIncomingReferencesInfoArray() {
        return new IncomingReferencesInfoArray();
    }

    /**
     * Create an instance of {@link ServiceStatusArray }
     * 
     */
    public ServiceStatusArray createServiceStatusArray() {
        return new ServiceStatusArray();
    }

    /**
     * Create an instance of {@link CheckOutFile }
     * 
     */
    public CheckOutFile createCheckOutFile() {
        return new CheckOutFile();
    }

    /**
     * Create an instance of {@link CreateModelwithContentResponse }
     * 
     */
    public CreateModelwithContentResponse createCreateModelwithContentResponse() {
        return new CreateModelwithContentResponse();
    }

    /**
     * Create an instance of {@link CheckInFileResponse }
     * 
     */
    public CheckInFileResponse createCheckInFileResponse() {
        return new CheckInFileResponse();
    }

    /**
     * Create an instance of {@link UncontrolResponse }
     * 
     */
    public UncontrolResponse createUncontrolResponse() {
        return new UncontrolResponse();
    }

    /**
     * Create an instance of {@link CreateModelwithContent }
     * 
     */
    public CreateModelwithContent createCreateModelwithContent() {
        return new CreateModelwithContent();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link RepositoryDirEntryArray }
     * 
     */
    public RepositoryDirEntryArray createRepositoryDirEntryArray() {
        return new RepositoryDirEntryArray();
    }

    /**
     * Create an instance of {@link CheckPathResponse }
     * 
     */
    public CheckPathResponse createCheckPathResponse() {
        return new CheckPathResponse();
    }

    /**
     * Create an instance of {@link UnpublishService }
     * 
     */
    public UnpublishService createUnpublishService() {
        return new UnpublishService();
    }

    /**
     * Create an instance of {@link ServiceProperties }
     * 
     */
    public ServiceProperties createServiceProperties() {
        return new ServiceProperties();
    }

    /**
     * Create an instance of {@link InfoResponse }
     * 
     */
    public InfoResponse createInfoResponse() {
        return new InfoResponse();
    }

    /**
     * Create an instance of {@link RepositoryDirEntry }
     * 
     */
    public RepositoryDirEntry createRepositoryDirEntry() {
        return new RepositoryDirEntry();
    }

    /**
     * Create an instance of {@link PathFileContentMapEntryArray }
     * 
     */
    public PathFileContentMapEntryArray createPathFileContentMapEntryArray() {
        return new PathFileContentMapEntryArray();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link ServiceStatus }
     * 
     */
    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

    /**
     * Create an instance of {@link CheckInModelResponse }
     * 
     */
    public CheckInModelResponse createCheckInModelResponse() {
        return new CheckInModelResponse();
    }

    /**
     * Create an instance of {@link UnpublishServiceResponse }
     * 
     */
    public UnpublishServiceResponse createUnpublishServiceResponse() {
        return new UnpublishServiceResponse();
    }

    /**
     * Create an instance of {@link Exists }
     * 
     */
    public Exists createExists() {
        return new Exists();
    }

    /**
     * Create an instance of {@link LockInfoArray }
     * 
     */
    public LockInfoArray createLockInfoArray() {
        return new LockInfoArray();
    }

    /**
     * Create an instance of {@link CreateFileResponse }
     * 
     */
    public CreateFileResponse createCreateFileResponse() {
        return new CreateFileResponse();
    }

    /**
     * Create an instance of {@link CreateFile }
     * 
     */
    public CreateFile createCreateFile() {
        return new CreateFile();
    }

    /**
     * Create an instance of {@link ExistsResponse }
     * 
     */
    public ExistsResponse createExistsResponse() {
        return new ExistsResponse();
    }

    /**
     * Create an instance of {@link CopyResponse }
     * 
     */
    public CopyResponse createCopyResponse() {
        return new CopyResponse();
    }

    /**
     * Create an instance of {@link Commit }
     * 
     */
    public Commit createCommit() {
        return new Commit();
    }

    /**
     * Create an instance of {@link PathFileContentMapEntry }
     * 
     */
    public PathFileContentMapEntry createPathFileContentMapEntry() {
        return new PathFileContentMapEntry();
    }

    /**
     * Create an instance of {@link GetIncomingReferencesResponse }
     * 
     */
    public GetIncomingReferencesResponse createGetIncomingReferencesResponse() {
        return new GetIncomingReferencesResponse();
    }

    /**
     * Create an instance of {@link IncomingReferencesInfo }
     * 
     */
    public IncomingReferencesInfo createIncomingReferencesInfo() {
        return new IncomingReferencesInfo();
    }

    /**
     * Create an instance of {@link CreateModelResponse }
     * 
     */
    public CreateModelResponse createCreateModelResponse() {
        return new CreateModelResponse();
    }

    /**
     * Create an instance of {@link CreateDirResponse }
     * 
     */
    public CreateDirResponse createCreateDirResponse() {
        return new CreateDirResponse();
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link Control }
     * 
     */
    public Control createControl() {
        return new Control();
    }

    /**
     * Create an instance of {@link GetLogEntries }
     * 
     */
    public GetLogEntries createGetLogEntries() {
        return new GetLogEntries();
    }

    /**
     * Create an instance of {@link CheckOutModelResponse }
     * 
     */
    public CheckOutModelResponse createCheckOutModelResponse() {
        return new CheckOutModelResponse();
    }

    /**
     * Create an instance of {@link GetIncomingReferences }
     * 
     */
    public GetIncomingReferences createGetIncomingReferences() {
        return new GetIncomingReferences();
    }

    /**
     * Create an instance of {@link CreateModel }
     * 
     */
    public CreateModel createCreateModel() {
        return new CreateModel();
    }

    /**
     * Create an instance of {@link CheckInModel }
     * 
     */
    public CheckInModel createCheckInModel() {
        return new CheckInModel();
    }

    /**
     * Create an instance of {@link PublishServiceResponse }
     * 
     */
    public PublishServiceResponse createPublishServiceResponse() {
        return new PublishServiceResponse();
    }

    /**
     * Create an instance of {@link CreateDir }
     * 
     */
    public CreateDir createCreateDir() {
        return new CreateDir();
    }

    /**
     * Create an instance of {@link GetLocks }
     * 
     */
    public GetLocks createGetLocks() {
        return new GetLocks();
    }

    /**
     * Create an instance of {@link Authenticate }
     * 
     */
    public Authenticate createAuthenticate() {
        return new Authenticate();
    }

    /**
     * Create an instance of {@link CheckOutFileResponse }
     * 
     */
    public CheckOutFileResponse createCheckOutFileResponse() {
        return new CheckOutFileResponse();
    }

    /**
     * Create an instance of {@link GetDirResponse }
     * 
     */
    public GetDirResponse createGetDirResponse() {
        return new GetDirResponse();
    }

    /**
     * Create an instance of {@link CheckInFile }
     * 
     */
    public CheckInFile createCheckInFile() {
        return new CheckInFile();
    }

    /**
     * Create an instance of {@link Lock }
     * 
     */
    public Lock createLock() {
        return new Lock();
    }

    /**
     * Create an instance of {@link PublishService }
     * 
     */
    public PublishService createPublishService() {
        return new PublishService();
    }

    /**
     * Create an instance of {@link CommitResponse }
     * 
     */
    public CommitResponse createCommitResponse() {
        return new CommitResponse();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link CheckPath }
     * 
     */
    public CheckPath createCheckPath() {
        return new CheckPath();
    }

    /**
     * Create an instance of {@link CheckOutModel }
     * 
     */
    public CheckOutModel createCheckOutModel() {
        return new CheckOutModel();
    }

    /**
     * Create an instance of {@link AuthenticateResponse }
     * 
     */
    public AuthenticateResponse createAuthenticateResponse() {
        return new AuthenticateResponse();
    }

    /**
     * Create an instance of {@link GetLogEntriesResponse }
     * 
     */
    public GetLogEntriesResponse createGetLogEntriesResponse() {
        return new GetLogEntriesResponse();
    }

    /**
     * Create an instance of {@link RepositoryLogEntry }
     * 
     */
    public RepositoryLogEntry createRepositoryLogEntry() {
        return new RepositoryLogEntry();
    }

    /**
     * Create an instance of {@link MapEntry }
     * 
     */
    public MapEntry createMapEntry() {
        return new MapEntry();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link Base64Binary }
     * 
     */
    public Base64Binary createBase64Binary() {
        return new Base64Binary();
    }

    /**
     * Create an instance of {@link HexBinary }
     * 
     */
    public HexBinary createHexBinary() {
        return new HexBinary();
    }

    /**
     * Create an instance of {@link RepositoryLogPath }
     * 
     */
    public RepositoryLogPath createRepositoryLogPath() {
        return new RepositoryLogPath();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "RepositoryAuthentifcationException")
    public JAXBElement<RepositoryException> createRepositoryAuthentifcationException(RepositoryException value) {
        return new JAXBElement<RepositoryException>(_RepositoryAuthentifcationException_QNAME, RepositoryException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "includeMergedRevisions")
    public JAXBElement<Boolean> createIncludeMergedRevisions(Boolean value) {
        return new JAXBElement<Boolean>(_IncludeMergedRevisions_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "InvalidValueException")
    public JAXBElement<RepositoryException> createInvalidValueException(RepositoryException value) {
        return new JAXBElement<RepositoryException>(_InvalidValueException_QNAME, RepositoryException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "LockedException")
    public JAXBElement<RepositoryException> createLockedException(RepositoryException value) {
        return new JAXBElement<RepositoryException>(_LockedException_QNAME, RepositoryException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "srcPaths")
    public JAXBElement<StringArray> createSrcPaths(StringArray value) {
        return new JAXBElement<StringArray>(_SrcPaths_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "revisionProperties")
    public JAXBElement<StringArray> createRevisionProperties(StringArray value) {
        return new JAXBElement<StringArray>(_RevisionProperties_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceStatusArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "serviceStatus")
    public JAXBElement<ServiceStatusArray> createServiceStatus(ServiceStatusArray value) {
        return new JAXBElement<ServiceStatusArray>(_ServiceStatus_QNAME, ServiceStatusArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Session }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "session")
    public JAXBElement<Session> createSession(Session value) {
        return new JAXBElement<Session>(_Session_QNAME, Session.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncomingReferencesInfoArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "incomingReferencesInfos")
    public JAXBElement<IncomingReferencesInfoArray> createIncomingReferencesInfos(IncomingReferencesInfoArray value) {
        return new JAXBElement<IncomingReferencesInfoArray>(_IncomingReferencesInfos_QNAME, IncomingReferencesInfoArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "fileUri")
    public JAXBElement<String> createFileUri(String value) {
        return new JAXBElement<String>(_FileUri_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "uri")
    public JAXBElement<String> createUri(String value) {
        return new JAXBElement<String>(_Uri_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "properties")
    public JAXBElement<ServiceProperties> createProperties(ServiceProperties value) {
        return new JAXBElement<ServiceProperties>(_Properties_QNAME, ServiceProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "targetPaths")
    public JAXBElement<StringArray> createTargetPaths(StringArray value) {
        return new JAXBElement<StringArray>(_TargetPaths_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "limit")
    public JAXBElement<Long> createLimit(Long value) {
        return new JAXBElement<Long>(_Limit_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "getStatus")
    public JAXBElement<GetStatus> createGetStatus(GetStatus value) {
        return new JAXBElement<GetStatus>(_GetStatus_QNAME, GetStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "initialModelContent")
    public JAXBElement<byte[]> createInitialModelContent(byte[] value) {
        return new JAXBElement<byte[]>(_InitialModelContent_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "NonExistingResourceException")
    public JAXBElement<RepositoryException> createNonExistingResourceException(RepositoryException value) {
        return new JAXBElement<RepositoryException>(_NonExistingResourceException_QNAME, RepositoryException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "destPath")
    public JAXBElement<String> createDestPath(String value) {
        return new JAXBElement<String>(_DestPath_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "fragmentFileLocation")
    public JAXBElement<String> createFragmentFileLocation(String value) {
        return new JAXBElement<String>(_FragmentFileLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "username")
    public JAXBElement<String> createUsername(String value) {
        return new JAXBElement<String>(_Username_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "revision")
    public JAXBElement<Long> createRevision(Long value) {
        return new JAXBElement<Long>(_Revision_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "InvalidServiceDescriptionException")
    public JAXBElement<RepositoryException> createInvalidServiceDescriptionException(RepositoryException value) {
        return new JAXBElement<RepositoryException>(_InvalidServiceDescriptionException_QNAME, RepositoryException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "startupDate")
    public JAXBElement<Object> createStartupDate(Object value) {
        return new JAXBElement<Object>(_StartupDate_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "metamodelUri")
    public JAXBElement<String> createMetamodelUri(String value) {
        return new JAXBElement<String>(_MetamodelUri_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "failWhenDstExists")
    public JAXBElement<Boolean> createFailWhenDstExists(Boolean value) {
        return new JAXBElement<Boolean>(_FailWhenDstExists_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "checksum")
    public JAXBElement<String> createChecksum(String value) {
        return new JAXBElement<String>(_Checksum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "SecureLocation")
    public JAXBElement<String> createSecureLocation(String value) {
        return new JAXBElement<String>(_SecureLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "changedPath")
    public JAXBElement<Boolean> createChangedPath(Boolean value) {
        return new JAXBElement<Boolean>(_ChangedPath_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryLogEntryArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "logEntries")
    public JAXBElement<RepositoryLogEntryArray> createLogEntries(RepositoryLogEntryArray value) {
        return new JAXBElement<RepositoryLogEntryArray>(_LogEntries_QNAME, RepositoryLogEntryArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "location")
    public JAXBElement<String> createLocation(String value) {
        return new JAXBElement<String>(_Location_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockInfoArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "lockInfos")
    public JAXBElement<LockInfoArray> createLockInfos(LockInfoArray value) {
        return new JAXBElement<LockInfoArray>(_LockInfos_QNAME, LockInfoArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "timeout")
    public JAXBElement<Object> createTimeout(Object value) {
        return new JAXBElement<Object>(_Timeout_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "deletionPaths")
    public JAXBElement<StringArray> createDeletionPaths(StringArray value) {
        return new JAXBElement<StringArray>(_DeletionPaths_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "successful")
    public JAXBElement<Boolean> createSuccessful(Boolean value) {
        return new JAXBElement<Boolean>(_Successful_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryNodeKind }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "nodeKind")
    public JAXBElement<RepositoryNodeKind> createNodeKind(RepositoryNodeKind value) {
        return new JAXBElement<RepositoryNodeKind>(_NodeKind_QNAME, RepositoryNodeKind.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryDirEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "entry")
    public JAXBElement<RepositoryDirEntry> createEntry(RepositoryDirEntry value) {
        return new JAXBElement<RepositoryDirEntry>(_Entry_QNAME, RepositoryDirEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "InvalidRevisionException")
    public JAXBElement<RepositoryException> createInvalidRevisionException(RepositoryException value) {
        return new JAXBElement<RepositoryException>(_InvalidRevisionException_QNAME, RepositoryException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "startRevision")
    public JAXBElement<Long> createStartRevision(Long value) {
        return new JAXBElement<Long>(_StartRevision_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "isMove")
    public JAXBElement<Boolean> createIsMove(Boolean value) {
        return new JAXBElement<Boolean>(_IsMove_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "includeCommitMessages")
    public JAXBElement<Boolean> createIncludeCommitMessages(Boolean value) {
        return new JAXBElement<Boolean>(_IncludeCommitMessages_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "RepositoryAuthentificationException")
    public JAXBElement<RepositoryException> createRepositoryAuthentificationException(RepositoryException value) {
        return new JAXBElement<RepositoryException>(_RepositoryAuthentificationException_QNAME, RepositoryException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "changeModelContent")
    public JAXBElement<byte[]> createChangeModelContent(byte[] value) {
        return new JAXBElement<byte[]>(_ChangeModelContent_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PathFileContentMapEntryArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "checkInFileMap")
    public JAXBElement<PathFileContentMapEntryArray> createCheckInFileMap(PathFileContentMapEntryArray value) {
        return new JAXBElement<PathFileContentMapEntryArray>(_CheckInFileMap_QNAME, PathFileContentMapEntryArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "logMessage")
    public JAXBElement<String> createLogMessage(String value) {
        return new JAXBElement<String>(_LogMessage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "ConstraintViolationException")
    public JAXBElement<RepositoryException> createConstraintViolationException(RepositoryException value) {
        return new JAXBElement<RepositoryException>(_ConstraintViolationException_QNAME, RepositoryException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PathFileContentMapEntryArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "createFileMap")
    public JAXBElement<PathFileContentMapEntryArray> createCreateFileMap(PathFileContentMapEntryArray value) {
        return new JAXBElement<PathFileContentMapEntryArray>(_CreateFileMap_QNAME, PathFileContentMapEntryArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "folderPaths")
    public JAXBElement<StringArray> createFolderPaths(StringArray value) {
        return new JAXBElement<StringArray>(_FolderPaths_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "modelUri")
    public JAXBElement<String> createModelUri(String value) {
        return new JAXBElement<String>(_ModelUri_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryDirEntryArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "entries")
    public JAXBElement<RepositoryDirEntryArray> createEntries(RepositoryDirEntryArray value) {
        return new JAXBElement<RepositoryDirEntryArray>(_Entries_QNAME, RepositoryDirEntryArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "strictNode")
    public JAXBElement<Boolean> createStrictNode(Boolean value) {
        return new JAXBElement<Boolean>(_StrictNode_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "UnresolvedReferencesException")
    public JAXBElement<RepositoryException> createUnresolvedReferencesException(RepositoryException value) {
        return new JAXBElement<RepositoryException>(_UnresolvedReferencesException_QNAME, RepositoryException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "enableDependencies")
    public JAXBElement<Boolean> createEnableDependencies(Boolean value) {
        return new JAXBElement<Boolean>(_EnableDependencies_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "sessionID")
    public JAXBElement<String> createSessionID(String value) {
        return new JAXBElement<String>(_SessionID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "messageID")
    public JAXBElement<String> createMessageID(String value) {
        return new JAXBElement<String>(_MessageID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "fileContent")
    public JAXBElement<byte[]> createFileContent(byte[] value) {
        return new JAXBElement<byte[]>(_FileContent_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "dirUri")
    public JAXBElement<String> createDirUri(String value) {
        return new JAXBElement<String>(_DirUri_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "RepositoryRuntimeException")
    public JAXBElement<RepositoryException> createRepositoryRuntimeException(RepositoryException value) {
        return new JAXBElement<RepositoryException>(_RepositoryRuntimeException_QNAME, RepositoryException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "model")
    public JAXBElement<byte[]> createModel(byte[] value) {
        return new JAXBElement<byte[]>(_Model_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "includeServices")
    public JAXBElement<Boolean> createIncludeServices(Boolean value) {
        return new JAXBElement<Boolean>(_IncludeServices_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "urlPrefix")
    public JAXBElement<String> createUrlPrefix(String value) {
        return new JAXBElement<String>(_UrlPrefix_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "endRevision")
    public JAXBElement<Long> createEndRevision(Long value) {
        return new JAXBElement<Long>(_EndRevision_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "initialFileContent")
    public JAXBElement<byte[]> createInitialFileContent(byte[] value) {
        return new JAXBElement<byte[]>(_InitialFileContent_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "result")
    public JAXBElement<String> createResult(String value) {
        return new JAXBElement<String>(_Result_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modelbus.org/Repository/", name = "fragmentUri")
    public JAXBElement<String> createFragmentUri(String value) {
        return new JAXBElement<String>(_FragmentUri_QNAME, String.class, null, value);
    }

}
