package oo1.ej17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String direccion;
    private int dni;
    private List<Propiedad> propiedades;

    public Usuario(String nombre, String direccion, int dni) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
        this.propiedades = new ArrayList<>();
    }

    public void addPropieadad(Propiedad propiedad){
        this.propiedades.add(propiedad);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getDni() {
        return dni;
    }

    public List<Propiedad> getPropiedades() {
        return new ArrayList<>(this.propiedades);
    }
}
