/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteng;

import com.sun.xml.ws.developer.StreamingAttachmentFeature;
import java.net.URL;
import javax.xml.ws.soap.MTOMFeature;

/**
 *
 * @author samgodfrey
 */
public class ClientEng {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080/CryptoServlet/EncEng");
            
            EncEng_Service encenguser = new EncEng_Service(url);
            StreamingAttachmentFeature stf = new StreamingAttachmentFeature(null, true, 4000000L);
            EncEng port = encenguser.getEncEngPort(new MTOMFeature(), stf);
            
            System.out.println(port.encrypt("Hello World", null));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
