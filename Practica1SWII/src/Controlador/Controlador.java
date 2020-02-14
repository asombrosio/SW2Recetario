/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Recetarios.Receta;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Controlador {
    Marsalling mrs = new Marsalling();
    public void crearXML(String nombreFichero, Receta receta){
       mrs.crearXML(nombreFichero, receta);
    }
    public void crearReceta(){
    Receta receta = new Receta();
    receta.setNombre("Canelones");
        ArrayList<String> ingredientes = new ArrayList<String>();
        ingredientes.add("Pasta");
        ingredientes.add("Bechamel");
        ingredientes.add("Carne");
        ingredientes.add("tomate frito");
    receta.setIngredienete(ingredientes);
    receta.setPrecio(15.56);
        crearXML("prueba1.xml", receta);
    }
    
    
}
