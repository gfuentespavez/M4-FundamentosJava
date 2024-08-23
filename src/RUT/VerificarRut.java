package RUT;

import java.util.Scanner;

public class VerificarRut {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el RUT, sin digito verificador ni puntos: ");
        String rut = sc.nextLine();

        System.out.println("Ingrese dígito verificador RUT: ");
        char digitoVerificador = sc.nextLine().toUpperCase().charAt(0);

        boolean esValido = verificarRUT(rut, digitoVerificador);

        if (esValido) {
            System.out.println("El RUT es valido");
        } else {
            System.out.println("El RUT no es valido");
        }

        sc.close();
    }

    public static boolean verificarRUT(String rut, char digitoVerificador) {
        int suma = 0;
        int multiplicador = 2;

        //Recorre los dígitos del RUT de derecha a izquierda
        for (int i = rut.length() - 1; i >= 0; i--) {
            int numero = Character.getNumericValue(rut.charAt(i));
            suma += numero * multiplicador;
            multiplicador++;

            //Reinicia multiplicador a 2 si es mayor que 7
            if (multiplicador > 7) {
                multiplicador = 2;
            }
        }

        //Cálculo módulo 11
        int resto = suma % 11;
        int digitoCalculado = 11 - resto;

        char digitoCalculadoChar;
        if (digitoCalculado == 11) {
            digitoCalculadoChar = '0';
        } else if (digitoCalculado == 10) {
            digitoCalculadoChar = 'K';
        } else {
            digitoCalculadoChar = (char) (digitoCalculado + '0');
        }

        return digitoCalculadoChar == digitoVerificador;
    }
}