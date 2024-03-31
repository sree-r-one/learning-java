package files;

import java.util.ArrayList;

/**
 * Controller class
 */
public class Main {
    public static void main(String[] args) {
        String fileName = "text.txt";
        double sum = 0.0;

        try {
            sum = MyFileReader.readFileGetTotalSum(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Total sum : " + sum);
        }

        // Get list of line sums
        ArrayList<Double> lineSums = MyFileReader.readFileGetLineSums(fileName);
        System.out.println(lineSums);
    }
}
