package dia_13;

public class ArregloSuma {
    public void ArregloSuma () {
        int suma = 0;
        int [] arreglo = {1, 5, 11, 33, 4, 5, 66, 31, 69, -1};
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] >= 1 && arreglo[i] <= 70) {
                suma += arreglo[i];
            }
        }
        System.out.println("La suma es: " + suma);
    }
}