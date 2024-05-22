package desafio_evaluado12;
import java.util.Scanner;

public class PatternsGF {
    public void PatternsGF (Scanner sc){
        //Primer patron *.*.
        System.out.println("Ingrese la cantidad de repeticiones del patrón '*.*.': ");
        int n = sc.nextInt();
        //Bucle del patrón *.*.
        for (int i = 1; i <= n; i++) {
            System.out.printf("*.*.");
        }
        //Salto de línea para ordenar la consola
        System.out.println("");
        //Segundo patron 1234
        System.out.println("Ingrese la cantidad de repeticiones del patrón '1234': ");
        int n2 = sc.nextInt();
        //Bucle del patrón 1234
        for (int i = 1; i <= n2; i++) {
            System.out.printf("1234");
        }
        //Salto de línea para ordenar la consola
        System.out.println("");
        //Tercer patrón ||*
        System.out.println("Ingrese la cantidad de repeticiones del patrón '||*': ");
        int n3 = sc.nextInt();
        //Bucle del patrón ||*
        for (int i = 1; i <= n3; i++) {
            System.out.printf("||*");
        }
    }
}