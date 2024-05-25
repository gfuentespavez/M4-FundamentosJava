package desafio_evaluado15;
import java.util.Scanner;

public class VisitasGF {
    public static int promedio() {
        int sum = 0;
        int count = 0;
        int[] arreglo = {3001, 1402, 1304, 1505};
        for (int x = 0; x < arreglo.length; x++) {
            if (arreglo[x] >= 1) {
                sum += arreglo[x];
                count++;
            }
        }
        if (count > 0) {
            return sum / count;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("El promedio de las visitas es: " + promedio());
    }
}
