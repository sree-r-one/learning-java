package words;

import java.util.Scanner;

/**
 * Count the syllables in the words of a sentence
 */
public class SyllableCounter {

    public static void main(String[] args) {

        System.out.println("Enter a sentence : ");

        // Create scanner for user inputs
        Scanner scanner = new Scanner(System.in);

        String input;
        Word w;
        int syllables;

        // While there is a word to scan
        while (scanner.hasNext()) {

            // Scan next token / word
            input = scanner.next();

            w = new Word(input);
        }

        scanner.close();
    }
}
