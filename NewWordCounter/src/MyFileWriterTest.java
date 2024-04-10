import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyFileWriterTest {

	MyFileWriter myFileWriter1;
	

	@BeforeEach
	void setUp() throws Exception {
		myFileWriter1 = new MyFileWriter("output_test.txt");
	}

	@Test
	void testWriteToFile() {
		ArrayList<String> actualLines = new ArrayList<String>();

		// Test file with multiple words per line
		actualLines.add("hello world");
		actualLines.add("Course Name and ID");
		actualLines.add("The quick brown fox jumps over the lazy dog.");

		// Write to file
		myFileWriter1.writeToFile(actualLines);

		// Read the written file to test its contents
		ArrayList<String> expectedLines = readWrittenFile("output_test.txt");
		assertEquals(expectedLines, actualLines);
	}

	public ArrayList<String> readWrittenFile(String writtenFilename) {
		ArrayList<String> expectedLines = new ArrayList<String>();
		try {
			BufferedReader file = new BufferedReader(new FileReader(writtenFilename));
			String line = file.readLine();
			while (line != null) {
				expectedLines.add(line);
				line = file.readLine();
			}
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return expectedLines;
	}

}
