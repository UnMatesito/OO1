package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import Classes.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PresupuestoTest {

	private Presupuesto presupuesto;

	@BeforeEach
	public void setUp() {
		presupuesto = new Presupuesto("Pedro");
	}

	@Test
	public void testCalcularTotal() {
		assertEquals(0, presupuesto.calcularTotal());

		Item item = new Item("Leche", 1, 100);
		presupuesto.agregarItem(item);
		assertEquals(100, presupuesto.calcularTotal());

		item = new Item("Chocolate", 2, 150);
		presupuesto.agregarItem(item);

		assertEquals(400, presupuesto.calcularTotal());
	}

	@Test
	public void testInitialize() {
		assertEquals(LocalDate.now(), presupuesto.getFecha());
		assertEquals("Pedro", presupuesto.getCliente());
		assertEquals(0, presupuesto.calcularTotal());
	}

}
