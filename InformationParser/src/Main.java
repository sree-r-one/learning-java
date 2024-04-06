import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /**
         * Creates a new instance of FileReader which reads the file "info.txt"
         */
        MyFileReader fr = new MyFileReader("info.txt");

        /**
         * Clean lines of text passed from the file reader
         */
        ArrayList<String> lines = fr.getCleanContent();

        /**
         * Create new instance of info processor
         */
        InfoProcessor ip = new InfoProcessor(lines);

        /**
         * Get course name
         */
        String courseName = ip.getCourseName();

        // >>>>>>
        System.out.println(lines);
        System.out.println(courseName);

    }
}