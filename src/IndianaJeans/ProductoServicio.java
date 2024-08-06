package IndianaJeans;

import java.util.ArrayList;

public class ProductoServicio {
    private ArrayList<String> listaProductos;

    // Constructor que acepta una lista
    public ProductoServicio(ArrayList<String> listaProductos) {
        this.listaProductos = listaProductos;
    }

    // Constructor sin argumentos que inicializa la lista
    public ProductoServicio() {
        this.listaProductos = new ArrayList<>(); // Inicializa listaProductos
    }

    // Getters y setters
    public ArrayList<String> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<String> listaProductos) {
        this.listaProductos = listaProductos;
    }

    // Método listarProductos
    public void listarProductos() {
        if (listaProductos.isEmpty()) {
            System.out.println("No se encontró ningun producto");
        } else {
            System.out.println("Lista de productos: ");
            for (String producto : listaProductos) {
                System.out.println("- " + producto);
            }
        }
    }

    // Método agregarProducto
    public void agregarProducto(String producto) {
        listaProductos.add(producto);
        System.out.println("Producto agregado: " + producto);
    }
}