package oo1.ej22;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
    private Carpeta inbox;
    private List<Carpeta> carpetas;

    public ClienteDeCorreo() {
        this.inbox = new Carpeta("Inbox");
        this.carpetas = new ArrayList<>();
        this.carpetas.add(this.inbox);
    }

    public void addCarpeta(Carpeta carpeta){
        this.carpetas.add(carpeta);
    }

    public void recibir(Email email){
        this.inbox.addEmail(email);
    }

    public Email buscar(String texto){
        return this.carpetas.stream().map(carpeta -> carpeta.buscar(texto)).findFirst().orElse(null);
    }

    public int espacioOcupado(){
        return this.carpetas.stream().mapToInt(carpeta -> carpeta.espacioOcupado()).sum();
    }

    public int cantMails(){
        return carpetas.stream().mapToInt(carpeta -> carpeta.cantMails()).sum();
    }
}
