package conditions_loops.labs;

import java.util.Scanner;
/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String args[]){

        //Find lowest multiple of 6

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an upper bound");

        int maxNumber = scanner.nextInt();

        System.out.println("Enter a lower bound");

        int minNumber = scanner.nextInt();

        boolean multipleFound = false;

        while (minNumber <= maxNumber){
            if (minNumber % 6 == 0) {
                multipleFound = true;
                break;
            }
            minNumber++;
        }

        if (multipleFound) {
            System.out.println("The first multiple of six is " + minNumber);
        } else {
            System.out.println("No multiples of six found");
        }

    }
}
