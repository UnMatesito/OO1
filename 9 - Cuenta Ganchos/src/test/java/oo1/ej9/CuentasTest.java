package oo1.ej9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentasTest {
    private CuentaCorriente cuentaCorriente1;
    private CuentaCorriente cuentaCorriente2;
    private CajaDeAhorro cajaDeAhorro1;
    private CajaDeAhorro cajaDeAhorro2;

    @BeforeEach
    void setUp() {
        cuentaCorriente1 = new CuentaCorriente();
        cuentaCorriente1.setDescubierto(-3000);
        cuentaCorriente2 = new CuentaCorriente();

        cajaDeAhorro1 = new CajaDeAhorro();
        cajaDeAhorro2 = new CajaDeAhorro();

        cuentaCorriente1.depositar(300);
        cuentaCorriente2.depositar(7000);

        cajaDeAhorro1.depositar(200);
        cajaDeAhorro2.depositar(5000);
    }

    @Test
    void testDescubierto(){
        assertEquals(cuentaCorriente1.getDescubierto(), -3000);
        assertEquals(cuentaCorriente2.getDescubierto(), 0);
    }

    @Test
    void testDepositarCuentaCorriente() {
        assertEquals(cuentaCorriente1.getSaldo(), 300);
        assertEquals(cuentaCorriente2.getSaldo(), 7000);
    }

    @Test
    void testDepositarCajaDeAhorro() {
        assertEquals(cajaDeAhorro1.getSaldo(), 204);
        assertEquals(cajaDeAhorro2.getSaldo(), 5100);
    }

    @Test
    void testExtraerCuentaCorriente() {
        cuentaCorriente1.extraer(200);
        cuentaCorriente2.extraer(4500);
        assertEquals(cuentaCorriente1.getSaldo(), 100);
        assertEquals(cuentaCorriente2.getSaldo(), 2500);
    }

    @Test
    void testExtraerCajaDeAhorro() {
        cajaDeAhorro1.extraer(100);
        cajaDeAhorro2.extraer(2000);
        assertEquals(cajaDeAhorro1.getSaldo(), 102);
        assertEquals(cajaDeAhorro2.getSaldo(), 3060);
    }

    @Test
    void testTransferirCuentaCorriente() {
        cuentaCorriente1.transferirACuenta(200, cuentaCorriente2);
        assertEquals(cuentaCorriente1.getSaldo(), 100);
        assertEquals(cuentaCorriente2.getSaldo(), 7200);
    }

    @Test
    void testTransferirCajaDeAhorro() {
        // Cual va a ejecutar a depositar a otra cuenta el de caja de ahorro o el la clase abstracta?
        cajaDeAhorro1.transferirACuenta(50, cajaDeAhorro2);
        assertEquals(cajaDeAhorro1.getSaldo(), 153);
        assertEquals(cajaDeAhorro2.getSaldo(), 5152.02);
    }

    @Test
    void testTransferirOtraCuenta(){
        // No esta funcionando como deberia el test deberia retornar 8060
        cuentaCorriente2.transferirACuenta(3000, cajaDeAhorro2);
        assertEquals(cuentaCorriente2.getSaldo(), 4000);
        assertEquals(cajaDeAhorro2.getSaldo(), 8060);
    }
}
