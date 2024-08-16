package ReciclaJeans;

import java.util.Scanner;

public class ModificarProducto {

    public static void modificarProducto(Producto producto) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Modificar producto: " + producto);
        System.out.println("Ingrese nuevo artículo (Enter para no cambiar): ");
        String articulo = sc.nextLine();
        if (!articulo.isEmpty()) {
            producto.setArticulo(articulo);
        }

        System.out.println("Ingrese nuevo precio (Enter para no cambiar): ");
        String precio = sc.nextLine();
        if (!precio.isEmpty()) {
            producto.setPrecio(precio);
        }

        System.out.println("Ingrese nuevo descripción (Enter para no cambiar): ");
        String descripcion = sc.nextLine();
        if (!descripcion.isEmpty()) {
            producto.setDescripcion(descripcion);
        }

        System.out.println("Ingrese nuevo código (Enter para no cambiar): ");
        String codigo = sc.nextLine();
        if (!codigo.isEmpty()) {
            producto.setCodigo(codigo);
        }

        System.out.println("Ingrese nueva talla (Enter para no cambiar): ");
        String talla = sc.nextLine();
        if (!talla.isEmpty()) {
            producto.setTalla(talla);
        }

        System.out.println("Ingrese nueva marca (Enter para no cambiar): ");
        String marca = sc.nextLine();
        if (!marca.isEmpty()) {
            producto.setMarca(marca);
        }

        System.out.println("Ingrese nuevo color (Enter para no cambiar): ");
        String color = sc.nextLine();
        if (!color.isEmpty()) {
            producto.setColor(color);
        }

        System.out.println("Producto modificado" + producto);
    }
}