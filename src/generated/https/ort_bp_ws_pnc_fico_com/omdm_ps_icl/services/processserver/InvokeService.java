package https.ort_bp_ws_pnc_fico_com.omdm_ps_icl.services.processserver;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-12-21T11:18:08.142-05:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "InvokeService", 
                  wsdlLocation = "file:/C:/Users/nareshrajaram/workspace/omdmclient/src/main/resources/omdm.wsdl",
                  targetNamespace = "https://ort-bp.ws.pnc.fico.com/OMDM_PS_ICL/services/ProcessServer") 
public class InvokeService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("https://ort-bp.ws.pnc.fico.com/OMDM_PS_ICL/services/ProcessServer", "InvokeService");
    public final static QName ProcessServer = new QName("https://ort-bp.ws.pnc.fico.com/OMDM_PS_ICL/services/ProcessServer", "ProcessServer");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/nareshrajaram/workspace/omdmclient/src/main/resources/omdm.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(InvokeService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/nareshrajaram/workspace/omdmclient/src/main/resources/omdm.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public InvokeService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public InvokeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InvokeService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public InvokeService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public InvokeService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public InvokeService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns Invoke
     */
    @WebEndpoint(name = "ProcessServer")
    public Invoke getProcessServer() {
        return super.getPort(ProcessServer, Invoke.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Invoke
     */
    @WebEndpoint(name = "ProcessServer")
    public Invoke getProcessServer(WebServiceFeature... features) {
        return super.getPort(ProcessServer, Invoke.class, features);
    }

}
