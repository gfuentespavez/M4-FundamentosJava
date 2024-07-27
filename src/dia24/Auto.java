package dia24;
import dia24.SistemaSonido;

public class Auto {
    //Atributos
    private String marca;
    private String modelo;
    private String color;
    private int velocidadActual;
    private boolean motorEncendido;
    //Composición
    private SistemaSonido sistemaSonido;
    //Constructor
    public Auto(String marca, String modelo, String color, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidadActual = velocidadActual;
        this.sistemaSonido = new SistemaSonido();
        this.motorEncendido = false;
    }
    //Setter sistemaSonido

    public void setSistemaSonido(SistemaSonido sistemaSonido) {
        this.sistemaSonido = sistemaSonido;
    }

    public void aumentarVelocidad(int velocidad) {
        velocidadActual = velocidadActual + velocidad;
    }
    public void aumentarVelocidad() {
        velocidadActual = velocidadActual + 10;
    }
    public void aumentarVelocidad(boolean maximoCiudad, boolean maximoCarretera) {
        if(maximoCiudad) {
            velocidadActual = velocidadActual + 50;
        }
        if(maximoCarretera) {
            velocidadActual = velocidadActual + 100;
        }
    }
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", velocidadActual="
                + ", motorEncendido=" + motorEncendido + "]";
    }
    //Método main
    public static void main(String[] args) {
        Auto instanciaAuto = new Auto("Toyota", "Corolla", "Rojo", 0);
        System.out.println("Auto creado");
        instanciaAuto.aumentarVelocidad();
        System.out.println("Sistema de sonido creado");
        SistemaSonido sistemaSonido = new SistemaSonido();
        sistemaSonido.setVolumenMaximo(100);
        instanciaAuto.setSistemaSonido(sistemaSonido);
        System.out.println(instanciaAuto.toString());
    }
}