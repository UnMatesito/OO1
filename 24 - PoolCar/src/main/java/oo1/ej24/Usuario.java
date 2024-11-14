package oo1.ej24;

public abstract class Usuario {
    private String nombre;
    private double saldo;

    public Usuario(String nombre) {
        this.nombre = nombre;
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

    protected abstract void procesarViaje(Viaje viaje);

    protected abstract double getComision();

    protected void cargarSaldo(double monto){
        this.saldo = monto + (monto * this.getComision());
    }
}
