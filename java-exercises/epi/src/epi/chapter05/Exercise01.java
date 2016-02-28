package epi.chapter05;

/**
 * From Elements of Programming, Chapter 5, Exercise 1 
 * 
 * Find the parity of 64-bit words. - Parity 1 = number of 1-bits are odd. -
 * Parity 0 = number of 1-bits are even.
 * 
 * @author leebrett
 * https://github.com/leebrett/brett-lee-public-portfolio
 */

public class Exercise01 {
	private static short[] parityLookup;
	private static final int BIT_MASK = 0xFFFF;
	private static final int WORD_SIZE = 16;

	// Store the values in the lookup table up front
	static {
		parityLookup = new short[BIT_MASK];
		for (int i = 0; i < BIT_MASK; ++i) {
			parityLookup[i] = parityCalculator(i);
		}
	}

	// This is a brute force solution, that should not be done for 64-bit words
	// as it has an O(n) time for each bit
	private static short parityCalculator(long number) {
		short ret = 0;
		while (number != 0) {
			ret ^= (number & 1);
			number >>>= 1;
		}
		return ret;
	}

	// Bit shift by the size of each chunk (4x16bit chunks) then XOR it with the
	// result of the previous chunk.
	public static short getParity(long number) {
		short ret = 0;
		ret ^= parityLookup[(int) (number & BIT_MASK)];
		number = number >>> WORD_SIZE;

		ret ^= parityLookup[(int) (number) & BIT_MASK];
		number = number >>> WORD_SIZE;

		ret ^= parityLookup[(int) (number) & BIT_MASK];
		number = number >>> WORD_SIZE;

		ret ^= parityLookup[(int) (number) & BIT_MASK];

		return ret;
	}

}
