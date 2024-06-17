package dia_14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaPlatos {
    public void ListaPlatos(Scanner sc) {
        ArrayList<String> lista = new ArrayList<String>();
        //Solicita al usuario ingresar platos
        System.out.println("Ingrese el primer plato: ");
        String a = sc.nextLine();
        System.out.println("Ingrese el segundo plato: ");
        String b = sc.nextLine();
        System.out.println("Ingrese el tercer plato: ");
        String c = sc.nextLine();
        System.out.println("Ingrese el cuarto plato: ");
        String d = sc.nextLine();
        System.out.println("Ingrese el quinto plato: ");
        String e = sc.nextLine();
        System.out.println("Ingrese el sexto plato: ");
        String f = sc.nextLine();
        //Agregar a ArrayList
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);
        lista.add(f);
        //Ordenar lista
        Collections.sort(lista);
        //Print
        System.out.println("La lista de comida es " + lista);
    }
}