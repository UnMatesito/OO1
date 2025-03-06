package oo1.ej17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String direccion;
    private int DNI;
    private List<Propiedad> propiedades;

    public Usuario(String nombre, String direccion, int DNI) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.DNI = DNI;
        this.propiedades = new ArrayList<>();
    }

    public double calcularIngresos(LocalDate fechaInicio, LocalDate fechaFin){
        return this.propiedades.stream().mapToDouble(propiedad -> propiedad.ingresosPropieadaPorPeriodo(fechaInicio, fechaFin)).sum() * 0.75;
    }
}
