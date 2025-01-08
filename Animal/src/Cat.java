/**
 * Represents a cat and extends the animal class 
 */
public class Cat extends Animal{
    
    // static variables

    /**
     * Default type for the cat
     */
    static String DEFAULT_TYPE = "domestic";

    // constuctor 

    // Instance variables 

    /**
     * Type of cat
     */
    private String type; 

    // Also inherits variables defined in Animal superclass 

    // constructor 

    /**
     * Creates a cat with a given age
     * @param age of the cat
     */
    public Cat(int age){
        // Calls the contructor from the superclass Animal
        super(age);

        // Set the type of the cat to deault value 
        this.type = Cat.DEFAULT_TYPE;
    }

    // Getters and setters 

    /**
     * @return the type 
     */
    public String getType(){
        return this.type;
    }

    /**
     * @param type of the cat to be set
     */
    public void setType(String type){
        this.type = type;
    }

    // Other methods 

    /**
     * Overrides speak in animal class 
     * Cat speaks 
     */
    @Override
    public void speak(){
        System.out.println(this.name + "Says Meow");
    }

    /**
     * Return the name and type 
     */
    @Override
    public String toString(){
        return this.name + " is a " + this.type;
    }


}
