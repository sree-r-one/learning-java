
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

    /**
     * Fixed amount for quick withdrawals
     */
    double fastCashAmount;

    // CONSTRUCTOR

    /**
     * Creates a bank account of a given type for a customer
     * @param accountType for the bank account
     * @param customer for the bank account
    */
    public BankAccount(String accountType, Customer customer){
        this.accountType = accountType; 
        this.customer = customer;

        // Set initial default value for fast cash amount
        this.fastCashAmount = 60;
    }

    // METHODS

    /**
     * Deposits the given amount into a bank account
     * @param amount
    */
    public void deposit(double amount){
        if (amount > 0) {
            this.balance += amount;
        }
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
     * Withdraws fast cash amount
     * @throws Exception if amount given is largen than the available amount
     */
    public void fastWithdraw() throws Exception{

        // Withdraws the given fast cash amount
        this.withdraw(this.fastCashAmount);
    }

    /**
     * Sets the fast cash amount if greater than zero
     * @param amount
     */
    public void setFastCashAmount(double amount){
        if (amount > 0) {
            this.fastCashAmount = amount;
        }
    }

    /**
     * Returns account type and balance for this type of account
     * @return string with all the info
    */
    public String getAccountInfo(){
        return this.accountType + " : " + this.balance;
    }

    /**
     * Returns customer name and address for this bank account
     * @return concatenated account information
    */
    public String getCustomerInfo(){
        return this.customer.getName() + "\n" + this.customer.getAddress();
    }

}
