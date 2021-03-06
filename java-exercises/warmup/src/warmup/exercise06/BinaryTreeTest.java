package warmup.exercise06;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {
	int[] testValues = { 10, 8, 11, 13, 19, 4, 3, -1, 7 };
	int[] inOrder = { -1, 3, 4, 7, 8, 10, 11, 13, 19 };
	int[] preOrder = { 10, 8, 4, 3, -1, 7, 11, 13, 19 };
	int[] postOrder = { -1, 3, 7, 4, 8, 19, 13, 11, 10 };
	int[] reverseOrder = {19, 13, 11, 10, 8, 7, 4, 3, -1};
	BinaryTree<Integer> tree;

	@Before
	public void setupTree() {
		tree = new BinaryTree<Integer>();
		for (int i : testValues) {
			tree.add(i);
		}
	}

	@Test
	public void testInOrder() {
		List<Integer> list = tree.getAsList(TraversalOrder.INORDER);
		for (int i = 0; i < list.size(); i++) {
			assertEquals(list.get(i).intValue(), inOrder[i]);
		}
	}

	@Test
	public void testPreOrder() {
		List<Integer> list = tree.getAsList(TraversalOrder.PREORDER);
		for (int i = 0; i < list.size(); i++) {
			assertEquals(list.get(i).intValue(), preOrder[i]);
		}
	}
	
	@Test
	public void testPostOrder() {
		List<Integer> list = tree.getAsList(TraversalOrder.POSTORDER);
		for (int i = 0; i < list.size(); i++) {
			assertEquals(list.get(i).intValue(), postOrder[i]);
		}
	}
	
	@Test
	public void testReverseOrder() {
		List<Integer> list = tree.getAsList(TraversalOrder.REVERSEORDER);
		for (int i = 0; i < list.size(); i++) {
			assertEquals(list.get(i).intValue(), reverseOrder[i]);
		}
	}

}
