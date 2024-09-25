package oo1.ej11;

import java.time.LocalDate;

public class PlazoFijo implements Inversion{
    private LocalDate fechaDeConstitucion;
    private double montoDepositado;
    private double porcentajeDeInteresDiario;

    public PlazoFijo(LocalDate fecha, double monto, double porcentaje){
        this.fechaDeConstitucion = fecha;
        this.montoDepositado = monto;
        this.porcentajeDeInteresDiario = porcentaje;
    }

    public LocalDate getFechaDeConstitucion() {
        return fechaDeConstitucion;
    }

    public double getMontoDepositado() {
        return montoDepositado;
    }

    public double getPorcentajeDeInteresDiario() {
        return porcentajeDeInteresDiario;
    }

    public double valorActual(){
        int diasPasados = this.fechaDeConstitucion.until(LocalDate.now()).getDays();
        return montoDepositado + (diasPasados * (montoDepositado * porcentajeDeInteresDiario));
    }
}
