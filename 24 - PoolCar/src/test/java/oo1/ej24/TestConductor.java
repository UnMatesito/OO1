package oo1.ej24;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConductor {
    Conductor c1;
    Vehiculo v;

    //Setteo las variables de instancia
    @BeforeEach
    void setUp(){
        v = new Vehiculo("Descripcion", 4, 2007, 357000);
        c1 = new Conductor("Pepe", v);
        c1.newViaje("hola", "chau", 3000, LocalDate.now().minusMonths(2));
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
     * Test procesarViaje()
     * - Dado un conductor que procesa un viaje que ha creado
     * - Pruebo el metodo procesarViaje() para que calcule los saldos
     */
    @Test
    void TestProcesarViaje(){

    }
}
