package dia_15;

public class ArraysIntro {
    public int ArraysIntro() {
        int[] sueldos = {400000, 760000, 1100000, 650000, 654980, 987300, 700450, 442300};
        int suma = 0;
        int count = 0;
        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i] >= 500000 && sueldos[i] <= 1100000) {
                suma += sueldos[i];
                count++;
            }
        }
        double mean = (count > 0) ? (double) suma / count : 0.0;
        System.out.println("El promedio es: " + mean);
        return suma;
    }
}