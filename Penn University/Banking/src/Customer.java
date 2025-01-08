/** 
 * Represents the Customer of the bank
*/
public class Customer {

    // INSTANCE VARS 

    /**
     * Name of the customer
    */
    String name; 

    /** 
     * Address of the customer
    */
    String address; 

    // Constuctor
    /**
     * Creates a customer with the given name
     * @param name of a customer
     */
     public Customer(String name){
        this.name = name; 
     }

    //  Methods

    /**
     * Set the address of the customer to be given address
     * @param address of the customer
     */
    public void setAddress(String address){
        this.address = address;
    }

    /**
     * Returns address of the customer
     * @return adress of the customer
    */
    public String getAddress(){
        return this.address;
    }

    /**
     * Returns customer's name
     * @return name of the customer
    */
    public String getName(){
        return this.name; 
    }

    
    
}
