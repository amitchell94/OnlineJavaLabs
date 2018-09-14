package generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class Controller1 {
    public static void main(String[] args) {
        int y = 0;
        double x = 0;
        String z = "";
        boolean b = false;

        GenericTest<Double,Integer> genericTest = new GenericTest(x,y);

        GenericTest<String,Boolean> genericTest2 = new GenericTest(z,b);

        genericTest.printDataType();

        genericTest2.printDataType();
    }
}

class GenericTest<T,V> {

    T variableOne;
    V variableTwo;

    public T getVariableOne() {
        return variableOne;
    }

    public void setVariableOne(T variableOne) {
        this.variableOne = variableOne;
    }

    public V getVaribleTwo() {
        return variableTwo;
    }

    public void setVaribleTwo(V varibleTwo) {
        this.variableTwo = varibleTwo;
    }

    public GenericTest(T variableOne, V varibleTwo) {
        this.variableOne = variableOne;
        this.variableTwo = varibleTwo;
    }

    public void printDataType() {
        System.out.println("Variable 1 is type " + variableOne.getClass().getTypeName());
        System.out.println("Variable 2 is type " + variableTwo.getClass().getTypeName());
    }
}