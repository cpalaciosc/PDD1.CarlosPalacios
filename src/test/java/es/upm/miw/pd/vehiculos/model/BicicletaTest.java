package es.upm.miw.pd.vehiculos.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BicicletaTest extends VehiculoTest {
	private Vehiculo bicicleta;

	@Before
	public void before() {
		this.bicicleta = new Bicicleta(13, "Gazelle");
	}

	@Test
	public void testPrecioHastaDosDias() {
		assertEquals(6, this.bicicleta.precio(2), 10e-2);
	}

	@Test
	public void testPrecioDespuesDosDias() {
		assertEquals(8, this.bicicleta.precio(4), 10e-2);
	}

	@Override
	public Vehiculo getVehiculo(int id, String descripcion) {
		return new Bicicleta(id, descripcion);
	}

}
