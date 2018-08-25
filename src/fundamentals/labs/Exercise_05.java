package fundamentals.labs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Fundamentals Exercise 5: Days to seconds
 *
 *      Take in a number in days from the user between 1 and 1,000,000,000 and convert it to
 *      seconds.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        // create scannerdays
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number in days between 1 and 1,000,000,000: ");
        // assign input to variable as int
        int days = scanner.nextInt();
        int seconds = days * 86400; // 86400 seconds in a day
        System.out.println("There are " + seconds + " seconds in " + days + " days.");
//        BigInteger hoursInDay = new BigInteger("24");
//        BigInteger minutesinHour  = new BigInteger("60");
//        BigInteger secondsInMinute  = new BigInteger("60");
//
//        BigInteger secondsInDay = new BigInteger("1");
//        secondsInDay = secondsInDay.multiply(secondsInMinute).multiply(minutesinHour).multiply(hoursInDay);
//
//        BigInteger secondsInInput = new BigInteger("1");
//        secondsInInput = secondsInInput.multiply(secondsInDay);
//
//        System.out.println("The number of seconds in " + days + " days is " + secondsInInput);


    }
}
