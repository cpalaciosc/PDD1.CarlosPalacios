package es.upm.miw.pd.vehiculos.util;

public enum CocheTarifas {
	ENTREUNOYTRES(1), ENTRECUATROYSIETE(0.8), RESTO(0.5);

	public double porcentaje;

	private CocheTarifas(double porcentaje) {
		this.porcentaje = porcentaje;
	}

}
