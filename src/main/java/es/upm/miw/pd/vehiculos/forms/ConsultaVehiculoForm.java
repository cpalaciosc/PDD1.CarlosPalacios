package es.upm.miw.pd.vehiculos.forms;

public class ConsultaVehiculoForm {
	
	private int idVehiculo;
	private int diasAlquiler;
	
	public ConsultaVehiculoForm(int idVehiculo, int diasAlquiler){
		this.idVehiculo = idVehiculo;
		this.diasAlquiler = diasAlquiler;
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public int getDiasAlquiler() {
		return diasAlquiler;
	}

	@Override
	public String toString() {
		return "ConsultaVehiculoForm [idVehiculo=" + idVehiculo
				+ ", diasAlquiler=" + diasAlquiler + "]";
	}
	
	

}
