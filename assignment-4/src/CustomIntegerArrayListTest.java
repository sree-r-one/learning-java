import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CustomIntegerArrayListTest {

	@Test
	void testGetArrayList() {
		
		//create a new empty CustomIntegerArrayList
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);
		assertEquals(lst1, arr1.getArrayList());

		ArrayList<Integer> arr4Elements = new ArrayList<Integer>();
		arr4Elements.add(100);
		arr4Elements.add(200);
		arr4Elements.add(500);
		
		//create a new CustomIntegerArrayList with the elements in the given ArrayList
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList(arr4Elements);

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(100);
		lst4.add(200);
		lst4.add(500);

		assertEquals(lst4, arr4.getArrayList());
		
		// TODO write at least 3 additional test cases

		// Create arraylist
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(0);
		lst2.add(1);
		lst2.add(2);
		lst2.add(3);

		ArrayList<Integer> arr2Elements = new ArrayList<Integer>();
		arr2Elements.add(0);
		arr2Elements.add(1);
		arr2Elements.add(2);
		arr2Elements.add(3);

		// Create new CustomIntegerArrayList
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList(arr2Elements);
		
		assertEquals(lst2, arr2.getArrayList());

		// Create arraylist
		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(0);
		lst3.add(1);
		lst3.add(1);
		lst3.add(1);

		ArrayList<Integer> arr3Elements = new ArrayList<Integer>();
		arr3Elements.add(0);
		arr3Elements.add(1);
		arr3Elements.add(1);
		arr3Elements.add(1);

		// Create new CustomIntegerArrayList
		CustomIntegerArrayList arr3 = new CustomIntegerArrayList(arr3Elements);
		
		assertEquals(lst3, arr3.getArrayList());
		
		//create a new empty CustomIntegerArrayList
		CustomIntegerArrayList arr5 = new CustomIntegerArrayList();
		arr1.add(3);
		arr1.add(0, 5);
		arr1.add(1, 5);
		
		ArrayList<Integer> lst5 = new ArrayList<Integer>();
		lst1.add(3);
		lst1.add(0, 5);
		lst1.add(1, 5);
		assertEquals(lst5, arr5.getArrayList());

	}

	@Test
	void testGet() {
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases 

		CustomIntegerArrayList arr5 = new CustomIntegerArrayList();

		arr5.add(5);
		arr5.add(0,5);
		arr5.add(1,5);
		
		ArrayList<Integer> lst5 = new ArrayList<Integer>();

		lst5.add(5);
		lst5.add(0,5);
		lst5.add(1,5);

		assertEquals(arr5.get(0), lst5.get(0));
		assertEquals(arr5.get(1), lst5.get(1));
		assertEquals(arr5.get(2), lst5.get(2));
	}

	@Test
	void testAddInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases 
		CustomIntegerArrayList arr5 = new CustomIntegerArrayList();

		arr5.add(5);
		arr5.add(0,5);
		arr5.add(1,5);
		
		ArrayList<Integer> lst5 = new ArrayList<Integer>();

		lst5.add(5);
		lst5.add(0,5);
		lst5.add(1,5);

		assertEquals(arr5.get(0), lst5.get(0));
		assertEquals(arr5.get(1), lst5.get(1));
		assertEquals(arr5.get(2), lst5.get(2));
	}

	@Test
	void testAddIntInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases 
		CustomIntegerArrayList arr5 = new CustomIntegerArrayList();

		arr5.add(5);
		arr5.add(0,5);
		arr5.add(1,5);
		
		ArrayList<Integer> lst5 = new ArrayList<Integer>();

		lst5.add(5);
		lst5.add(0,5);
		lst5.add(1,5);

		assertEquals(arr5.get(0), lst5.get(0));
		assertEquals(arr5.get(1), lst5.get(1));
		assertEquals(arr5.get(2), lst5.get(2));	
	}

	@Test
	void testRemoveInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(0);
		arr1.remove(1);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);
		lst1.remove(0);
		lst1.remove(1);
		
		assertEquals(lst1.get(0), arr1.get(0));

		// TODO write at least 3 additional test cases 
		CustomIntegerArrayList arr5 = new CustomIntegerArrayList();

		arr5.add(5);
		arr5.add(0,5);
		arr5.add(1,5);
		arr5.add(1,4);
		arr5.add(1,4);
		
		ArrayList<Integer> lst5 = new ArrayList<Integer>();

		lst5.add(5);
		lst5.add(0,5);
		lst5.add(1,5);
		lst5.add(1,4);
		lst5.add(1,4);

		assertEquals(arr5.get(0), lst5.get(0));
		assertEquals(arr5.get(1), lst5.get(1));
		assertEquals(arr5.get(2), lst5.get(2));
	}

	@Test
	void testRemoveIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(3, 3);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);

		assertEquals(lst1, arr1.getArrayList());

		// TODO write at least 3 additional test cases 
	}

	@Test
	void testSpliceIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 2);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases 
	}

	@Test
	void testSpliceIntIntIntArray() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 1, new int[] { 4, 5 });
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		lst1.add(4);
		lst1.add(5);
		lst1.add(6);
		
		assertEquals(lst1, arr1.getArrayList());

		// TODO write at least 3 additional test cases 
	}
}