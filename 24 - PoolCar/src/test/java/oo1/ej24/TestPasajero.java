package oo1.ej24;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPasajero {
    Pasajero p1;
    Pasajero p2;

    @BeforeEach
    void setUp() {
        p1 = new Pasajero("Pepe");
        p2 = new Pasajero("Mateo");
        p1.cargarSaldo(2000);
    }

    /*
     * Test cargarSaldo()
     * - Dado un pasajero que quiere cargar su saldo de 100
     * - Pruebo el metodo cargarSaldo()
     * -
     * - Realizo la prueba y me retorna true
     */
    @Test
    void TestCargarSaldo(){

    }

    @Test
    void TestAddViajeConEspacio(){

    }

    @Test
    void TestAddViajeSinEspacio(){

    }

    @Test
    void TestAddViajeConSaldoNegativo(){

    }

    @Test
    void TestAddViaje2DiasAntes(){

    }

    @Test
    void TestAddViajeNo2DiasAntes(){

    }

    @Test
    void TestProcesarViajeConSaldoPositivo(){

    }

    @Test
    void TestProcesarViajeConSaldoNegativo(){

    }
}
