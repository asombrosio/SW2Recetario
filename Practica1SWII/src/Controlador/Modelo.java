/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Recetarios.Receta;
import Recetarios.Recetario;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Modelo {
   
    protected Receta crearReceta(){
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
    protected Receta crearReceta2(){
    Receta receta = new Receta();
    receta.setNombre("cacatua");
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
        recetas.add(crearReceta());
        recetas.add(crearReceta2());
    recetario.setRecetas(recetas);
    recetario.setPrecio(100.00);
        return recetario;
    }
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
