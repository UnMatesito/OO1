package oo1.ej25;

public class Guarderia extends Servicio{
    private int cantDias;

    public Guarderia(Mascota mascota, int cantDias) {
        super(mascota);
        this.cantDias = cantDias;
    }

    public int getCantDias() {
        return cantDias;
    }

    private double getCostoDia(){
        return 500;
    }

    @Override
    public double calcularCosto() {
        if (this.getMascota().cantServicios(5)){
            return (cantDias * this.getCostoDia()) + ((cantDias * this.getCostoDia()) * 0.1);
        }
        return cantDias * this.getCostoDia();
    }
}
