package es.upm.miw.pd.vehiculos.util;

public enum MotoTarifas {
	MENORQUESEMANA(8), MAYORIGUALQUESEMANA(7);

	private double valor;

	private MotoTarifas(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

}
