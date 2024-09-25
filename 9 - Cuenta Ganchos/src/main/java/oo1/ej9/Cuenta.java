package oo1.ej9;

public abstract class Cuenta {
    private double saldo;

    public Cuenta(){
        this.saldo = 0;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double monto){
        this.saldo += monto;
    }

    protected void extraerSinControlar(double monto){
        this.saldo -= monto;
    }

    // No deberia preguntar si la cuenta que esta queriendo transferir es la misma (lo cual daria error)?
    public boolean transferirACuenta(double monto, Cuenta cuentaDestino){
        if (this.puedeExtaer(monto)){
            this.extraerSinControlar(monto);
            cuentaDestino.depositar(monto);
            return true;
        }
        return false;
    }

    public boolean extraer(double monto){
        if (this.puedeExtaer(monto)){
            this.extraerSinControlar(monto);
            return true;
        }
        return false;
    }

    protected abstract boolean puedeExtaer(double monto);
}
