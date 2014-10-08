package es.upm.miw.pd.vehiculos.controller;

import es.upm.miw.pd.vehiculos.forms.ConsultaVehiculoForm;
import es.upm.miw.pd.vehiculos.model.Bicicleta;
import es.upm.miw.pd.vehiculos.model.Coche;
import es.upm.miw.pd.vehiculos.model.Moto;
import es.upm.miw.pd.vehiculos.model.Vehiculo;
import es.upm.miw.pd.vehiculos.model.AlquilerHandler;
import es.upm.miw.pd.vehiculos.model.VehiculosHandler;
import es.upm.miw.pd.vehiculos.view.MenuView;

public class MenuController {

	private MenuView menuView;

	public MenuController() {
		this.menuView = new MenuView(this);
	}

	public void ingresarMoto() {
		this.ingresar(Moto.class.getName());
	}

	public void ingresarCoche() {
		this.ingresar(Coche.class.getName());
	}

	public void ingresarBicicleta() {
		this.ingresar(Bicicleta.class.getName());
	}

	public void listar() {
		this.menuView.listar(VehiculosHandler.getInstance().listar());
	}

	public void consultarPrecio() {
		ConsultaVehiculoForm consultaVehiculoForm = this.menuView
				.consultarPrecio();
		Vehiculo vehiculo = VehiculosHandler.getInstance().buscar(consultaVehiculoForm
				.getIdVehiculo());
		double precio = new AlquilerHandler().calcularPrecioAlquiler(
				consultaVehiculoForm.getIdVehiculo(),
				consultaVehiculoForm.getDiasAlquiler());
		this.menuView.mostrarPrecioVehiculo(vehiculo.getDescripcion(),
				consultaVehiculoForm.getDiasAlquiler(), precio);

	}

	private void ingresar(String tipoVehiculo) {
		Vehiculo vehiculo = this.menuView.ingresar(tipoVehiculo);
		VehiculosHandler.getInstance().agregar(vehiculo);
		this.listar();
	}

}
