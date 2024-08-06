package IndianaJeans;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ProductoServicio productoServicio;
    private Scanner scanner;

    public Menu() {
        this.productoServicio = new ProductoServicio();
        this.scanner = new Scanner(System.in);
    }

    //Método para mostrar y gestionar el menú
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("1. Lista de productos.");
            System.out.println("2. Agregar Producto.");
            System.out.println("3. Exportar datos.");
            System.out.println("4. Salir.");
            opcion = scanner.nextInt();
            scanner.nextLine(); //Consumir la nueva línea

            switch (opcion) {
                case 1:
                    listarProductos();
                    break;
                case 2:
                    agregarProducto();
                    break;
                case 3:
                    exportarDatos();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
        } while (opcion != 4);
    }

    //Método para listar productos
    private void listarProductos() {
        productoServicio.listarProductos();
    }

    // Método para agregar un producto
    private void agregarProducto() {
        Producto producto = new Producto();

        System.out.print("Ingrese el nombre del artículo: ");
        producto.setArticulo(scanner.nextLine());

        System.out.print("Ingrese el precio: ");
        producto.setPrecio(scanner.nextLine());

        System.out.print("Ingrese la descripción: ");
        producto.setDescripcion(scanner.nextLine());

        System.out.print("Ingrese el código: ");
        producto.setCodigo(scanner.nextLine());

        System.out.print("Ingrese la talla: ");
        producto.setTalla(scanner.nextLine());

        System.out.print("Ingrese la marca: ");
        producto.setMarca(scanner.nextLine());

        System.out.print("Ingrese el color: ");
        producto.setColor(scanner.nextLine());

        productoServicio.agregarProducto(String.valueOf(producto));
    }


    //Método para exportar datos
    private void exportarDatos() {
        System.out.println("Ingrese el nombre del archivo: ");
        String nombreArchivo = scanner.nextLine();
        ExportarTxt exportarTxt = new ExportarTxt(nombreArchivo);
        exportarTxt.exportar(productoServicio.getListaProductos());
    }

    //Método main para iniciar el menú
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostrarMenu();
    }
}
