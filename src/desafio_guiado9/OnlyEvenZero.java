package desafio_guiado9;

import java.util.Scanner;

public class OnlyEvenZero {
    public void OnlyEvenZero (Scanner sc) {
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        System.out.printf("Los primeros %d números pares son:\n", n);
        for (int i = 0, count = 0; count < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                count++;
            }
        }
    }
}
