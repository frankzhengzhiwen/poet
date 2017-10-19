//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.22 时间 10:30:52 PM CST 
//


package poet.oauth.ws.ebs.pm.changepassword;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the poet.oauth.ws.ebs.pm.changepassword package. 
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

    private final static QName _InputParametersPUSERNAME_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_pm_webservice_pkg/changepassword/", "P_USERNAME");
    private final static QName _InputParametersPOLDPASSWORD_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_pm_webservice_pkg/changepassword/", "P_OLD_PASSWORD");
    private final static QName _InputParametersPNEWPASSWORD_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_pm_webservice_pkg/changepassword/", "P_NEW_PASSWORD");
    private final static QName _OutputParametersXRETURNSTATUS_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_pm_webservice_pkg/changepassword/", "X_RETURN_STATUS");
    private final static QName _OutputParametersXRETURNMESSAGE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_pm_webservice_pkg/changepassword/", "X_RETURN_MESSAGE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: poet.oauth.ws.ebs.pm.changepassword
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InputParameters }
     * 
     */
    public InputParameters createInputParameters() {
        return new InputParameters();
    }

    /**
     * Create an instance of {@link OutputParameters }
     * 
     */
    public OutputParameters createOutputParameters() {
        return new OutputParameters();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_pm_webservice_pkg/changepassword/", name = "P_USERNAME", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersPUSERNAME(String value) {
        return new JAXBElement<String>(_InputParametersPUSERNAME_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_pm_webservice_pkg/changepassword/", name = "P_OLD_PASSWORD", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersPOLDPASSWORD(String value) {
        return new JAXBElement<String>(_InputParametersPOLDPASSWORD_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_pm_webservice_pkg/changepassword/", name = "P_NEW_PASSWORD", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersPNEWPASSWORD(String value) {
        return new JAXBElement<String>(_InputParametersPNEWPASSWORD_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_pm_webservice_pkg/changepassword/", name = "X_RETURN_STATUS", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersXRETURNSTATUS(String value) {
        return new JAXBElement<String>(_OutputParametersXRETURNSTATUS_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_pm_webservice_pkg/changepassword/", name = "X_RETURN_MESSAGE", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersXRETURNMESSAGE(String value) {
        return new JAXBElement<String>(_OutputParametersXRETURNMESSAGE_QNAME, String.class, OutputParameters.class, value);
    }

}
