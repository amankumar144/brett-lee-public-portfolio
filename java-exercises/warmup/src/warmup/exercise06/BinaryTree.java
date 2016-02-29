package warmup.exercise06;

import java.util.ArrayList;
import java.util.List;

/**
 * From: http://elementsofprogramminginterviews.com/2015-04-01-warming-up/
 * 
 * Binary Trees: Write inorder, preorder and postorder traversal methods for a
 * binary tree. (You will need to implement a class suitable for representing
 * binary trees, but do not need to implement add, lookup, delete, etc.
 * methods.)
 * 
 * @author brettlee
 *
 * @param <T>
 */
public class BinaryTree<T extends Comparable<T>> {

	private Node<T> root = null;

	public List<T> getAsList(TraversalOrder order) {
		List<T> ret = new ArrayList<T>();
		switch (order) {
			case INORDER:
				readInOrder(root, ret);
				break;
			case PREORDER:
				readPreOrder(root, ret);
				break;
			case POSTORDER:
				readPostOrder(root, ret);
				break;
			case REVERSEORDER:
				readReverseOrder(root, ret);
				break;
		}
		return ret;
	}

	private void readInOrder(BinaryTree<T>.Node<T> node, List<T> ret) {
		if (node != null) {
			readInOrder(node.left, ret);
			ret.add(node.data);
			readInOrder(node.right, ret);
		}
	}

	private void readPreOrder(BinaryTree<T>.Node<T> node, List<T> ret) {
		if (node != null) {
			ret.add(node.data);
			readPreOrder(node.left, ret);
			readPreOrder(node.right, ret);
		}
	}

	private void readPostOrder(BinaryTree<T>.Node<T> node, List<T> ret) {
		if (node != null) {
			readPostOrder(node.left, ret);
			readPostOrder(node.right, ret);
			ret.add(node.data);
		}
	}

	private void readReverseOrder(BinaryTree<T>.Node<T> node, List<T> ret) {
		if (node != null) {
			readReverseOrder(node.right, ret);
			ret.add(node.data);
			readReverseOrder(node.left, ret);
		}
	}

	public void add(T val) {
		if (val != null) {
			Node<T> node = new Node<T>();
			node.data = val;
			if (root == null)
				root = node;
			else
				insert(node, root);
		}
	}

	private void insert(Node<T> node, Node<T> parent) {
		if (node.data.compareTo(parent.data) <= 0) {
			if (parent.left != null)
				insert(node, parent.left);
			else
				parent.left = node;
		} else {
			if (parent.right != null)
				insert(node, parent.right);
			else
				parent.right = node;
		}
	}

	@SuppressWarnings("hiding")
	private class Node<T> {
		Node<T> left = null;
		Node<T> right = null;
		T data = null;
	}

}
