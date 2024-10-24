package oo1.ej19;

public class QuinceAños implements Antiguedad{
    @Override
    public double getDescuento(int antiguedad) {
        if (antiguedad >= 15) {
            return  0.7;
        }
        return 0;
    }
}
