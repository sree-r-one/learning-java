import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomStringTest {
	
	//	Declare variables for testing
	CustomString myCustomString;
	
	@BeforeEach
	void setUp() throws Exception {
		this.myCustomString = new CustomString();
	}

	@Test
	void testGetString() {

		//string should be null to start, before setting it
		assertNull(this.myCustomString.getString());
		
		this.myCustomString.setString("hello");
		assertEquals("hello", this.myCustomString.getString());
		
		// Should be null if 
		// If the current string is null, 
		// has not been set to a value with setString
		this.myCustomString.setString(null);
		assertNull(this.myCustomString.getString());
		
		this.myCustomString.setString("");
		assertEquals("", this.myCustomString.getString());
		
	
	}

	@Test
	void testSetString() {

		//string should be null to start, before setting it
		assertNull(this.myCustomString.getString());
		
		this.myCustomString.setString("Good-bye!");
		assertEquals("Good-bye!", this.myCustomString.getString());

		// this.myCustomString.setString("");
		// assertEquals("", this.myCustomString.getString());
	}

	@Test
	void testRemove() {

		assertEquals("", this.myCustomString.remove(""));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.remove(""));

		this.myCustomString.setString("");
		assertEquals("", this.myCustomString.remove(""));
		
		this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
		assertEquals("my lucky numbes e 6, 8, nd 19.", this.myCustomString.remove("ra6"));
		assertEquals("my lucky numbers are 6, 8, and 19.", this.myCustomString.remove("6,."));
		assertEquals("my lucky numbers are 6, 8, and 19.", this.myCustomString.remove(""));

		this.myCustomString.setString("My lucky numbers are 6, 8, and 19.");
		assertEquals("y lucky nubes e 6, 8, nd 19.", this.myCustomString.remove("mra6"));
	}
	
	@Test
	void testReverse() {
		assertEquals("", this.myCustomString.reverse(""));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.reverse(""));
		
		this.myCustomString.setString("abc, XYZ; 123.");
		assertEquals("aBC, xyz; 123.", this.myCustomString.reverse("bcdxyz@3210."));
		
		// 	 * - For a current string "abc, XYZ; 123.", calling reverse("6,.") would return "abc, XYZ; 123."
		assertEquals("abc, XYZ; 123.", this.myCustomString.reverse("6,."));
		
		//  * - For a current string "abc, XYZ; 123.", calling reverse("") would return "abc, XYZ; 123."
		assertEquals("abc, XYZ; 123.", this.myCustomString.reverse(""));
		//  * - For a current string "", calling reverse("") would return ""
		
		this.myCustomString.setString("");
		assertEquals("", this.myCustomString.reverse(""));
	}

	@Test
	void testFilterLetters() {
		assertEquals("", this.myCustomString.filterLetters('E', false));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.filterLetters('E', true));
		
		// 	     * - For a current string "Hello 90, bye 2", calling filterLetters('h', false) would return "llo 90, y 2"
		this.myCustomString.setString("Hello 90, bye 2");
		assertEquals("llo 90, y 2", this.myCustomString.filterLetters('h', false));
		
		//  * - For a current string "Abcdefg", calling filterLetters('c', false) would return "defg"
		this.myCustomString.setString("Abcdefg");
		assertEquals("defg", this.myCustomString.filterLetters('c', false));
		
		//  * - For a current string "Hello 90, bye 2", calling filterLetters('h', true) would return "e 90, be 2"
		this.myCustomString.setString("Hello 90, bye 2");
		assertEquals("e 90, be 2", this.myCustomString.filterLetters('h', true));
		
		//  * - For a current string "Abcdefg", calling filterLetters('c', true) would return "Ab"
		this.myCustomString.setString("Abcdefg");
		assertEquals("Ab", this.myCustomString.filterLetters('c', true));
    //  * 
	}
}
