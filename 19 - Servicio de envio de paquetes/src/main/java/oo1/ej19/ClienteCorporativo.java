package oo1.ej19;

public class ClienteCorporativo extends Cliente{
    private int cuit;

    public ClienteCorporativo(String nombre, String direccion, int cuit) {
        super(nombre, direccion);
        this.cuit = cuit;
    }

    @Override
    public double descuento() {
        return 0;
    }
}
