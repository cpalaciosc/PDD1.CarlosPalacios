package es.upm.miw.pd.vehiculos;

import upm.jbb.IO;
import es.upm.miw.pd.vehiculos.model.AlquilerHandler;
import es.upm.miw.pd.vehiculos.model.Bicicleta;
import es.upm.miw.pd.vehiculos.model.Coche;
import es.upm.miw.pd.vehiculos.model.Moto;
import es.upm.miw.pd.vehiculos.model.Vehiculo;
import es.upm.miw.pd.vehiculos.model.VehiculosHandler;

public class VehiculosMain {
	private static final String TITULO_INGRESAR = "Ingrese los valores solicitados";
	private static final String MSG_PRECIO = "El vehiculo ##descripcion## por los dias de alquiler ##dias## es ##precio##";
	private static final String MSG_ID_INGRESAR = "Ingrese el id del vehiculo a alquilar";
	private static final String MSG_DIAS_ALQUILAR = "Ingrese el numero de dias a alquilar";

	public VehiculosMain() {
		IO.in.addController(this, false);
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

	private void ingresar(String tipoVehiculo) {
		Vehiculo vehiculo = (Vehiculo) IO.in
				.read(tipoVehiculo, TITULO_INGRESAR);
		VehiculosHandler.getInstance().agregar(vehiculo);
		this.listar();
	}

	public void listar() {
		String msg = VehiculosHandler.getInstance().listar();
		IO.out.clear();
		IO.out.println(msg);
	}

	public void consultarPrecio() {
		int id = IO.in.readInt(MSG_ID_INGRESAR);
		int diasAlquiler = IO.in.readInt(MSG_DIAS_ALQUILAR);
		Vehiculo vehiculo = VehiculosHandler.getInstance().buscar(id);
		double precio = AlquilerHandler.getInstance().calcularPrecioAlquiler(
				id, diasAlquiler);
		String msg = MSG_PRECIO.replaceAll("##descripcion##",
				vehiculo.getDescripcion());
		msg = msg.replaceAll("##dias##", "" + diasAlquiler);
		msg = msg.replaceAll("##precio##", "" + precio);
		IO.out.println(msg);
	}

	public static void main(String[] args) {
		new VehiculosMain();
	}

}
