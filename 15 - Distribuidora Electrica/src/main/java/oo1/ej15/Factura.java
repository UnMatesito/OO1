package oo1.ej15;

import java.time.LocalDate;

public class Factura {
    private Usuario usuario;
    private LocalDate fecha;
    private Consumo consumo;
    private CuadroTarifario tarifaKwh;
    private boolean bonificacion;
    private double montoFinal;

    public Factura(Usuario usuario, LocalDate fecha){
        this.usuario = usuario;
        this.fecha = fecha;
        this.consumo = usuario.getConsumos().getLast();
        this.tarifaKwh = new CuadroTarifario(1000.0);
        hayBonificacion();
        setMontoFinal();
    }

    public void hayBonificacion(){
        if (factorDePotencia() == 0.8){
            this.bonificacion = true;
        } else {
            this.bonificacion = false;
        }
    }

    private double factorDePotencia(){
        return consumo.getKwh() / Math.sqrt(Math.pow(consumo.getKwh(), 2) + Math.pow(consumo.getKvarh(), 2));
    }

    private void setMontoFinal(){
        if (this.bonificacion){
            this.montoFinal = getCostoConsumo() - (getCostoConsumo() * 0.1);
        } else {
            this.montoFinal = getCostoConsumo();
        }
    }

    private double getCostoConsumo(){
        return consumo.getKwh() * this.tarifaKwh.getPrecioKWH();
    }
}
