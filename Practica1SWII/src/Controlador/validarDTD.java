/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.Document;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import jdk.internal.org.xml.sax.ErrorHandler;
import jdk.internal.org.xml.sax.InputSource;
import jdk.internal.org.xml.sax.XMLReader;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 *
 * @author darth
 */
public class validarDTD {
    
    private validarDTD(){}
    // validatar usando SAX (DTD esta definido en el XML)
  public static boolean validarXML(String xml) 
    throws ParserConfigurationException, IOException, jdk.internal.org.xml.sax.SAXException
  {
    try {
      
      SAXParserFactory factory = SAXParserFactory.newInstance();
      factory.setValidating(true);
      factory.setNamespaceAware(true);

      SAXParser parser = factory.newSAXParser();

      XMLReader reader = (XMLReader) parser.getXMLReader();
      reader.setErrorHandler(
          new ErrorHandler() {
            public void warning(SAXParseException e) throws SAXException {
              System.out.println("WARNING : " + e.getMessage()); // do nothing
            }

            public void error(SAXParseException e) throws SAXException {
              System.out.println("ERROR : " + e.getMessage());
              throw e;
            }

            public void fatalError(SAXParseException e) throws SAXException {
              System.out.println("FATAL : " + e.getMessage());
              throw e;
            }

          @Override
          public void warning(jdk.internal.org.xml.sax.SAXParseException saxpe) throws jdk.internal.org.xml.sax.SAXException {
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }

          @Override
          public void error(jdk.internal.org.xml.sax.SAXParseException saxpe) throws jdk.internal.org.xml.sax.SAXException {
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }

          @Override
          public void fatalError(jdk.internal.org.xml.sax.SAXParseException saxpe) throws jdk.internal.org.xml.sax.SAXException {
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
          }
          );
      reader.parse(new InputSource( xml ));
      return true;
    }
    catch (ParserConfigurationException pce) {
      throw pce;
    } 
    catch (IOException io) {
      throw io;
    }
    catch (SAXException se){
      return false;
    }
 }
}
