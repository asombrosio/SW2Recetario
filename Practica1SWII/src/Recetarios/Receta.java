/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recetarios;

import java.io.Serializable;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author darth
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Receta")
public class Receta implements Serializable {

    @XmlElement
    private String nombre;
    @XmlAttribute
    private String dificultad;
    @XmlElementWrapper
    private ArrayList<String> ingredienete = new ArrayList<>();
    @XmlElement
    private Double precio;
    
    public Receta (){}


   


    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ingredienete
     */
    public ArrayList<String> getIngredienete() {
        return ingredienete;
    }

    /**
     * @param ingredienete the ingredienete to set
     */
    public void setIngredienete(ArrayList<String> ingredienete) {
        this.ingredienete = ingredienete;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

 
}
