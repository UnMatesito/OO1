package oo1.ej4;

import java.time.LocalDate;
import java.util.List;

public class Ticket {
    private LocalDate fecha;
    private double pesoTotal;
    private double precioTotal;
    private List<Producto> productos;

    public Ticket(double precioTotal, double pesoTotal, List<Producto> productos){
        this.fecha = LocalDate.now();
        this.precioTotal = precioTotal;
        this.pesoTotal = pesoTotal;
        this.productos = productos;
    }

    public double impuesto(){
        return (precioTotal * 21) / 100;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getCantidadDeProductos() {
        return productos.size();
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
