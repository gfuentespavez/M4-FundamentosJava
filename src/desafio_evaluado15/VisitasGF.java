package desafio_evaluado15;

public class VisitasGF {
    public void promedio() {
        int [] visitas = {3001, 1402, 1304, 1505};
        int suma = 0;
        int count = 0;
        for (int i = 0; i < visitas.length; i++) {
            if (visitas[i] > 1) {
                suma += visitas[i];
                count++;
            }
        }
        double mean = (count > 0) ? (double) suma / count : 0;
        System.out.println("El promedio de visitas es: " + mean);
    }
}