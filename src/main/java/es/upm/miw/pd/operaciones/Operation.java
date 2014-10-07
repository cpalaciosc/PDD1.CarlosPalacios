package es.upm.miw.pd.operaciones;

public abstract class Operation {
	
	private int operator1; 
	private int operator2;
	
	public Operation(final int operator1, final int operator2){
		this.operator1 = operator1;
		this.operator2 = operator2;
	}
	
	public abstract int calcular();

	public int getOperator1() {
		return operator1;
	}

	public int getOperator2() {
		return operator2;
	}
	
	

}
