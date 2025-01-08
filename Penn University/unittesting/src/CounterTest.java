import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {
	
//	Declare variable counter before testing 
	Counter counter; 

	@BeforeEach
	void setUp() throws Exception {
		this.counter = new Counter();
	}

	@Test
	void testIncrement() {
		assertTrue(this.counter.increment() == 1);
		assertTrue(this.counter.increment() == 2);
		assertTrue(this.counter.increment() == 3);
		assertFalse(this.counter.getCount() == 2, "Should not be getting 2 after incrementing 3 times from default of 0");
		assertEquals(this.counter.getCount(),3);
		assertFalse(this.counter.increment() == 3, "Should not be 3 as this is already incremented 4 times");
	}

	@Test
	void testDecrement() {
		assertTrue(this.counter.decrement() == -1);
		assertTrue(this.counter.decrement() == -2);
		assertTrue(this.counter.decrement() == -3);
		assertFalse(this.counter.getCount() == -1, "Should not be -1 as this is already decremented 3 times");
		assertEquals(this.counter.getCount(), -3);
		assertFalse(this.counter.decrement() == -3, "Should not be -3 as this is already incremented 4 times");
	}

}
