package datatypes_operators.labs;

import java.sql.SQLOutput;
import java.util.Scanner;
/**
 * Data Types and Operators Exercise 3: Pig latin
 *
 *      Take in the user's name and print out their name translated to pig latin.
 *      For the purpose of this program, we will say that any word or name can be
 *      translated to pig latin by moving the first letter to the end, followed by "ay".
 *      For example: ryan -> yanray, caden -> adencay
 *
 *      HINT: We will make use of the substring() method.
 */

public class Exercise_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");

        String name = scanner.next();

        String firstLetter = name.substring(0,1);

        name = name.substring(1,name.length());

        String pigLatinName = name + firstLetter + "ay";

        System.out.println("Your name in pig latin is '" + pigLatinName + "'");

    }
}


