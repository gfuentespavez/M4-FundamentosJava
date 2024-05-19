package dia_8;

import java.util.Scanner;

public class EjercicioCiclos {
    public void EjercicioCiclos() {
        Scanner sc = new Scanner(System.in);
        //Primer número
        System.out.println("Ingrese el primer numero: ");
        double num1 = sc.nextInt();
        //Segundo número
        System.out.println("Ingrese el segundo numero: ");
        double num2 = sc.nextInt();

        while (true) {
            //Mostrar menú
            System.out.println("Selecciones una opción: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Opción: ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                //Sumar
                    double suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                //Restar
                    double resta = num1 - num2;
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                //Multiplicar
                    double multiplicacion = num1 * num2;
                    System.out.println("La multiplicacion es: " + multiplicacion);
                    break;
                case 4:
                //Dividir
                    if (num2 !=0) {
                        double division = num1 / num2;
                        System.out.println("La division es: " + division);
                    } else {
                        System.out.println("Error. No se puede dividir por cero");
                    }
                    break;
                case 5:
                //Salir
                    System.out.println("Saliendo...");
                    sc.close();
                    return; //Termina el programa
                default:
                    System.out.println("Opcion no valida");

            }
        }
    }
}
