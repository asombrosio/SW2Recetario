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
    XQuery XQ= new XQuery();
    
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
    return co.crearRecetario1();
    
    }
    
    
    public void Menu(){
        Scanner scanner = new Scanner(System.in);
    Integer opcion = -1;
    Integer salir = 0;
     String respuesta ;
     ArrayList<Receta> recetaArrayList = new ArrayList();
     Receta receta;
     Recetario recetario = new Recetario();
        while(opcion != salir){
            System.out.println("Elige una opcion, pulsa 0 para salir");
            System.out.println("1= Importar recetario, 2=Exportar recetario");
            opcion = Integer.parseInt(scanner.nextLine());
            switch(opcion){
                 case 0:
                    System.out.println("Saliendo del programa");
                    break;
                case 1:
                     // Importar recetario
                     System.out.println("Introduce el nombre del fichero sin la extensión del recetario");
                    respuesta = scanner.nextLine();
                    recetario= importarObjetoRecetario(respuesta+".xml");
                    recetaArrayList=recetario.getRecetas();
                    modelo.listarRecetario(recetario);
                    break;
                case 2:
                     //Exportar recetario
                    System.out.println("Introduce el nombre del fichero sin la extensión del recetario");
                     respuesta = scanner.nextLine();
                     crearXMLRecetario(respuesta+ ".xml",recetario);
                    break;
                case 3:
                     System.out.println("En esta opcion creará el nombre del xml de la receta.");
                     System.out.println("Introduce el nombre de la receta a exportar");
                     respuesta = scanner.nextLine();      
                     crearXMLReceta(respuesta,respuesta+".xml");
                             
                    // crearXMLReceta(respuesta+ ".xml",);
                    // Exportar Persona agenda
                    break;
                case 4:
                    // Importar Persona agenda
                    System.out.println("Introduce el nombre del fichero sin la extensión de la receta");
                    respuesta = scanner.nextLine();
                    receta= importarObjetoReceta(respuesta+".xml");
                    recetaArrayList.add(receta);
                    modelo.listarReceta(receta);
                    break;
                case 5:
                    // Validacion DTD de la agenda
                    break;
                case 6:
                    //validar XSD
                    System.out.println("file.xml es valido con file.xsd? "+ vXSD.validarXSD("./files/xsd/recetario.xsd", "./files/xml/yaa.xml"));
                    break;
                case 7:
                    // Escribir sentencia Xpath y ejecutarla
                    break;
                case 8:
                    // Consulat xQuery 
                    XQ.buscarRecetasNovatos();
                    break;
                case 9:
                    // Consulat xQuery 
                   XQ.listarRecetas();
                    break;
                case 10:
                    // Consulat xQuery
                    XQ.verRecetasConPrecioMayorA2€();
                    break;
                case 11:
                    // Consulat xQuery 
                    modelo.crearHTML(XQ.creadorDeHTML());
                  
                    break;
                case 12:
                    // Consulat xQuery a la Agenda
                  
                    break;
                case 13:
                    // Añadir Agenda
                    
                    recetario=co.crearRecetario(recetaArrayList);
                    modelo.listarRecetario(recetario);
                    break;
                case 14:
                  
                    receta=co.crearReceta();
                    recetaArrayList.add(receta);
                    modelo.listarReceta(receta);
                    // Añadir Persona
                    break;
                 case 15:
                    // Listar recetas en caliente
                     for(Receta ele:recetaArrayList){
                         System.out.println(ele.getNombre());
                    }
                    break;
                  case 16:
                       // Listar recetas en agenda
                      modelo.listarRecetario(recetario);
                   
                    break;  
                default: 
                    System.out.println("Error, introduzca un numero del cero al 10");
                   
            }
        }
    }
   
      
}
