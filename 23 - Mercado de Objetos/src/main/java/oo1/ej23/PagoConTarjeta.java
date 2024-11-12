package oo1.ej23;

public class PagoConTarjeta implements Pago {
    @Override
    public double precioFinal(double precio){
        return precio + (precio * 0.20);
    }
}
