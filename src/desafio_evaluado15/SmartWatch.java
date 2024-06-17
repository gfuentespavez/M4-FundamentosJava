package desafio_evaluado15;

public class SmartWatch {
    public void SmartWatch() {
        int [] pasosdiarios = {300, 405, 403, 506, 100020040, 45006, -1044};
        int suma = 0;
        int count = 0;
        for (int i = 0; i < pasosdiarios.length; i++) {
            if (pasosdiarios[i] > 200 && pasosdiarios[i] < 100000) {
                suma += pasosdiarios[i];
                count++;
                System.out.println("Registro de pasos diarios corregido: "+ pasosdiarios[i]);
            }
        }
        double mean = (count > 0) ? (double) suma / count : 0.0;
        System.out.println("El promedio de pasos diarios es: " + mean);
    }
}
