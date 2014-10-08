package es.upm.miw.pd.vehiculos.model;

public class AlquilerHandler {

	private static AlquilerHandler alquilerHandler;

	private AlquilerHandler() {

	}

	public static AlquilerHandler getInstance() {
		if (alquilerHandler == null) {
			alquilerHandler = new AlquilerHandler();
		}
		return alquilerHandler;
	}

	public double calcularPrecioAlquiler(int id, int diasAlquiler) {
		Vehiculo vehiculo = VehiculosHandler.getInstance().buscar(id);
		double precio = 0;
		if (vehiculo != null) {
			precio = vehiculo.precio(diasAlquiler);
		} else {
			assert false : "No se encontró vehiculo con ese id";
		}
		return precio;
	}
}
