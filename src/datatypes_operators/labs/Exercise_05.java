package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 5: More arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_05{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int index;

        System.out.println("Please enter a number.");

        index = scanner.nextInt();

        System.out.println(array[index]);


        // write code here


    }
}