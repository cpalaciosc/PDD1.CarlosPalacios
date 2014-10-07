package es.upm.miw.pd.operaciones;

import java.util.ArrayList;

public class OperationsHandler {

	private ArrayList<Operation> operators;
	
	public OperationsHandler(){
		this.operators = new ArrayList<Operation>();
	}

	public void add(Operation operator) {
		this.operators.add(operator);
	}

	public void reset() {
		this.operators.clear();
	}

	public int total() {
		int result = 0;
		for (Operation operando : this.operators) {
			result += operando.calcular();
		}
		return result;
	}

}
