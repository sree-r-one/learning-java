import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MyFileReader {

    // Variables

    /**
     * Name of the file being read
     */
    private String filename;

    // Constructor

    /**
     * Creates MyFileReader with given filename to read
     * 
     * @param filename to read
     */
    public MyFileReader(String filename) {
        this.filename = filename;
    }

    public ArrayList<String> getCleanContent() {

        ArrayList<String> lineData = new ArrayList<String>();

        // Create file object and read the file
        File file = new File(filename);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            // Create file reader
            fileReader = new FileReader(file);

            // Create buffered reader for the file reader
            bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                // Clean up the line by trimming whitespace
                String cleanedLine = line.trim();

                if (!cleanedLine.isEmpty()) {
                    System.out.println(cleanedLine);
                    lineData.add(cleanedLine);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return lineData;
    }
}
