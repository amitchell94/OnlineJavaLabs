package conditions_loops.labs;

import java.util.Scanner;
/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and usig a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

public class Exercise_07 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word.");

        String word = scanner.next();

        char[] wordArray = word.toCharArray();

        int charIndex = 0;

        boolean vowelFound = false;

        while (!vowelFound && charIndex <= wordArray.length){

            if (wordArray[charIndex] == 'a'||
                    wordArray[charIndex] == 'e'||
                    wordArray[charIndex] == 'i'||
                    wordArray[charIndex] == 'o'||
                    wordArray[charIndex] == 'u'||
                    wordArray[charIndex] == 'A'||
                    wordArray[charIndex] == 'E'||
                    wordArray[charIndex] == 'I'||
                    wordArray[charIndex] == 'O'||
                    wordArray[charIndex] == 'U') {
                System.out.println("The first vowel in the word '" + word + "' is " + wordArray[charIndex] );
                vowelFound = true;
            } else { charIndex++; }
        }
    }
}
