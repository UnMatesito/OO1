package oo1.ej15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String domicilio;
    private List<Consumo> consumos;

    public Usuario(String nombre, String domicilio){
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.consumos = new ArrayList<>();
    }

    public void addConsumo(Consumo consumo){
        consumos.add(consumo);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public List<Consumo> getConsumos(){
        return new ArrayList<>();
    }

    private double factorDePotencia(Consumo consumo){
        return consumo.getKwh() / Math.sqrt(Math.pow(consumo.getKwh(), 2) + Math.pow(consumo.getKvarh(), 2));
    }

    public Factura emitirFactura(CuadroTarifario tarifa){
        double bonificacion = 0;
        double costoConsumo = consumos.getLast().getKwh() * tarifa.getPrecioKWH();
        double montoFinal = costoConsumo;
        if (factorDePotencia(consumos.getLast()) == 0.8){
            bonificacion = 0.1;
            montoFinal = costoConsumo * bonificacion;
        }
        return new Factura(this, LocalDate.now(), montoFinal, bonificacion);
    }
}
