package oo1.ej19;

public class CincoAños implements Antiguedad{
    @Override
    public double getDescuento(int antiguedad){
        if (antiguedad >= 5) {
            return 0.3;
        }
        return 0;
    }
}
