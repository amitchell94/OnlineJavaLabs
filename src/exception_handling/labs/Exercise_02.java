package exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

class Controller2 {
    public static void main(String[] args) {
        int testInt;

        try {
            testInt = 3/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by zero not allowed");
        }
        catch (Exception e) {
            System.out.println("General exception");
        }
    }
}
