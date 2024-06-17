package dia_15;

import java.util.ArrayList;
import java.util.Collections;

public class Indice {
    public void Indice () {
        ArrayList<Double> Notas  = new ArrayList<Double>();
        Notas.add(4.7);
        Notas.add(2.2);
        Notas.add(5.4);
        Notas.add(6.9);
        Notas.add(4.4);
        Notas.add(2.6);
        //Ordenar lista
        Collections.sort(Notas);
        //Imprimir lista ordenada
        System.out.println("Las notas ingresadas son: " + Notas);
        Double min = Collections.min(Notas);
        Double max = Collections.max(Notas);
        //Imprimir notas solicitadas
        System.out.println("La nota más baja es: " + min);
        System.out.println("La nota mayor es: " + max);
    }
}
