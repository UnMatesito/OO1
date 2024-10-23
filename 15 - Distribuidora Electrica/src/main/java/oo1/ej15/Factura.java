package oo1.ej15;

import java.time.LocalDate;

public class Factura {
    private Usuario usuario;
    private LocalDate fecha;
    private double bonificacion;
    private double montoFinal;

    public Factura(Usuario usuario, LocalDate fecha, double montoFinal, double bonificacion){
        this.usuario = usuario;
        this.fecha = fecha;
        this.montoFinal = montoFinal;
        this.bonificacion = bonificacion;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "usuario=" + usuario +
                ", fecha=" + fecha +
                ", bonificacion=" + bonificacion +
                ", montoFinal=" + montoFinal +
                '}';
    }
}
