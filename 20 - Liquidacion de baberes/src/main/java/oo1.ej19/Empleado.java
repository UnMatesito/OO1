package oo1.ej19;

import oo1.ej14.DateLapse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Empleado{
    private String nombre;
    private String apellido;
    private int cuil;
    private LocalDate fechaNacimiento;
    private boolean hasHijos;
    private List<Contrato> contratos;

    public Empleado(String nombre, String apellido, int cuil, LocalDate fechaNacimiento, boolean hasHijos, List<Contrato> contratos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuil = cuil;
        this.fechaNacimiento = fechaNacimiento;
        this.hasHijos = hasHijos;
        this.contratos = new ArrayList<>();
    }

    public void addContrato(Contrato contrato){
        this.contratos.add(contrato);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCuil() {
        return cuil;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public boolean isHasHijos() {
        return hasHijos;
    }

    public List<Contrato> getContratos() {
        return new ArrayList<>(contratos);
    }

    public int getAntiguedad(){
        int dias = contratos.stream().mapToInt(contrato -> getDias(contrato.getFechaInicio(), contrato.getFechaFin())).sum();
        return dias / 365;
    }

    private int getDias(LocalDate fechaInicio, LocalDate fechaFin){
        DateLapse intervalo = new DateLapse(fechaInicio, fechaFin);
        return intervalo.sizeInDays();
    }

    public ReciboDeSueldo emitirRecibo(){
        Contrato ultimo = contratos.stream()
                .sorted((c1, c2) -> c1.getFechaFin().compareTo(c2.getFechaFin()))
                .collect(Collectors.toList())
                .getLast();
        return new ReciboDeSueldo(this.nombre, this.apellido, this.cuil, this.getAntiguedad(), LocalDate.now(), this.calcularMonto(ultimo.sueldoBasico(), this.getAntiguedad()));
    }

    private double calcularMonto(double sueldoBasico, int antiguedad){
        double descuento = 0;
        if (antiguedad >= 20){
            descuento = new VeinteAños().getDescuento(antiguedad);
        } else if (antiguedad >= 15){
            descuento = new QuinceAños().getDescuento(antiguedad);
        } else if (antiguedad >= 10){
            descuento = new DiezAños().getDescuento(antiguedad);
        } else if (antiguedad >= 5){
            descuento = new CincoAños().getDescuento(antiguedad);
        }
        return sueldoBasico + (sueldoBasico * descuento);
    }
}
