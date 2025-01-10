
public abstract class Animal {
    protected int numberOfLegs;
    protected String name;

    // Constructor
    public Animal(int numberOfLegs, String name) {
        this.numberOfLegs = numberOfLegs;
        this.name = name;
    }

    public abstract void walk();
}
