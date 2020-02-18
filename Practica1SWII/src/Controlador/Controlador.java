/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Recetarios.Receta;
import Recetarios.Recetario;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Controlador {
    Marsalling mrs = new Marsalling();
    ValidarXSD vXSD = new ValidarXSD();
    Modelo modelo = new Modelo();
    CreadorObjetos co= new CreadorObjetos();
    
    private void crearXMLRecetario(String nombreFichero, Recetario recetario){
       mrs.crearXMLRecetario(nombreFichero, recetario);  
    }
     private void crearXMLReceta(String nombreReceta, String nombreFichero){
            mrs.crearXMLReceta(nombreFichero,modelo.buscarReceta(nombreReceta,crearRecetario())); 
    }
    private Receta importarObjetoReceta(String nombreFichero){  
        Receta receta = mrs.importarObjetoReceta(nombreFichero);
        return receta;
    }
        private Recetario importarObjetoRecetario(String nombreFichero){  
        Recetario recetario = mrs.importarObjetoRecetario(nombreFichero);
        return recetario;
    }
    private Recetario crearRecetario (){
    return modelo.crearRecetario();
    
    }
    
    
    public void Menu(){
        Scanner scanner = new Scanner(System.in);
    Integer opcion = -1;
    Integer salir = 0;
     String respuesta ;    
        while(opcion != salir){
            System.err.println("Elige una opcion, pulsa 0 para salir");
            System.err.println("1= Importar recetario, 2=Exportar recetario");
            opcion = Integer.parseInt(scanner.nextLine());
            switch(opcion){
                 case 0:
                    System.err.println("Saliendo del programa");
                    break;
                case 1:
                     // Importar recetario
                     System.err.println("Introduce el nombre del fichero sin la extensión del recetario");
                    respuesta = scanner.nextLine();
                    Recetario recetario= importarObjetoRecetario(respuesta+".xml");
                    modelo.listarRecetario(recetario);
                    break;
                case 2:
                     //Exportar recetario
                    System.err.println("Introduce el nombre del fichero sin la extensión del recetario");
                     respuesta = scanner.nextLine();
                     crearXMLRecetario(respuesta+ ".xml", modelo.crearRecetario());
                    break;
                case 3:
                     System.err.println("En esta opcion creará el nombre del xml de la receta.");
                     System.err.println("Introduce el nombre de la receta a exportar");
                     respuesta = scanner.nextLine();      
                     crearXMLReceta(respuesta,respuesta+".xml");
                             
                    // crearXMLReceta(respuesta+ ".xml",);
                    // Exportar Persona agenda
                    break;
                case 4:
                    // Importar Persona agenda
                    System.err.println("Introduce el nombre del fichero sin la extensión de la receta");
                    respuesta = scanner.nextLine();
                    Receta receta= importarObjetoReceta(respuesta+".xml");
                    modelo.listarReceta(receta);
                    break;
                case 5:
                    // Validacion DTD de la agenda
                    break;
                case 6:
                    System.out.println("file.xml es valido con file.xsd? "+ vXSD.validarXSD("./files/xml/file.xsd", "./files/xml/file.xml"));
                    break;
                case 7:
                    // Escribir sentencia Xpath y ejecutarla
                    break;
                case 8:
                    // Consulat xQuery a la Agenda
                    break;
                case 9:
                    // Añadir Agenda
                    modelo.crearRecetario();
                    break;
                case 10:
                  
                    modelo.listarReceta(co.crearReceta());
                    // Añadir Persona
                    break;
                 case 11:
                    // Listar Agenda
                    break;
                default: 
                    System.err.println("Error, introduzca un numero del cero al 10");
                    
            }
        }
    }
   
      
}
