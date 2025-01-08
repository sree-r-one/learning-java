import java.util.ArrayList;

/**
 * Represent customer with name, ID and geography
 */
public class Customer {

    // Static variables 

    /** 
     * Company for all customers
    */
    static final String COMPANY = "CVS";

    /** 
     * Store list of all customers 
    */
    static ArrayList<Customer> CUSTOMERS = new ArrayList<Customer>();

    /**
     * Generate and keep track of custoemr IDs
     */
    static Counter COUNTER; 

    // Instance variables 

    /**
     * Name of the customer
     */
    String name; 

    /**
     * Geography of the customer 
     */
    String geography;

    /**
     * ID of the customer
     */
    int ID;

    // Constructor

    public Customer(String name, String geography){
        this.name = name; 
        this.geography = geography; 

        // Get the unique ID from the counter 
        this.ID = Customer.COUNTER.getCount();

        // Increment the counter
        Customer.COUNTER.increment();

        // Add customer to list of all customers 
        Customer.CUSTOMERS.add(this);
    }

    // Methods

    /**
     * Prints all customers for the company
     */
    public static void printAllCustomers(){
        System.out.println("All Customers : ");

        // Iterate over the list of customers
        for (Customer customer : Customer.CUSTOMERS) {
            System.out.println(customer);
        }
        System.out.println("\n");
    }

    /**
     * Compares two customers for equality
     * If they have the same name and geography, then they are equal
     */
    public boolean equals(Object obj){

        // Cast object to customer
        Customer otherCustomer = (Customer) obj;

        // Compare name and geography for customers
        if (this.name.equals(otherCustomer.name) && this.geography.equals(otherCustomer.geography)) {
            return true;
        }
        return false;
    }

    /**
     * Returns ID, name of the customer and geography
     */
    public String toString(){
        return this.ID + ": " + this.name + ", Company: " + Customer.COMPANY + ",Location: " + this.geography;
    }

    /**
     * Locates the given customer in the list of customers
     * @param customer to look up 
     * @return index of the given customer in the list, otherwise -1
     */
    public static int findCustomer(Customer customer){

        // Set default index
        int index = -1;
        
        // Iterate over the customer list and locate the given customer
        for (int i = 0; i < Customer.CUSTOMERS.size(); i++) {
            if(Customer.CUSTOMERS.get(i).equals(customer)){
                index = i; 
                break;
            };
        }
        return index;
    }
   
    /**
     * Removes Customer from the list of customers
     * @param customer to be removed
     */
    public static void removeCustomer(Customer customer){
        
        // Find the customer
        int removeIndex = findCustomer(customer);

        // Check if the index is valid, if yes remove the customer
        if (removeIndex >= 0 ) {
            Customer.CUSTOMERS.remove(removeIndex);
        }
    }

    public static void main(String[] args) {
        
        // Initialise the counter 
        Customer.COUNTER= new Counter(1);

        // Create Customer
        Customer c1 = new Customer("Sree","SG");
        Customer c2 = new Customer("Reshu","SG");
        

        // Print all the customers 
        Customer.printAllCustomers();
        
        Customer.removeCustomer(c2);
        Customer.printAllCustomers();
    }
}