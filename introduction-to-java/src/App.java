import java.util.Scanner;

import chapter1.Assignment1;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String fullName = Assignment1.sayHello();
        Assignment1.addFiveNumbers(scanner);
        Assignment1.isOddEven(scanner);
        Assignment1.primeNumberChecker(scanner);
        Assignment1.secondsToHoursConverter(scanner);
        Assignment1.sayGoodbye(fullName);

        scanner.close();
    }

    
}
