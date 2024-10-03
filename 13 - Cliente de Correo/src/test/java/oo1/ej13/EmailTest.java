package oo1.ej13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailTest {

    private Email emailConAdjuntos;
    private Email emailSinAdjuntos;
    private Archivo archivo;
    private Archivo archivo2;

    @BeforeEach
    void setUp() throws Exception {
        this.emailConAdjuntos = new Email ("SoyUnMail","12345Hola");
        this.emailSinAdjuntos = new Email ("Soy","12345Hola");
        this.archivo = new Archivo("LanaDelRey");
        this.archivo2 = new Archivo("TaylorSwift");

    }

    @Test
    void testConstructor() {
        assertEquals("SoyUnMail",this.emailConAdjuntos.getTitulo());
        assertEquals("12345Hola",this.emailConAdjuntos.getCuerpo());
        assertNotNull(this.emailConAdjuntos.adjuntos());
    }

    @Test
    void testEspacioOcupado() {
        this.emailConAdjuntos.addArchivo(archivo);
        this.emailConAdjuntos.addArchivo(archivo2);
        assertEquals(39.00,this.emailConAdjuntos.tamaño());
        assertEquals(12.00,this.emailSinAdjuntos.tamaño());
    }

    @Test
    void contiene() {
        /*assertTrue(this.emailSinAdjuntos.buscar("12345"));
        assertFalse(this.emailSinAdjuntos.buscar("Mail"));*/
    }

}
