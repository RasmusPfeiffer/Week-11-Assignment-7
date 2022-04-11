package assignment7;

import static org.junit.Assert.fail;
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

	@Test
	void should_double_List_size() {
		CustomList<Integer> lCustom = new CustomArrayList<>();
		for (int i = 0; i < 88; i++) {
			lCustom.add(10000);
		}
		int iExpSize = lCustom.getSize();
		int iExpResult = lCustom.get(87);

		assertEquals(88, iExpSize);
		assertEquals(10000, iExpResult);
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
	void should_remove_one_item() {
		CustomList<Integer> lCustom = new CustomArrayList<>();
		for (int i = 0; i < 10; i++) {
			lCustom.add(i);
		}

		lCustom.remove(4);
		lCustom.remove(9);
//		lCustom.remove(6);

		int iExpSize = lCustom.getSize();
		Integer iExpResult = lCustom.get(8);

		assertEquals(8, iExpSize);
		assertEquals(null, iExpResult);
	}

	@Test
	void should_add_an_item_at_index() {
		CustomList<Integer> lCustom = new CustomArrayList<>();
		for (int i = 0; i < 10; i++) {
			lCustom.add(i);
		}
		lCustom.add(7, 10000);
		lCustom.add(9, 20000);

//		lCustom.remove(9);
//		lCustom.remove(6);
		
		int iExpSize = lCustom.getSize();
		int iExpResult = lCustom.get(7);
		assertEquals(10 + 2, iExpSize);
		assertEquals(10000, iExpResult);

	}
	
	@Test
	void should_throw_exception() {
		CustomList<Integer> lCustom = new CustomArrayList<>();
		for (int i = 0; i < 40; i++) {
			lCustom.add(i);
		}
	
		try {
//			lCustom.add(40, 10000);
//			lCustom.remove(40);
//			lCustom.get(40);
//			lCustom.get(-1);
//			lCustom.remove(-1);
			lCustom.add(-1, 5);
			fail("no exception thrown");
		} catch (IndexOutOfBoundsException e) {
			return;
		}
		fail("so exception thrown");
		
	}

}
