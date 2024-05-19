package desafio_guiado9;

import java.util.Scanner;

public class OnlyEven {
    public void OnlyEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te indicará los primeros números pares que necesites.");
        System.out.println("Digite un número: ");
        int n = sc.nextInt();
        System.out.printf("Los primeros %d números pares son:\n", n);
        for (int i = 1, count = 0; count < n; i++) {
            if (i % 2 == 0);
            System.out.println(i);
            count++;
        }
        sc.close();
    }
}