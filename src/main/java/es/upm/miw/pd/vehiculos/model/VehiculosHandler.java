package es.upm.miw.pd.vehiculos.model;

import java.util.HashMap;

public class VehiculosHandler {

	private HashMap<Integer, Vehiculo> vehiculos;

	public VehiculosHandler() {
		this.vehiculos = new HashMap<Integer, Vehiculo>();
	}

	public void agregar(Vehiculo vehiculo) {
		this.vehiculos.put(vehiculo.getId(), vehiculo);
	}

	public int cantidadVehiculos() {
		return this.vehiculos.size();
	}

	public String listar(){
		return this.vehiculos.values().toString();
	}

	public Vehiculo buscar(int id) {
		return this.vehiculos.get(id);
	}

	public double calcularPrecioAlquiler(int id, int diasAlquiler) {
		Vehiculo vehiculo = this.buscar(id);
		double precio = 0;
		if (vehiculo != null) {
			precio = vehiculo.precio(diasAlquiler);
		} else {
			assert false : "No se encontró vehiculo con ese id";
		}
		return precio;
	}
}
