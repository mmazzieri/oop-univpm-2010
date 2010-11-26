package it.univpm.progogg.tdd;

import org.junit.*;
import static it.univpm.progogg.tdd.Factorials.*;

public class FactorialsTest {

	@Test
	public void test0() {
		Assert.assertEquals(1, factorial(0));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(1, factorial(1));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(2, factorial(2));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(6, factorial(3));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(24, factorial(4));
	}
	
	@Test
	public void test7() {
		Assert.assertEquals(5040, factorial(7));
	}
	
	@Test
	public void test11() {
		Assert.assertEquals(39916800, factorial(11));
	}
	
	@Test
	public void testNegative() {
		Assert.assertEquals(1, factorial(-1));
	}
	
	@Test
	public void testBig() {
		Assert.assertEquals(2304077777655037952l, factorial(39));
	}

}
