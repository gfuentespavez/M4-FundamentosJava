package ReciclaJeans;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportarTxt extends Exportador {
    private String nombreArchivo;

    public ExportarTxt(String nombreArchivo) {
        super();
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void exportar(ArrayList<Producto> listaProductos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Producto producto : listaProductos) {
                writer.write(producto.toString());
                writer.newLine();
            }
            System.out.println("Productos exportados a: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al exportar los productos: " + e.getMessage());
        }
    }
}
