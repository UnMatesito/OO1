package oo1.ej19;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaEnvios {
    private List<Cliente> clientes;

    public SistemaEnvios() {
        this.clientes = new ArrayList<>();
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return new ArrayList<>(clientes);
    }

    public void agregarEnvio(Cliente cliente, Envio envio){

    }

    public double CalcularMontoPorPeriodo(Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin){
        return 0;
    }
}
