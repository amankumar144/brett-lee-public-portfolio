package epi.chapter06;

/**
 * From Elements of Programming, Chapter 6, Exercise 1
 * 
 * Dutch National Flag problem: sort the colors of the flag to be red(0),
 * white(1) and blue(2)
 * 
 * @author leebrett https://github.com/leebrett/brett-lee-public-portfolio
 */
public class Exercise01 {

	public static void dutchFlagSort(int[] flagArray) {
		int smaller = 0;
		int larger = flagArray.length - 1;
		int equal = 0;
		while (equal <= larger) {
			switch (flagArray[equal]) {
				case 0: {
					swap(flagArray, smaller, equal);
					smaller++;
					equal++;
					break;
				}
				case 1:
					equal++;
					break;
				case 2: {
					swap(flagArray, equal, larger);
					larger--;
					break;
				}
			}
		}
	}
	
	private static void swap(int[] arr, int idx1, int idx2) {
		int swapValue = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = swapValue;
	}

}
