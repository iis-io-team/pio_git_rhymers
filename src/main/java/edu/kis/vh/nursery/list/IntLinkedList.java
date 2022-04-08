package edu.kis.vh.nursery.list;

public class IntLinkedList {

	Node last;
	int nodeValue;
	int errorReturnValue = -1;

	public void push(int value) {
		if (last == null)
			last = new Node(value);
		else {
			last.next = new Node(value);
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
		if (isEmpty()) {
			return errorReturnValue;
		}
		return last.value;
	}

	public int pop() {
		if (isEmpty()) {
			return errorReturnValue;
		}
		int returnValue = last.value;
		last = last.prev;
		return returnValue;
	}

}
