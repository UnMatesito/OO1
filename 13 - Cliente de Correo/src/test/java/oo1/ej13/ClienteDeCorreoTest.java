package oo1.ej13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteDeCorreoTest {

    private ClienteDeCorreo cliente;
    private Carpeta inbox;
    private Carpeta carpeta;
    private Email email;
    private Email email2;

    @BeforeEach
    void setUp() throws Exception {
        this.cliente = new ClienteDeCorreo();
        this.carpeta = new Carpeta("TengoMails");
        this.email = new Email ("SoyUnMail","12345Hola");
        this.email2 = new Email ("Holanda","12345");

        this.cliente.recibir(email);
    }

    @Test
    void testRecibirYMover() {
        /*this.cliente.recibir(email2);
        assertEquals(2,this.cliente.getInbox().getEmails().size());
        this.cliente.mover(email, inbox, carpeta);
        assertEquals(1,this.cliente.getInbox().getEmails().size());
        assertEquals(1,this.carpeta.getEmails().size());*/
    }

    @Test
    void testBuscar() {
        this.carpeta.addEmail(email2);
        this.cliente.addCarpeta(carpeta);
        assertEquals(this.email,this.cliente.buscar("1234")); // Esta en inbox
        assertEquals(this.email2,this.cliente.buscar("Holanda")); // Esta en carpeta
        assertNull(this.cliente.buscar("Notoy")); //No esta
    }

    void testEspacioOcupado() {
        this.carpeta.addEmail(email2);
        this.cliente.addCarpeta(carpeta);
        assertEquals(30,this.cliente.espacioOcupado());
    }



}
