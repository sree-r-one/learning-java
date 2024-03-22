package pet;

/**
 * Represents a dog and is a subclass of abstract class Pet
 */
public class Dog extends Pet {

    // Static variables

    /**
     * Default sound for all dogs
     * Only accessible within this class
     */
    private static String SOUND = "Bark!";

    // Instance variables

    /**
     * Breed of dog
     * Only accessible within this class
     */
    private String breed;

    // Constructor

    public Dog(int age, String name, double weight, String breed) {
        super(age, name, weight);
        this.breed = breed;
    }

    // Getters and Setters

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Abstract methods
    // Inherited abstract methods
    // must override and implement methods

    /**
     * Dog Makes sound
     */
    @Override
    public void makeSound() {
        System.out.println("Dog makes the sound " + Dog.SOUND);

    }

    /**
     * Returns the name and breed for printing / debugging
     */
    @Override
    public String toString() {
        return "Dog [type=" + breed + "] " + this.name;

    }
}
