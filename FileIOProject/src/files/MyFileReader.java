package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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

    /**
     * Calculates the sum of numbers in each line of the given fileName
     * 
     * @param fileName to read
     * @return list of line sums
     */
    public static ArrayList<Double> readFileGetLineSums(String fileName) {

        // Create arraylist to store sum of numbers for each line of the given file
        ArrayList<Double> lineSums = new ArrayList<Double>();

        // Create file object
        File file = new File(fileName);

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            // Create file reader
            fileReader = new FileReader(file);

            // Create buffered reader for the file reader
            bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                // Split line into tokens (values) based on whitespace using regular expression
                // to indicate one or more instances of whitespaces
                String[] numStringArray = line.trim().split("\\s+");

                // Set default sum for line
                double sum = 0.0;

                // Iterate over the array of strings
                for (int i = 0; i < numStringArray.length; i++) {

                    // Get each value as a string
                    String numString = numStringArray[i];

                    try {

                        // Cast each value to a double
                        double numDouble = Double.parseDouble(numString);

                        // Add to sum for line
                        sum += numDouble;

                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }

                }

                // Add line sum to list of sums
                lineSums.add(sum);
            }

        } catch (FileNotFoundException e) {

            // Gets and prints fileName
            System.out.println("Sorry, " + file.getName() + " not found! ");
            e.printStackTrace();

        } catch (IOException e) {

            // Prints error message and info about which line
            e.printStackTrace();

        } finally {
            // Regardless of what happens, close the file object
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return lineSums;
    }
}
