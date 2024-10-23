package oo1.ej19;

import java.time.LocalDate;

public class EnvioLocal extends Envio{
    private boolean entregaRapida;

    public EnvioLocal(LocalDate fechaDespacho, String direccionDeOrigen, String direccionDeDestino, double peso, boolean entregaRapida) {
        super(fechaDespacho, direccionDeOrigen, direccionDeDestino, peso);
        this.entregaRapida = entregaRapida;
    }

    @Override
    protected double calcularCosto() {
        if (entregaRapida) return 1500;
        return 1000;
    }
}
