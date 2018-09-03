package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 4: Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_04{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numArray = new int[10];
        int sum = 0;
        float average;

        System.out.println("Enter 10 numbers");

        for (int  i = 0; i < numArray.length;i++) {
            numArray[i] = scanner.nextInt();
        }

        for (int  j = 0; j < numArray.length;j++) {
            sum += numArray[j];
        }

        average = (float)sum/numArray.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }

}