package es.upm.miw.pd.operaciones.model;

public class Multiplication extends Operation {

	public Multiplication(int operator1, int operator2) {
		super(operator1, operator2);
	}

	@Override
	public int calcular() {
		return this.getOperator1() * this.getOperator2();
	}

}
