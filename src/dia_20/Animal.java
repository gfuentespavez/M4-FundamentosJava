package dia_20;

public class Animal {
    private int edad;
    private String origen;

    public Animal(int edad, String origen) {
        this.edad = edad;
        this.origen = origen;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Edad: " + edad + ", Origen: " + origen;
    }
}

class Zorro extends Animal {
    private String tipoDeZorro;

    public Zorro(int edad, String origen, String tipoDeZorro) {
        super(edad, origen);
        this.tipoDeZorro = tipoDeZorro;
    }

    public String getTipoDeZorro() {
        return tipoDeZorro;
    }

    public void setTipoDeZorro(String tipoDeZorro) {
        this.tipoDeZorro = tipoDeZorro;
    }

    @Override
    public String toString() {
        return "Zorro: { " +
                "Edad: " + getEdad() +
                ", Origen: " + getOrigen() +
                ", Tipo de Zorro: " + tipoDeZorro +
                " }";
    }
}

class Leon extends Animal {
    private String sexo;

    public Leon(int edad, String origen, String sexo) {
        super(edad, origen);
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Leon: { " +
                "Edad: " + getEdad() +
                ", Origen: " + getOrigen() +
                ", Sexo: " + sexo +
                " }";
    }
}

class Main {
    public static void main(String[] args) {
        Zorro zorro = new Zorro(8, "Siberia", "Viejo");
        Leon leon = new Leon(20, "Antartica", "macho");

        System.out.println(zorro);
        System.out.println(leon);
    }
}