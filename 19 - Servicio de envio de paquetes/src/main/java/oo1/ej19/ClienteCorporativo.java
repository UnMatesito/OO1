package oo1.ej19;

public class ClienteCorporativo extends Cliente{
    private int cuit;

    public ClienteCorporativo(String nombre, String direccion, Envio envios, int cuit) {
        super(nombre, direccion, envios);
        this.cuit = cuit;
    }

    @Override
    public double descuento() {
        return 0;
    }
}
