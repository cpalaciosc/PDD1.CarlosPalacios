package es.upm.miw.pd.vehiculos.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.vehiculos.util.Categoria;

public class CocheTest {
	private Vehiculo coche;

	@Before
	public void before() {
		this.coche = new Coche(1, "Kia", Categoria.A);
	}

	@Test
	public void testPrecioHastaTresDias() {
		assertEquals(20, this.coche.precio(2), 10e-2);
	}
	
	@Test
	public void testPrecioHastaSieteDias() {
		assertEquals(62, this.coche.precio(7), 10e-2);
	}	
	
	@Test
	public void testPrecioDespuesSieteDias() {
		assertEquals(72, this.coche.precio(9), 10e-2);
	}		
}
