package oo1.ej17;

import oo1.ej14.DateLapse;

import java.time.LocalDate;

public class Reserva {
    private int cantidadNoches;
    private PeriodoReserva periodo;

    public Reserva(int cantidadNoches, PeriodoReserva periodo) {
        this.cantidadNoches = cantidadNoches;
        this.periodo = periodo;
    }

    public double calcularPrecio(double precioPorNoche){
        return precioPorNoche * cantidadNoches;
    }

    protected boolean entreFechas(LocalDate fechaInicio, LocalDate fechaFin){
        return this.periodo.overlapse(new DateLapse(fechaInicio, fechaFin));
    }

    protected boolean fechaDentroDePeriodo(LocalDate fecha){
        return this.periodo.dentroPeriodo(fecha);
    }
}
