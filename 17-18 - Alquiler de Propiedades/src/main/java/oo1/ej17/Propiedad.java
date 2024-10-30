package oo1.ej17;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
    private String direccion;
    private String nombreDescriptivo;
    private double precioPorNoche;
    private List<Reserva> reservas;

    public Propiedad(String direccion, String nombreDescriptivo, double precioPorNoche) {
        this.direccion = direccion;
        this.nombreDescriptivo = nombreDescriptivo;
        this.precioPorNoche = precioPorNoche;
        this.reservas = new ArrayList<>();
    }

    public void addReserva(Reserva reserva){
        this.reservas.add(reserva);
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombreDescriptivo() {
        return nombreDescriptivo;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public List<Reserva> getReservas(){
        return new ArrayList<>(this.reservas)
    }
}
