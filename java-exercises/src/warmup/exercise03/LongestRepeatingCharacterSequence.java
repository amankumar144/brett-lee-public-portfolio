package warmup.exercise03;

/**
 * From: http://elementsofprogramminginterviews.com/Warming-Up/
 * 
 * Strings: Write a program to find the longest substring that consists of a
 * single character in an input string.
 * 
 * @author leebrett
 * https://github.com/leebrett/brett-lee-public-portfolio
 */
public class LongestRepeatingCharacterSequence {

	public static String findLongestRepeatingCharSequence(String str) {
		String longestRepeatingCharSeq = "";
		if (str != null && str.length() > 0) {
			// Initialize with the first character so we have something to compare.
			char lastChar = str.charAt(0);
			
			// To keep track of the current repeating character substring...
			StringBuilder sb = new StringBuilder();
			
			
			for (int i = 1; i < str.length(); i++) {
				if (str.charAt(i) == lastChar) {
					// We have a hit, so check if sb is empty.
					if (sb.length() == 0) {
						// It is, so we need to add our previous character...
						sb.append(lastChar);
					}
					// ...and then the current character.
					sb.append(str.charAt(i));
				} else { 
					// The pattern is broken; check if we have a new longest repeating sequence.
					if (sb.length() > longestRepeatingCharSeq.length()) {
						// New longest sequence is set to the last value in string
						longestRepeatingCharSeq = sb.toString();
					}
					// Reset our temporary variable.
					sb.setLength(0);
				}
				lastChar = str.charAt(i);
			}
		}
		return longestRepeatingCharSeq;
	}

}
