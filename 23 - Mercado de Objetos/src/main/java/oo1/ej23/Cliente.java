package oo1.ej23;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona{
    private List<Producto> pedidos;

    public Cliente(String nombre, String direccion, List pedidos) {
        super(nombre, direccion);
        this.pedidos = new ArrayList<>();
    }

    public void addPedido(Producto producto){
        this.pedidos.add(producto);
    }

    public List<Producto> getPedidos(){
        return new ArrayList<>(pedidos);
    }
}
