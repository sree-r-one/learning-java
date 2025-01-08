import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MyFileWriter {

    private String filename;

    public MyFileWriter(String filename) {
        this.filename = filename;
    }

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
