package oo1.ej19;

public class DiezAños implements Antiguedad{
    @Override
    public double getDescuento(int antiguedad) {
        if (antiguedad >= 10) {
            return 0.5;
        }
        return 0;
    }
}
