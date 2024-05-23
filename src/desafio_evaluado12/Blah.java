package desafio_evaluado12;

import java.util.Scanner;

public class Blah {
    public void Blah () {
        Scanner sc = new Scanner(System.in);
        int choice;

            do {
                // Display menu options
                System.out.println("\nNested Pattern Menu:");
                System.out.println("1. Rectangle Pattern");
                System.out.println("2. Box with Diagonal Pattern");
                System.out.println("3. Box with X Pattern");
                System.out.println("4. Irregular Box Pattern");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                // Get user choice
                choice = sc.nextInt();

                // Call corresponding method based on choice
                switch (choice) {
                    case 1:
                        printRectanglePattern(sc);
                        break;
                    case 2:
                        printBoxWithDiagonal(sc);
                        break;
                    case 3:
                        printBoxWithX(sc);
                        break;
                    case 4:
                        printIrregularBox(sc);
                        break;
                    case 5:
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 5); // Repeat until user chooses exit (option 5)

            sc.close();
        }

        // Helper method to print rectangle pattern
        private static void printRectanglePattern(Scanner sc) {
            System.out.println("Ingresa el tamaño del rectángulo: ");
            int size = sc.nextInt();

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        // Helper method to print box with diagonal pattern
        private static void printBoxWithDiagonal(Scanner sc) {
            System.out.println("Ingresa el tamaño de la otra caja: ");
            int x = sc.nextInt();

            // Print first row of asterisks
            for (int i = 0; i < x; i++) {
                System.out.print("*");
            }
            System.out.println();

            // Print middle rows with diagonal pattern
            for (int i = 1; i < x - 1; i++) {
                for (int j = 0; j < x; j++) {
                    if (j == x - i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            // Print last row of asterisks
            for (int i = 0; i < x; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Helper method to print box with X pattern
        private static void printBoxWithX(Scanner sc) {
            System.out.println("Ingresa el tamaño de la caja con las X: ");
            int y = sc.nextInt();

            for (int i = 0; i < y; i++) {
                for (int j = 0; j < y; j++) {
                    if (i == j || i + j == y - 1) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        // Helper method to print irregular box pattern
        private static void printIrregularBox(Scanner sc) {
            System.out.println("ingresa cualquier número: ");
            int z = sc.nextInt();

            // Print first row of asterisks
            for (int i = 0; i < z; i++) {
                if (i == 0) {
                    for (int j = 0; j < z - 1; j++) {
                        System.out.print("*");
                    }
                } else {
                }
            }
        }
    }

