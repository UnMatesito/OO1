package oo1.ej8;

public class Ej8 {
    public static void main(String[] args) {
        Gerente alan = new Gerente("Alan Turing");
        double aportesDeAlan = alan.aportes();
        double sueldoBasicoDeAlan = alan.sueldoBasico();

        // Lo realiza en la clase Gerente
        System.out.println(aportesDeAlan); // Aportes: 2850.0
        // Busca de la clase EmpleadoJerarquico debido a que no posee el metodo .sueldoBasico()
        System.out.println(sueldoBasicoDeAlan); // Sueldo basico: 67850.0
    }
}
