package es.upm.miw.pd.vehiculos.model;

import es.upm.miw.pd.vehiculos.util.BicicletaTarifas;

public class Bicicleta extends Vehiculo {

	public Bicicleta(int id, String descripcion) {
		super(id, descripcion);
	}

	@Override
	public double precio(int diasAlquiler) {
		double precio = 0;
		if (diasAlquiler >= 1 && diasAlquiler <= 2) {
			precio = BicicletaTarifas.HASTADOSDIAS.valor * diasAlquiler;
		} else if (diasAlquiler > 2) {
			precio = BicicletaTarifas.DESPUESDOSDIAS.valor * diasAlquiler;
		} else {
			assert false : "Valor inesperado";
		}
		return precio;
	}
}