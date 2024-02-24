/** 
 * Represents a counter with methods
*/
public class Counter {

    // Instance variables

    /**
     * Stores internal count
     * Defaults to zero
     */
    int count = 0; 

    /**
     * Increments the counter by 1
     * @return the new value of count
     */
    public int increment(){
        this.count+=1;
        return this.count;
    }

    /**
     * Decrements the counter by 1
     * @return the new value of count
     */
    public int decrement(){
        this.count-=1;
        return this.count;
    }

    /**
     * Gets the current value of the count
     * @return the new value of count
     */
    public int getCount(){
        return this.count;
    }
    
}
