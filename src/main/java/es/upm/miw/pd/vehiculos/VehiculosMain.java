package es.upm.miw.pd.vehiculos;

import es.upm.miw.pd.vehiculos.model.Bicicleta;
import es.upm.miw.pd.vehiculos.model.Coche;
import es.upm.miw.pd.vehiculos.model.Moto;
import es.upm.miw.pd.vehiculos.model.VehiculosHandler;
import es.upm.miw.pd.vehiculos.util.Categoria;

public class VehiculosMain {
	public static void main(String[] args) {
		VehiculosHandler vehiculosHandler = new VehiculosHandler();

		vehiculosHandler.agregar(new Coche(1, "Kia", Categoria.A));
		vehiculosHandler.agregar(new Coche(2, "Volkswagen", Categoria.B));
		vehiculosHandler.agregar(new Coche(3, "Peugeot", Categoria.C));
		vehiculosHandler.agregar(new Coche(4, "Alfa Romeo", Categoria.A));
		vehiculosHandler.agregar(new Coche(5, "Nissan", Categoria.B));
		vehiculosHandler.agregar(new Coche(6, "Citroen", Categoria.C));

		vehiculosHandler.agregar(new Moto(7, "Kawasaki"));
		vehiculosHandler.agregar(new Moto(8, "Yamaha"));
		vehiculosHandler.agregar(new Moto(9, "Honda"));
		vehiculosHandler.agregar(new Moto(10, "BMW"));
		vehiculosHandler.agregar(new Moto(11, "Ducati"));
		vehiculosHandler.agregar(new Moto(12, "Suzuki"));

		vehiculosHandler.agregar(new Bicicleta(13, "Gazelle"));
		vehiculosHandler.agregar(new Bicicleta(14, "Kronan AB"));
		vehiculosHandler.agregar(new Bicicleta(15, "Flying Pigeon"));
		vehiculosHandler.agregar(new Bicicleta(16, "Chesini X-Uno"));
		vehiculosHandler.agregar(new Bicicleta(17, "Achielle"));
		vehiculosHandler.agregar(new Bicicleta(18, "Trek"));

		System.out.println(vehiculosHandler.buscar(1) + " "
				+ vehiculosHandler.calcularPrecioAlquiler(1, 9));

	}

}
