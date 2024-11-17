package oo1.ej24;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    private Conductor dueño;
    private String descripcion;
    private int capacidad; //Incluye al conductor
    private int añoFabricacion;
    private double valorMercado;
    private List<Usuario> tripulantes;

    public Vehiculo(String descripcion, int capacidad, int añoFabricacion, double valorMercado) {
        this.descripcion = descripcion;
        this.capacidad = capacidad;
        this.añoFabricacion = añoFabricacion;
        this.valorMercado = valorMercado;
        this.tripulantes = new ArrayList<>();
    }

    public void setDueño(Conductor dueño) {
        this.dueño = dueño;
    }

    public void addTripulante(Usuario tripulante) {
        this.tripulantes.add(tripulante);
    }

    public Conductor getDueño() {
        return dueño;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public List<Usuario> getTripulantes() {
        return tripulantes;
    }

    public int getEstadoDeCapacidad(){
        return this.tripulantes.size();
    }
}
