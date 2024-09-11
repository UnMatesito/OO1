package oo1.ej4;

import java.time.LocalDate;
import java.util.List;

public class Ticket {
    private LocalDate fecha;
    private double pesoTotal;
    private double precioTotal;
    private List<Producto> productos;

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

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
