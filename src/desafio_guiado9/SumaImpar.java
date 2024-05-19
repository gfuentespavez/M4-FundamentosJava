package desafio_guiado9;

import java.util.Scanner;

public class SumaImpar {
    public void SumaImpar() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Ingrese cualquier numero: ");
            n = sc.nextInt();
        } while (n % 1 != 0);
        int i = 1;
        int suma = 0;
        while (i <= n) {
            suma += i;
            i += 2;
        }
        System.out.printf("La suma de los números impares hasta %d es: %d\n", n, suma);
    }
}