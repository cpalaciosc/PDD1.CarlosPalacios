package es.upm.miw.pd.vehiculos.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.upm.miw.pd.vehiculos.util.Categoria;

public class AlquilerHandlerTest {

	@Test
	public void testCalcularPrecioAlquiler() {
		VehiculosHandler.getInstance()
				.agregar(new Coche(1, "Kia", Categoria.A));
		assertEquals(72, new AlquilerHandler().calcularPrecioAlquiler(1, 9),
				10e-2);
	}
}
