package oo1.ej19;

import java.time.LocalDate;

public abstract class Contrato {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Contrato(LocalDate fechaInicio, LocalDate fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    protected abstract double sueldoBasico();
}
