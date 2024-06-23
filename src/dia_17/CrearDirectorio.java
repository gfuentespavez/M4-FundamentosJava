package dia_17;

import java.io.File;
import java.util.Scanner;

public class CrearDirectorio {
    public void crearDirectorio(String nombre) {
        File directorio = new File("src" + File.separator + nombre);

        if (!directorio.exists()) {
            boolean isCreated = directorio.mkdir();
            if (isCreated) {
                System.out.println("Directorio " + nombre + " creado");
            } else {
                System.out.println("No se puede crear el directorio " + nombre);
            }
        } else {
            System.out.println("El directorio " + nombre + " ya existe");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CrearDirectorio cd = new CrearDirectorio();
        System.out.println("Introduce el nombre del directorio");
        String dirnName = sc.nextLine();
        cd.crearDirectorio(dirnName);
    }
}