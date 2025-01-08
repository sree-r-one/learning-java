package pet;

/**
 * Represents the generic food for a pet 
 */
public class Food {
    
    //Instance variables 

    /**
     * Calories for the food 
     * Only accessible within the same class 
     */
    private int calories;
    
    
    // Constructor 
    
    /**
     * Creates instance of food with given number of calories 
     * @param calories
     */
    public Food(int calories) {
        this.calories = calories;
    } 
    
    //Getters and Setters 
    
    /**
     * Gets the calories 
     * @return calories in the food
     */
    public int getCalories() {
        return calories;
    }
    
    /**
     * Sets the calories 
     * @param calories to be set
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }
}
