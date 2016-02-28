package vampire;

import java.util.Arrays;

/**
 * A vampire number is a natural number with an even number of digits, that can
 * be factored into two integers. These two factors are called the fangs, and
 * must have the following properties:
 * 
 * 1) they each contain half the number of the digits of the original number 2)
 * together they consist of exactly the same digits as the original number 3) at
 * most one of them has a trailing zero
 * 
 * An example of a Vampire number and its fangs: 1260 : (21, 60)
 * 
 * @author brettlee
 *
 */
public class VampireNumber {
	public static int[] getFangs(final int number) {
		String numStr = String.valueOf(number);
		if (numStr.length() % 2 == 0) {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (checkFangs(number, i, number / i)) {
					int[] arr = new int[2];
					arr[0] = i;
					arr[1] = number / i;
					return arr;
				}
			}
		}
		return null;
	}

	private static boolean checkFangs(int number, int fang1, int fang2) {
		if (number != fang1 * fang2)
			return false;

		if (fang1 % 10 == 0 && fang2 % 10 == 0)
			return false;

		char[] orig = String.valueOf(number).toCharArray();
		char[] fangs = (String.valueOf(fang1) + String.valueOf(fang2)).toCharArray();
		Arrays.sort(orig);
		Arrays.sort(fangs);
		if (orig.length != fangs.length)
			return false;
		for (int i = 0; i < fangs.length; i++)
			if (orig[i] != fangs[i])
				return false;

		return true;
	}

}
