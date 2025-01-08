import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {

	// Initialize the customer variable
	Customer customer; 

	@BeforeEach
	void setUp() throws Exception {
		this.customer = new Customer("Brandon");
		
	}

	@Test
	void testSetAddress() {

		// Confirm that the initial value of the customer address is null 
		assertNull(this.customer.getAddress());

		// Set address for the customer
		this.customer.setAddress("821268 Singapore");

		// Rest the address for the customer
		this.customer.setAddress("541325 Singapore");

		// Checks that the address was set correctly
		assertEquals("541325 Singapore", this.customer.getAddress());
	}

}
