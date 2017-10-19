package poet.oauth.ws.config;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import poet.oauth.ws.ebs.pm.changepassword.InputParameters;
import poet.oauth.ws.ebs.pm.changepassword.ObjectFactory;
import poet.oauth.ws.ebs.pm.changepassword.OutputParameters;

public class EBSUpdatePasswordWsClient extends WebServiceGatewaySupport {
	
    /**
	 * Creates a new instance of EBSUpdatePasswordWsClient
	 * 
	 */
	public EBSUpdatePasswordWsClient() {
		super();
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(ObjectFactory.class.getPackage().getName());
        this.setMarshaller(marshaller);
        this.setUnmarshaller(marshaller);
	}

	public OutputParameters updatePassword(String username, String oldPassword, String newPassword) {
    	ObjectFactory of = new ObjectFactory();
    	InputParameters request = of.createInputParameters();
        request.setPUSERNAME(of.createInputParametersPUSERNAME(username));
        request.setPOLDPASSWORD(of.createInputParametersPUSERNAME(oldPassword));
        request.setPNEWPASSWORD(of.createInputParametersPUSERNAME(newPassword));
        OutputParameters response = (OutputParameters) getWebServiceTemplate().marshalSendAndReceive(
            "http://ebstest.poet:8008/webservices/SOAProvider/plsql/cux_pm_webservice_pkg/APPS_CUX_PM_WEBSERVICE_PKG_CHANGEPASSWORD.xsd", request);
        return response;
    }
}