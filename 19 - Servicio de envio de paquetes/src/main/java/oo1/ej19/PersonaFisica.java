package oo1.ej19;

public class PersonaFisica extends Cliente {
    private int dni;

    public PersonaFisica(String nombre, String direccion, Envio envios, int dni) {
        super(nombre, direccion, envios);
        this.dni = dni;
    }

    @Override
    public double descuento(){
        return 0.1;
    }
}
