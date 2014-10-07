package es.upm.miw.pd.vehiculos.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MotoTest extends VehiculoTest {
	private Vehiculo moto;

	@Before
	public void before() {
		this.moto = new Moto(7, "Kawasaki");
	}

	@Test
	public void testPrecioHastaUnaSemana() {
		assertEquals(48, this.moto.precio(6), 10e-2);
	}
	
	@Test
	public void testPrecioMasUnaSemana() {
		assertEquals(70, this.moto.precio(10), 10e-2);
	}

	@Override
	public Vehiculo getVehiculo(int id, String descripcion) {
		return new Moto(id, descripcion);
	}

}
