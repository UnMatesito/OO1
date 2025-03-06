package oo1.ej17;

import oo1.ej14.DateLapse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TestPropiedad {
    private Propiedad propiedad;
    private Propiedad propiedad2;

    @BeforeEach
    void setUp() {
        propiedad = new Propiedad("La Plata", "Pepe", 500);
        propiedad.agregarReserva(3, LocalDate.of(2024,5,1), LocalDate.of(2024,6,1));
        propiedad2.agregarReserva(3, LocalDate.of(2024,5,1), LocalDate.now());
    }

    @Test
    void testAgregarReserva() {

    }

    @Test
    void testCancelarReserva() {

    }
}
