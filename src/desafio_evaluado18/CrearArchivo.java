package desafio_evaluado18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CrearArchivo {
    //Crear directorio
    public void NewDirectory(String nombre) {
        File directorio = new File("src" + File.separator + nombre);
        if (!directorio.exists()) {
            boolean creado = directorio.mkdir();
            if (creado) {
                System.out.println("Directorio " + nombre + " creado");
            } else {
                System.out.println("Error al crear el directorio " + nombre);
            }
        } else {
            System.out.println("Directorio " + nombre + " ya existe");
        }
    }
    //Crear archivo y añade ArrayList
    public void createNewFile(String directorio, String nombreArchivo, ArrayList<String> contenido) {
        File archivo = new File("src" + File.separator + directorio + File.separator + nombreArchivo);
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo " + nombreArchivo + " creado en el directorio " + directorio);
                //FileWriter
                FileWriter escritor = new FileWriter(archivo);
                 for (String linea : contenido) {
                     escritor.write(linea + System.lineSeparator());
                 }
                escritor.close();
                System.out.println("Información añadida al archivo " + nombreArchivo);
            } else {
                System.out.println("El archivo " + nombreArchivo + " ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo " + nombreArchivo);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CrearArchivo cg = new CrearArchivo();

        //Crear directorio
        System.out.println("Introduzca el nombre del directorio");
        String nombreDirectorio = sc.nextLine();
        cg.NewDirectory(nombreDirectorio);

        //Crear archivo
        System.out.println("Introduzca el nombre del archivo");
        String nombreArchivo = sc.nextLine();

        //Contenidp en ArrayList
        ArrayList<String> contenido = new ArrayList<String>();
            contenido.add("Perro");
            contenido.add("Gato");
            contenido.add("Juan");
            contenido.add("Daniel");
            contenido.add("Juan");
            contenido.add("Gato");
            contenido.add("Perro");
            contenido.add("Camila");
            contenido.add("Daniel");
            contenido.add("Camila");

        cg.createNewFile(nombreDirectorio, nombreArchivo, contenido);
    }
}
