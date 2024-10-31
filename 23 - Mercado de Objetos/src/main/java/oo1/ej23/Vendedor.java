package oo1.ej23;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona{
    private List<Producto> productos;

    public Vendedor(String nombre, String direccion) {
        super(nombre, direccion);
        this.productos = new ArrayList<>();
    }

    public void addProducto(Producto producto){
        this.productos.add(producto);
    }

    public List<Producto> getProductos() {
        return new ArrayList<>(productos);
    }
}
