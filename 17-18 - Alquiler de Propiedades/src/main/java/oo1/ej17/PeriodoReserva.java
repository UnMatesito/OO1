package oo1.ej17;

import oo1.ej14.DateLapse;

import java.time.LocalDate;

public class PeriodoReserva {
    private DateLapse periodoReserva;

    public PeriodoReserva(DateLapse periodoReserva) {
        this.periodoReserva = periodoReserva;
    }

    public boolean overlapse(DateLapse anotherPeriodoReserva) {
        return anotherPeriodoReserva.includesDate(periodoReserva.getFrom()) || anotherPeriodoReserva.includesDate(periodoReserva.getTo());
    }

    protected boolean dentroPeriodo(LocalDate fecha){
        return this.periodoReserva.includesDate(fecha);
    }
}
