package es.upm.miw.pd.vehiculos.model;

import java.util.HashMap;

public class VehiculosHandler {

	private HashMap<Integer, Vehiculo> vehiculos;
	private static VehiculosHandler vehiculosHandler;

	private VehiculosHandler() {
		this.vehiculos = new HashMap<Integer, Vehiculo>();
	}

	public static VehiculosHandler getInstance() {
		if (vehiculosHandler == null) {
			vehiculosHandler = new VehiculosHandler();
		}
		return vehiculosHandler;
	}

	public void agregar(Vehiculo vehiculo) {
		if (vehiculo != null) {
			this.vehiculos.put(vehiculo.getId(), vehiculo);
		}
	}

	public int cantidadVehiculos() {
		return this.vehiculos.size();
	}

	public String listar() {
		return this.vehiculos.values().toString();
	}

	public Vehiculo buscar(int id) {
		return this.vehiculos.get(id);
	}
	
	public void limpiar(){
		this.vehiculos.clear();
	}
}
