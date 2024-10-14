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

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public List<Consumo> getConsumos() {
        return new ArrayList<>();
    }

    public Factura emitirFactura(){
        return new Factura(this, LocalDate.now());
    }

    public void addConsumo(Consumo consumo){
        this.consumos.add(consumo);
    }
}
