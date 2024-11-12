package oo1.ej23;

public class Pedido {
    private Cliente cliente;
    private Pago pago;
    private Envio envio;
    private Producto producto;
    private int cantidad;

    public Pedido(Cliente cliente, Pago pago, Envio envio, Producto producto, int cantidad) {
        this.cliente = cliente;
        this.pago = pago;
        this.envio = envio;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pago getPago() {
        return pago;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getCostoTotal(String origen, String destino){
        return pago.precioFinal(producto.getPrecio()) + envio.costoEnvio(origen, destino);
    }
}
