package es.upm.miw.pd.vehiculos.view;

import upm.jbb.IO;
import es.upm.miw.pd.vehiculos.controller.MenuController;
import es.upm.miw.pd.vehiculos.forms.ConsultaVehiculoForm;
import es.upm.miw.pd.vehiculos.model.Vehiculo;

public class MenuView {
	private static final String TITULO_INGRESAR = "Ingrese los valores solicitados";
	private static final String MSG_PRECIO = "El vehiculo ##descripcion## por los dias de alquiler ##dias## es ##precio##";

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
	
	public ConsultaVehiculoForm consultarPrecio(){
		return (ConsultaVehiculoForm)IO.in.read(ConsultaVehiculoForm.class.getName(), TITULO_INGRESAR);
	}
	
	public void mostrarPrecioVehiculo(String descripcion, int diasAlquiler, double precio){
		String msg = MSG_PRECIO.replaceAll("##descripcion##", descripcion);
		msg = msg.replaceAll("##dias##", ""+diasAlquiler);
		msg = msg.replaceAll("##precio##", ""+precio);
		IO.out.println(msg);
	}
}
