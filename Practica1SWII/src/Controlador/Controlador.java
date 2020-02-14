/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Recetarios.Receta;
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
    private void crearXML(String nombreFichero, Receta receta){
       mrs.crearXML(nombreFichero, receta);  
    }
    
    private Receta crearObjeto(String nombreFichero){
        
        Receta receta = mrs.crearObjeto(nombreFichero);
        return receta;
    }
    
    public void Menu(){
        Scanner scanner = new Scanner(System.in);
    Integer opcion = -1;
    Integer salir = 0;
     String respuesta ;    
        while(opcion != salir){
            System.err.println("Elige una opcion, pulsa 0 para salir");
            System.err.println("1= Importar receta, 2=Exportar receta");
            opcion = Integer.parseInt(scanner.nextLine());
            switch(opcion){
                 case 0:
                    System.err.println("Saliendo del programa");
                    break;
                case 1:
                     // Importar agenda
                    System.err.println("Introduce el nombre del fichero sin la extensión");
                    respuesta = scanner.nextLine();
                    Receta receta= crearObjeto(respuesta+".xml");
                    listarReceta(receta);
                    break;
                case 2:
                     //Exportar agenda
                    System.err.println("Introduce el nombre del fichero sin la extensión");
                     respuesta = scanner.nextLine();
                     crearXML(respuesta+ ".xml", crearReceta());
                    break;
                case 3:
                    // Exportar Persona agenda
                    break;
                case 4:
                    // Importar Persona agenda
                    break;
                case 5:
                    // Validacion DTD de la agenda
                    break;
                case 6:
                    System.out.println("file.xml es valido con file.xsd? "+ vXSD.validarXSD("./files/file.xsd", "./files/file.xml"));
                    break;
                case 7:
                    // Escribir sentencia Xpath y ejecutarla
                    break;
                case 8:
                    // Consulat xQuery a la Agenda
                    break;
                case 9:
                    // Añadir persona
                    break;
                case 10:
                    // Listar Agenda
                    break;
                default: 
                    System.err.println("Error, introduzca un numero del cero al 10");
                    
            }
        }
    }
    
    private Receta crearReceta(){
    Receta receta = new Receta();
    receta.setNombre("Canelones");
        ArrayList<String> ingredientes = new ArrayList<String>();
        ingredientes.add("Pasta");
        ingredientes.add("Bechamel");
        ingredientes.add("Carne");
        ingredientes.add("tomate frito");
    receta.setIngredienete(ingredientes);
    receta.setPrecio(15.56);
        return receta;
    }
    private void listarReceta(Receta receta){
        System.err.println("Este es el nombre de la receta elegida :" + receta.getNombre());
        System.err.println("Estos son los ingredientes:");
        for(String elemeto:receta.getIngredienete()){
             System.err.println( elemeto);
        }
        System.err.println("El precio de la receta es :" + receta.getPrecio());
    }
    
    
      
}
