package epi.chapter06;

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
	private static final Random RAN_GEN = new Random();
	private static int[] DUTCH_FLAG_COMPLETE = 	{ 0, 0, 0, 1, 1, 1, 2, 2, 2 };
	private static int[] TEST_ARRAY = 			{ 2, 1, 1, 0, 0, 2, 0, 1, 2 };

	private static int[] RANDOM_UNSORTED_ARRAY;
	private static int[] RANDOM_SORTED_ARRAY;
	static {
		RANDOM_UNSORTED_ARRAY = new int[10000000];
		for (int i = 0; i < RANDOM_UNSORTED_ARRAY.length; i++) {
			RANDOM_UNSORTED_ARRAY[i] = RAN_GEN.nextInt(3);
		}
		RANDOM_SORTED_ARRAY = Arrays.copyOf(RANDOM_UNSORTED_ARRAY, RANDOM_UNSORTED_ARRAY.length);
		Arrays.sort(RANDOM_SORTED_ARRAY);
	}

	@Test
	public void test() {
		int[] test = Arrays.copyOf(TEST_ARRAY, TEST_ARRAY.length);
		Exercise01.dutchFlagSort(test);
		for (int i = 0; i < DUTCH_FLAG_COMPLETE.length; i++) {
			assertEquals(test[i], DUTCH_FLAG_COMPLETE[i]);
		}
	}

	@Test
	public void testLarge() {
		int[] test = Arrays.copyOf(RANDOM_UNSORTED_ARRAY, RANDOM_UNSORTED_ARRAY.length);
		Exercise01.dutchFlagSort(test);
		for (int i = 0; i < RANDOM_SORTED_ARRAY.length; i++) {
			assertEquals(test[i], RANDOM_SORTED_ARRAY[i]);
		}
	}
}
