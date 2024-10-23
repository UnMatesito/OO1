package oo1.ej17;

public class OOBnB {
    private Propiedad propiedad;
    private Usuario usuario;
    private DateRange dateRange;

    public OOBnB(Propiedad propiedad, Usuario usuario, DateRange dateRange) {
        this.propiedad = propiedad;
        this.usuario = usuario;
        this.dateRange = dateRange;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public DateRange getDateRange() {
        return dateRange;
    }
}
