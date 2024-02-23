package chapter2;

import java.util.Scanner;

/** 
 * Represents Bank
*/
public class Bank {

    public void run(){

        System.out.println("Welcome to the bank. What is your name");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Hello " + name + ", we are creating an account for you!");

        // Create customer with a given name 
        Customer customer = new Customer(name);

        // Set address on the customer object
        System.out.println("What is your address");

        String address = scanner.next();
        customer.setAddress(address);
        
        // Create bank account
        BankAccount checkingAccount = new BankAccount("Checking", customer);
        BankAccount savingsAccount = new BankAccount("Savings", customer);

        System.out.println();
        
        // Print out details
        System.out.println(checkingAccount.getCustomerInfo());
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(savingsAccount.getAccountInfo());
        

    
        scanner.close();
        
    }
    
}
