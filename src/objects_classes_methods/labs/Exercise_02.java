package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 2:
 *
 *      Create a class that demonstrates the following: (all methods below can be in the same class)
 *
 *      1) A static method that calls another static method.
 *      2) A static method that calls a non-static method.
 *      3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
 *      4) A non-static method1 that calls another non-static method2 and passes a value to method2.
 */
class Controller {
    public static void main(String[] args) {
        int appointmentTime = 17;
        //1 Calling a static method which calls a second static method.
        int timeUntilAppointment = Method.timeUntilAppointment(appointmentTime);

        System.out.println("Your appointment is in " + timeUntilAppointment + " hours.");

        //Calling a static method which calls a non static method.
        int age = 24;
        int birthYear = Method.getBirthYear(age);
        System.out.println("You were born in " + birthYear);

        //Calling a non static method which calls a non static method.
        Method method1 = new Method();

        String fullName = method1.getFullName();
        System.out.println(fullName);

        //Calling a non-static method which calls another non static method and passes a value to it.
        Method method2 = new Method();

        int pounds = 156;

        int pennies = method2.convertPoundsToPennies(pounds);

        System.out.println("£" + pounds + " is equal to " + pennies +" pennies.");

    }
}

class Method {
    public static int timeUntilAppointment(int appointmentTime) {
        return appointmentTime - getTimeOfDay();
    }

    public static int getTimeOfDay() {
        return 14;
    }

    public static int getBirthYear(int age){
        Method method = new Method();
        return method.getCurrentYear() - age;
    }

    public int getCurrentYear() {
        return 2018;
    }

    public String getFullName(){
        String firstName = "Andy";

        Method method = new Method();

        return firstName + " " + getLastName();
    }

    public String getLastName(){
        return "Mitchell";
    }

    public int convertPoundsToPennies(int value){
        int noOfPenniesInPound = 100;

        Method method = new Method();

        return method.multiply(noOfPenniesInPound, value);
    }

    public int multiply(int x, int y) {
        return x * y;
    }
}
