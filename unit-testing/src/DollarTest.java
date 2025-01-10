import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DollarTest {

	@Test
	void testMultiplication() {
		Dollar five = new Dollar(5);

		Dollar product = five.times(2);

		assertEquals(10, product.getAmount());

	}

	@Test
	void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
		assertFalse(new Dollar(5).equals(null));
	}

}
