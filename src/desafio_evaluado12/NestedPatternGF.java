package desafio_evaluado12;

import java.util.Scanner;

public class NestedPatternGF {

    public void NestedPatternGf(Scanner sc) {

        // Rectángulo con límites
        System.out.println("Ingresa el tamaño del rectángulo: ");
        int size = sc.nextInt();

        // Patrón
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                //Imprimir límites del rectángulo
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Salto de línea
        }

        // Rectángulo con diagonal interior
        System.out.println("Ingresa el tamaño de la otra caja: ");
        int x = sc.nextInt();

        //Primera fila de asteriscos
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        System.out.println(); // Siguiente línea

        // Diagonal interior
        for (int i = 1; i < x - 1; i++) {
            for (int j = 0; j < x; j++) {
                // Imprimir asteriscos o espacios (" ")
                if (j == x - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Salto de línea
        }

        // Última fila
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        System.out.println(); // Salto de línea para ordenar la consola

        // Caja X
        System.out.println("Ingresa el tamaño de la caja con la X: ");
        int y = sc.nextInt();

        // Caja con X
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < y; j++) {
                // X en diagonal
                if (i == j || i + j == y - 1) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Salto de línea
        }

        // Caja irregular
        System.out.println("ingresa cualquier número: ");
        int z = sc.nextInt();

        // Imprimir primera línea de asteriscos
        for (int i = 0; i < z; i++) {
            if (i == 0) {
                // Primera línea, excepto z - 1
                for (int j = 0; j < z - 1; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print(" ");
                // Filas del medio
                for (int j = 0; j < z - 2; j++) {
                    System.out.print("*");
                }
            }
            System.out.println(); // Salto de línea
        }

        // Última fila, partiendo de i == 1
        for (int i = 0; i < z; i++) {
            if (i == 1) {
                for (int j = 0; j < z - 1; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print(" ");
            }
        }
    }
}