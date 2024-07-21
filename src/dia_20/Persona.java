package dia_20;

public class Persona {

    private String nombre;
    private String rut;

    public Persona(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                '}';
    }
}

class Abogado extends Persona {

    private String titulo;

    public Abogado(String nombre, String rut, String titulo) {
        super(nombre, rut);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Abogado{" +
                "nombre='" + getNombre() + '\'' +
                ", rut='" + getRut() + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}

class Juez extends Persona {

    private String direccion;

    public Juez(String nombre, String rut, String direccion) {
        super(nombre, rut);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Juez{" +
                "nombre='" + getNombre() + '\'' +
                ", rut='" + getRut() + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

class Run {

    public static void main(String[] args) {
        Abogado abogado = new Abogado("Juan Perez", "12345678-9", "Abogado Penal");
        Juez juez = new Juez("Maria Lopez", "98765432-1", "Tribunal de Concepción");

        System.out.println("Abogado: " + abogado);
        System.out.println("Juez: " + juez);
    }
}