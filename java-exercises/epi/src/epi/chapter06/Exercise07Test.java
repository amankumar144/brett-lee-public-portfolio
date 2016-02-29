package epi.chapter06;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise07Test {
	private static final int[] TEST_1 = { 310, 315, 275, 295, 260, 270, 290, 230, 255, 250 };
	private static final int[] TEST_2 = { 310, 310, 275, 270, 260, 260, 260, 230, 230, 230 };

	@Test
	public void test1() {
		assertEquals(Exercise07.getMaxProfit(TEST_1), 30);
	}

	@Test
	public void test2() {
		assertEquals(Exercise07.getMaxProfit(TEST_2), 30);
	}

}
