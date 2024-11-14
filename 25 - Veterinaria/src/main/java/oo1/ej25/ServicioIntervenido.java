package oo1.ej25;

public abstract class ServicioIntervenido extends Servicio{
    private Medico medico;

    public ServicioIntervenido(Mascota mascota, Medico medico) {
        super(mascota);
        this.medico = medico;
    }

    public Medico getMedico() {
        return medico;
    }

    private double costoDomingo(){
        if (this.isDomingo()){
            return 200;
        }
        return 0;
    }

    @Override
    protected double calcularCosto() {
        return medico.getHonorarios() + costoDomingo();
    }
}
