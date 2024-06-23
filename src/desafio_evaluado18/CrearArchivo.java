package desafio_evaluado18;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CrearArchivo {
    public void crearArchivo(String nombreArchivo) {

    }
    // Crear directorio
    public void newDirectory(String nombre) {
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

    // Crear archivo y añade ArrayList
    public void createNewFile(String directorio, String nombreArchivo, ArrayList<String> contenido) {
        File archivo = new File("src" + File.separator + directorio + File.separator + nombreArchivo);
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo " + nombreArchivo + " creado en el directorio " + directorio);
                // FileWriter
                FileWriter escritor = new FileWriter(archivo);
                for (String linea : contenido) {
                    escritor.write(linea + System.lineSeparator());
                }
                escritor.close();
                System.out.println("Información añadida al archivo " + nombreArchivo);
            } else {
                System.out.println("El archivo " + nombreArchivo + " ya existe en el directorio " + directorio);
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo " + nombreArchivo);
            e.printStackTrace();
        }
    }

    //Verificar existencia del fichero
    public void comprobarArchivo(String nombreDirectorio) {
        Scanner sc = new Scanner(System.in);
        boolean archivoEncontrado = false;

        while (!archivoEncontrado) {
            System.out.println("Ingrese el nombre del archivo a buscar: ");
            String nombreArchivo = sc.nextLine();
            File archivo = new File("src" + File.separator + nombreDirectorio + File.separator + nombreArchivo);

            if (archivo.exists()) {
                System.out.println("El archivo " + nombreArchivo + "existe dentro del directorio " + nombreDirectorio);
                archivoEncontrado = true;
            } else {
                System.out.println("El archivo " + nombreArchivo + " no existe en el directorio " + nombreDirectorio);
                System.out.println("¿Desea buscar de nuevo (sí/no)?");
                String respuesta = sc.nextLine();
                if (!respuesta.equalsIgnoreCase("sí")) {
                    archivoEncontrado = true;
                }
            }
        }
        sc.close();
    }

    // Buscar texto

    public void buscarTexto(String nombreDirectorio, String nombreArchivo) {
        File archivo = new File("src" + File.separator + nombreDirectorio + File.separator + nombreArchivo);

        if (!archivo.exists()) {
            System.out.println("El archivo " + nombreArchivo + " no existe en el directorio " + nombreDirectorio);
            return;
        }

        Scanner sc = new Scanner(System.in);
        boolean textoEncontrado = false;

        while (!textoEncontrado) {
            System.out.println("Ingrese el texto a buscar: ");
            String textoABuscar = sc.nextLine();

            try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
                String linea;
                int numeroLinea = 1;
                int contador = 0;

                while ((linea = lector.readLine()) != null) {
                    if (linea.contains(textoABuscar)) {
                        System.out.println("Texto encontrado en la línea " + numeroLinea + ": " + linea);
                        contador++;
                    }
                    numeroLinea++;
                }

                if (contador > 0) {
                    System.out.println("El texto '" + textoABuscar + "' se encontró " + contador + " veces en el archivo.");
                    textoEncontrado = true;
                } else {
                    System.out.println("Texto no encontrado en el archivo: " + nombreArchivo);
                    System.out.println("¿Desea buscar de nuevo (sí/no)?");
                    String respuesta = sc.nextLine();
                    if (!respuesta.equalsIgnoreCase("sí")) {
                        textoEncontrado = true;
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        sc.close();
    }
}