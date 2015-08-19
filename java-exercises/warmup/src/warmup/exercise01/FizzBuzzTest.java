package warmup.exercise01;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author leebrett
 * https://github.com/leebrett/brett-lee-public-portfolio
 */
public class FizzBuzzTest {
	
	private static final String FIZZ_BUZZ = "fizz buzz";
	private static final String FIZZ = "fizz";
	private static final String BUZZ = "buzz";


	/**
	 * Given a value of 3, the result should be "fizz".
	 */
	@Test
	public void test3() {
		assertEquals(FIZZ, FizzBuzz.fizzBuzz(3));
	}

	/**
	 * Given a value of 5, the result should be "buzz".
	 */
	@Test
	public void test5() {
		assertEquals(BUZZ, FizzBuzz.fizzBuzz(5));
	}
	
	/**
	 * Given a value of 15, the result should be "fizz buzz".
	 */
	@Test
	public void test15() {
		assertEquals(FIZZ_BUZZ, FizzBuzz.fizzBuzz(15));
	}

	/**
	 * Given a value of 0, the result should be 0.
	 */
	@Test
	public void test0() {
		assertEquals("0", FizzBuzz.fizzBuzz(0));
	}
	
	/**
	 * Given a value of 2, the result should be 2.
	 */
	@Test
	public void test2() {
		assertEquals("2", FizzBuzz.fizzBuzz(2));
	}
	
	/**
	 * Given a value of 10, the result should be "buzz".
	 */
	@Test
	public void test10() {
		assertEquals(BUZZ, FizzBuzz.fizzBuzz(10));
	}
	
	/**
	 * Given a value of 9, the result should be "fizz".
	 */
	@Test
	public void test9() {
		assertEquals(FIZZ, FizzBuzz.fizzBuzz(9));
	}
	/**
	 * Given a value of 30, the result should be "fizz buzz".
	 */
	@Test
	public void test30() {
		assertEquals(FIZZ_BUZZ, FizzBuzz.fizzBuzz(30));
	}
}
