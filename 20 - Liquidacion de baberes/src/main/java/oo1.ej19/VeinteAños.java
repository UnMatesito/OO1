package oo1.ej19;

public class VeinteAños implements Antiguedad{
    @Override
    public double getDescuento(int antiguedad){
        if (antiguedad >= 20) {
            return 1;
        }
        return 0;
    }
}
