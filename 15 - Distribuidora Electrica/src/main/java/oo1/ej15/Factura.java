package oo1.ej15;

import java.time.LocalDate;

public class Factura {
    private Usuario usuario;
    private LocalDate fecha;
    private double bonificacion;
    private double montoFinal;

    public Factura(String nombre, String domicilio, LocalDate fecha){
        this.usuario = new Usuario(nombre, domicilio);
        this.fecha = fecha;
    }
}
