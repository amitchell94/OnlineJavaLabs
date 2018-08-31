package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 5:
 *
 *      Demonstrate the use of static instance variables. Create a class with at least one static variable
 *      and one non-static variable. Create a few objects of that class and set the values of the variables.
 *      Use System.out.println to demonstrate when the variables are changed.
 *
 */
class Exercise5Program {
    public static void main(String[] args) {

        Vehicle tesla = new Vehicle();

        tesla.model = "Model S";
        tesla.year = 2015;

        System.out.println(tesla.model + " " + tesla.year);
        System.out.println(tesla.numOfVehicles);

        Vehicle ford = new Vehicle();

        ford.model =  "Focus";
        ford.year = 2005;

        System.out.println(ford.model + " " + ford.year);
        System.out.println(ford.numOfVehicles);

    }
}

class Vehicle {
    int year;
    String model;

    static int numOfVehicles;

    public Vehicle() {
        numOfVehicles++;
    }
}