package oo1.ej23;

import oo1.ej21.Parte2.Bag;
import oo1.ej21.Parte2.BagImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cliente extends Persona{
    private List<Pedido> pedidos;

    public Cliente(String nombre, String direccion) {
        super(nombre, direccion);
        this.pedidos = new ArrayList<>();
    }

    public void addPedido(Pago pago, Envio envio, Producto producto, int cantidad){
        if (producto.getCantidad() - cantidad < 0){
            producto.setCantidad(producto.getCantidad() - cantidad);
            Pedido pedido = new Pedido(this, pago, envio, producto, cantidad);
            this.pedidos.add(pedido);
        }
    }

    public List<Pedido> getPedidos(){
        return new ArrayList<>(pedidos);
    }

    public Bag<String> getPedidosPorCategoria(){
        return pedidos.stream().map(pedido -> pedido.getProducto().getCategoria()).collect(Collectors.toCollection(BagImpl<String>::new));
    }

}
