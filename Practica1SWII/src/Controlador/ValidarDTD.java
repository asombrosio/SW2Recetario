/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author darth
 */
public class ValidarDTD {
    
   
    
  public  boolean validarXML(String xml){
  File xmlFile = new File(xml); 
        try {
            DocumentBuilderFactory dBF = DocumentBuilderFactory.newInstance();
            dBF.setValidating(true);
            DocumentBuilder builder = dBF.newDocumentBuilder();
            //In this case we are creating a different ErrorHandler, if not we do like the well-formed Checker+
            CustomErrorHandler customErrorHandler = new CustomErrorHandler();

            builder.setErrorHandler(customErrorHandler);
            org.w3c.dom.Document doc = builder.parse(xmlFile);
            if (customErrorHandler.isValid()) {
                System.out.println(xmlFile + " was valid!");
            } else {
                System.out.println(xmlFile + " was not valid!");
            }

        } catch (ParserConfigurationException ex) {
            System.out.println(xmlFile + " error while parsing!");
            Logger.getLogger(ValidarDTD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (SAXException ex) {
            System.out.println(xmlFile + " was not well-formed!");
            Logger.getLogger(ValidarDTD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            System.out.println(xmlFile + " was not accesible!");
            Logger.getLogger(ValidarDTD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
  }

