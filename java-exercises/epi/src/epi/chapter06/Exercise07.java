package epi.chapter06;

/**
 * 
 * From Elements of Programming, Chapter 6, Exercise 7
 * 
 * Buy and Sell Stock Once problem: Find the maximum profit that can be made at
 * buying low and selling high. Finding min and max are not enough, because
 * maximums can occur before a minimum.
 * 
 * @author leebrett https://github.com/leebrett/brett-lee-public-portfolio
 */
public class Exercise07 {

	public static int getMaxProfit(int[] stockPrices) {
		if (stockPrices.length >= 2) {
			int currMin = stockPrices[0];
			int minIndex = 0;
			for (int i = 1; i < stockPrices.length; i++) {
				if (stockPrices[i] < currMin) {
					currMin = stockPrices[i];
					minIndex = i;
				}
			}
			int currMax = stockPrices[minIndex];
			for (int i = minIndex + 1; i < stockPrices.length; i++) {
				if (stockPrices[i] > currMax)
					currMax = stockPrices[i];
			}
			if (currMin < currMax)
				return currMax - currMin;
		}
		return 0;
	}

}
