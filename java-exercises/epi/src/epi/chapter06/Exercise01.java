package epi.chapter06;

/**
 * From Elements of Programming, Chapter 6, Exercise 1
 * 
 * Dutch National Flag problem: sort the colors of the flag to be
 * 
 * @author leebrett https://github.com/leebrett/brett-lee-public-portfolio
 */
public class Exercise01 {

	public static void dutchFlagSort(int[] flagArray) {
		int pivot = flagArray.length / 2;
		for (int i = 0, smaller = 0, j = flagArray.length - 1, larger = flagArray.length
				- 1; i < flagArray.length; i++, --j) {
			if (flagArray[i] < pivot) {
				swap(flagArray, i, smaller++);
			}
			if (flagArray[j] > pivot) {
				swap(flagArray, j, larger--);
			}
		}
	}

	public static void dutchFlagSortOptimized(int[] flagArray) {
		int pivot = flagArray.length / 2;
		int equal = 0, smaller = 0, larger = flagArray.length - 1;
		while (equal <= larger) {
			if (flagArray[equal] < pivot) {
				swap(flagArray, smaller++, equal++);
			} else if (flagArray[equal] == pivot) {
				++equal;
			} else {
				swap(flagArray, equal, larger--);
			}
		}
	}

	private static void swap(int[] arr, int idx1, int idx2) {
		int swapValue = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = swapValue;
	}

}
