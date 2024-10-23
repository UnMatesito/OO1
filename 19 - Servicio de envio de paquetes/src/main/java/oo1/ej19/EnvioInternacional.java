package oo1.ej19;

import java.time.LocalDate;

public class EnvioInternacional extends Envio{

    public EnvioInternacional(LocalDate fechaDespacho, String direccionDeOrigen, String direccionDeDestino, double peso) {
        super(fechaDespacho, direccionDeOrigen, direccionDeDestino, peso);
    }

    @Override
    protected double calcularCosto() {
        double peso = getPeso();
        if (peso > 1000) return hasta1KG(peso);
        return mas1KG(peso);
    }

    private double hasta1KG(double peso){
        return 10 * peso;
    }

    private double mas1KG(double peso){
        return 12 * peso;
    }
}
