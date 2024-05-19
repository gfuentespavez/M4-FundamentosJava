package dia7;

import java.util.Scanner;

public class MenuOpcionesUsuario {
    public void MenuOpcionesUsuario () {
        Scanner sc = new Scanner(System.in);
        String opcion = " ";
        while(!opcion.equals("Salir")) {
            System.out.printf("Escoge una opción\n");
            System.out.printf("1 -- Acción 1\n");
            System.out.printf("2 -- Acción 2\n");
            System.out.printf("Escribe 'salir' para terminar el programa\n\n");
            System.out.printf("Ingrese una opción: ");
            opcion = sc.nextLine();
            if (opcion.equals("1")) {
                System.out.printf("Realizando acción 1\n");
            } else if(opcion.equals("2")) {
                System.out.printf("Realizando acción 2\n");
            } else if(opcion.equals("salir")) {
                System.out.printf("Saliendo...\n");
            } else {
                System.out.printf("Opcion no valida\n");
            }
        }
    }
}
