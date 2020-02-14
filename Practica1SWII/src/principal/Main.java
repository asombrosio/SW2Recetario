/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import Controlador.Controlador;
import java.util.Scanner;


/**
 *
 * @author darth
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    /*Scanner scanner = new Scanner(System.in);
    Integer opcion = -1;
    Integer salir = 0;
        
        while(opcion != salir){
            System.err.println("Elige una opcion, pulsa 0 para salir");
            opcion = Integer.parseInt(scanner.nextLine());
            switch(opcion){
                case 1:
                    //Exportar agenda
                    break;
                case 2:
                    // Importar agenda
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
                    // Validacion contra XSD Agenda
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
                    break;
            }
        }*/
    Controlador controlador = new Controlador();
    controlador.crearObjeto("prueba1.xml");
    //controlador.crearReceta();
    }
    
}

