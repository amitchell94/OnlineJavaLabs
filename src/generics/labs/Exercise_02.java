package generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an array and prints out the value at a certain index.
 */

class Controller2 {
    public static void main(String[] args) {
        String[] stringArray = {"Zero","One","Two","Three","Four"};

        GenericArray<String> genericArray = new GenericArray();

        genericArray.getValueAtIndex(stringArray,3);
    }
}

class GenericArray <T> {
    public void getValueAtIndex(T[] array, int index) {
        System.out.println(array[index]);
    }
}