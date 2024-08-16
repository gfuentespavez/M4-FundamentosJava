package ReciclaJeans;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ProductoServicio productoServicio;
    private Scanner scanner;

    public Menu() {
        this.productoServicio = new ProductoServicio();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("1. Lista de productos.");
            System.out.println("2. Crear producto.");
            System.out.println("3. Modificar producto.");
            System.out.println("4. Eliminar producto.");
            System.out.println("5. Exportar datos.");
            System.out.println("6. Importar datos.");
            System.out.println("7. Pausar la ejecución.");
            System.out.println("8. Limpiar la pantalla.");
            System.out.println("0. Salir.");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea nueva

            switch (opcion) {
                case 1:
                    listarProductos();
                    break;
                case 2:
                    crearProducto();
                    break;
                case 3:
                    modificarProducto();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    exportarDatos();
                    break;
                case 6:
                    importarDatos();
                    break;
                case 7:
                    esperar();
                    break;
                case 8:
                    Utilidad.limpiarPantalla();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);
    }

    //Método para listar los productos
    private void listarProductos() {
        productoServicio.listarProductos();
    }

    //Método para agregar un producto
    private void crearProducto() {
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

        productoServicio.agregarProducto(producto);

        System.out.println("Producto creado exitosamente");
    }

    //Método para modificar un producto al ingresar su código
    private void modificarProducto() {
        System.out.print("Ingrese el código del artículo a modificar: ");
        String codigo = scanner.nextLine();
        Producto producto = productoServicio.buscarProductoPorCodigo(codigo);
        if (producto != null) {
            ModificarProducto.modificarProducto(producto);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    //Método para eliminar un producto
    private void eliminarProducto() {
        System.out.println("Ingrese el código del producto a eliminar: ");
        String codigo = scanner.nextLine();
        productoServicio.eliminarProducto(codigo);
    }

    //Método para exportar datos
    private void exportarDatos() {
        System.out.println("Ingrese el nombre del archivo: ");
        String nombreArchivo = scanner.nextLine();
        ExportarTxt exportarTxt = new ExportarTxt(nombreArchivo);
        exportarTxt.exportar(productoServicio.getListaProductos());
    }

    //Método para importar datos desde un archivo csv
    private void importarDatos(){
        System.out.println("Ingrese la ruta del archivo: ");
        String rutaArchivo = scanner.nextLine();
        ImportarCsv importarCsv = new ImportarCsv(rutaArchivo);
        ArrayList<Producto> productosImportados = importarCsv.importar();
        for (Producto producto : productosImportados) {
            productoServicio.agregarProducto(producto);
        }
        System.out.println("Productos importados exitosamente");
    }

    private void esperar() {
        System.out.print("Ingrese la cantidad de segundos para pausar la ejecución: ");
        int segundos = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea nueva
        Utilidad.esperar(segundos);
    }

    //Método main
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostrarMenu();
    }
}