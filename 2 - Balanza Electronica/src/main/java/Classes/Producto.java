package Classes;

public class Producto {
    private double peso;
    private double precioPorKilo;
    private String descripcion;

    public double getPrecio(){
        return precioPorKilo * peso;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPrecioPorKilo(double precioPorKilo) {
        this.precioPorKilo = precioPorKilo;
    }

    public double getPrecioPorKilo() {
        return precioPorKilo;
    }
}
