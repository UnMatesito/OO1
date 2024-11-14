package oo1.ej25;

public class ConsultaMedica extends ServicioIntervenido{
    public ConsultaMedica(Mascota mascota, Medico medico) {
        super(mascota, medico);
    }

    private double getAdicionalDescartables(){
        return 300;
    }

    private double getAdicionalAntiguedad(){
        return 100 * this.getMedico().getAñosServicio();
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto() + this.getAdicionalDescartables() + this.getAdicionalAntiguedad();
    }
}
