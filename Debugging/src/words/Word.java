package words;

/**
 * Represents a word with functionality for counting syllables
 */
public class Word {

    // Instance variables
    private String text;

    // Constructor
    /**
     * Creates a word with a string
     * 
     * @param s
     */
    public Word(String s) {

        // Trim the beginning of the word
        int i = 0;
        while (i < s.length() && !Character.isLetter(s.charAt(i))) {
            i++;
        }

        // Trim the end of the word
        int j = s.length() - 1;
        while (j > i && !Character.isLetter(s.charAt(j))) {
            j--;
        }

        /**
         * Gets the substring of the given s based on i and j
         * Stores it as text for word
         * example : 123Hello123 will be stored as Hello
         */
        this.text = s.substring(i, j);
    }

    /**
     * Counts syllables in the word
     * Bases count of syllables on location of vowels in the word
     * 
     * @return syllable count
     */
    public int countSyllables() {
        return 0;
    }
}
