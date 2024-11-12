package oo1.ej23;

public class EnvioEnSucursalDeCorreo implements Envio{
    @Override
    public double costoEnvio(String origen, String destino){
        return 3000;
    }
}
