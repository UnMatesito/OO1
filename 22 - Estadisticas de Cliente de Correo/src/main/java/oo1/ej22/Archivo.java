package oo1.ej22;

public class Archivo {
    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    public int tamaño(){
        return nombre.length();
    }

    public String getNombre(){
        return nombre;
    }
}
