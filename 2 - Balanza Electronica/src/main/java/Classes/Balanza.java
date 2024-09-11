package Classes;

import java.time.LocalDate;

public class Balanza {
    private int cantidadDeProductos;
    private double precioTotal;
    private double pesoTotal;

    /*
     * Pone en cero tanto el peso como el precio de los productos
     */
    public void ponerEnCero(){
        this.precioTotal = 0;
        this.pesoTotal = 0;
        this.cantidadDeProductos = 0;
    }

    /*
     * Agrega un producto a la balanza
     */
    public void agregarProducto(Producto producto){
        this.pesoTotal += producto.getPeso();
        this.cantidadDeProductos++;
        this.precioTotal += producto.getPrecio();
    }

    /*
     * emite un ticket con el resumen de los productos
     */
    public Ticket emitirTicket(){
        Ticket ticket = new Ticket();
        ticket.setCantidadDeProductos(this.cantidadDeProductos);
        LocalDate fecha = LocalDate.now();
        ticket.setFecha(fecha);
        ticket.setPrecioTotal(this.precioTotal);
        ticket.setPesoTotal(this.pesoTotal);
        return ticket;
    }

    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }
}
