package epi.chapter05;

import java.util.Random;

import org.junit.Test;

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
		for (long num : RANDOM_TEST_VALUES) {
			assert (Exercise01.getParity(num) == Long.bitCount(num) % 2);
		}
	}

}
