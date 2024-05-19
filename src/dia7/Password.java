package dia7;

import java.util.Scanner;

public class Password {
    public void Password () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la contraseña: ");
        String password = sc.nextLine();
        while(password.compareTo("stemmen2202")!=0) {
            System.out.printf("La contraseña es incorrecta\n", password);
            System.out.printf("Ingrese la contraseña: ");
            password = sc.nextLine();
        }
        System.out.printf("La contraseña ingresada es correcta\n");
    }
}
