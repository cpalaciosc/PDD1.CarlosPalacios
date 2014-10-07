package es.upm.miw.pd.vehiculos.controller;

import es.upm.miw.pd.vehiculos.forms.ConsultaVehiculoForm;
import es.upm.miw.pd.vehiculos.model.Bicicleta;
import es.upm.miw.pd.vehiculos.model.Coche;
import es.upm.miw.pd.vehiculos.model.Moto;
import es.upm.miw.pd.vehiculos.model.Vehiculo;
import es.upm.miw.pd.vehiculos.model.VehiculosHandler;
import es.upm.miw.pd.vehiculos.view.MenuView;

public class MenuController {

	private MenuView menuView;
	private VehiculosHandler vehiculosHandler;

	public MenuController() {
		this.menuView = new MenuView(this);
		this.vehiculosHandler = new VehiculosHandler();
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
		this.menuView.listar(this.vehiculosHandler.listar());
	}

	public void consultarPrecio() {
		ConsultaVehiculoForm consultaVehiculoForm = this.menuView.consultarPrecio();
		Vehiculo vehiculo = this.vehiculosHandler.buscar(consultaVehiculoForm.getIdVehiculo());
		double precio = this.vehiculosHandler.calcularPrecioAlquiler(consultaVehiculoForm.getIdVehiculo(), consultaVehiculoForm.getDiasAlquiler());
		this.menuView.mostrarPrecioVehiculo(vehiculo.getDescripcion(), consultaVehiculoForm.getDiasAlquiler(), precio);
		
	}

	private void ingresar(String tipoVehiculo) {
		Vehiculo vehiculo = this.menuView.ingresar(tipoVehiculo);
		if (vehiculo != null) {
			this.vehiculosHandler.agregar(vehiculo);
		}
		this.listar();
	}

}
