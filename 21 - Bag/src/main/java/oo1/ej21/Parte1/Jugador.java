package oo1.ej21.Parte1;

public class Jugador {
    private String nombre;
    private String apellido;

    public Jugador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
