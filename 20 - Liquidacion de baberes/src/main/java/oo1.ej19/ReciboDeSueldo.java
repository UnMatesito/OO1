package oo1.ej19;

import java.time.LocalDate;

public class ReciboDeSueldo {
    private String nombre;
    private String apellido;
    private int cuil;
    private int antiguedad;
    private LocalDate fecha;
    private double monto;

    public ReciboDeSueldo(String nombre, String apellido, int cuil, int antiguedad, LocalDate fecha, double monto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuil = cuil;
        this.antiguedad = antiguedad;
        this.fecha = fecha;
        this.monto = monto ;
    }

    @Override
    public String toString() {
        return "ReciboDeSueldo{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cuil=" + cuil +
                ", antiguedad=" + antiguedad +
                ", fecha=" + fecha +
                ", monto=" + monto +
                '}';
    }
}
