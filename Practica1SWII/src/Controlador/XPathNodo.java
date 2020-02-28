/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 *
 * @author darth
 */


public class XPathNodo {
    
    File xmlFile = new File("./files/xml/Recetario.xml");
    
   
        public void XpathRecetas () {
            
            //Mostrar todos las recetas
            String expressionXPath = "///recetas";
            try {
                //Carga del documento xml
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse(xmlFile);
                
                // Preparación de xpath
                XPath xpath = XPathFactory.newInstance().newXPath();
                
                //Consultas
                NodeList nodos = (NodeList) xpath.evaluate(expressionXPath, doc, XPathConstants.NODESET);
                
                
                //Imprime solo categoria de recetas resultantes
                for (int i=0;i<nodos.getLength();i++){
                    System.out.println(nodos.item(i).getNodeName()+" : " +
                        nodos.item(i).getAttributes().getNamedItem("nombre"));
                }
            } catch (ParserConfigurationException ex) {
            Logger.getLogger(XPathNodo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
            Logger.getLogger(XPathNodo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(XPathNodo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (XPathExpressionException ex) {
            Logger.getLogger(XPathNodo.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }
        
        public void XpathPrecios () {
            

            //Mostrar todos los nombres
            String expressionXPath = "//ingredienete";

          try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);

            XPath xpath = XPathFactory.newInstance().newXPath();

            NodeList nodos = (NodeList) xpath.evaluate(expressionXPath, doc, XPathConstants.NODESET);
            //Imprime solo categoria de libros resultado
            for (int i = 0; i < nodos.getLength(); i++) {
                System.out.println(
                         mostrarNodo(nodos.item(i)));

            }
            } catch (ParserConfigurationException ex) {
            Logger.getLogger(XPathNodo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
            Logger.getLogger(XPathNodo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(XPathNodo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (XPathExpressionException ex) {
            Logger.getLogger(XPathNodo.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }
        
        public void XpathPrecioMenor15 () {
            
            //Mostrar todas las recetas cuyo precio es menor que 15
            String expressionXPath = "/Recetario/receta[precio < 15.0]";
            try {
                //Carga del documento xml
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse(xmlFile);
                
                // Preparación de xpath
                XPath xpath = XPathFactory.newInstance().newXPath();
                
                //Consultas
                NodeList nodos = (NodeList) xpath.evaluate(expressionXPath, doc, XPathConstants.NODESET);
                
                
                //Imprime solo categoria de recetas resultantes
                for (int i=0;i<nodos.getLength();i++){
                    System.out.println(nodos.item(i).getNodeName()+" : " +
                        nodos.item(i).getAttributes().getNamedItem("nombre"));
                }
            } catch (ParserConfigurationException ex) {
            Logger.getLogger(XPathNodo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
            Logger.getLogger(XPathNodo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(XPathNodo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (XPathExpressionException ex) {
            Logger.getLogger(XPathNodo.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }
        
        public void XpathMixto () {
            
            //Mostrar las recetas con dificultad menor que medio y precio mayor que 10
            String expressionXPath = "/Recetario/receta[ dificultad < 2 and precio > 10]";
            try {
                //Carga del documento xml
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse(xmlFile);
                
                // Preparación de xpath
                XPath xpath = XPathFactory.newInstance().newXPath();
                
                //Consultas
                NodeList nodos = (NodeList) xpath.evaluate(expressionXPath, doc, XPathConstants.NODESET);
                
                
                //Imprime solo categoria de recetas resultantes
                for (int i=0;i<nodos.getLength();i++){
                    System.out.println(nodos.item(i).getNodeName()+" : " +
                        nodos.item(i).getAttributes().getNamedItem("nombre"));
                }
            } catch (ParserConfigurationException ex) {
            Logger.getLogger(XPathNodo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
            Logger.getLogger(XPathNodo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(XPathNodo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (XPathExpressionException ex) {
            Logger.getLogger(XPathNodo.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }
        private static String mostrarNodo(Node item) {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            StringWriter sw = new StringWriter();
            StreamResult sR = new StreamResult(sw);
            transformer.transform(new DOMSource(item), sR);
            return sw.toString();
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(XPathNodo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(XPathNodo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    }
  	
		
                
 		

		
        
   


 

