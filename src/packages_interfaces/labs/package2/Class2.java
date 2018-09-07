package packages_interfaces.labs.package2;

import packages_interfaces.labs.package1.Class1;

public class Class2 {
    public String getUserName() {
        return "Andy";
    }

    protected int getUserAge () {
        return 21;
    }
}

class Controller {
    public static void main(String[] args) {
        Class2 c2 = new Class2();

        int age = c2.getUserAge();
        String name = c2.getUserName();

        Class1 c1 = new Class1();

        int timeOfDay = c1.getTimeOfDay();
        //int year = c1.getCurrentYear();
        //The above line will cause an error as it is a protected method.
    }
}