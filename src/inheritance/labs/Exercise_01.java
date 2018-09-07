package inheritance.labs;

/**
 * Inheritance Exercise 1:
 *
 *      1) Create one super class Class1 and two subclasses Class2 and Class3.
 *          -Class2 should extend Class1.
 *          -Class3 should extend Class2.
 *      2) Each class should have at least two instance variable, all private.
 *      3) Create getters and setters for all instance variables and demonstrate setting superclass
 *          variables from a subclass
 *      4) Demonstrate the use of (non getter and setter) methods in a superclass from a subclass.
 *      5) Add constructors to each class and demonstrate the use of a superclass constructor
 *          from a subclass.
 *      6) Demonstrate constructor overloading and the use of the "super" keyword.
 *      7) Demonstrate method overloading.
 *
 *      NOTE: We encourage you to be creative and try to think of an example of your own for this
 *       exercise but if you are stuck, some ideas include:
 *
 *       - A Vehicle superclass, with Truck and Motorcycle subclasses.
 *       - A Restaurant superclass, with Gourmet and FastFood subclasses.
 *
 *
 */

class FurnitureTester {
    public static void main(String[] args) {
        RockingChair oldRockingChair = new RockingChair(20);
        if (oldRockingChair.getAge() > 1) {
            oldRockingChair.expireWarranty("Old Rocking Chair");
        }

    }
}

class Furniture {
    private String material;
    private boolean hasStorage;
    private int age;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isHasStorage() {
        return hasStorage;
    }

    public void setHasStorage(boolean hasStorage) {
        this.hasStorage = hasStorage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void expireWarranty(String item){
        System.out.println("The warranty for " + item + " has expired.");
    }

    public void expireWarranty() {
        System.out.println("The warranty for an item has expired.");
    }
}

class Chair extends Furniture {
    private boolean hasWheels;
    private boolean canRecline;

    Chair(){
        super.setHasStorage(false);
    }

    public Chair(boolean hasWheels) {
        this.hasWheels = hasWheels;
        super.setHasStorage(false);
    }

    public Chair(boolean hasWheels, boolean canRecline) {
        this.hasWheels = hasWheels;
        this.canRecline = canRecline;
        super.setHasStorage(false);
    }

    public boolean isHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    public boolean isCanRecline() {
        return canRecline;
    }

    public void setCanRecline(boolean canRecline) {
        this.canRecline = canRecline;
    }
}

class RockingChair extends Chair {
    private String color;
    private int maxRockingAngle;

    RockingChair(int age){
        setMaterial("Wood");
        setCanRecline(true);
        setHasWheels(false);
        setAge(age);

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxRockingAngle() {
        return maxRockingAngle;
    }

    public void setMaxRockingAngle(int maxRockingAngle) {
        this.maxRockingAngle = maxRockingAngle;
    }

}