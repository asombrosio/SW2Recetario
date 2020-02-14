/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarXMLConXSD;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.Document;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;

/**
 *
 * @author DarVVolf
 */
public class validarXMLConXSD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        System.out.println("file.xml es valido con file.xsd? "+validateXMLSchema("./files/file.xsd", "./files/file.xml"));
    
      }
    
    public static boolean validateXMLSchema(String xsdPath, String xmlPath) {
        
     
        try { 
            SchemaFactory factory =
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = (Validator) schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
       
            //System.out.println("Exception: "+e.getMessage());
        } catch (SAXException e) {
                        Logger.getLogger(validarXMLConXSD.class.getName()).log(Level.SEVERE, null, e);

            System.out.println("Exception: "+e.getMessage());
            return false;
        } catch (IOException ex) {
            Logger.getLogger(validarXMLConXSD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*catch (JAXBException e) {
            System.out.println("Exception: "+e.getMessage());
            return false;
        }*/
        return true;
          
    }
    
}

