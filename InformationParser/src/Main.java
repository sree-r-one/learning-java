import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MyFileReader fr = new MyFileReader("info.txt");

        ArrayList<String> lines = fr.getCleanContent();

        System.out.println(lines);

    }
}