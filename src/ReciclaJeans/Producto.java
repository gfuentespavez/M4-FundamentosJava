package ReciclaJeans;

import java.util.UUID;

public class Producto {
    // Atributos
    private String articulo;
    private String precio;
    private String descripcion;
    private String codigo;
    private String talla;
    private String marca;
    private String color;

    // Constructores
    public Producto(String articulo, String precio, String descripcion, String codigo, String talla, String marca, String color) {
        this.articulo = articulo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.codigo = (codigo != null && !codigo.isEmpty()) ? codigo : generarCodigo(); // Genera un código si no se proporciona
        this.talla = talla;
        this.marca = marca;
        this.color = color;
    }

    public Producto() {
        this.codigo = generarCodigo(); // Genera un código aleatorio por defecto
    }

    // Método para generar un código aleatorio
    private String generarCodigo() {
        return UUID.randomUUID().toString();
    }

    // Getters y setters
    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = (codigo != null && !codigo.isEmpty()) ? codigo : generarCodigo(); // Reasigna si se proporciona un nuevo código
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Producto{" +
                "articulo='" + articulo + '\'' +
                ", precio='" + precio + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", codigo='" + codigo + '\'' +
                ", talla='" + talla + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
