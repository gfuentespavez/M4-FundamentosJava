package dia_13;

public class ArregloPancho {
    public static int suma() {
        int suma = 0;
        int [] arreglo = {1, 1, 1, 1, 1, 1, 1, 1, -1};
        for (int x = 0; x < arreglo.length; x++) {
            if (arreglo[x] >= 1 && arreglo[x] <= 10) {
                suma += arreglo[x];
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.println("La suma es: " + suma());
    }
}
