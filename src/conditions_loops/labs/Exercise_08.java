package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 8: do-while loop
 *
 *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
 *
 */

public class Exercise_08 {
    public static void main(String args[]){

        int number = 1000;

        int count = 1;

        do {
            if (count == 3) {
                count = 1;
                System.out.println(number);
            } else {
                count++;
            }

            number--;
        } while (number != 0);
    }
}
