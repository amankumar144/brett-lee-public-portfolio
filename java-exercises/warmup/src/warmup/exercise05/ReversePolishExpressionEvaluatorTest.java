package warmup.exercise05;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author leebrett https://github.com/leebrett/brett-lee-public-portfolio
 */
public class ReversePolishExpressionEvaluatorTest {

	@Test
	public void testIncompleteExpression() throws Exception {
		assertEquals(ReversePolishExpressionEvaluator.evaluate("3 4 + 5"), 5);
	}

	@Test
	public void testAddition() throws Exception {
		assertEquals(ReversePolishExpressionEvaluator.evaluate("3 4 +"), 7);
	}

	@Test
	public void testSubtractionNegResult() throws Exception {
		assertEquals(ReversePolishExpressionEvaluator.evaluate("3 4 -"), -1);
	}

	@Test
	public void testSubtractionPosResult() throws Exception {
		assertEquals(ReversePolishExpressionEvaluator.evaluate("4 3 -"), 1);
	}

	@Test
	public void testMultiplication() throws Exception {
		assertEquals(ReversePolishExpressionEvaluator.evaluate("3 4 *"), 12);
	}

	@Test
	public void testDivisionFractionResult() throws Exception {
		assertEquals(ReversePolishExpressionEvaluator.evaluate("3 12 /"), 0);
	}

	@Test
	public void testDivisionWholeResult() throws Exception {
		assertEquals(ReversePolishExpressionEvaluator.evaluate("12 3 /"), 4);
	}

	@Test
	public void testSubtractionMultipleOperators() throws Exception {
		assertEquals(ReversePolishExpressionEvaluator.evaluate("1 3 + 5 7 + *"), 48);
	}
}
