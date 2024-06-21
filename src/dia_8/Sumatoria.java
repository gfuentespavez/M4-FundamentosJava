package dia_8;

import java.util.Scanner;

public class Sumatoria {
    public void Sumatoria(Scanner sc) {
        System.out.println("Ingrese un número");
        int n = sc.nextInt();
        int i = 0;
        int suma = 0;
        while (i < n){
            i+=1;
            suma += i;
        }
        System.out.printf("La sumatoria de los primeros %d naturales es: %d\n", n,  suma);
    }
}