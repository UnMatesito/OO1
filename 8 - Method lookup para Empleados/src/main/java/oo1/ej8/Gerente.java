package oo1.ej8;

public class Gerente extends EmpleadoJerarquico{

    // Recibe el nombre del constructor de Empleado
    public Gerente(String nombre){
        super(nombre);
    }

    /*
     * 1. this.montoBasico() -> 57000
     * 2. this.montoBasico() * 0.05d -> 2850
     * 3. return 2850
     */
    public double aportes(){
        return this.montoBasico() * 0.05d;
    }

    // Retorna 57000
    public double montoBasico(){
        return 57000;
    }
}
