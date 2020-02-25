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
        String valor = "";
        ArrayList<String> ingredientes = new ArrayList();
        System.out.println("Introduce el nombre de la receta");
        receta.setNombre(scanner.nextLine());
        System.out.println("Introduce la dificultad de la receta");
        receta.setDificultad(scanner.nextLine());
        System.out.println("Introduce los ingredientes, para finalizar introduce como ultimo ingrediente un 0");
        while (valor.equals("0") != true) {
            valor = scanner.nextLine();
            if(valor.equals("0")==false){
                 ingredientes.add(valor);
            }

        }
        receta.setIngredienete(ingredientes);
        System.out.println("Introduce el precio de la receta");
        receta.setPrecio(Double.parseDouble(scanner.nextLine()));

        return receta;
    }

    protected Recetario crearRecetario(ArrayList<Receta> recetas) {
        Scanner scanner = new Scanner(System.in);
        Recetario recetario = new Recetario();
        String valor = "";
        if (recetas.isEmpty()) {

            System.out.println("Debes crear recetas antes");
            recetario = null;
        } else {
            System.out.println("Introduce el nombre del recetario");
            recetario.setNombre(scanner.nextLine());
            System.out.println("Se introduciran las recetas en caliente");
            recetario.setRecetas(recetas);

            System.out.println("Introduce el precio de la recetario");
            recetario.setPrecio(Double.parseDouble(scanner.nextLine()));
        }
        return recetario;
    }

    //por defecto
//    protected Recetario crearRecetario1() {
//        Recetario recetario = new Recetario();
//        recetario.setNombre("libro1");
//        ArrayList<Receta> recetas = new ArrayList<Receta>();
//        recetas.add(crearReceta1(recetario.getNombre()));
//        recetas.add(crearReceta2(recetario.getNombre()));
//        recetario.setRecetas(recetas);
//        recetario.setPrecio(100.00);
//        return recetario;
//    }
//
//    protected Receta crearReceta1(String nombreRecetario) {
//        Receta receta = new Receta();
//        receta.setNombre("Canelones");
//        receta.setDificultad(nombreRecetario);//sele adjunta como referencia de su recetario el mismo nombre de este
//        ArrayList<String> ingredientes = new ArrayList<String>();
//        ingredientes.add("Pasta");
//        ingredientes.add("Bechamel");
//        ingredientes.add("Carne");
//        ingredientes.add("Tomate frito");
//        receta.setIngredienete(ingredientes);
//        receta.setPrecio(15.56);
//        return receta;
//    }
//
//    protected Receta crearReceta2(String nombreRecetario) {
//        Receta receta = new Receta();
//        receta.setNombre("Ensaladilla rusa");
//        receta.setDificultad(nombreRecetario);
//        ArrayList<String> ingredientes = new ArrayList<String>();
//        ingredientes.add("Patatas");
//        ingredientes.add("Zanahorias");
//        ingredientes.add("Aceitunas");
//        ingredientes.add("AMayonesa");
//        receta.setIngredienete(ingredientes);
//        receta.setPrecio(12.56);
//        return receta;
//    }
}
