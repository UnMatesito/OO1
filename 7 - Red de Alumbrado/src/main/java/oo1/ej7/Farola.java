package oo1.ej7;

import java.util.ArrayList;
import java.util.List;

public class Farola {
    private boolean estado;
    private List<Farola> vecinos;

    /*
     * Crear una farola. Debe inicializarla como apagada
     */
    public Farola(){
        this.estado = false;
        this.vecinos = new ArrayList<>();
    }

    /*
     * Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
     */
    public void pairWithNeighbor(Farola otraFarola){
        this.vecinos.add(otraFarola);
        otraFarola.vecinos.add(this);
    }

    /*
     * Retorna sus farolas vecinas
     */
    public List<Farola> getNeighbors(){
        return vecinos;
    }


    /*
     * Si la farola no está encendida, la enciende y propaga la acción.
     */
    public void turnOn(){
        // Preguntar si esta implentacion esta bien o debo usar streams
        this.estado = true;
        for (Farola farola : vecinos){
            if (!farola.estado){
                farola.estado = true;
            }
        }
    }

    /*
     * Si la farola no está apagada, la apaga y propaga la acción.
     */
    public void turnOff(){
        // Preguntar si esta implentacion esta bien o debo usar streams
        this.estado = false;
        for (Farola farola : vecinos){
            if (farola.estado){
                farola.estado = false;
            }
        }
    }

    /*
     * Retorna true si la farola está encendida.
     */
    public boolean isOn(){
        return this.estado;
    }

    /*
     * Retorna true si la farola está apagada.
     */
    public boolean isOff(){
        return !this.estado;
    }


}
