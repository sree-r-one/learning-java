package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Utility class for writing to files
 */
public class MyFileWriter {

    /**
     * Writes the list of sum values to a given file
     * 
     * @param fileName to write to
     * @param linesums to write
     * @param append   to end of file
     */
    public static void writeFileLineSums(String fileName, ArrayList<Double> linesums, boolean append) {

        // Create a file object
        File file = new File(fileName);

        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter(file, append);
            printWriter = new PrintWriter(fileWriter);

            // Iterate over arraylist and write each one to the file
            for (double line : linesums) {
                printWriter.println(line);
            }
            // Flush memory
            printWriter.flush();

        } catch (Exception e) {

            e.printStackTrace();

        } finally {
            try {

                fileWriter.close();
                printWriter.close();

            } catch (IOException e) {

                e.printStackTrace();

            }
        }

    }

}
