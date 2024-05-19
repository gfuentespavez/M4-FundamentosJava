package dia_8;

import java.util.Scanner;

public class SumarSoloPar {
    public void printEvenNumbers() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Ingrese cualquier numero: ");
            n = sc.nextInt();
            if (n % 2 != 0) {
                System.out.println("El número ingresado es impar. Vuelve a ingresar un número par");
            }
        } while (n % 2 != 0);

        int i = 2;
        int suma = 0;
        while (i <= n) {
            suma += i;
            i += 2;
        }
        System.out.printf("La suma de los números pares hasta %d es: %d\n", n, suma);
        sc.close();
    }
}
