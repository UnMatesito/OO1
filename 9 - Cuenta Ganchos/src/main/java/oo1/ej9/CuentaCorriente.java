package oo1.ej9;

public class CuentaCorriente extends Cuenta{
    private double descubierto;

    public CuentaCorriente(){
        this.descubierto = 0;
    }

    public double getDescubierto(){
        return descubierto;
    }

    public void setDescubierto(double descubierto){
        this.descubierto = descubierto;
    }

    @Override
    protected boolean puedeExtaer(double monto) {
        return this.getSaldo() > this.getDescubierto();
    }
}
