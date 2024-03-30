package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Utility class for reading particular types of files
 */
public class MyFileReader {

    /**
     * Calculates the total sum of numbers in the given file
     * Returns 0.0 if there are no numerical values found, or there is an error or
     * exception
     * 
     * @param fileName to read
     * @return sum of all numbers in the file
     * @throws FileNotFoundException if file not found
     */
    public static double readFileGetTotalSum(String fileName) throws FileNotFoundException {

        // Create file
        File file = new File(fileName);

        // Create default sum value
        double sum = 0.0;

        // Create scanner with given file
        Scanner scanner = new Scanner(file);

        // While scanner has another token (value)
        while (scanner.hasNext()) {
            // If the next token is a double
            if (scanner.hasNextDouble()) {
                // Get token (value) as a double and add to sum
                double numDouble = scanner.nextDouble();
                sum += numDouble;
            } else {
                // If it is not a double, skip it
                scanner.next();
            }
        }

        // Close scanner
        scanner.close();

        return sum;
    }
}
