package oo1.ej9;

public class CajaDeAhorro extends Cuenta{

    @Override
    protected boolean puedeExtaer(double monto) {
        return this.getSaldo() > aplicarCostoAdicional(monto);
    }

    private double aplicarCostoAdicional(double monto) {
        return monto - (monto * 0.02);
    }

    @Override
    public void depositar(double monto) {
        super.depositar(aplicarCostoAdicional(monto));
    }

    @Override
    public boolean extraer(double monto) {
        return super.extraer(aplicarCostoAdicional(monto));
    }

    @Override
    protected void extraerSinControlar(double monto){
        super.extraerSinControlar(aplicarCostoAdicional(monto));
    }
}
