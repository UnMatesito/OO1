package oo1.ej5;

public class Cuadrado implements Figura2D{
    private double lado;

    public void setLado(double valor){
        this.lado = valor;
    }

    public double getLado(){
        return lado;
    }

    @Override
    public double getPerimetro(){
        return lado * 4;
    }

    @Override
    public double getArea(){
        return lado * lado;
    }
}
