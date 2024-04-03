import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Class with various methods for using different kinds of collections
 */
public class CollectionsClass {

    /**
     * Takes a give nlist and removes elements in the range min through max
     * (inclusive)
     * 
     * Demonstrates use of iterator
     * 
     * @param list of values
     * @param min
     * @param max
     */
    public static void removeRange(ArrayList<Integer> list, int min, int max) {

        // Create iterator to interate over list and remove items in place
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next >= min && next <= max) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

        // Create array of ints
        Integer[] removeRangeArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // Add all items to arraylist
        arrayList.addAll(Arrays.asList(removeRangeArray));

        CollectionsClass.removeRange(arrayList, 3, 6);

        System.out.println("removeRange : " + arrayList);
        System.out.println();

    }
}
