package es.upm.miw.pd.vehiculos.view;

import upm.jbb.IO;
import es.upm.miw.pd.vehiculos.controller.MenuController;
import es.upm.miw.pd.vehiculos.model.Vehiculo;

public class MenuView {
	private static final String TITULO_INGRESAR = "Ingrese los valores solicitados";

	public MenuView(MenuController menuController) {
		IO.in.addController(menuController, false);
	}

	public Vehiculo ingresar(String tipoVehiculo) {
		return (Vehiculo) IO.in.read(tipoVehiculo, TITULO_INGRESAR);
	}

	public void listar(String msg) {
		IO.out.clear();
		IO.out.println(msg);
	}
}
