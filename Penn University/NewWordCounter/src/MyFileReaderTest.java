import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyFileReaderTest {

	MyFileReader myFileReader1;
	MyFileReader myFileReader2;
	MyFileReader myFileReader3;

	@BeforeEach
	void setUp() throws Exception {

		// Open war_and_peace
		this.myFileReader1 = new MyFileReader("war_and_peace.txt");

		// Test 1
		this.myFileReader2 = new MyFileReader("test1.txt");

		// Test 2
		this.myFileReader3 = new MyFileReader("test2.txt");
	}

	@Test
	void testGetCleanContent() {

		// Create an array of strings with the content of the war and peace
		// Make sure that this is equal to the contents of the file

		ArrayList<String> actualContent = myFileReader1.getCleanContent();
		ArrayList<String> expectedContent = new ArrayList<String>();

		expectedContent.add("Title: War and Peace");
		expectedContent.add("Author: Leo Tolstoy");
		expectedContent.add("Translators: Louise and Aylmer Maude");
		expectedContent.add("Posting Date: January 10, 2009 [EBook #2600]");
		expectedContent.add("Last Updated: January 21, 2019");
		expectedContent.add("Language: English");
		expectedContent.add("WAR AND PEACE");
		expectedContent.add("By Leo Tolstoy/Tolstoi");

		// Loop through the expected Content and compare
		for (int i = 0; i < expectedContent.size(); i++) {
			assertEquals(expectedContent.get(i), actualContent.get(i));
		}

		actualContent = myFileReader2.getCleanContent();
		expectedContent = new ArrayList<String>();
		expectedContent.add("Lines Other Info");
		expectedContent.add("\"The Project Gutenberg EBook of War and Peace, by Leo Tolstoy\"");
		expectedContent.add("Author: Leo Tolstoy");
		expectedContent.add("CHAPTER I");
		expectedContent.add("\"Well, Prince, so Genoa and Lucca are now just family estates of the\"");
		expectedContent.add("\"Buonapartes. But I warn you, if you don't tell me that this means war,\"");
		expectedContent.add("if you still try to defend the infamies and horrors perpetrated by that");
		assertEquals(expectedContent, actualContent);

		actualContent = myFileReader3.getCleanContent();
		expectedContent = new ArrayList<String>();
		expectedContent.add("In the first case it was necessary to renounce the consciousness of an");
		expectedContent.add("unreal immobility in space and to recognize a motion we did not feel;");
		expectedContent.add("in the present case it is similarly necessary to renounce a freedom");
		expectedContent.add("\"that does not exist, and to recognize a dependence of which we are not\"");
		expectedContent.add("conscious.");
		expectedContent.add("Most people start at our Web site which has the main PG search facility:");
		expectedContent.add("http://www.gutenberg.org");
		assertEquals(expectedContent, actualContent);

	}

}
