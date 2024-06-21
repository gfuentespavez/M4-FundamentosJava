package dia_14;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {
    public void Metodos (Scanner sc) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("a"); //Índice cero
        a.add("b"); //Índice uno
        a.add("c");
        a.add("d");
        a.add("e");
        a.add("f"); //Posición 5
        //ArrayList original
        System.out.println(a);
        //Cambio de variable
        System.out.println("Ingrese la variable a reemplazar: ");
        String varV = sc.nextLine();
        //Selección de posición
        System.out.println("Ingrese la posición a modificar: ");
        int posV = sc.nextInt();
        if (posV < 0 || posV > a.size()) {
            System.out.println("Posicion invalida");
            return;
        }
        //Modificar ArrayList
        String set = a.set(posV, varV);
        //Imprimir por pantalla ArrayList actualizado
        System.out.println(a);
    }
}
