package es.upm.miw.pd.vehiculos.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public abstract class VehiculoTest {

	public abstract Vehiculo getVehiculo(int id, String descripcion);

	@Before
	public void before() {
	}

	@Test
	public void testGetId() {
		Vehiculo vehiculo = this.getVehiculo(1, "");
		assertEquals(1, vehiculo.getId());
	}

	@Test
	public void testGetDescripcion() {
		Vehiculo vehiculo = this.getVehiculo(1, "");
		assertEquals("", vehiculo.getDescripcion());
	}

}
