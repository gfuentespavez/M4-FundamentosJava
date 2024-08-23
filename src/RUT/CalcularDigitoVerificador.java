package RUT;

import java.util.Scanner;

public class CalcularDigitoVerificador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingree el RUT: ");
        String rut = sc.nextLine();

        char digitoVerificador = calcularDigitoVerificador(rut);
        System.out.println("El dígito verificador para este RUT es: " + digitoVerificador);

        sc.close();
    }

    public static char calcularDigitoVerificador(String rut) {
        int suma = 0;
        int multiplicador = 2;

        for (int i = rut.length() - 1; i >= 0; i--) {
            int numero = Character.getNumericValue(rut.charAt(i));
            suma += numero * multiplicador;
            multiplicador++;

            if(multiplicador > 7) {
                multiplicador = 2;
            }
        }

        int resto = suma % 11;
        int digitoCalculado = 11 - resto;

        if (digitoCalculado == 11) {
            return '0';
        } else if (digitoCalculado == 10){
            return '1';
        } else {
            return (char) (digitoCalculado + '0');
        }
    }
}
