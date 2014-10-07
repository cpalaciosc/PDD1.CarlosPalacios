package es.upm.miw.pd.vehiculos.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.vehiculos.util.Categoria;

public class VehiculosHandlerTest {
	
	private VehiculosHandler vehiculosHandler;

	@Before
	public void before() {
		this.vehiculosHandler = new VehiculosHandler();
	}

	@Test
	public void testAgregar() {
		this.vehiculosHandler.agregar(new Moto(8, "Yamaha"));
		assertEquals(1, this.vehiculosHandler.cantidadVehiculos());
	}

	@Test
	public void testBuscar() {
		this.vehiculosHandler.agregar(new Moto(8, "Yamaha"));
		Vehiculo vehiculo = this.vehiculosHandler.buscar(8);
		assertEquals("Yamaha",vehiculo.getDescripcion());
	}

	@Test
	public void testCalcularPrecioAlquiler() {
		this.vehiculosHandler.agregar(new Coche(1, "Kia", Categoria.A));
		assertEquals(72, vehiculosHandler.calcularPrecioAlquiler(1, 9), 10e-2);
	}

}
