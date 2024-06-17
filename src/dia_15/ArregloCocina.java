package dia_15;

import java.util.ArrayList;
import java.util.Scanner;

public class ArregloCocina {
    public void ArregloCocina (Scanner sc) {
        ArrayList<String> Elementos = new ArrayList<String>();
        Elementos.add("Cafetera");
        Elementos.add("Refrigerador");
        Elementos.add("Muebles");
        Elementos.add("Cafetera");

        System.out.println("Los elementos en la cocina son: " + Elementos);

        System.out.println("Ingrese un nuevo elemento a la cocina");
        String newElement = sc.nextLine();
        if (Elementos.contains(newElement)) {
            System.out.println("El elemento ya se encuentra en la cocina");
        } else {
            Elementos.add(newElement);
            System.out.println("Elemento agregado con éxito");
        }
        System.out.println("La lista actualizada de elementos en la cocina son: " + Elementos);
    }
}