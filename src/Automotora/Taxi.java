package Automotora;

public class Taxi {
    private double valorPasaje;
    //Constructor
   public Taxi(double valorPasaje) {
       this.valorPasaje = valorPasaje;
   }
   public double getValorPasaje() {
       return valorPasaje;
   }
   public void setValorPasaje(double valorPasaje) {
       this.valorPasaje = valorPasaje;
   }
   //Método pagarPasaje
   public double pagarPasaje(double monto) {
       if (monto > valorPasaje) {
           return valorPasaje - monto;
       } else {
           return valorPasaje + monto;
       }
   }
}