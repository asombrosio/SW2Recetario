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
    private ArrayList<String> ingrediente = new ArrayList<>();
    @XmlElement
    private Double precio;
    
    public Receta (){}

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getIngrediente() {
        return ingrediente;
    }

  
    public void setIngrediente(ArrayList<String> ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Double getPrecio() {
        return precio;
    }

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
