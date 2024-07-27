package Modelo;

public class Auto {
    // Atributos
    private String marca;
    private String color;
    private String modelo;
    private int velocidadActual;
    private boolean motorEncendido;

    // Getters and setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public void apagarMotor() {
        if (this.velocidadActual == 0) {
            this.setMotorEncendido(false);
        }
    }

    public static void main(String[] args) {
        // Creamos la instancia
        Auto instancia = new Auto();
        // Encendemos el motor
        instancia.setMotorEncendido(true);
        System.out.println("Motor Encendido: " + instancia.isMotorEncendido());
        // Acelerar hasta 100
        instancia.aumentarVelocidad(100);
        System.out.println("Velocidad: " + instancia.getVelocidadActual());
        // Frenar
        instancia.frenar();
        // Intentamos apagar el motor
        instancia.apagarMotor();
        // Imprimir el estado de las instancias
        System.out.println("Auto: ");
        System.out.println("Velocidad: " + instancia.getVelocidadActual());
        System.out.println("Motor Encendido: " + instancia.isMotorEncendido());
    }

    // Implementación de los métodos aumentarVelocidad y frenar
    private void aumentarVelocidad(int incremento) {
        if (motorEncendido) {
            this.velocidadActual += incremento;
        }
    }

    private void frenar() {
        if (motorEncendido && this.velocidadActual > 0) {
            this.velocidadActual = 0;
        }
    }
}