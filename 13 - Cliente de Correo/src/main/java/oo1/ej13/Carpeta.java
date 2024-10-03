package oo1.ej13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
    private String nombre;
    private List<Email> emails;

    public Carpeta(String nombre) {
        this.nombre = nombre;
        this.emails = new ArrayList<>();
    }

    public void addEmail(Email email){
        this.emails.add(email);
    }

    public List<Email> getEmails(){
        return new ArrayList<>(this.emails);
    }

    public String getNombre() {
        return nombre;
    }

    public void mover(Email email, Carpeta destino){
        destino.addEmail(email);
        this.emails.remove(email);
    }

    public Email buscar(String texto){
        return this.emails.stream().map(email -> email.buscar(texto)).findFirst().orElse(null);
    }

    public int espacioOcupado(){
        return this.emails.stream().mapToInt(email -> email.tamaño()).sum();
    }
}
