package test.com.algorithms.sort;

import static org.junit.Assert.*;

import org.junit.Test;

import com.algorithms.sort.SortUtility;

public class SortUtilityTest {

	@Test
	public void testLess() {
		int a = 1;
		int b = 2;
		assertTrue(SortUtility.less(a, b));
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public void testExchange() {
		Integer[] a = {1,2};
		int i = 0;
		int j = 1;
		SortUtility.exchange(a, i, j);
		assertEquals(new Integer(2), a[0]);
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public void testShow() {
		
		//fail("Not yet implemented"); // TODO
	}
	
	@Test
	public void testIsSorted() {
		Integer[] a = {1,2,4,9};
		assertTrue(SortUtility.isSorted(a));
		//fail("Not yet implemented"); // TODO
	}

}
