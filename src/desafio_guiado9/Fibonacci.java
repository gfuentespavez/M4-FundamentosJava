package desafio_guiado9;

import java.util.Scanner;

public class Fibonacci {
    public void Fibonacci(Scanner sc) {
        System.out.println("Ingrese la cantidad de números de la serie Fibonacci a mostrar: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Ingresa un número positivo");
        } else {
            System.out.printf("Los primeros %d números de la serie Fibonacci son\n", n);
            int a = 0, b = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
        }
    }
}