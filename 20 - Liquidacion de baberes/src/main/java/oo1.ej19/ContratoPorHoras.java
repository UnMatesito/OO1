package oo1.ej19;

import java.time.LocalDate;

public class ContratoPorHoras extends Contrato{
    private double numeroHoras;
    private double valorHora;

    public ContratoPorHoras(LocalDate fechaInicio, LocalDate fechaFin, double numeroHoras, double valorHora) {
        super(fechaInicio, fechaFin);
        this.numeroHoras = numeroHoras;
        this.valorHora = valorHora;
    }

    public double getNumeroHoras() {
        return numeroHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    @Override
    public double sueldoBasico(){
        return valorHora * numeroHoras;
    }
}
