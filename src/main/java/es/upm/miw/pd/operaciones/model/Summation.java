package es.upm.miw.pd.operaciones.model;

public class Summation extends Operation {
    public Summation(final int operator1, final int operator2) {
    	super(operator1, operator2);
    }

    @Override
    public int calcular() {
    	return this.getOperator1() + this.getOperator2();
    }

    @Override
    public String toString() {
    	return "[" + this.getOperator1() + "+" + this.getOperator2() + "]";
    }

}
