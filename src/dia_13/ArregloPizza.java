package dia_13;
import java.util.ArrayList;
import java.util.Scanner;

public class ArregloPizza {
    public void ArregloPizza(Scanner sc) {
        ArrayList<String> ingredientes = new ArrayList<String>();
        ingredientes.add("piña");
        ingredientes.add("jamón");
        ingredientes.add("queso");
        ingredientes.add("salsa");

        System.out.println("Agregue un ingrediente a la pizza: ");
        String ingrediente = sc.nextLine();
        if (ingredientes.contains(ingrediente)) {
            System.out.printf("El ingrediente ya se encuentra dentro de la piiza\n");
        } else {
            ingredientes.add(ingrediente);
            System.out.printf("El ingrediente %s fue agregado\n", ingrediente);
        }
        System.out.println(ingredientes);
    }
}
