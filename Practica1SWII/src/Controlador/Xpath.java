///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Controlador;
//
///**
// *
// * @author darth
// */
//import java.io.File;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.xpath.XPath;
//import javax.xml.xpath.XPathConstants;
//import javax.xml.xpath.XPathFactory;
//
//import org.w3c.dom.Document;
//import org.w3c.dom.NodeList;
//
//public class Xpath {
//    // La expresion xpath de busqueda
//    String xPathExpression = "//satelite[@nombre='Luna']";
//		
//    // Carga del documento xml
//    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//    DocumentBuilder builder = factory.newDocumentBuilder();
//    Document documento = builder.parse(new File("prueba.xml"));
//
//    // Preparación de xpath
//    XPath xpath = XPathFactory.newInstance().newXPath();
//
//    // Consultas
//    NodeList nodos = (NodeList) xpath.evaluate(xPathExpression, documento, XPathConstants.NODESET);
//
//    for (int i=0;i<nodos.getLength();i++){
//	System.out.println(nodos.item(i).getNodeName()+" : " +
//        nodos.item(i).getAttributes().getNamedItem("nombre"));
//		}
//}
