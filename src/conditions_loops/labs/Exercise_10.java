package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
     public static void main(String args[]){

         Scanner scanner = new Scanner(System.in);

         //Check how many numbers are multiples of 5 or 3 in a given range.

         System.out.println("Enter an upper bound");

         int upperBound = scanner.nextInt();

         System.out.println("Enter a lower bound");

         int lowerBound = scanner.nextInt();

         int count = 0;

         for (int i = lowerBound; i <= upperBound; i++){

             if (i % 3 == 0){
                 count++;
                 continue;
             } else if (i % 5 ==0){
                 count++;
             }

         }

         System.out.println("There are " + count + " multiples of 3 or 5 in that range.");
     }
}
