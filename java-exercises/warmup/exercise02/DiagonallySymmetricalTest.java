package warmup.exercise02;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author leebrett
 * https://github.com/leebrett/brett-lee-public-portfolio
 */
public class DiagonallySymmetricalTest {

	int[][] positive6x6Matrix = { 
			{ 12, 5, 8, 3, 2, 9 }, 
			{ 1, 6, 7, 4, 11, 13 },
			{ 10, 4, 3, 7, 9, 15 }, 
			{ 15, 9, 7, 3, 4, 10 },
			{ 13, 11, 4, 7, 6, 1 }, 
			{ 9, 2, 3, 8, 5, 12 } 
			};
	
	int[][] negative5x5Matrix = { 
			{ 12, 5, 8, 3, 2 }, 
			{ 1, 6, 7, 4, 11 },
			{ 15, 9, 8, 3, 4 },
			{ 11, 4, 7, 6, 1 }, 
			{ 2, 3, 8, 5, 12 } 
			};
	
	int[][] positive5x5Matrix = { 
			{ 12, 5, 8, 3, 2 }, 
			{ 1, 6, 7, 4, 11 },
			{ 15, 9, 8, 9, 15 },
			{ 11, 4, 7, 6, 1 }, 
			{ 2, 3, 8, 5, 12 } 
			};
	
	int[][] negativeMatrixNotSquare = { 
			{ 12, 5, 8, 3, 2, 9 }, 
			{ 1, 6, 7, 4, 11, 13 },
			{ 10, 4, 3, 7, 9, 15 }, 
			{ 13, 11, 4, 7, 6, 1 }, 
			{ 9, 2, 3, 8, 5, 12 } 
			};
	
	int[][] negativeMatrixEmpty = { };
	
	int[][] negativeMatrixOneWrong = { 
			{ 12, 5, 8, 3, 2, 9 }, 
			{ 1, 6, 7, 4, 11, 13 },
			{ 10, 4, 3, 7, 9, 15 }, 
			{ 15, 9, 7, 3, 3, 10 },
			{ 13, 11, 4, 7, 6, 1 }, 
			{ 9, 2, 3, 8, 5, 12 } 
			};

	/**
	 * Given a 6x6 integer matrix that is diagonally symmetric, the result
	 * should be true.
	 */
	@Test
	public void testPositive6x6() {
		assertTrue(DiagonallySymmetrical
				.isDiagonallySymmetrical(positive6x6Matrix));
	}

	/**
	 * Given a 5x5 integer matrix that is diagonally symmetric, the result
	 * should be true.
	 */
	@Test
	public void testPositive5x5() {
		assertTrue(DiagonallySymmetrical
				.isDiagonallySymmetrical(positive5x5Matrix));
	}
	
	/**
	 * Given a 5x5 integer matrix where the middle row is not symmetrical, the
	 * result should be false.
	 */
	@Test
	public void test5x5Negative() {
		assertFalse(DiagonallySymmetrical
				.isDiagonallySymmetrical(negative5x5Matrix));
	}
	
	/**
	 * Given a 6x5 integer matrix, the result should be false.
	 */
	@Test
	public void testNegativeNotSquare() {
		assertFalse(DiagonallySymmetrical
				.isDiagonallySymmetrical(negativeMatrixNotSquare));
	}

	/**
	 * Given an empty integer matrix the result should be false.
	 */
	@Test
	public void testNegativeEmpty() {
		assertFalse(DiagonallySymmetrical
				.isDiagonallySymmetrical(negativeMatrixEmpty));
	}

	/**
	 * Given a 6x6 integer matrix that is diagonally symmetric except for one
	 * row, the result should be false.
	 */
	@Test
	public void testNegativeOneWrong() {
		assertFalse(DiagonallySymmetrical
				.isDiagonallySymmetrical(negativeMatrixOneWrong));
	}

}
