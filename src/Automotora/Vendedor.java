package Automotora;

public class Vendedor  extends Persona{
    private String direccion;

    //Constructor
    public Vendedor(String nombre, String rut, String direccion, int edad) {
        super(nombre, rut);
        this.direccion = direccion;
    }

    //Getters and setters
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}