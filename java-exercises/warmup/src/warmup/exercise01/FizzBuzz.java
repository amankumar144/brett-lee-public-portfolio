package warmup.exercise01;

/**
 * From: http://elementsofprogramminginterviews.com/2015-04-01-warming-up/
 * 
 * Primitive types: write a program that takes as input an integer, N, and
 * prints all the integers from 1 to N, replacing numbers divisible by 3 with
 * "fizz", numbers divisible by 5 with "buzz", and numbers divisible by both
 * with "fizz buzz".
 * 
 * @author leebrett
 * https://github.com/leebrett/brett-lee-public-portfolio
 */
public class FizzBuzz {
	private static final String FIZZ_BUZZ = "fizz buzz";
	private static final String FIZZ = "fizz";
	private static final String BUZZ = "buzz";
	private static final String ARGUMENT_ERROR = "You need to pass in one numeric value.";

	public static void main(String[] args) {
		int n = 0;
		if (args.length > 0) {
			try {
				n = Integer.valueOf(args[0]);
			} catch (NumberFormatException e) {
				System.err.println(ARGUMENT_ERROR);
			}
		} else {
			System.err.println(ARGUMENT_ERROR);
		}
		for (int i = 1; i <= n; i++) {
			System.out.println(fizzBuzz(i));
		}
	}

	protected static String fizzBuzz(final int i) {
		// zero is a special case, because it can technically be divisible by
		// all of them
		if (i == 0) {
			return String.valueOf(i);
		}
		// 15 is the common lowest denominator of both 5 and 3 so you can
		// save a calculation
		if (i % 15 == 0) {
			return FIZZ_BUZZ;
		} else if (i % 3 == 0) {
			return FIZZ;
		} else if (i % 5 == 0) {
			return BUZZ;
		} else {
			return String.valueOf(i);
		}
	}

}
