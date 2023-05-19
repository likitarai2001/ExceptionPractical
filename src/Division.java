import jdk.jshell.EvalException;

public class Division {
    public void divideArithmeticException(){
        try {
            System.out.println(15/0);
        } catch (ArithmeticException e) {
            System.out.println("Aritmetic exception caught - " + e);
        } catch (Exception e) {
            System.out.println("Generic exception caught - " + e);
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("Outside try catch finally block\n");
    }

    public void divideException(){
        try {
            System.out.println(15/0);
        } catch (AbstractMethodError e) {
            System.out.println("Abstract method exception caught - " + e);
        } catch (Exception e) {
            System.out.println("Generic exception caught - " + e);
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("Outside try catch finally block\n");
    }

    public void divideExceptionNotCaught(){
        try {
            System.out.println(15/0);
        } catch (AbstractMethodError e) {
            System.out.println("Abstract method exception caught - " + e);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception caught - " + e);
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("Outside try catch finally block");
    }

    public void divideNoException(){
        try {
            System.out.println(15);
        } catch (ArithmeticException e) {
            System.out.println("Aritmetic exception caught - " + e);
        } catch (Exception e) {
            System.out.println("Generic exception caught - " + e);
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("Outside try catch finally block\n");
    }

    public void divideCustomException(){
        try {
            int divisor = 15;
            int dividend = 0;

            if(dividend == 0){
                throw new CustomException("Divide By ZERO is invalid");
            }
        } catch (CustomException e) {
            System.out.println("Custom exception caught - " + e.getMessage());
        }
        System.out.println("Outside try catch finally block\n");
    }
}
