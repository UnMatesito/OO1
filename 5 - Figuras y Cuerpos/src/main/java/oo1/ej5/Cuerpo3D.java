package oo1.ej5;

public class Cuerpo3D {
    private double altura;
    private Figura2D caraBasal;

    public void setAltura(double valor){
        this.altura = valor;
    }

    public double getAltura(){
        return altura;
    }

    public void setCaraBasal(Figura2D cara){
        this.caraBasal = cara;
    }

    public double getVolumen(){
        return caraBasal.getArea() * altura;
    }

    public double getSuperficieExterior(){
        return 2 * caraBasal.getArea() + caraBasal.getPerimetro() * altura;
    }
}
