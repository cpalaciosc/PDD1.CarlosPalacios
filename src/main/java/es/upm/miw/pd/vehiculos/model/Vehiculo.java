package es.upm.miw.pd.vehiculos.model;

public abstract class Vehiculo {
	private int id;
	private String descripcion;

	public Vehiculo(final int id, final String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}

	public abstract double precio(int diasAlquiler);

	public int getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String toString() {
		return "Vehiculo [tipo=" + this.getClass().getSimpleName() + " id="
				+ this.getId() + " descripcion=" + this.getDescripcion() + "]";
	}
}
