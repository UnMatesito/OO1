package oo1.ej17;

public class Propiedad {
    private String direccion;
    private String nombreDescriptivo;
    private double precioPorNoche;

    public Propiedad(String direccion, String nombreDescriptivo, double precioPorNoche) {
        this.direccion = direccion;
        this.nombreDescriptivo = nombreDescriptivo;
        this.precioPorNoche = precioPorNoche;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombreDescriptivo() {
        return nombreDescriptivo;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }
}
