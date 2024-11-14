package oo1.ej25;

public class Vacunacion extends ServicioIntervenido {
    private String nombreVacuna;
    private double costoVacuna;

    public Vacunacion(Mascota mascota, Medico medico, String nombreVacuna, double costoVacuna) {
        super(mascota, medico);
        this.nombreVacuna = nombreVacuna;
        this.costoVacuna = costoVacuna;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public double getCostoVacuna() {
        return costoVacuna;
    }

    private double getAdicionalDescartables(){
        return 500;
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto() + this.getAdicionalDescartables() + costoVacuna;
    }
}
