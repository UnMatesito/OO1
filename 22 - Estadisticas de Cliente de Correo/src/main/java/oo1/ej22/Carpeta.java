package oo1.ej22;

import oo1.ej21.Parte2.Bag;
import oo1.ej21.Parte2.BagImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

    public int cantMails(){
        return this.emails.size();
    }

    public Bag<String> cantMailsPorCategoria(){
        BagImpl<String> categorias = new BagImpl<>();
        categorias = this.emails.stream().map(email -> email.emailPequeño()).collect(Collectors.toCollection(BagImpl<String>::new));
        categorias = this.emails.stream().map(email -> email.emailMediano()).collect(Collectors.toCollection(BagImpl<String>::new));
        categorias = this.emails.stream().map(email -> email.emailGrande()).collect(Collectors.toCollection(BagImpl<String>::new));
        return categorias;
    }
}
