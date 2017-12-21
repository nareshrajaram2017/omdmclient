
package https.ort_bp_ws_pnc_fico_com.omdm_ps_icl.services.processserver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.ort_bp_ws_pnc_fico_com.omdm_ps_icl.services.processserver package. 
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

    private final static QName _ProcessRequestReturn_QNAME = new QName("https://ort-bp.ws.pnc.fico.com/OMDM_PS_ICL/services/ProcessServer", "processRequestReturn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.ort_bp_ws_pnc_fico_com.omdm_ps_icl.services.processserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://ort-bp.ws.pnc.fico.com/OMDM_PS_ICL/services/ProcessServer", name = "processRequestReturn")
    public JAXBElement<String> createProcessRequestReturn(String value) {
        return new JAXBElement<String>(_ProcessRequestReturn_QNAME, String.class, null, value);
    }

}
