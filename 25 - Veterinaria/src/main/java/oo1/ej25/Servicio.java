package oo1.ej25;

import java.time.LocalDate;

public abstract class Servicio {
    private Mascota mascota;
    private LocalDate fecha;

    public Servicio(Mascota mascota) {
        this.mascota = mascota;
        this.fecha = LocalDate.now();
    }

    protected abstract double calcularCosto();

    protected boolean isDomingo(){
        return this.fecha.getDayOfWeek().getValue() == 7;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
