package dia_8;

import java.util.Scanner;

public class SumarPares {
    public void SumarPares(Scanner sc) {
        System.out.println("Ingrese cualquier numero: ");
        int n = sc.nextInt();
        int i = 0;
        int suma = 0;
        while (i < n) {
            i += 1;
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.printf("La suma de los números pares hasta %d es: %d\n", n, suma);
    }
}