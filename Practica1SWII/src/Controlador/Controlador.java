
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
    ValidarDTD vDTD = new ValidarDTD();
    Modelo modelo = new Modelo();
    CreadorObjetos co= new CreadorObjetos();
    XQuery XQ= new XQuery();
<<<<<<< HEAD
    XPathNodo XPnodo = new XPathNodo();
=======
    XPathNodo XPN = new XPathNodo();
>>>>>>> fab7bd7979c1590f32f10b8a79108011d952da00
     ArrayList<Receta> recetaArrayList = new ArrayList();
     
          Receta receta;
     Recetario recetario = new Recetario();
    private void crearXMLRecetario(String nombreFichero, Recetario recetario){
       mrs.crearXMLRecetario(nombreFichero, recetario);  
    }
     private void crearXMLReceta(String nombreReceta, String nombreFichero){
            mrs.crearXMLReceta(nombreFichero,modelo.buscarReceta(nombreReceta,recetario)); 
    }
    private Receta importarObjetoReceta(String nombreFichero){  
        Receta receta = mrs.importarObjetoReceta(nombreFichero);
        return receta;
    }
        private Recetario importarObjetoRecetario(String nombreFichero){  
        Recetario recetario = mrs.importarObjetoRecetario(nombreFichero);
        return recetario;
    }
    
    
    
    public void Menu(){
        Scanner scanner = new Scanner(System.in);
    Integer opcion = -1;
    Integer salir = 0;
     String respuesta ;
    

        while(opcion != salir){
            System.out.println("Elige una opcion, pulsa 0 para salir");
            System.out.println("1= Importar recetario, 2=Exportar recetario, 3=Exportar Receta, 4=Importar Receta, 5= crea el recetario, 6=crea recetas, 7=Lista recetas en caliente , 8=listar las recetas del recetario");
            System.out.println("9=Xpath *, 10=Xpath muestra recetas cuyo precio <15 11=XPath que muestra las recetas con dificultad Facil y que el precio sea menor a 15 euros");
            System.out.println("12=Xquery que dice cuales son las recetas viables para novatos, 13=Xquery que te lista la receta, 13=XQuery que busca las recetas cuyo valor es superior a 2 euros");
            System.out.println("15= crea un HTML a partir del xml donde lista las recetas,16=Validar DTD, 17=Validar XSD");
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
                     if(respuesta.equals("recetarioDTD")!= true){
                      crearXMLRecetario(respuesta+ ".xml",recetario);
                     }else{
                         System.out.println("Ese nombre esta prohibido");
                     }
                    
                    break;
                case 3:
                     System.out.println("En esta opcion creará el nombre del xml de la receta.");
                     System.out.println("Introduce el nombre de la receta a exportar");
                     respuesta = scanner.nextLine();
                    // System.out.println(recetario.getNombre());
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
                    recetario=co.crearRecetario(recetaArrayList);
                    modelo.listarRecetario(recetario);
                    break;
                case 6:
                     //crear recetas
                    receta=co.crearReceta();
                    recetaArrayList.add(receta);
                    modelo.listarReceta(receta);
                    break;
                case 7:
                   // Listar recetas en caliente
                     for(Receta ele:recetaArrayList){
                         System.out.println(ele.getNombre());
                    }
                    break;
                case 8:
                     modelo.listarRecetario(recetario);
                   
                   
                    break;
                case 9:
<<<<<<< HEAD
                   
                  XPnodo.XpathPrecioMenor15();
=======
                    XPN.XpathPrecios();

>>>>>>> fab7bd7979c1590f32f10b8a79108011d952da00
                    break;
                case 10:

                    break;
                case 11:

                    break;
                case 12:

                    break;
                case 13:

                    XQ.buscarRecetasNovatos();

                    break;
                case 14:
                     XQ.listarRecetas();
                  
                    break;
                case 15:
                    XQ.verRecetasConPrecioMayorA2euros();
                    
                    break;
                case 16:
                     modelo.crearHTML(XQ.creadorDeHTML());
                    
                    break;
                 case 17:
                    // Validacion DTD de la agenda
                    System.out.println("¿Es valido el xml con su dtd? "+  vDTD.validarXML( "./files/xml/recetarioDTD.xml"));
                   
                    break;
                  case 18:
                       // Listar recetas en agenda
                      System.out.println("Introduce el nombre del XML a validar sin extension: ");
                     respuesta = scanner.nextLine();
                     System.out.println("¿Es valido el xml con su xsd? "+  vXSD.validarXSD("./files/xsd/recetario.xsd", "./files/xml/"+respuesta+".xml"));
                   
                    break;  
                default: 
                    System.out.println("Error, introduzca un numero del cero al 17");
                   
            }
        }
    }
   
      
}
