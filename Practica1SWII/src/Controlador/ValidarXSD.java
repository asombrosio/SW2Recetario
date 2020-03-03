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
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;

/**
 *
 * @author david
 */
public class ValidarXSD {
    
    
   public boolean validarXSD(String xsdPath, String xmlPath){
   
        try {
            SchemaFactory factory
                    = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = (Validator) schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));

        } catch (SAXException ex) {
            System.err.println("No es valido");
            return false;
        } catch (IOException ex) {
          System.err.println("No esta ese fichero");
            return false;
        }
        return true;
    }

}
