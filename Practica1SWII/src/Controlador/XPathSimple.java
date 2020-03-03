
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
import org.xml.sax.SAXException;

public class XPathSimple {
    
    public void XpathSimpleNumeroRecetas (String fichero) {
        
        File xmlFile = new File("./files/xml/"+fichero+".xml");
        
        String expressionXPath = "count(//Recetario/recetas/recetas)";
        
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);
            XPath xpath = XPathFactory.newInstance().newXPath();
            //Evaluate expression
            Double resultado = (Double) xpath.evaluate(expressionXPath, doc, XPathConstants.NUMBER);
            System.out.println("El  numero total de recetas es : " + resultado);
        } catch (SAXException ex) {
            Logger.getLogger(XPathSimple.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XPathSimple.class.getName()).log(Level.SEVERE, null, ex);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(XPathSimple.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XPathSimple.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void XpathSimpleTotalRecetasPrecioMenor (String fichero) {
        
        File xmlFile = new File("./files/xml/"+fichero+".xml");
        
        String expressionXPath = "count(//Recetario/recetas/recetas[precio < 15.0])";
        
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);
            XPath xpath = XPathFactory.newInstance().newXPath();
            Double resultado = (Double) xpath.evaluate(expressionXPath, doc, XPathConstants.NUMBER);
            System.out.println("El  numero total de recetas con menor precio a 15 euros es : " + resultado);
        } catch (SAXException ex) {
            Logger.getLogger(XPathSimple.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XPathSimple.class.getName()).log(Level.SEVERE, null, ex);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(XPathSimple.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XPathSimple.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
