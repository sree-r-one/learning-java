package files;

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
    }
}
