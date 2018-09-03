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

        List<Integer> answer = new ArrayList();

        answer = arrayMultiply(days, 86400);

        System.out.print("There are ");

        for (int i = answer.size()-1;i > 0;i--) {
            System.out.print(answer.get(i));
        }

        System.out.print(" seconds in " + days + " days");
    }

    public static List<Integer> arrayMultiply(int a, int b) {
        int x;
        int y;

        //x needs to be the bigger number of the two.
        if (a > b) {
            x = b;
            y = a;
        } else {
            x = a;
            y = b;
        }

        List<Integer> xList = new ArrayList();
        List<Integer> yList = new ArrayList();
        List<List<Integer>> addList = new ArrayList();
        List<Integer> returnList = new ArrayList();

        //turn x into a list of integer units
        while(x != 0) {
            xList.add(x % 10);
            x /= 10;
        }

        //turn y into a list of integer units
        while(y != 0) {
            yList.add(y % 10);
            y /= 10;
        }

        for (int i = 0;i < xList.size();i++) {
            int xTemp = xList.get(i);
            int yTemp;
            int carryOver = 0;
            List<Integer> tempList = new ArrayList();

            //Pad out 0s to ensure we are in the right units
            for (int k = 0; k < i;k++) {
                tempList.add(0);
            }

            //Multiply current unit from xList with every unit in yList
            for (int j = 0; j < yList.size();j++) {
                yTemp = yList.get(j);

                int addTemp = xTemp * yTemp + carryOver;

                carryOver = addTemp/10;

                if (addTemp > 9) {
                    tempList.add(addTemp%10);
                } else {
                    tempList.add(addTemp);
                }
            }
            if (carryOver != 0) { tempList.add(carryOver); }
            //Add new
            addList.add(tempList);

        }

        int carryOver = 0;
        for (int unit = 0; unit < addList.get(addList.size()-1).size();unit++) {
            int addTemp = 0;

            for (int numberIndex = 0; numberIndex < addList.size(); numberIndex++) {
                if (addList.get(numberIndex).size()-1 < unit) {
                    continue;
                }
                addTemp += addList.get(numberIndex).get(unit);

            }
            addTemp += carryOver;

            carryOver = addTemp/10;

            if (addTemp > 9) {
                returnList.add(addTemp%10);
            } else {
                returnList.add(addTemp);
            }
        }
        return returnList;
    }
}
