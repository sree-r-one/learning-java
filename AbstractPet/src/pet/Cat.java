package pet;

/**
 * Represents a cat and is a subclass of the abstract class pet 
 */
public class Cat extends Pet{
    
    // Static variable 

    /**
     * Default sound for all cats 
     * Only accessible within this class 
     */
    private static String SOUND = "Meow!";

    // Instance variables 

    /**
     * Type of cat 
     * Only accessible within this class 
     */
    private String type; 

    // Constructor

    /**
     * Creates a cat with the given name, age, weight and type 
     * @param age of cat 
     * @param name of cat 
     * @param weight of cat 
     * @param type of cat 
     */
    public Cat(int age, String name, double weight, String type){

        // Must call constructor in superclass pet 
        // Set age, name and weight of the cat 
        super(age,name,weight);
        this.type = type;
    }

    // Setters and Getters 

    /**
     * Get the type of cat 
     * @return type of cat 
     */
    public String getType() {
        return type;
    }

    /**
     * Set the type of cat 
     * @param type of cat to be set 
     */
    public void setType(String type) {
        this.type = type;
    }

    // Inherited abstract methods 
    // Must inherit and implement these 

    /**
     * Cat makes sound 
     */
    @Override
    public void makeSound() {
        System.out.println("Cat makes the sound " + Cat.SOUND);        
    }

    /**
     * Overriding to string method
     */
    @Override
    public String toString() {
        return "Cat [type=" + type + "]";
    }

}
