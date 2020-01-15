package edu.kis.vh.nursery.list;

public class IntLinkedList {

	Node last;
	int numberToPush;

	public void push(int number) {
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
			return -1;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
