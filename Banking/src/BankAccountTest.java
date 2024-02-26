import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {

	// Declare objects for testing 
	Customer customer; 
	BankAccount myCheckingAccount; 
	BankAccount mySavingsAccount;

	@BeforeEach
	void setUp() throws Exception {
		
		// Initialise objects for testing
		this.customer = new Customer("Brandon"); 
		this.myCheckingAccount = new BankAccount("checking", this.customer);
		this.mySavingsAccount = new BankAccount("savings", this.customer);
	}

	@Test
	void testDeposit() {

		// Make reposit 
		this.myCheckingAccount.deposit(100);

		// Test that current balance is 100 
		assertEquals(this.myCheckingAccount.balance, 100);
		
		// Make a deposit of -100 
		this.myCheckingAccount.deposit(-100);
		
		// Balance should be the same (100)
		assertEquals(this.myCheckingAccount.balance, 100);
		
		// Deposit 0 
		this.myCheckingAccount.deposit(0);
		
		// Balance should be the same (100)
		assertEquals(this.myCheckingAccount.balance, 100);
	}

	@Test
	void testWithdraw() {

		// Make initial deposit
		this.myCheckingAccount.deposit(100);

		// Test that current balance is 100 
		assertEquals(this.myCheckingAccount.balance, 100);

		// Make withdraw
		try {
			this.myCheckingAccount.withdraw(80);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Balance should be 20
		assertEquals(this.myCheckingAccount.balance, 20);
		
		// Try to withdraw amount greater than available balance 
		// Expect an expectation 
		assertThrows(Exception.class, () ->{
			this.myCheckingAccount.withdraw(21);
		});
		
		// Balance should be 20
		assertEquals(this.myCheckingAccount.balance, 20);
		
		// Try to make withdrwawak
		// Does not throw exception 
		assertDoesNotThrow(()->{
			this.myCheckingAccount.withdraw(1);;
		});
		
		// Balance should be 19
		assertEquals(this.myCheckingAccount.balance, 19);
	}

	@Test
	void testFastWithdraw() {

		// Initial deposit 
		this.myCheckingAccount.deposit(100);

		// Try to make a fast withdraw
		try {
			this.myCheckingAccount.fastWithdraw();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Check the balance
		assertEquals(40,this.myCheckingAccount.balance);
		
		// Reset the fast draw amount to 20 
		this.myCheckingAccount.fastCashAmount = 40;
		assertEquals(40,this.myCheckingAccount.fastCashAmount);
		
		this.myCheckingAccount.setFastCashAmount(20);
		assertEquals(20,this.myCheckingAccount.fastCashAmount);

		// Assert that exception is not thrown when making fast cash withdrawal 
		assertDoesNotThrow(() ->{
			this.myCheckingAccount.fastWithdraw();
		});

		// Check balance is 20 
		assertEquals(20,this.myCheckingAccount.balance);
		
		// Set fast withdraw to a negative amount. This should be ignored
		this.myCheckingAccount.setFastCashAmount(-50);
		
		// Balance should still be the same
		assertEquals(20,this.myCheckingAccount.balance);

		// Try to make a fast withdraw
		try {
			this.myCheckingAccount.fastWithdraw();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Withdraw more than balance 
		assertThrows(Exception.class, ()->{
			this.myCheckingAccount.fastWithdraw();
		});

	}

}
