package RUT;

import java.util.Scanner;

public class GestionaRut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una opción:");
        System.out.println("1. Calcular dígito verificador");
        System.out.println("2. Verificar RUT completo");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el RUT (sin dígito verificador ni puntos, solo números): ");
                String rutParaCalcular = scanner.nextLine();
                char digitoVerificador = CalculadorDigitoVerificadorRUT.calcularDigitoVerificador(rutParaCalcular);
                System.out.println("El dígito verificador calculado es: " + digitoVerificador);
                break;

            case 2:
                System.out.print("Ingrese el RUT (sin dígito verificador ni puntos, solo números): ");
                String rutParaVerificar = scanner.nextLine();

                System.out.print("Ingrese el dígito verificador (número o K): ");
                char digitoVerificadorIngresado = scanner.nextLine().toUpperCase().charAt(0);

                boolean esValido = VerificadorRUT.verificarRUT(rutParaVerificar, digitoVerificadorIngresado);

                if (esValido) {
                    System.out.println("El RUT es válido.");
                } else {
                    System.out.println("El RUT no es válido.");
                }
                break;

            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}

class CalculadorDigitoVerificadorRUT {

    public static char calcularDigitoVerificador(String rut) {
        int suma = 0;
        int multiplicador = 2;

        for (int i = rut.length() - 1; i >= 0; i--) {
            int numero = Character.getNumericValue(rut.charAt(i));
            suma += numero * multiplicador;
            multiplicador++;

            if (multiplicador > 7) {
                multiplicador = 2;
            }
        }

        int resto = suma % 11;
        int digitoCalculado = 11 - resto;

        if (digitoCalculado == 11) {
            return '0';
        } else if (digitoCalculado == 10) {
            return 'K';
        } else {
            return (char) (digitoCalculado + '0');
        }
    }
}

class VerificadorRUT {

    public static boolean verificarRUT(String rut, char digitoVerificador) {
        char digitoCalculado = CalculadorDigitoVerificadorRUT.calcularDigitoVerificador(rut);
        return digitoCalculado == digitoVerificador;
    }
}
