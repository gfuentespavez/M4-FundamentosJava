package IndianaJeans;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportarTxt extends Exportador{
    private String nombreArchivo;

    //Constructor para inicializar el nombre del archivo
    public ExportarTxt(String nombreArchivo) {
        super();
        this.nombreArchivo = nombreArchivo;
    }

    //Implementacióm del método exportar
    @Override
    public void exportar(ArrayList<String> listaProductos) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (String producto : listaProductos) {
                writer.write(producto);
                writer.newLine();
            }
            System.out.println("Productos exportados a: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al exportar los productos: " + e.getMessage());
        }
    }
}