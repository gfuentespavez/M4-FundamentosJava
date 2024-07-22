package Botilleria;

public class Cerveza extends Botella{
    private int precio;

    public Cerveza(String tipoBotella, String marca, int precio) {
        super(tipoBotella, marca);
        this.precio = precio;
    }

    public Cerveza(String tipoBotella, String marca) {
        super(tipoBotella, marca);
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}