import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Class to write the lsit of words to a file
 */
public class MyFileWriter {

    // Variables
    private String filename;

    // Constructor

    public MyFileWriter(String filename) {
        this.filename = filename;
    }

    // Methods

    /**
     * Open file specified by filename and writes each string in the given list of
     * strings to the file
     * 
     * Each String is written to a new line
     * 
     * @param words to be writted in to this file
     */
    public void writeToFile(ArrayList<String> words) {
        // Create file object
        File file = new File(filename);

        // Create File Writer Object
        FileWriter fileWriter = null;

        // Create PrintWriter Obejct
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);

            for (String string : words) {
                printWriter.println(string);
            }
            printWriter.flush();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                printWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
