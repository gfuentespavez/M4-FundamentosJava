package dia_15;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuscarDestruir {
    public void BuscarDestruir(Scanner sc) {
        ArrayList<String> Nombres = new ArrayList<String>();
        List<String> NoEncontrado = new ArrayList<>();
        //Lista con nombres
        Nombres.add("Alicia");
        Nombres.add("Beto");
        Nombres.add("Carlos");
        Nombres.add("David");
        Nombres.add("Eva");
        //Ingresa nombre a buscar
        System.out.println("Ingresa un nombre a buscar");
        String BuscarNombre = sc.nextLine();
        //Ciclo para buscar el nombre
        boolean encontrado = false;
        for (int i = 0; i < Nombres.size(); i++) {
            if (Nombres.get(i).equals(BuscarNombre)) {
                System.out.println("Nombre encontrado: " + BuscarNombre);
                encontrado = true;
                return;
            }
        } if (!encontrado) {
            NoEncontrado.add(BuscarNombre);
        }
        if (NoEncontrado.size() > 0) {
            System.out.println("El nombre no existe: " + NoEncontrado);
        }
    }
}