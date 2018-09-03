package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 7: Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        int[][] array = {
                {10},
                {9, 8},
                {7, 6, 5},
                {4, 3, 2, 1}
        };

        for (int[] item : array) {
            for (int item2 : item) {
                System.out.print(item2 + ", ");
            }
            System.out.println();
        }

    }
}
