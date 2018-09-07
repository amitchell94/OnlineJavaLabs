package exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
class Controller4 {
    public static void main(String[] args) {

        int val;

        try {
            val = 6/0;
        }
        catch (Exception e) {

            try {
                val = 7/0;
            }
            catch (Exception e2) {
                System.out.println("Second try created an exception");
            }
            System.out.println("First try created an exception");
        }
    }
}