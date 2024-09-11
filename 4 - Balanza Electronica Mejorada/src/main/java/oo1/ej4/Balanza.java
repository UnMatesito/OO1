package oo1.ej4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Balanza {
    private double precioTotal;
    private double pesoTotal;
    private List<Producto> productos = new ArrayList<>();

    /*
     * Pone en cero tanto el peso como el precio de los productos
     */
    public void ponerEnCero(){
        this.precioTotal = 0;
        this.pesoTotal = 0;
        this.productos = new ArrayList<>();
    }

    /*
     * Agrega un producto a la balanza
     */
    public void agregarProducto(Producto producto){
        this.pesoTotal += producto.getPeso();
        this.precioTotal += producto.getPrecio();
        this.productos.add(producto);
    }

    /*
     * emite un ticket con el resumen de los productos
     */
    public Ticket emitirTicket(){
        Ticket ticket = new Ticket();
        LocalDate fecha = LocalDate.now();
        ticket.setFecha(fecha);
        ticket.setPrecioTotal(this.precioTotal);
        ticket.setPesoTotal(this.pesoTotal);
        ticket.setProductos(getProductos());
        return ticket;
    }

    public int getCantidadDeProductos() {
        return productos.size();
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
