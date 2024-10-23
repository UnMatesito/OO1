package oo1.ej19;

import java.time.LocalDate;

public abstract class Envio {
    private LocalDate fechaDespacho;
    private String direccionDeOrigen;
    private String direccionDeDestino;
    private double peso;

    public Envio(LocalDate fechaDespacho, String direccionDeOrigen, String direccionDeDestino, double peso) {
        this.fechaDespacho = fechaDespacho;
        this.direccionDeOrigen = direccionDeOrigen;
        this.direccionDeDestino = direccionDeDestino;
        this.peso = peso;
    }

    public LocalDate getFechaDespacho() {
        return fechaDespacho;
    }

    public String getDireccionDeOrigen() {
        return direccionDeOrigen;
    }

    public String getDireccionDeDestino() {
        return direccionDeDestino;
    }

    public double getPeso() {
        return peso;
    }

    protected abstract double calcularCosto();
}
