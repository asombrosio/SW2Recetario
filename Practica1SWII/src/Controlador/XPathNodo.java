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
            String expressionXPath = "//recetas";
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
            
            //Mostrar todos los precios
            String expressionXPath = "//precio";
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
        
    }
  	
		
                
 		

		
        
   


 

