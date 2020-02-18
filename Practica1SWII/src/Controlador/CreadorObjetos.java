/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Recetarios.Receta;
import Recetarios.Recetario;
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
    
    
    //por defecto
     protected Recetario crearRecetario(){
    Recetario recetario = new Recetario();
    recetario.setNombre("libro1");
        ArrayList<Receta> recetas = new ArrayList<Receta>();
        recetas.add(crearReceta1(recetario.getNombre()));
        recetas.add(crearReceta2(recetario.getNombre()));
    recetario.setRecetas(recetas);
    recetario.setPrecio(100.00);
        return recetario;
    }
       protected Receta crearReceta1(String nombreRecetario){
    Receta receta = new Receta();
    receta.setNombre("Canelones");
     receta.setCodigoRecetario(nombreRecetario);//sele adjunta como referencia de su recetario el mismo nombre de este
        ArrayList<String> ingredientes = new ArrayList<String>();
        ingredientes.add("Pasta");
        ingredientes.add("Bechamel");
        ingredientes.add("Carne");
        ingredientes.add("Tomate frito");
    receta.setIngredienete(ingredientes);
    receta.setPrecio(15.56);
        return receta;
    }  
    protected Receta crearReceta2(String nombreRecetario){
    Receta receta = new Receta();
    receta.setNombre("Ensaladilla rusa");
    receta.setCodigoRecetario(nombreRecetario);
        ArrayList<String> ingredientes = new ArrayList<String>();
        ingredientes.add("patatas");
        ingredientes.add("zanahoria");
        ingredientes.add("aceitunas");
        ingredientes.add("mayonesa");
    receta.setIngredienete(ingredientes);
    receta.setPrecio(12.56);
        return receta;
    }
}
