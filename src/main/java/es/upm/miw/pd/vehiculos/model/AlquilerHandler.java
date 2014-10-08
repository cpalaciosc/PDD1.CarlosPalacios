package es.upm.miw.pd.vehiculos.model;

public class AlquilerHandler {

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
