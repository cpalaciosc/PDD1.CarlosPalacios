package es.upm.miw.pd.vehiculos.model;

import es.upm.miw.pd.vehiculos.util.Categoria;
import es.upm.miw.pd.vehiculos.util.CocheTarifas;

public class Coche extends Vehiculo {

	private Categoria categoria;

	public Coche(int id, String descripcion, Categoria categoria) {
		super(id, descripcion);
		this.categoria = categoria;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.upm.miw.pd.vehiculos.Vehiculo#precio(int) Precio de alquiler
	 * Precio de alquiler depende de la categoría (10, 15 y 20€) y de los días
	 * alquilados: de 1º al 3º día es el precio base, del 4º al 7º día es 80%
	 * del precio base, y el resto de días al 50% del precio base
	 */
	@Override
	public double precio(int diasAlquiler) {
		double precio = 0;
		assert (diasAlquiler > 0): "El número de días a alquilar debe ser mayor que 0";
		if (diasAlquiler >= 1 && diasAlquiler <= 3) {
			precio = this.precioHastaTresDias(diasAlquiler);
		} else if (diasAlquiler >= 1 && diasAlquiler <= 7) {
			precio = this.precioHastaSieteDias(diasAlquiler);
		} else if (diasAlquiler >= 1 && diasAlquiler >= 7) {
			precio = this.precioDespuesSieteDias(diasAlquiler);
		} else{
			assert false : "Valor de dias de alquiler inesperado";
		}
		return precio;
	}

	private double precioHastaTresDias(int diasAlquiler) {
		return this.calcula(diasAlquiler,
				CocheTarifas.ENTREUNOYTRES.porcentaje);
	}

	private double precioHastaSieteDias(int diasAlquiler) {
		return this.precioHastaTresDias(3)
				+ this.calcula((diasAlquiler - 3),
						CocheTarifas.ENTRECUATROYSIETE.porcentaje);
	}

	private double precioDespuesSieteDias(int diasAlquiler) {
		return this.precioHastaSieteDias(7)
				+ this.calcula((diasAlquiler - 7),
						CocheTarifas.RESTO.porcentaje);
	}

	private double calcula(int diasIntervalo, double porcentaje) {
		return this.categoria.precio * diasIntervalo * porcentaje;
	}

	@Override
	public String toString() {
		return super.toString() + " [categoria="
				+ this.categoria.categoria + " precio por dia="
				+ this.categoria.precio + "]";
	}

}
