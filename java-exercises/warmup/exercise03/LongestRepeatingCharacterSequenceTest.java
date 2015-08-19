package warmup.exercise03;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author leebrett
 * https://github.com/leebrett/brett-lee-public-portfolio
 * 
 * @author leebrett
 * https://github.com/leebrett/brett-lee-public-portfolio
 */
public class LongestRepeatingCharacterSequenceTest {

	@Test
	public void testPositive() {
		assertEquals("aaa",
				LongestRepeatingCharacterSequence
						.findLongestRepeatingCharSequence("baaad"));
	}

	@Test
	public void testMultipleWords() {
		assertEquals("pp",
				LongestRepeatingCharacterSequence
						.findLongestRepeatingCharSequence("what's upp?"));
	}

	@Test
	public void testNoRepeatingChar() {
		assertEquals("",
				LongestRepeatingCharacterSequence
						.findLongestRepeatingCharSequence("what's up?"));

	}
	
	@Test
	public void testWithMultipleMatches() {
		assertEquals("....",
				LongestRepeatingCharacterSequence
						.findLongestRepeatingCharSequence("Hey, maaan.... What's upp?"));
	}

}
