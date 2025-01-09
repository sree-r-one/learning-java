import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {

	@Test
	public void same_currency_n_amount_is_equal() {
		Money m1 = new Money(12, "SGD");
		Money m2 = new Money(12, "SGD");

		assertEquals(m1, m2);
	}

	@Test
	public void adding_same_currency_return_amount_added_up() {
		Money m1 = new Money(12, "SGD");
		Money m2 = new Money(14, "SGD");

		Money sum = m1.add(m2);

		assertEquals(new Money(26, "SGD"), sum);
	}

}
