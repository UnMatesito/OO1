package oo1.ej24;

public abstract class Usuario {
    private String nombre;
    private double saldo;

    public Usuario(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    protected abstract double getComision();

    protected void cargarSaldo(){
        this.saldo = this.saldo + this.getSaldo();
    }
}
