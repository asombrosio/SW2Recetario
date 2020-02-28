
package Controlador;

import Recetarios.Receta;
import Recetarios.Recetario;
import java.util.ArrayList;
import java.util.Scanner;

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
        receta.setIngrediente(ingredientes);
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
}
