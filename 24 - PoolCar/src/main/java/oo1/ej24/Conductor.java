package oo1.ej24;

import java.time.LocalDate;

public class Conductor extends Usuario{
    private Vehiculo vehiculo;

    public Conductor(String nombre, Vehiculo vehiculo) {
        super(nombre);
        this.vehiculo = vehiculo;
        this.vehiculo.setDueño(this);
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    @Override
    protected double getComision() {
        if (LocalDate.now().getYear() - vehiculo.getAñoFabricacion() < 5){
            return 0.01;
        }
        return 0.1;
    }

    @Override
    public void procesarViaje(Viaje viaje){
        this.setSaldo(this.getSaldo() - (viaje.valorViajeIndividual() + (this.vehiculo.getValorMercado() * 0.01)));
    }
}
