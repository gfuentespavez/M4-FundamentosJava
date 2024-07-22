package Botilleria;

public class Botilleria {
    private String nombre;
    private Cerveza cerveza;

    public Botilleria(Cerveza cerveza, String nombre) {
        this.cerveza = cerveza;
        this.nombre = nombre;
    }
    public Cerveza getCerveza() {
        return cerveza;
    }
    public void setCerveza(Cerveza cerveza) {
        this.cerveza = cerveza;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}