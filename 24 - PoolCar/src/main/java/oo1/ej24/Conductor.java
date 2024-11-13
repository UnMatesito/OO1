package oo1.ej24;

import java.time.LocalDate;

public class Conductor extends Usuario{
    private Vehiculo vehiculo;

    public Conductor(String nombre, double saldo, Vehiculo vehiculo) {
        super(nombre, saldo);
        this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
    public void newViaje(String origen, String destino, double costoTotal, LocalDate fecha){
        Viaje v = new Viaje(origen, destino, costoTotal, this.vehiculo, fecha);
    }

    @Override
    public double getComision() {
        if (LocalDate.now().getYear() - vehiculo.getAñoFabricacion() < 5){
            return 1;
        }
        return 10;
    }
}
