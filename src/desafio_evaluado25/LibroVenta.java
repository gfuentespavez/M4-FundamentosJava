package desafio_evaluado25;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LibroVenta {
    private String nombreVenta;
    private String fechaVenta;

    //Constructor
    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }
    //Getter & Setter

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    //Método para guardar la venta en un archivo
    public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {
        String directorio = "Ventas"; //Nombre de la carpeta
        String nombreArchivo = directorio + "/" + nombreVenta + ".txt"; //Nombre del archivo con nombreVenta
        //Crea carpeta, guarda el archivo
        File dir = new File(directorio);
        if(!dir.exists()) {
            dir.mkdir();//Crea el directorio si no existe.
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            writer.write("Patente del vehículo: " + vehiculo.getPatente() + "\n");
            writer.write("Edad del cliente: " + cliente.getEdadCliente() + "\n");
            writer.write("Fecha de la venta: " + this.fechaVenta + "\n");
            writer.write("Nombre de la venta: " + this.nombreVenta + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la venta: ");
        String nombreVenta = sc.nextLine();

        System.out.println("Ingrese la fecha de la venta (DD/MM/YYYY): ");
        String fechaVenta = sc.nextLine();

        System.out.println("Ingrese la patente del vehículo: ");
        String patente = sc.nextLine();

        System.out.println("Ingrese la edad del cliente: ");
        int edadCliente = sc.nextInt();

        sc.close();

        //Instancias
        Cliente cliente = new Cliente(edadCliente);
        Vehiculo vehiculo = new Vehiculo(patente);
        LibroVenta libroVenta = new LibroVenta(nombreVenta, fechaVenta);

        //Guardar
        libroVenta.guardarVenta(cliente, vehiculo);

        System.out.println("Venta guardada exitosamente.");
    }
}
