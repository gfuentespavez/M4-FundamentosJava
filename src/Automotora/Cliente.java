package Automotora;

public class Cliente extends Persona {
    private int edad;
    //Constructor
    public Cliente(String nombre, String rut, int edad) {
        super(nombre, rut);
        this.edad = edad;
    }
    //Getters and setters

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
}