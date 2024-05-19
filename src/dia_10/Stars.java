package dia_10;
import java.util.Scanner;
public class Stars {
    public void Stars(Scanner sc) {
        System.out.printf("Ingresa un numero: ");
        int n1 = sc.nextInt();
        for(int i = 0; i < n1; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        System.out.printf("Ingresa un número: ");
        int n2 = sc.nextInt();
        //De izquierda a derecha, de 10 a 0
        for (int k = n2; k > 0; k--) {
            //De arriba hacia abajo, de 1 a 10
            for (int m = 0; m <= k; m++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}

