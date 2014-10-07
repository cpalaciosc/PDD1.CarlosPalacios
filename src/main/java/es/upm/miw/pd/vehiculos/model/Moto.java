package es.upm.miw.pd.vehiculos.model;

import es.upm.miw.pd.vehiculos.util.MotoTarifas;

public class Moto extends Vehiculo {

	public Moto(int id, String descripcion) {
		super(id, descripcion);
	}

	@Override
	public double precio(int diasAlquiler) {
		double precio = 0;
		assert (diasAlquiler > 0): "El número de días a alquilar debe ser mayor que 0";
		if (diasAlquiler >= 1 && diasAlquiler <= 6) {
			precio = MotoTarifas.MENORQUESEMANA.valor * diasAlquiler;
		} else if(diasAlquiler >=7) {
			precio = MotoTarifas.MAYORIGUALQUESEMANA.valor * diasAlquiler;
		} else {
			assert false : "Valor de dias de alquiler inesperado";
		}
		return precio;
	}
}
