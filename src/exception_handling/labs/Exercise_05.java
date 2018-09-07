package exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Controller5 {
    public static void main(String[] args) {
        try {
            divide(7,0);
        }
        catch (Exception e) {
            System.out.println("Divide by zero not allowed.");
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        try {
            return a/b;
        }
        catch (ArithmeticException e) {
            throw e;
        }
    }

}