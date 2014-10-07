package es.upm.miw.pd.operaciones;

import es.upm.miw.pd.operaciones.model.Multiplication;
import es.upm.miw.pd.operaciones.model.OperationsHandler;
import es.upm.miw.pd.operaciones.model.Subtraction;
import es.upm.miw.pd.operaciones.model.Summation;

public class OperationMain {
	public void calcular(){
		OperationsHandler operations = new OperationsHandler();
        operations.add(new Summation(3, 4));

        System.out.println("Total1:" + operations.total());

        operations.add(new Subtraction(1, 1));
        operations.add(new Summation(3, 5));
        operations.add(new Subtraction(4, 1));
        operations.add(new Summation(3, 6));
        operations.add(new Subtraction(3, 2));

        System.out.println("Total2:" + operations.total());
        
        operations.add(new Summation(4, 5));
        operations.add(new Subtraction(8, 6));
        operations.add(new Multiplication(4, 2));    
        
        System.out.println("Total3:" + operations.total());
	}

    public static void main(String[] args) {
    	OperationMain operationMain = new OperationMain();
    	operationMain.calcular();
    }

}
