package es.upm.miw.pd.operaciones;

public class Main {

    public static void main(String[] args) {
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

}
