package es.upm.miw.pd.vehiculos.model;

import es.upm.miw.pd.vehiculos.util.MotoTarifas;

public class Moto extends Vehiculo {

	public Moto(int id, String descripcion) {
		super(id, descripcion);
	}

	@Override
	public double precio(int diasAlquiler) {
		double precio = 0;
		if (diasAlquiler >= 1 && diasAlquiler <= 6) {
			precio = MotoTarifas.MENORQUESEMANA.valor * diasAlquiler;
		} else if(diasAlquiler >=7) {
			precio = MotoTarifas.MAYORIGUALQUESEMANA.valor * diasAlquiler;
		} else {
			assert false : "Valor inesperado";
		}
		return precio;
	}
}
