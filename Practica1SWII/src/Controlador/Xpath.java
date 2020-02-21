/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author darth
 */
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Xpath {
    
    File xmlFile = new File("Recetario.xml");
    
    //Mostrar todos los receta
    String expressionXPath = "//receta";
    
     try {
            //Carga del documento xml
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.parse(xmlFile);
            
            //preparacion de xpath
            XPath xpath = XPathFactory.newInstance().newXPath();
            
            //consultas
            NodeList nodos = (NodeList) xpath.evaluate(expressionXPath,documento,XPathConstants.NODESET);
            //Imprime solo categoria de libros resultado
            for (int i = 0; i < nodos.getLength(); i++) {
                System.out.println(nodos.item(i).getNodeName() + " : " +
                        + nodos.item(i)).getAttributes().getNamedItem("nombre"));

            }

        } catch (SAXException ex) {
            Logger.getLogger(Xpath.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Xpath.class.getName()).log(Level.SEVERE, null, ex);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(Xpath.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Xpath.class.getName()).log(Level.SEVERE, null, ex);
        }
}
