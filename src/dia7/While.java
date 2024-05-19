package dia7;

import java.util.Scanner;

public class While {
    public void While () {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingresa un número del 1 al 10: ");
        int num = sc.nextInt();
        while(num <1 || num >10) {
            System.out.printf("El número ingresado no está entre 1 y 10\n");
            System.out.printf("Ingresa un número del uno al diez: ");
            num = sc.nextInt();
        }
        System.out.printf("El número ingresado fue: %d\n", num);
    }
}
