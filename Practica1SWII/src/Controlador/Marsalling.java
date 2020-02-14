/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Recetarios.Receta;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author david
 */
public class Marsalling {


protected void crearXML(String nombreFichero, Receta receta){
        FileWriter fichero = null;

        try {
            fichero = new FileWriter("./files/" + nombreFichero);

            try {
                JAXBContext context = JAXBContext.newInstance(Receta.class);
                Marshaller m = context.createMarshaller();
                m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                m.marshal(receta, fichero);

            } catch (PropertyException ex) {
                Logger.getLogger(Marsalling.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JAXBException ex) {
                Logger.getLogger(Marsalling.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(Marsalling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public Receta crearObjeto(String nombreFichero){
    Receta receta= new Receta();
       try {  
   
        File file = new File("./files/" + nombreFichero);  
        JAXBContext jaxbContext = JAXBContext.newInstance(Receta.class);  
   
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
        receta = (Receta) jaxbUnmarshaller.unmarshal(file);  
          
        
        
   
      } catch (JAXBException e) {  
        e.printStackTrace();  
      }  
       return receta;
    }  
    

}
        
