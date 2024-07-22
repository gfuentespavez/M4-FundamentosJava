package Automotora;

public class MiniBus extends Bus {
    private String tipoViaje;
//Constructor
    public MiniBus(String color, String patente, String tipoViaje) {
        super(color, patente);
        this.tipoViaje = tipoViaje;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }
    //Método imprime todos los atributos de las clases
    public void imprimeMiniBus() {
        System.out.println("Color: " + getColor());
        System.out.println("Patente: " + getPatente());
        System.out.println("Cantidad de asientos: " + getCantidadDeAsientos());
        System.out.println("Tipo Viaje: " + getTipoViaje());
    }
}

