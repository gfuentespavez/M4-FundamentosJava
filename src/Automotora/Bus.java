package Automotora;

public class Bus extends Vehiculo {
    private int cantidadDeAsientos;
    //Constructor
    public Bus(String color, String patente) {
        super(color, patente);
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }
    //Método retorna cantidad de asientos disponibles.
    public int asientosDisponibles() {
        return cantidadDeAsientos;
    }
}
