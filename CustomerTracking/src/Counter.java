/**
 * Represents a counter with methods or manipulating count 
 */
public class Counter {

    // Instance vars

    /** 
     * Internal count for the customer
    */
    int count; 

    // Constructor

    /**
     * Creates counter with a given initial count
     * @param initialCount to start with
     */
    public Counter(int initialCount){
        this.count = initialCount;
    }

    // Methods

    /**
     * Increments internal count by 1
     */
    public void increment(){
        this.count++;
    }

    /**
     * Returns the internal count
     * @return count
     */
    public int getCount(){
        return this.count; 
    }

    /**
     * Sets internal count to given count
     * @param count to be set
     */
    public void setCount(int count){
        this.count = count;
    }
    
}
