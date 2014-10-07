package es.upm.miw.pd.vehiculos.util;

/**
 * @author cpalacios
 *
 */
public enum Categoria {
	A("A",10),
	B("B",15),
	C("C",20);
	
	public String categoria;
	public int precio;
	
	private Categoria(String categoria, int precio){
		this.categoria = categoria;
		this.precio = precio;
	}
}
