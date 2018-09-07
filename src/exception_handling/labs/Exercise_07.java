package exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class Controller7 {
    public static void main(String[] args) {
        try {
            divide(10, 0);
        }
        catch (Exception e) {
            System.out.println("Caught CustomException");
        }
    }

    public static int divide(int x, int y) throws CustomException {
        try {
            return x/y;
        }
        catch (Exception e) {
            throw new CustomException();
        }
    }
}

class CustomException extends Exception {

    @Override
    public String toString() {
        return "CustomException{ This is a custom exception}";
    }
}