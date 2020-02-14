/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Recetarios.Receta;

/**
 *
 * @author david
 */
public class Controlador {
    Marsalling mrs = new Marsalling();
    public void crearXML(String nombreFichero, Receta receta){
       mrs.crearXML(nombreFichero, receta);
    }
    
}
