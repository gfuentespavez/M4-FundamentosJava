package Zoo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Leon leon = new Leon();
        Tigre tigre = new Tigre();
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        ArrayList<Carnivoro> listaCarnivoro  = new ArrayList<>();
        listaAnimales.add(leon);
        listaAnimales.add(tigre);
        listaCarnivoro.add(leon);
        listaCarnivoro.add(tigre);
        System.out.println(listaAnimales);
        System.out.println(listaCarnivoro);
    }
}