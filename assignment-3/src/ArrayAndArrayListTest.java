import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayAndArrayListTest {

	ArrayAndArrayList arrayAndArrayList; 

	@BeforeEach
	void setUp() throws Exception {
		this.arrayAndArrayList = new ArrayAndArrayList();
	}

	@Test
	void testHowMany() {
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(2, this.arrayAndArrayList.howMany(array, 1));
		assertEquals(1, this.arrayAndArrayList.howMany(array, 2));
		assertEquals(0, this.arrayAndArrayList.howMany(array, 10));
		assertEquals(1, this.arrayAndArrayList.howMany(array, 4));
	}

	/**
	 * Test findMax method in ArrayAndArrayList.
	 */
	@Test
	void testFindMax() {

		// findMax in an nonEmpty array
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(9, this.arrayAndArrayList.findMax(array));
		
		int[] array1 = new int[0];
		assertEquals(-1, this.arrayAndArrayList.findMax(array1));
		
		int[] array2 = {2, 4, 8, 12, 12, 4};
		assertEquals(12, this.arrayAndArrayList.findMax(array2));

		int[] array4 = {2, 4, 8, 12, 12, 4};
		assertEquals(12, this.arrayAndArrayList.findMax(array4));
		
	}

	/**
	 * Test maxArray method in ArrayAndArrayList.
	 */
	@Test
	void testMaxArray() {

		// test a valid array. 
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		ArrayList<Integer> testArrayList = new ArrayList<Integer>();
		testArrayList.add(9);
		assertEquals(testArrayList, this.arrayAndArrayList.maxArray(array));
		
		int[] array2 = {2, 4, 8, 12, 12, 4};
		ArrayList<Integer> testArrayList2 = new ArrayList<Integer>();
		testArrayList2.add(12);
		testArrayList2.add(12);
		assertEquals(testArrayList2, this.arrayAndArrayList.maxArray(array2));
		
		int[] array3 = new int[0];
		assertEquals(null, this.arrayAndArrayList.maxArray(array3));

		int[] array4 = new int[0];
		assertEquals(null, this.arrayAndArrayList.maxArray(array4));
		
	}	

	/**
	 * Test swapZero method in ArrayAndArrayList.
	 */
	@Test
	void testSwapZero() {

		// test an array containing 0
		int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
		int[] testArray = {1, 2, 3, 5, 0, 0, 0, 0};
		this.arrayAndArrayList.swapZero(array);
		assertArrayEquals(testArray, array);
		
		int[] array2 = new int[0];
		int[] testArray2 = {};
		this.arrayAndArrayList.swapZero(array2);
		assertArrayEquals(testArray2, array2);
		
		int[] array3 = {1, 3, 5, 7, 9, 10};
		int[] testArray3 = {1, 3, 5, 7, 9, 10};
		this.arrayAndArrayList.swapZero(array3);
		assertArrayEquals(testArray3, array3);

		int[] array4 = {1, 3, 5, 7, 9, 10};
		int[] testArray4 = {1, 3, 5, 7, 9, 10};
		this.arrayAndArrayList.swapZero(array4);
		assertArrayEquals(testArray4, array4);
	}

}
