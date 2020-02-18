/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Recetarios.Receta;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DarVVolf
 */
public class CreadorObjetos {
    
    
    protected Receta crearReceta() {
          Scanner scanner = new Scanner(System.in);
        Receta receta = new Receta();
        String valor="";
        ArrayList<String> ingredientes = new ArrayList();
      System.err.println("Introduce el nombre de la receta");
      receta.setNombre(scanner.nextLine());
     System.err.println("Introduce los ingredientes, para finalizar introduce como utimo ingrediente un 0");
      while(valor.equals("0")!=true){
    
      ingredientes.add(scanner.nextLine());
      valor=scanner.nextLine();
      }
      receta.setIngredienete(ingredientes);
      System.err.println("Introduce el precio de la receta");   
      receta.setPrecio(Double.parseDouble(scanner.nextLine()));
      
      return receta;
    }
    
}
