package es.upm.miw.pd.vehiculos.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VehiculosHandlerTest {
	
	private VehiculosHandler vehiculosHandler;

	@Before
	public void before() {
		this.vehiculosHandler = VehiculosHandler.getInstance();
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

}
