package oo1.ej8;

public class EmpleadoJerarquico extends Empleado {

    // Recibe el nombre del constructor de Empleado
    public EmpleadoJerarquico(String nombre) {
        super(nombre);
    }

    /*
     * 1. Empleado.sueldoBasico -> Empleado.montoBasico() -> 35000 + Empleado.aportes() -> 13500
     * 2. super.sueldoBasico -> Empleado.sueldoBasico = 48500
     * 3. this.bonoPorCategoria = 8000
     * 4. super.sueldoBasico() -> 48500 + this.bonoPorCategoria -> 8000
     * 5. return 56500
     */
    public double sueldoBasico(){
        return super.sueldoBasico() + this.bonoPorCategoria();
    }

    // Retorna 45000
    public double montoBasico(){
        return 45000;
    }

    // Retorna 8000
    public double bonoPorCategoria(){
        return 8000;
    }
}
