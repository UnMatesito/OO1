package oo1.ej11;

import java.util.ArrayList;
import java.util.List;

public class Inversor{
    private String nombre;
    private List<Inversion> inversiones;

    public Inversor(String nombre){
        this.nombre = nombre;
        this.inversiones = new ArrayList<>();
    }

    public List<Inversion> getInversiones() {
        return new ArrayList<>(inversiones);
    }

    public void addInversion(Inversion inversion){
        inversiones.add(inversion);
    }

    public double valorActual(){
        return inversiones.stream().mapToDouble(inversion -> inversion.valorActual()).sum();
    }

}
