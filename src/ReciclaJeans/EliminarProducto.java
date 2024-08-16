package ReciclaJeans;

import java.util.List;
import java.util.Iterator;
import java.util.Scanner;

public class EliminarProducto {
    public static void eliminarProducto(List<Producto> productos) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el código del producto que desea eliminar: ");
        String codigo = sc.nextLine();

        Iterator<Producto> iterator = productos.iterator();
        boolean eliminado = false;

        while(iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getCodigo().equals(codigo)) {
                iterator.remove();
                eliminado = true;
                System.out.println("El producto fue eliminado correctamente");
                break;
            }
        }
        if (!eliminado) {
            System.out.println("El producto no se encuentra eliminado");
        }
        eliminarProducto(productos);
    }
}