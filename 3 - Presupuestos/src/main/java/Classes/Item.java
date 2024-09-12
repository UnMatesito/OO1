package Classes;

public class Item {
    private String detalle;
    private double costoUnitario;
    private int cantidad;

    public Item(String detalle, int cantidad, double costoUnitario) {
        this.detalle = detalle;
        this.costoUnitario = costoUnitario;
        this.cantidad = cantidad;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public double costo(){
        return costoUnitario * cantidad;
    }
}
