package Classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
    private LocalDate fecha;
    private String cliente;
    private List<Item> items;

    public Presupuesto(String cliente){
        this.cliente = cliente;
        this.items = new ArrayList<>();
        this.fecha = LocalDate.now();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void agregarItem(Item item){
        this.items.add(item);
    }

    public double calcularTotal(){
        return items.stream().mapToDouble(item -> item.costo()).sum();
    }
}
