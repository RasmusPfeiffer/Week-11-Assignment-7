package assignment7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_one_item() {
		CustomList<Integer> lCustom = new CustomArrayList<>();
		lCustom.add(1);
		Integer iExpResult = lCustom.get(0);

		assertEquals(1, iExpResult);
	}
	
	
//	  Changed getSize after this test, returned Array.length for this Test
	 
	@Test
	void should_double_List_size() {
		CustomList<Integer> lCustom = new CustomArrayList<>();
		for (int i = 0; i < 88; i++) {
			lCustom.add(i);
		}
		int iExpSize = lCustom.getSize();
		int iExpResult = lCustom.get(87);
		
		assertEquals(160, iExpSize);
		assertEquals(87, iExpResult);
	}

	@Test
	void should_return_actual_items_in_Array() {
		CustomList<Integer> lCustom = new CustomArrayList<>();
		for (int i = 0; i < 88; i++) {
			lCustom.add(i);
		}
		int iExpSize = lCustom.getSize();
		
		assertEquals(88, iExpSize);
	}

	@Test
	void should_return_array_size_without_null_if_items_equal_arrayLength() {
		CustomList<Integer> lCustom = new CustomArrayList<>();
		for (int i = 0; i < 40; i++) {
			lCustom.add(i);
		}
		int iExpSize = lCustom.getSize();
		
		assertEquals(40, iExpSize);
	}

	@Test
	void should_remove_one_item() {
		CustomList<Integer> lCustom = new CustomArrayList<>();
		for (int i = 0; i < 42; i++) {
			lCustom.add(i);
		}

		lCustom.remove(4);

		int iExpSize = lCustom.getSize();
		Integer iExpResult = lCustom.get(4);

		assertEquals(41, iExpSize);
		assertEquals(5, iExpResult);
	}
	
	@Test
	void should_add_an_item_at_index() {
		CustomList<Integer> lCustom = new CustomArrayList<>();
		for (int i = 0; i < 40; i++) {
			lCustom.add(i);
		}
		lCustom.add(5, 10);
		
		int iExpSize = lCustom.getSize();
		int iExpResult = lCustom.get(5);
		assertEquals(40+1, iExpSize);
		assertEquals(10, iExpResult);
	
	}

}
