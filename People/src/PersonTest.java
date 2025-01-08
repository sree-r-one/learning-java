import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testPerson() {

		Person person1 = new Person("Ted",22);
		Person person2 = new Person("ted",22);

		assertNotEquals(person1,person2);

		Person person3 = new Person("Ted",34);

		assertEquals(person1,person3);
		assertNotEquals(person2,person3);
		
	}

}
