import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class MyFileReader {

    /**
     * Name of the file being read
     */
    private String filename;

    /**
     * Creates MyFileReader with given filename to read
     * 
     * @param filename to read
     */
    public MyFileReader(String filename) {
        this.filename = filename;
    }

    /**
     * Opens the file and read the text line by line
     * 
     * @return list of lines with no empty spaces at the beginning or end of each
     *         line
     */
    public ArrayList<String> getCleanContent() {

        ArrayList<String> lines = new ArrayList<String>();

        // Read File
        File file = new File(filename);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            // Create file reader
            // Create buffered reader for the file reader
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                // Clean up the line by trimming whitespace
                String cleanedLine = line.trim();

                if (!cleanedLine.isEmpty()) {
                    System.out.println(cleanedLine);
                    lines.add(cleanedLine);
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
        return lines;
    }
}
