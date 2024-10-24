package oo1.ej19;

import oo1.ej14.DateLapse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Cliente {
    private String nombre;
    private String direccion;
    // Los envios estan ordenados por fecha??
    private List<Envio> envios;

    public Cliente(String nombre, String direccion, Envio envios) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.envios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Envio> getEnvios() {
        return new ArrayList<>(envios);
    }

    public void addEnvio(Envio envio){
        this.envios.add(envio);
    }

    public double CalcularMontoPorPeriodo(LocalDate fechaInicio, LocalDate fechaFin){
        DateLapse intervalo = new DateLapse(fechaInicio, fechaFin);
        List<Envio> e = envios.stream().filter(envio -> intervalo.includesDate(envio.getFechaDespacho())).collect(Collectors.toList());
        return e.stream().mapToDouble(envio -> envio.calcularCosto()).sum();
    }

    protected abstract double descuento();

}
