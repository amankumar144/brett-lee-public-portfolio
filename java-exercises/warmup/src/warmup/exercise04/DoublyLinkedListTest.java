package warmup.exercise04;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author leebrett 
 * https://github.com/leebrett/brett-lee-public-portfolio
 */
public class DoublyLinkedListTest {

	Integer[] integerForward = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	String integerBackward = "987654321";

	Character[] characterForward = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
	String characterBackward = "GFEDCBA";

	/**
	 * Given an array of integers {1,2,3,4,5,6,7,8,9} to initialize the
	 * DoublyLinkedList, once reversed the toString value should be "987654321".
	 */
	@Test
	public void testIntegerReverse() {
		DoublyLinkedList<Integer> dll = new DoublyLinkedList<>(integerForward);
		dll.reverse();
		assertEquals(integerBackward, dll.toString());
	}

	/**
	 * Given an array of characters {'A','B','C','D','E','F','G'} to initialize
	 * the DoublyLinkedList, once reversed the expected toString value should be
	 * "GFEDCBA".
	 */
	@Test
	public void testCharacterReverse() {
		DoublyLinkedList<Character> dll = new DoublyLinkedList<>(characterForward);
		dll.reverse();
		assertEquals(characterBackward, dll.toString());
	}

}
