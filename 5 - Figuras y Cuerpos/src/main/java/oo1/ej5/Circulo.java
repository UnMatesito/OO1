package oo1.ej5;

public class Circulo implements Figura2D{
    private double radio;
    private double diametro;


    public void setDiametro(double radio){
        this.diametro = radio * 2;
    }

    public double getDiametro(){
        return this.radio * 2;
    }

    public void setRadio(double radio){
        this.radio = radio;
        setDiametro(radio);
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
        return diametro * Math.PI;
    }
}
