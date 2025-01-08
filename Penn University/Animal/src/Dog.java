public class Dog extends Animal {

    // instance variables

    /**
     * Breed of the dog
     */
    private String breed;

    // constructor

    /**
     * Creates a dog with the given age and breed
     * 
     * @param age   of the dog
     * @param breed of the dog
     */
    public Dog(int age, String breed) {
        // calls the constructor in the superclass
        super(age);

        // sets the breed of the dog
        this.breed = breed;
    }

    // Setters and Getters
    /**
     * Gets the breed of the dog
     * 
     * @return the breed
     */
    public String getBreed() {
        return this.breed;
    }

    /**
     * Sets the breed of the dog
     * 
     * @param breed of dog to be set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Overrides speak in animal class
     * Dog speaks
     */
    @Override
    public void speak() {
        System.out.println(this.name + "Says Boww!");
    }

    /**
     * Return the name and type
     */
    @Override
    public String toString() {
        return this.name + " is a " + this.breed;
    }

    /**
     * Overrides equals method in the Object superclass 
     * Compares two objects based on their name and breed 
     */
    @Override
    public boolean equals(Object obj) {

        // Cast given object to a dog
        Dog otherDog = (Dog) obj;

        // Compare the two dogs based on their name and breed 
        return (this.name.equals(otherDog.name) && this.breed.equals(otherDog.breed));
    }

}
