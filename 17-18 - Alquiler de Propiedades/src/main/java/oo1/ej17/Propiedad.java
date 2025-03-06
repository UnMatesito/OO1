package oo1.ej17;

import oo1.ej14.DateLapse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propiedad {
    private String direccion;
    private String nombre;
    private double precioPorNoche;
    private List<Reserva> reservas;

    public Propiedad(String direccion, String nombre, double precioPorNoche) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.precioPorNoche = precioPorNoche;
        this.reservas = new ArrayList<>();
    }

    protected boolean estaDisponible(LocalDate fechaInicio, LocalDate fechaFin){
        return this.reservas.stream().noneMatch(reserva -> reserva.entreFechas(fechaInicio, fechaFin));
    }

    protected boolean noSeEncuentraEnPeriodo(){
        return this.reservas.stream().noneMatch(reserva -> reserva.fechaDentroDePeriodo(LocalDate.now()));
    }

    public void cancelarReserva(Reserva reserva){
        if (noSeEncuentraEnPeriodo()){
            this.reservas.remove(reserva);
        }
    }

    public void agregarReserva(int cantNoches, LocalDate fechaInicio, LocalDate fechaFin){
        if (estaDisponible(fechaInicio, fechaFin)){
            reservas.add(new Reserva(cantNoches, new PeriodoReserva(new DateLapse(fechaInicio, fechaFin))));
        }
    }

    public double ingresosPropieadaPorPeriodo(LocalDate fechaInicio, LocalDate fechaFin){
        return this.reservas.stream().filter(reserva -> reserva.entreFechas(fechaInicio, fechaFin)).mapToDouble(reserva -> reserva.calcularPrecio(precioPorNoche)).sum();
    }
}

