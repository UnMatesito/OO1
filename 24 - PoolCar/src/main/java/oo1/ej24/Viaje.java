package oo1.ej24;

import java.time.LocalDate;

public class Viaje {
    private String origen;
    private String destino;
    private double costoTotal;
    private Vehiculo vehiculo;
    private LocalDate fecha;

    public Viaje(String origen, String destino, double costoTotal, Vehiculo vehiculo, LocalDate fecha) {
        this.origen = origen;
        this.destino = destino;
        this.costoTotal = costoTotal;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.vehiculo.getTripulantes().add(this.vehiculo.getDueño());
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double valorViaje(){
        return ((double)this.costoTotal / this.vehiculo.getTripulantes().size());
    }
}
