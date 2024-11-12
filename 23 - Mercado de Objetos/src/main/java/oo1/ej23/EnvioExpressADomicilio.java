package oo1.ej23;

public class EnvioExpressADomicilio implements Envio {
    @Override
    public double costoEnvio(String origen, String destino){
        CalculadoraDeDistancia calc = new CalculadoraDeDistancia();
        return 0.5 + calc.distanciaEntre(origen, destino);
    }
}
