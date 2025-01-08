package chapter2;

public class BankAccount {

    // Instance vars
    /** 
     * Type of account (checking/savings)
    */
    String accountType; 

    /** 
     * Balance for the account 
    */
    double balance;

    /** 
     * Represents customer of a bank
    */
    Customer customer;

    // CONSTRUCTOR

    /**
     * Creates a bank account of a given type for a customer
     * @param accountType for the bank account
     * @param customer for the bank account
    */
    public BankAccount(String accountType, Customer customer){
        this.accountType = accountType; 
        this.customer = customer;
    }

    // METHODS

    /**
     * Deposits the given amount into a bank account
     * @param amount
    */
    public void deposit(double amount){
        this.balance += amount;
    }
    
    /**
     * Withdraws the given amount into a bank account
     * @param amount
    */
    public void withdraw(double amount) throws Exception{

        // if the given amount is greater than balance
        if(amount > this.balance){
            throw new Exception("accountType");
        }

        // Withdraws if conditions are correct
        this.balance -= amount;
    }

    /**
     * Returns account type and balance for this type of account
     * @return string with all the info
    */
    public String getAccountInfo(){
        return this.accountType + " : " + this.balance;
    }

    /**
     * Returns customer name and adress for this bank account
     * @return concatenated account information
    */
    public String getCustomerInfo(){
        return this.customer.getName() + "\n" + this.customer.getAddress();
    }

}
