import java.util.ArrayList;

/**
 * Class with methods for working with and manipulating Arrays and ArrayLists
 */
public class ArrayAndArrayList {

    // Instance variables
    // Methods

    /**
     * Counts the number of occurrences of the given element in the given array
     * @param array to search
     * @param element to search for
     * @return number of times the element is present in the array
     */
    public int howMany(int[] array, int element){

        int count = 0; 
        
        // Iterate through the list
        for(int i = 0; i < array.length ;i++){
            
            int currentElement = array[i];

            if(currentElement == element){
                count++;
            }
        }
        // Check if the element is present, if so count how many
        return count;
    }
    
    /**
     * Find max in the given array
     * @param array
     * @return
     */
    public int findMax(int[] array){

        // If the array is empty, returns -1 
        if (array.length == 0) {
            return -1;
        }

        // Sort the array and get the last digit
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            int currentItem = array[i];

            if (currentItem > max) {
                max = currentItem; 
            }
        }
        return max;
    }

    /**
     * Keeps track of every occurrence of the max number in the given array
     * @param array to search
     * @return Arraylist containing every occurrence of the max
     */
    public ArrayList<Integer> maxArray(int[] array){

        ArrayList<Integer> max = new ArrayList<Integer>();

        // If the array is empty, returns null
        if (array.length == 0) {
            return null;
        }

        // Find the maximum in the array
        int max_number = this.findMax(array);

        // Check through the array and find the number of occurrences
        for (int num : array) {
            if (num == max_number) {
                max.add(num);
            }
        }
        return max;
    }

    /**
     * Puts all of the zeroes in the given array, at the end of the given array
     * Updates the array itself
     * Maintains order of non zeroes
     * @param array to search for zeroes
     */
    public void swapZero(int[] array){

        int insertIndex = 0; 

        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[insertIndex] = array[i];
                insertIndex++;
            }
        }

        while (insertIndex < array.length) {
            array[insertIndex++] = 0 ;
        }
    }
}
