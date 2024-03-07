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
    
}