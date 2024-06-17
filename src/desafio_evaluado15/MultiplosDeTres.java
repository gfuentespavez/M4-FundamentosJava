package desafio_evaluado15;

public class MultiplosDeTres {
    public void MultiplosDeTres() {
        int [] multiplos = { 10, 20, 30, 33, 21, 8, 2, 61};
        int suma = 0;
        int count = 0;
        for (int i = 0; i < multiplos.length; i++) {
            if (multiplos[i] % 3 == 0) {
                suma += multiplos[i];
                count++;
            }
        }
        double mean = (count > 0) ? (double) suma / count : 0;
        System.out.println("La suma de los múltiplos de tres es: " + suma);
        System.out.println("La media de la sumatoria de los múltiplos de tres es: " + mean);
    }
}