import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    private ArrayList<String> lines;

    private Map<String, Integer> wordCount;

    public WordCounter(ArrayList<String> lines) {
        this.lines = lines;
        this.wordCount = new HashMap<String, Integer>();
        this.generateWordCounts();
    }

    private void generateWordCounts() {
        // wordCount = new HashMap<String, Integer>();

        for (String line : lines) {

            String[] words = line.split("\\s");

            for (String word : words) {
                int count = wordCount.getOrDefault(word, 0);
                wordCount.put(word, count + 1);
            }
        }

    }

    public Map<String, Integer> getWordCounter() {
        return wordCount;
    }

    public ArrayList<String> getWordsOccuringMoreThan(int threshold) {
        ArrayList<String> result = new ArrayList<String>();

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            if (count >= threshold) {
                result.add(word);
            }
        }

        return result;
    }

}
