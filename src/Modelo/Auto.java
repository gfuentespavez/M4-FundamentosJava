package Modelo;

public class Auto {
        private double altura;
        private double ancho;
        private String tipoMaterial;
        private String color;

        public Auto(double Altura, String tipoMaterial) {
            this.altura = Altura;
            this.tipoMaterial = tipoMaterial;
        }
        public double getAltura() {
            return altura;
        }
        public String getTipoMaterial() {
            return tipoMaterial;
        }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
}