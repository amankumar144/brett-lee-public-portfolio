package warmup.exercise02;

/**
 * From: http://elementsofprogramminginterviews.com/2015-04-01-warming-up/
 * 
 * Arrays: Write a program that tests if a 2D square array is symmetric about
 * the diagonal from (0,0) to (n-1,n-1).
 * 
 * @author leebrett
 * https://github.com/leebrett/brett-lee-public-portfolio
 */
public class DiagonallySymmetrical {

	public static boolean isDiagonallySymmetrical(int[][] matrix) {
		// we need something to work with
		if (matrix.length == 0) {
			return false;
		}
		// check to make sure the matrix is square
		if (matrix.length != matrix[0].length) {
			return false;
		}

		// we need to add 1 to account for odd lengths
		int mid = (matrix.length + 1) / 2;

		int lastIndex = matrix.length - 1;

		for (int i = 0; i < mid; i++) {
			if (isEqualReversed(matrix[i], matrix[lastIndex - i])) {
				continue;
			} else {
				return false;
			}
		}

		return true;
	}

	private static boolean isEqualReversed(final int[] arr1, final int[] arr2) {
		int lastIndex = arr2.length - 1;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[lastIndex - i]) {
				return false;
			}
		}
		return true;
	}
}
