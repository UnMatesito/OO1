package oo1.ej19;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio{
    private double distancia;

    public EnvioInterurbano(LocalDate fechaDespacho, String direccionDeOrigen, String direccionDeDestino, double peso, double distancia) {
        super(fechaDespacho, direccionDeOrigen, direccionDeDestino, peso);
        this.distancia = distancia;
    }

    //ESTA BIEN?????
    @Override
    protected double calcularCosto() {
        double peso = getPeso();
        if (distancia < 100) return menos100Km(peso);
        if (distancia >= 100 && distancia <= 500) return entre100KmY500Km(peso);
        return mas500km(peso);
    }

    private double menos100Km(double peso){
        return 20 * peso;
    }

    private double entre100KmY500Km(double peso){
        return 25 * peso;
    }

    private double mas500km(double peso){
        return 30 * peso;
    }
}
