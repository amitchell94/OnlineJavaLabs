package exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
class Controller3 {
    public static void main(String[] args) {

        int val;

        try {
            val = 5 / 0;
        } catch (Exception e) {
            System.out.println("val assignment failed.");
        }
        finally {
            System.out.println("val assignment was attempted.");
        }
    }
}