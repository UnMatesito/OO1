package oo1.ej24;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConductor {
    Conductor c1;
    Vehiculo v;
    Vehiculo v2;
    Viaje viaje;
    Viaje viaje2;
    Pasajero p1;
    Pasajero p2;

    //Setteo las variables de instancia
    @BeforeEach
    void setUp(){
        // Vehiculo
        v = new Vehiculo("Descripcion", 4, 2007, 357000);
        v2 = new Vehiculo("dsfsdfsd", 3, 2010, 5000000);

        // Pasajeros
        c1 = new Conductor("Pepe", v);
        c1.cargarSaldo(7000);
        p1 = new Pasajero("Jorge");
        p1.cargarSaldo(5000);
        p2 = new Pasajero("Hsda");
        p2.cargarSaldo(5000);

        // Viaje
        viaje = new Viaje("Hola", "Chau", 4000, v, LocalDate.now().minusDays(5));
        viaje.addTripulante(p1);
        viaje.addTripulante(p2);
        viaje2 = new Viaje("sad", "dfs", 500000, v2, LocalDate.now().minusDays(5));
        viaje2.addTripulante(p1);
    }

    /*
     * Test cargarSaldo()
     * - Dado un conductor que quiere cargar un saldo de 5000
     * - Pruebo el metodo cargarSaldo() con el monto 5000
     * - Deberia asignarle al conductor un saldo de 5500 debido a que posee un auto de mas de 5 años de antiguedad
     * - Realizo la prueba y me retorna true
     */
    @Test
    void TestCargarSaldo(){
        c1.cargarSaldo(5000);
        assertEquals(5500, c1.getSaldo());
    }

    /*
     * Test procesarViaje() que termina con saldo positivo
     * - Dado un conductor que procesa un viaje
     * - Pruebo el metodo procesarViaje() para que calcule los saldos
     * - Debe retornar un saldo positivo
     * - Realizo el test y el resultado es positivo
     */
    @Test
    void TestProcesarViajeTerminaConSaldoPositivo(){
        c1.procesarViaje(viaje);
        assertEquals(2796, Math.floor(c1.getSaldo()), 1e-3);
    }

    /*
     * Test procesarViaje() que termina con saldo > 0
     * - Dado un conductor que procesa un viaje
     * - Pruebo el metodo procesarViaje() para que calcule los saldos
     * - Debe retornar un saldo negativo
     * - Realizo el test y el resultado es negativo
     */
    @Test
    void TestProcesarViajeTerminaConSaldoNegativo(){
        c1.procesarViaje(viaje2);
        assertEquals(-245870, Math.floor(c1.getSaldo()),1e-3);
    }
}
