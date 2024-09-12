package oo1.ej4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Balanza {
    private List<Producto> productos = new ArrayList<>();

    /*
     * Pone en cero tanto el peso como el precio de los productos
     */
    public void ponerEnCero(){
        this.productos = new ArrayList<>();
    }

    /*
     * Agrega un producto a la balanza
     */
    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    /*
     * emite un ticket con el resumen de los productos
     */
    public Ticket emitirTicket(){
        return new Ticket(this.getPrecioTotal(), this.getPesoTotal(), this.getProductos());
    }

    public int getCantidadDeProductos() {
        return productos.size();
    }

    public double getPrecioTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    public double getPesoTotal() {
        return productos.stream().mapToDouble(Producto::getPeso).sum();
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
