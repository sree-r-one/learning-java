import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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

    /**
     * Takes as arraylist and modifies the list by placing a "*" in between each
     * element, and at the beginning and the end
     * 
     * @param arrayList
     */
    public static void addStars(ArrayList<String> arrayList) {

        // Copy all values in the arraylist to an array
        String[] arrayToStore = arrayList.toArray(new String[arrayList.size()]);

        // Empty the original ArrayList
        arrayList.removeAll(Arrays.asList(arrayToStore));

        arrayList.add("*");

        for (String string : arrayToStore) {
            arrayList.add(string);
            arrayList.add("*");
        }
    }

    /**
     * Takes a given array of strings and returns a map with a key for each
     * different string, and a value for the cout of the number of times that string
     * appears in the array
     * 
     * Demonstrates the use of HashMap
     * 
     * @param strings to count
     * @return map of of word counts where key is word and value is count
     */
    public static Map<String, Integer> wordCount(String[] strings) {

        // Create a HashMap
        Map<String, Integer> wordCountMap = new HashMap<String, Integer>();

        // Iterate over array of strings
        for (String s : strings) {
            // If map does not contain key for string, add it
            if (!wordCountMap.containsKey(s)) {
                // Add default count of 1
                wordCountMap.put(s, 1);
            } else {
                // Replace old count with incremented count
                wordCountMap.replace(s, wordCountMap.get(s) + 1);
            }
        }
        return wordCountMap;
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

        // Add Star
        String[] addStar = { "antares", "sirius", "rigel", "canopus" };
        ArrayList<String> starArrayList = new ArrayList<String>();
        starArrayList.addAll(Arrays.asList(addStar));
        CollectionsClass.addStars(starArrayList);
        System.out.println(starArrayList);
        System.out.println();

        // Word count
        String[] strings = { "a", "a", "b", "c", "c" };
        Map<String, Integer> ret = CollectionsClass.wordCount(strings);
        System.out.println("WordCount : " + ret);
        System.out.println();

    }

}
