package oo1.ej13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArchivoTest {

    private Archivo archivo;

    @BeforeEach
    void setUp() throws Exception {
        this.archivo = new Archivo("LanaDelRey");
    }

    @Test
    void testTamaño() {
        assertEquals(10.00, this.archivo.tamaño());
    }

}
