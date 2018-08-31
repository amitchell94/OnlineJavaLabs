package objects_classes_methods.labs;

import java.util.Scanner;
/**
 * Objects, Classes and Methods Exercise 3:
 *
 *      Create at least three example classes (class1, class2, class3) that demonstrate comfort
 *      in creating multiple classes with multiple methods, and then call between those methods across classes.
 *      These methods can perform any task, such as getter/setter methods or simple addition/subtraction.
 *      1) Class1 should have the main method.
 *      2) The main method then needs to create an object of class1, class2, class3.
 *      3) The main method should then  call one or more non-static methods in class2 and class3.
 *
 */

class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Login login = new Login();

        login.getUserNameAndPassword();

        Program program = new Program();

        if (program.correctLoginInfo(login.username, login.password)) {
            System.out.println("Welcome " + login.username);
            System.out.println("Would you like the nuclear launch code? (y/n)");
            String response = scanner.next();

            if (response.equalsIgnoreCase("y")) {
                SecretServiceData secretServiceData = new SecretServiceData();

                int nukeCode = secretServiceData.getNuclearLaunchCode();

                System.out.println("The nuclear launch code is: " + nukeCode);
            } else {
                System.out.println("Goodbye");
            }

        } else {
            System.out.println("Access Denied");
        }


    }

    public boolean correctLoginInfo(String username, String password){
        if (username.equals("admin" ) && password.equals("password") ) {
            return true;
        } else {
            return false;
        }
    }
}

class Login {
    String username;
    String password;
    public void getUserNameAndPassword(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username:");
        username = scanner.next();
        System.out.println("Please enter your password:");
        password = scanner.next();
    }
}

class SecretServiceData {
    public int getNuclearLaunchCode() {
        return 12345;
    }
}

