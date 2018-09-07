package exception_handling.labs;

import java.sql.SQLOutput;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class Controller {
    public static void main(String[] args) {
        int testInt;

        try {
            testInt = 4/0;
        }
        catch (Exception e){
            System.out.println("Exception found.");
        }
    }
}