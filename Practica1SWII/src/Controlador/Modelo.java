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
  
    
   
    
    protected void listarReceta(Receta receta){
        if(receta!=null){
             System.out.println("Este es el nombre de la receta elegida :" + receta.getNombre());
        System.out.println("Estos son los ingredientes:");
        for(String elemeto:receta.getIngredienete()){
             System.out.println(elemeto);
        }
        System.out.println("El precio de la receta es :" + receta.getPrecio());
        }
       
    }
    protected void listarRecetario(Recetario recetario){
        if(recetario!=null){
             System.out.println("Este es el nombre del recetario :" + recetario.getNombre());
        System.out.println("Estos son sus recetas:");
        for(Receta elemeto:recetario.getRecetas()){
             System.out.println( elemeto.getNombre());
        }
        System.out.println("El precio del recetario es :" + recetario.getPrecio());
        }
       
    }
    protected Receta buscarReceta(String nombreReceta, Recetario recetario) {
      
       for(Receta ele:recetario.getRecetas()){
           if(ele.getNombre().equals(nombreReceta)){
               return ele;
           }       
       }
       System.out.println("No existe la receta");
        return null;
    }

 

     
}
