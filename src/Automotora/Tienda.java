package Automotora;

public class Tienda {
    private Vendedor vendedor;
    private Vehiculo vehiculo;
    private int stock;
    //Constructor
    public Tienda(Vendedor vendedor, Vehiculo vehiculo, int stock) {
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.stock = stock;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    //Método existencias
    public void verificarStock () {
        if (stock > 0) {
            System.out.println("Existe un stock de: " + stock);
        } else {
            System.out.println("No hay stock");
        }
    }
}
