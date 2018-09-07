package exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class Controller6 {
    public static void main(String[] args) {

        try {
            divideByZero(7);
        }
        catch (Exception e) {
            System.out.println("Divide by zero failed.");
        }

    }

    public static int divideByZero (int x) throws ArithmeticException {
        try {
            return x/0;
        }
        catch (ArithmeticException e) {
            throw e;
        }
    }
}