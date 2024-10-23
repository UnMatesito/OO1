package oo1.ej19;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    private String nombre;
    private String direccion;
    // Los envios estan ordenados por fecha??
    private List<Envio> envios;

    public Cliente(String nombre, String direccion, Envio envios) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.envios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Envio> getEnvios() {
        return new ArrayList<>(envios);
    }

    protected abstract double descuento();


}
