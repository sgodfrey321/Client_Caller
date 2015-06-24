/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EEstubs;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "EncEng", targetNamespace = "http://localhost:8080/CryptoServlet/EncEng", wsdlLocation = "http://localhost:8080/CryptoServlet/EncEng?wsdl")
public class EncEng_Service extends Service {
    
    private final static URL EncEng_WSDL_LOCATION;
    private final static QName EncEng_QNAME = new QName("http://localhost:8080/CryptoServlet/EncEng", "EncEng");

    static {
        URL url = null;
        try{
            url = new URL("http://localhost:8080/CryptoServlet/EncEng?wsdl");
            
        }
        catch(Exception e){
            
        }
        EncEng_WSDL_LOCATION = url;
    }


    public EncEng_Service() {
        super(EncEng_WSDL_LOCATION, EncEng_QNAME);
    }

    public EncEng_Service(WebServiceFeature... features) {
        super(EncEng_WSDL_LOCATION, EncEng_QNAME, features);
    }

    public EncEng_Service(URL wsdlLocation) {
        super(wsdlLocation, EncEng_QNAME);
    }

    public EncEng_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EncEng_QNAME, features);
    }

    public EncEng_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EncEng_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SKEEServlet
     */
    @WebEndpoint(name = "EncEngPort")
    public EncEng getEncEngPort() {
        return super.getPort(new QName("http://localhost:8080/CryptoServlet/EncEng", "EncEngPort"), EncEng.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SKEEServlet
     */
    @WebEndpoint(name = "EncEngPort")
    public EncEng getEncEngPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://localhost:8080/CryptoServlet/EncEng", "EncEngPort"), EncEng.class, features);
    }
   
}
