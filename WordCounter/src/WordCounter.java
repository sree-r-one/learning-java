import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    /**
     * List of lines of words to count.
     */
    private ArrayList<String> lines;

    /**
     * Map storing the count of each word in the list of lines.
     * Each word will be a key, and the associated counts of each word will be the
     * values.
     */
    private Map<String, Integer> wordCount;

    /**
     * Creates WordCounter based on the given list of lines.
     * Starts the process of generating the count of each word in the list.
     * 
     * @param lines of words to count
     */
    public WordCounter(ArrayList<String> lines) {

        this.lines = lines;
        this.wordCount = new HashMap<String, Integer>();
        this.generateWordCounts();
    }

    /**
     * Calculates the count of each word in the list of lines.
     * Traverses the list of lines, and keeps track of the count of each word.
     * Stores each word as a key and its associated count as a value in the
     * HashMap<String, Integer> wordCount.
     * 
     * Note, the words (keys) are case-sensitive.
     * e.g. "Hello" is considered a different word (key) than "hello".
     * e.g. "UFO" is considered the same word as "UFO".
     * 
     * Hint(s):
     * - Traverse the list of lines and split each one into an array of words
     * (strings). Use the words as keys and
     * the associated counts as values in the HashMap<String, Integer> wordCount.
     * 
     * Example(s):
     * - If the list of lines contains:
     * "war and the"
     * "war the peace peace"
     * "the war the"
     * 
     * Calling generateWordCounts() would populate the HashMap<String, Integer>
     * wordCount with:
     * ("war", 3), ("and", 1), ("the", 4), ("peace", 2)
     * 
     * Example(s):
     * - If the list of lines contains:
     * "War and the"
     * "war the Peace peace"
     * "thE war The"
     * 
     * Calling generateWordCounts() would populate the HashMap<String, Integer>
     * wordCount with:
     * ("War", 1), ("war", 2), ("and", 1), ("the", 2), ("The", 1), ("thE", 1),
     * ("Peace", 1), ("peace", 1)
     */
    private void generateWordCounts() {

        for (String line : lines) {
            String[] words = line.split("\\s+");

            for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

            }
        }
    }

    public Map<String, Integer> getWordCounter() {
        return this.wordCount;
    }

    public ArrayList<String> getWordsOccuringMoreThan(int threshold) {
        ArrayList<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() >= threshold) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

}
