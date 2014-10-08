package es.upm.miw.pd.vehiculos.model;

import es.upm.miw.pd.vehiculos.util.BicicletaTarifas;

public class Bicicleta extends Vehiculo {

	private static final int DIAS_MINIMO_TARIFA_ALTA = 1;
	private static final int DIAS_MAXIMO_TARIFA_ALTA = 2;

	public Bicicleta(int id, String descripcion) {
		super(id, descripcion);
	}

	@Override
	public double precio(int diasAlquiler) {
		double precio = 0;
		assert (diasAlquiler > 0) : "El número de días a alquilar debe ser mayor que 0";
		if (diasAlquiler >= DIAS_MINIMO_TARIFA_ALTA
				&& diasAlquiler <= DIAS_MAXIMO_TARIFA_ALTA) {
			precio = BicicletaTarifas.HASTADOSDIAS.valor * diasAlquiler;
		} else if (diasAlquiler > DIAS_MAXIMO_TARIFA_ALTA) {
			precio = BicicletaTarifas.DESPUESDOSDIAS.valor * diasAlquiler;
		} else {
			assert false : "Valor de dias de alquiler inesperado";
		}
		return precio;
	}
}
