package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int MINUS_ONE_CODE = -1;
	Node last;
	int numberToPush;

	public void push(final int number) {
		if (last == null)
			last = new Node(number);
		else {
			last.next = new Node(number);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return MINUS_ONE_CODE;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return MINUS_ONE_CODE;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
