/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EEstubs;

import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.ws.RequestWrapper;

/**
 *
 * @author samgodfrey
 */
public interface EncEng {
    /**
     * 
     * @param fileName
     * @param inputdatahandler
     * @return fileName
     *      parrots the file name that was input
    **/
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "encrypt", targetNamespace = "http://localhost:8080/CryptoServlet", className = "EEstubs.Encrypt")
    public String encrypt(
        @WebParam(name = "inputdatahandler", targetNamespace = "")
        DataHandler inputdatahandler,
        @WebParam(name = "fileName", targetNamespace = "")
        String fileName)
    ;
    
}
