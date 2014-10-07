package es.upm.miw.pd.vehiculos.util;

public enum BicicletaTarifas {
	HASTADOSDIAS(3), DESPUESDOSDIAS(2);

	private double valor;

	private BicicletaTarifas(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

}
