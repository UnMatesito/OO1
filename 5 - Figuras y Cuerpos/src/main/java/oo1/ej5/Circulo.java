package oo1.ej5;

public class Circulo implements Figura2D{
    private double radio;

    public double getDiametro(){
        return this.radio * 2;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public double getPerimetro(){
        return this.getDiametro() * Math.PI;
    }
}
