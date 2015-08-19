package warmup.exercise04;

/**
 * From: http://elementsofprogramminginterviews.com/Warming-Up/
 * 
 * Linked Lists: Implement a doubly linked list of integers class. Write a
 * reverse method for your list class that reverses a list without changing the
 * node contents.
 *  
 * @author leebrett
 * https://github.com/leebrett/brett-lee-public-portfolio
 */
public class DoublyLinkedList<T> {

	private Node<T> head = null;
	private Node<T> tail = null;

	public DoublyLinkedList(T[] array) {
		if (array != null) {
			for (T val : array) {
				this.add(val);
			}
		}
	}

	public void add(T val) {
		Node<T> newNode = new Node<T>();
		newNode.data = val;
		if (head == null && tail == null) {
			head = newNode;
			tail = head;
		} else if (tail != null) {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}

	public void reverse() {
		Node<T> curr = head;
		Node<T> swap = null;
		while (curr != null) {
			swap = curr.prev;
			curr.prev = curr.next;
			curr.next = swap;
			curr = curr.prev;
		}
		swap = head;
		head = tail;
		tail = swap;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node<T> curr = head;
		while (curr != null) {
			sb.append(curr.data.toString());
			curr = curr.next;
		}

		return sb.toString();
	}

	@SuppressWarnings({ "hiding" })
	private class Node<T> {
		Node<T> prev = null;
		Node<T> next = null;
		T data = null;
	}

}
