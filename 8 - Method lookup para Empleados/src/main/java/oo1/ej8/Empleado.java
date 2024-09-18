package oo1.ej8;

public class Empleado {
    private String nombre;

    public Empleado(String nombre){
        this.nombre = nombre;
    }

    // Retorna 35000
    public double aportes(){
        return 13500;
    }

    // Retorna 35000
    public double montoBasico(){
        return 35000;
    }

    /*
     * 1. this.montoBasico() -> 35000
     * 2. this.aportes() -> 13500
     * 3. this.montoBasico + this.aportes -> 48500
     * 4. return 48500
     */
    public double sueldoBasico(){
        return this.montoBasico() + this.aportes();
    }
}
