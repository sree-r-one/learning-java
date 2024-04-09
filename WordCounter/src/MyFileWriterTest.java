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
		this.myFileWriter1 = new MyFileWriter("output_test.txt"); // test output file

	}

	@Test
	void testWriteToFile() {
		// Define a list of words to write to the file
		ArrayList<String> wordsToWrite = new ArrayList<>();
		wordsToWrite.add("Hello");
		wordsToWrite.add("World");
		wordsToWrite.add("Test");

		// Write the list of words to the file
		myFileWriter1.writeToFile(wordsToWrite);

		// Read the written file
		ArrayList<String> actualLines = readWrittenFile("output_test.txt");

		// Check if the contents of the written file match the expected words
		assertEquals(wordsToWrite, actualLines);
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
