package oo1.ej24;

import oo1.ej14.DateLapse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Usuario{
    private List<Viaje> viajes;

    public Pasajero(String nombre) {
        super(nombre);
        this.viajes = new ArrayList<>();
    }

    public void addViaje(Viaje viaje){
        DateLapse intervalo = new DateLapse(LocalDate.now(), viaje.getFecha());
        if (viaje.getVehiculo().getTripulantes().size() < viaje.getVehiculo().getCapacidad() && intervalo.sizeInDays() >= 2 && this.getSaldo() < 0){
            viaje.getVehiculo().getTripulantes().add(this);
            this.viajes.add(viaje);
        }
    }

    @Override
    protected double getComision() {
        if (this.viajes.stream().filter(viaje -> viaje.getFecha().isBefore(LocalDate.now().minusDays(30))).findAny().orElse(null) != null){
            return 0;
        }
        return 0.01;
    }

    @Override
    public void procesarViaje(Viaje viaje){
        if (this.viajes.stream().findAny().orElse(null) != null){
            this.setSaldo(this.getSaldo() - (viaje.valorViaje() - 500));
        }
    }
}
