package epi.chapter06;

import java.util.ArrayList;
import java.util.List;

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
		List<Integer> profits = new ArrayList<>();
		if (stockPrices.length >= 2) {
			for (int i = 0; i < stockPrices.length; i++) {
				int currMax = stockPrices[i];
				for (int j = i + 1; j < stockPrices.length; j++) {
					if (stockPrices[j] > currMax)
						currMax = stockPrices[j];
				}
				if (stockPrices[i] < currMax)
					profits.add(currMax - stockPrices[i]);
			}
		}
		return getMax(profits);
	}

	private static int getMax(List<Integer> list) {
		int max = 0;
		for (Integer val : list) {
			if (val > max)
				max = val;
		}
		return max;
	}

}
