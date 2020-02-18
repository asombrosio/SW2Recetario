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
 * @author david
 */
public class Modelo {
  
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
    protected Receta crearReceta1(String nombreRecetario){
    Receta receta = new Receta();
    receta.setNombre("Canelones");
     receta.setCodigoRecetario(nombreRecetario);//sele adjunta como referencia de su recetario el mismonobre de este
        ArrayList<String> ingredientes = new ArrayList<String>();
        ingredientes.add("Pasta");
        ingredientes.add("Bechamel");
        ingredientes.add("Carne");
        ingredientes.add("tomate frito");
    receta.setIngredienete(ingredientes);
    receta.setPrecio(15.56);
        return receta;
    }  
    protected Receta crearReceta2(String nombreRecetario){
    Receta receta = new Receta();
    receta.setNombre("cacatua");
    receta.setCodigoRecetario(nombreRecetario);
        ArrayList<String> ingredientes = new ArrayList<String>();
        ingredientes.add("pera");
        ingredientes.add("manzana");
        ingredientes.add("Carne");
        ingredientes.add("tomate");
    receta.setIngredienete(ingredientes);
    receta.setPrecio(25.56);
        return receta;
    }
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
    
    //hasta  aqui lo de fuera de crear estructuras ojo eso sera con vision a cambiar
    protected void listarReceta(Receta receta){
        if(receta!=null){
             System.err.println("Este es el nombre de la receta elegida :" + receta.getNombre());
        System.err.println("Estos son los ingredientes:");
        for(String elemeto:receta.getIngredienete()){
             System.err.println( elemeto);
        }
        System.err.println("El precio de la receta es :" + receta.getPrecio());
        }
       
    }
    protected void listarRecetario(Recetario recetario){
        if(recetario!=null){
             System.err.println("Este es el nombre del recetario :" + recetario.getNombre());
        System.err.println("Estos son sus recetas:");
        for(Receta elemeto:recetario.getRecetas()){
             System.err.println( elemeto.getNombre());
        }
        System.err.println("El precio del recetario es :" + recetario.getPrecio());
        }
       
    }
    protected Receta buscarReceta(String nombreReceta, Recetario recetario) {
      
       for(Receta ele:recetario.getRecetas()){
           if(ele.getNombre().equals(nombreReceta)){
               return ele;
           }       
       }
       System.err.println("No existe la receta");
        return null;
    }

 

     
}
