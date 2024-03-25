import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VehicleTest {
	Vehicle jeep1;
	Vehicle jeep2;
	Vehicle benz;
	Vehicle bike1;
	Vehicle bike2;
	Vehicle bike3;

	@BeforeEach
	void setUp() throws Exception {
		this.jeep1 = new Car("Jeep", 2019);
		this.jeep2 = new Car("Jeep", 2010);
		this.benz = new Car("Benz", 2020);
		this.bike1 = new Bike("Trek", 1999);
		this.bike2 = new Bike("Giant", 1999);
		this.bike3 = new Bike("Giant", 2020);
	}

	@Test
	void testGetAge() {
		assertEquals(0, jeep1.getAge());
		assertEquals(0, jeep2.getAge());
		assertEquals(0, benz.getAge());
		assertEquals(0, bike1.getAge());
		assertEquals(0, bike2.getAge());
		assertEquals(0, bike3.getAge());
	}
}
