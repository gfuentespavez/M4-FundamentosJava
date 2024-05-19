package dia_5;

import java.util.Scanner;

public class NumeroPar {
    public void NumeroPar(){
        Scanner sc = new Scanner(System.in);
        double numPar = 0;
        double mod = 0;
        /*Ciclo DO-WHILE, bucle que no terminará hasta que el usuario ingrese un número par */
        do {
            System.out.printf("Ingrese un número:");
            numPar = sc.nextLong();
            mod = numPar%2;
        }while(mod !=0);
        System.out.println("El numero es par");
        sc.close();
    }
}
