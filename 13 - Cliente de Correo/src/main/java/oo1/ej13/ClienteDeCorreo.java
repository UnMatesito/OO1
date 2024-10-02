package oo1.ej13;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
    private Carpeta inbox;
    private List<Carpeta> carpetas;

    public ClienteDeCorreo() {
        this.inbox = new Carpeta("Inbox");
        this.carpetas = new ArrayList<>();
    }

    public void addCarpeta(Carpeta carpeta){
        this.carpetas.add(carpeta);
    }

    public void recibir(Email email){
        this.inbox.addEmail(email);
    }

    public Email buscar(String texto){
        /*
         * DELEGAR EL COMPORTAMIENTO A CADA CARPETA QUE BUSQUE EN SUS MAILS Y RETORNE UNA RESPUESTA
         */
    }

    public int espacioOcupado(){
        // HAY PROBLEMAS CON EL DELEGAMIENTO?
        int espacioTotal = 0;
        espacioTotal += this.inbox.getEmails().stream().mapToInt(Email::tamaño).sum();
        for (Carpeta carpeta: carpetas){
            espacioTotal += carpeta.getEmails().stream().mapToInt(Email::tamaño).sum();
        }
        return espacioTotal;
    }
}
