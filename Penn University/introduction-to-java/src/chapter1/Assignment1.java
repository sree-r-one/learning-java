package chapter1;
import java.util.Scanner;

public class Assignment1 {

    public static String sayHello(){
        System.out.println("FULLNAME");

        String firstName = "Sreeraj"; 
        String lastName = "Edakulathil Chellappan"; 
        String fullName = firstName + " "+ lastName;

        System.out.println(fullName + "\n");
        return fullName;
    }
    
    public static void sayGoodbye(String name){
        System.out.println("Goodbye "+ name + "\n");

    }

    public static void addFiveNumbers(Scanner scanner){
        /**
         * The main method of the program.
         * Prompts the user to enter five numbers, calculates their sum, and prints the result.
         * @param args The command-line arguments (not used in this program).
         */

        // Get input
        System.out.println("ADD FIVE NUMBERS");

        int count = 1; 
        double sum = 0; 

        while (count < 6){
            System.out.println("Enter number " + count);
            double number = scanner.nextDouble();
            sum += number;
            count++; 
        }

        System.out.println("The total sum is : " + sum + "\n");
    }

    public static void isOddEven(Scanner scanner) { 
        
        System.out.println("ODD OR EVEN");
        System.out.println("Enter number ");

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even \n");
            return; 
        }
        System.out.println("The number " + number + " is odd \n");
    }

    public static void primeNumberChecker(Scanner scanner){
        
        System.out.println("PRIME NUMBER CHECKER");
        System.out.println("Enter number ");
        
        int number = scanner.nextInt(); 
        
        // if number is less than 2, it is not a prime number 
        if (isPrime(number)) {
            System.err.println(number + "is prime number \n");
            return; 
        }
        System.err.println(number + "is not prime number \n");
    }
    
    public static boolean isPrime(int number){
        for (int i = 2; i < Math.sqrt(number); i++) {

            // If it is divisible by anything other than number itself, it is a prime number 
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void secondsToHoursConverter(Scanner scanner){
        /**
         * 
         * If input seconds is 1432, print output in the format: 0:23:52
         * If input seconds is 0, print output in the format: 0:0:0
         * If input seconds is negative, print output in the format: -1:-1:-1 
         * 
         */
        System.out.println("SECONDS TO HOURS CONVERTER");
        System.out.println("Enter seconds ");
        
        int seconds = scanner.nextInt(); 

        if (seconds < 0) {
            // return "-1:-1:-1";
            System.out.println("-1:-1:-1 \n");
        }

        int hours = seconds / 3600;
        int minutes = (seconds % 3600)/60;
        int remainingHours = seconds % 60; 
        System.out.printf("%02d:%02d:%02d \n", hours, minutes, remainingHours);
    }
    
}
