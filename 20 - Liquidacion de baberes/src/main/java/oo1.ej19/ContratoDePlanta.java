package oo1.ej19;

import java.time.LocalDate;

public class ContratoDePlanta extends Contrato {
    private double sueldo;
    private double montoConyugue;
    private double montoHijos;

    public ContratoDePlanta(LocalDate fechaInicio, double sueldo, double montoConyugue, double montoHijos) {
        super(fechaInicio, LocalDate.now());
        this.sueldo = sueldo;
        this.montoConyugue = montoConyugue;
        this.montoHijos = montoHijos;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getMontoConyugue() {
        return montoConyugue;
    }

    public double getMontoHijos() {
        return montoHijos;
    }

    @Override
    public double sueldoBasico() {
        return sueldo + montoConyugue + montoHijos;
    }
}
