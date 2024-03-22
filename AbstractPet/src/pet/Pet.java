package pet;

public abstract class Pet {
    
    // instance variables 

    /**
     * Age of the pet 
     * Default access 
     * Accessible anywhere in the package
     */
    int age; 

    /**
     * Name of the pet 
     * Default access
     * Accessible anywhere in the package 
     */
    String name; 

    /**
     * Weight of the pet 
     * Default access 
     * Accessible anywhere in the package
     */
    double weight; 

    // Constructor 

    /**
     * Called by subclasses of pet to create instances of different types of pets 
     * @param age of pet
     * @param name of pet 
     * @param weight of pet 
     */
    public Pet(int age, String name, double weight){
        this.age = age; 
        this.name = name; 
        this.weight = weight;
    }

    // Getters and setters 

    /**
     * Gets the weight 
     * @return weight of the pet 
     */
    public double getWeight(){
        return weight;
    }

    /**
     * Sets the weight of the pet 
     * @param weight of the pet to be set 
     */
    public void setWeight(double weight){
        this.weight = weight;
    }

    // Non abstract methods 
    public void eat(Food food){
        this.weight += (food.getCalories()/100);
    }

    // Abstract methods

    /**
     * Forces all pets to make their own sound 
     * All subclasses of Pet MUST implement this method 
     */
    public abstract void makeSound();

    /**
     * Forces all pets to override toString for printing / debugging
     */
    @Override
    public abstract String toString();


}
