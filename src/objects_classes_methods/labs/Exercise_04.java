package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 4:
 *
 *      Demonstrate method overloading with at least three overloaded methods.
 *
 */
class Exercise4Program {
    public static void main(String[] args) {
        multiply(2,3);
        multiply(3,4,5);
        multiply(4,5,6,7);
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int multiply(int x, int y, int z) {
        return x * y * z;
    }

    public static int multiply(int x, int y, int z, int a) {
        return a * x * y * z;
    }
}