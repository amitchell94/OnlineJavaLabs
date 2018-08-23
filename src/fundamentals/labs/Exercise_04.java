package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Area and Perimeter
 *
 *      Write the necessary code to calculate the area and perimeter of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        double radius = 3.14;
        double height = 5;

        double area = (2 * Math.PI * radius * height) + 2 * Math.PI * radius * radius;
        double perimeter = 2 * ((2 * radius) + height);

        System.out.println("The area of the cylinder is: " + area);
        System.out.println("The perimeter of the cylinder is " + perimeter);

    }
}
