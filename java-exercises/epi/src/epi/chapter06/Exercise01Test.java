package epi.chapter06;

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
	private static int[] DUTCH_FLAG_COMPLETE = { 0, 0, 0, 1, 1, 1, 2, 2, 2 };
	private static int[] TEST_ARRAY = { 2, 1, 1, 0, 0, 2, 0, 1, 2 };

	private static int[] RANDOM_UNSORTED_ARRAY;
	private static int[] RANDOM_SORTED_ARRAY;
	static{
		RANDOM_UNSORTED_ARRAY = new int[10000000];
		for (int i = 0; i < RANDOM_UNSORTED_ARRAY.length; i++) {
			RANDOM_UNSORTED_ARRAY[i] = RAN_GEN.nextInt();
		}
		RANDOM_SORTED_ARRAY = RANDOM_UNSORTED_ARRAY;
		Arrays.sort(RANDOM_SORTED_ARRAY);		
	}

	@Test
	public void testInitial() {
		int[] test = Arrays.copyOf(TEST_ARRAY, TEST_ARRAY.length);
		Exercise01.dutchFlagSort(test);
		for (int i = 0; i < DUTCH_FLAG_COMPLETE.length; i++) {
			assert (test[i] == DUTCH_FLAG_COMPLETE[i]);
		}
	}

	@Test
	public void testOptimized() {
		int[] test = Arrays.copyOf(TEST_ARRAY, TEST_ARRAY.length);
		Exercise01.dutchFlagSortOptimized(test);
		for (int i = 0; i < DUTCH_FLAG_COMPLETE.length; i++) {
			assert (test[i] == DUTCH_FLAG_COMPLETE[i]);
		}
	}
	
	@Test
	public void testInitialLarge() {
		int[] test = Arrays.copyOf(RANDOM_UNSORTED_ARRAY, RANDOM_UNSORTED_ARRAY.length);
		Exercise01.dutchFlagSort(test);
		for (int i = 0; i < RANDOM_SORTED_ARRAY.length; i++) {
			assert (test[i] == DUTCH_FLAG_COMPLETE[i]);
		}
	}

	@Test
	public void testOptimizedLarge() {
		int[] test = Arrays.copyOf(RANDOM_UNSORTED_ARRAY, RANDOM_UNSORTED_ARRAY.length);
		Exercise01.dutchFlagSortOptimized(test);
		for (int i = 0; i < RANDOM_SORTED_ARRAY.length; i++) {
			assert (test[i] == DUTCH_FLAG_COMPLETE[i]);
		}
	}
}
