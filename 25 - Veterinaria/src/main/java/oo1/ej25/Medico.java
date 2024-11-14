package oo1.ej25;

import java.time.LocalDate;

public class Medico {
    private String nombre;
    private LocalDate fechaIngreso;
    private double honorarios;

    public Medico(String nombre, LocalDate fechaIngreso, double honorarios) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.honorarios = honorarios;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public double getHonorarios() {
        return honorarios;
    }

    public int getAñosServicio(){
        return LocalDate.now().getYear() - fechaIngreso.getYear();
    }
}
