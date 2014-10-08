package es.upm.miw.pd.vehiculos.model;

import es.upm.miw.pd.vehiculos.util.Categoria;
import es.upm.miw.pd.vehiculos.util.CocheTarifas;

public class Coche extends Vehiculo {
	private static final int DIAS_MINIMO_TARIFA_ALTA = 1;
	private static final int DIAS_MAXIMO_TARIFA_ALTA = 3;
	private static final int DIAS_MAXIMO_TARIFA_MEDIA = 7;

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
		assert (diasAlquiler > 0) : "El número de días a alquilar debe ser mayor que 0";
		if (diasAlquiler >= DIAS_MINIMO_TARIFA_ALTA
				&& diasAlquiler <= DIAS_MAXIMO_TARIFA_ALTA) {
			precio = this.precioHastaTresDias(diasAlquiler);
		} else if (diasAlquiler >= DIAS_MINIMO_TARIFA_ALTA
				&& diasAlquiler <= DIAS_MAXIMO_TARIFA_MEDIA) {
			precio = this.precioHastaSieteDias(diasAlquiler);
		} else if (diasAlquiler >= DIAS_MINIMO_TARIFA_ALTA
				&& diasAlquiler > DIAS_MAXIMO_TARIFA_MEDIA) {
			precio = this.precioDespuesSieteDias(diasAlquiler);
		} else {
			assert false : "Valor de dias de alquiler inesperado";
		}
		return precio;
	}

	private double precioHastaTresDias(int diasAlquiler) {
		return this
				.calcula(diasAlquiler, CocheTarifas.ENTREUNOYTRES.porcentaje);
	}

	private double precioHastaSieteDias(int diasAlquiler) {
		return this.precioHastaTresDias(DIAS_MAXIMO_TARIFA_ALTA)
				+ this.calcula((diasAlquiler - DIAS_MAXIMO_TARIFA_ALTA),
						CocheTarifas.ENTRECUATROYSIETE.porcentaje);
	}

	private double precioDespuesSieteDias(int diasAlquiler) {
		return this.precioHastaSieteDias(DIAS_MAXIMO_TARIFA_MEDIA)
				+ this.calcula((diasAlquiler - DIAS_MAXIMO_TARIFA_MEDIA),
						CocheTarifas.RESTO.porcentaje);
	}

	private double calcula(int diasIntervalo, double porcentaje) {
		return this.categoria.precio * diasIntervalo * porcentaje;
	}

	@Override
	public String toString() {
		return super.toString() + " [categoria=" + this.categoria.categoria
				+ " precio por dia=" + this.categoria.precio + "]";
	}

}
