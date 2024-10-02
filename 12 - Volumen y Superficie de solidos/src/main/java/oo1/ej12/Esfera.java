package oo1.ej12;

public class Esfera extends Pieza{
    private int radio;

    public Esfera(int radio, String material, String color) {
        super(material, color);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    @Override
    public double getVolumen(){
        return ((double) 4/3) * Math.PI * Math.pow(this.radio, 3);
    }

    @Override
    public double getSuperficie(){
        return 4 * Math.PI * Math.pow(this.radio, 2);
    }
}
