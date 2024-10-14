package oo1.ej15;

public class Consumo {
    private double kwh;
    private double kvarh;

    public Consumo(double kwh, double kvarh) {
        this.kwh = kwh;
        this.kvarh = kvarh;
    }

    public double getKwh() {
        return kwh;
    }

    public double getKvarh() {
        return kvarh;
    }
}
