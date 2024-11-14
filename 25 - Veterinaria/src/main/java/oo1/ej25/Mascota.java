package oo1.ej25;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mascota {
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private String especie;
    private List<Servicio> servicios;

    public Mascota(String nombre, LocalDate fechaDeNacimiento, String especie) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.especie = especie;
        this.servicios = new ArrayList<>();
    }

    public Servicio addConsultaMedica(Medico medico){
        Servicio consulta = new ConsultaMedica(this, medico);
        this.servicios.add(consulta);
        return consulta;
    }

    public Servicio addVacunacion(Medico medico, String nombreVacuna, double costoVacuna){
        Servicio vacunacion = new Vacunacion(this, medico, nombreVacuna, costoVacuna);
        this.servicios.add(vacunacion);
        return vacunacion;
    }

    public Servicio addGuarderia(int cantDias){
        Servicio guarderia = new Guarderia(this, cantDias);
        this.servicios.add(guarderia);
        return guarderia;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getEspecie() {
        return especie;
    }

    public List<Servicio> getServicios() {
        return new ArrayList<>(servicios);
    }

    public boolean cantServicios(int cantidad){
        return this.servicios.size() >= cantidad;
    }

    public double getRecaudacion(LocalDate fecha){
        return this.servicios.stream().filter(servicio -> servicio.getFecha().equals(fecha)).mapToDouble(servicio -> servicio.calcularCosto()).sum();
    }
}
