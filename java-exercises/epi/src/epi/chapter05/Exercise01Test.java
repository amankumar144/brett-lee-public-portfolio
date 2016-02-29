package epi.chapter05;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

/**
 * 
 * @author leebrett 
 * https://github.com/leebrett/brett-lee-public-portfolio
 */
public class Exercise01Test {

	private static final long[] RANDOM_TEST_VALUES;
	private static final Random RAN_GEN = new Random();

	static {
		RANDOM_TEST_VALUES = new long[100];
		for (int i = 0; i < RANDOM_TEST_VALUES.length; i++) {
			RANDOM_TEST_VALUES[i] = RAN_GEN.nextLong();
		}
	}

	@Test // Testing against the standard Java library for determining bit
			// parity
	public void test() {
		long[] test = Arrays.copyOf(RANDOM_TEST_VALUES, RANDOM_TEST_VALUES.length);
		for (long num : test) {
			assertEquals(Exercise01.getParity(num), Long.bitCount(num) % 2);
		}
	}

}
