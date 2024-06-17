package dia_14;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;

public class Iterando {
    public void Iterando () {
        ArrayList<String> random = new ArrayList<String>();
        random.add("Primero");
        random.add("Segundo");
        random.add("Tercero");
        random.add("Cuatro");
        random.add("Cinco");
        //Ciclo for - iterator: variable temporal | Iterator: interfaz
        for (Iterator iterator = random.iterator(); iterator.hasNext();) {
            String elemento = (String) iterator.next();

        System.out.println("El elemento es: " + elemento);
        }
    }
}
