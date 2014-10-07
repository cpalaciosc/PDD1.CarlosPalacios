package es.upm.miw.pd.vehiculos.util;

public enum MotoTarifas {
	MENORQUESEMANA(8), MAYORIGUALQUESEMANA(7);

	public double valor;

	private MotoTarifas(double valor) {
		this.valor = valor;
	}
}
