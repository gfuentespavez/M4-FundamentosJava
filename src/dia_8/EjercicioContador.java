package dia_8;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class EjercicioContador {
    public void EjercicioContador () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número de inicio");
        int i = sc.nextInt();
        while (i > 0) {
            System.out.printf("%d\n", i);
            i--;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        sc.close();
    }
}
