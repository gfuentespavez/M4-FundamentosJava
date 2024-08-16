package ReciclaJeans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ImportarCsv {
    private String nombreArchivo;

    public ImportarCsv(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public ArrayList<Producto> importar() {
        ArrayList<Producto> listaProductos = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 7) {
                    Producto producto = new Producto();
                    producto.setArticulo(datos[0]);
                    producto.setPrecio(datos[1]);
                    producto.setDescripcion(datos[2]);
                    producto.setCodigo(datos[3]);
                    producto.setTalla(datos[4]);
                    producto.setMarca(datos[5]);
                    producto.setColor(datos[6]);

                    listaProductos.add(producto);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
        return listaProductos;
    }
}