package es.upm.miw.pd.vehiculos;

import es.upm.miw.pd.vehiculos.controller.MenuController;

public class VehiculosMain {

	public void ingresarDatos() {
		new MenuController();
	}

	public static void main(String[] args) {
		VehiculosMain vehiculosMain = new VehiculosMain();
		vehiculosMain.ingresarDatos();
	}

}
