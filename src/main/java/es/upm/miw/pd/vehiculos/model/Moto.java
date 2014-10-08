package es.upm.miw.pd.vehiculos.model;

import es.upm.miw.pd.vehiculos.util.MotoTarifas;

public class Moto extends Vehiculo {
	private static final int DIAS_MINIMO_TARIFA_ALTA = 1;
	private static final int DIAS_MAXIMO_TARIFA_ALTA = 6;

	public Moto(int id, String descripcion) {
		super(id, descripcion);
	}

	@Override
	public double precio(int diasAlquiler) {
		double precio = 0;
		assert (diasAlquiler > 0) : "El número de días a alquilar debe ser mayor que 0";
		if (diasAlquiler >= DIAS_MINIMO_TARIFA_ALTA
				&& diasAlquiler <= DIAS_MAXIMO_TARIFA_ALTA) {
			precio = MotoTarifas.MENORQUESEMANA.valor * diasAlquiler;
		} else if (diasAlquiler > DIAS_MAXIMO_TARIFA_ALTA) {
			precio = MotoTarifas.MAYORIGUALQUESEMANA.valor * diasAlquiler;
		} else {
			assert false : "Valor de dias de alquiler inesperado";
		}
		return precio;
	}
}
