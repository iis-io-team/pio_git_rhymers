package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int NUMBER = 12;
	public static final int NEGATIVE = -1;
	private int[] numbers = new int[NUMBER];

	private int total = NEGATIVE;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean isEmpty() {
		return total == NEGATIVE;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (isEmpty())
			return NEGATIVE;
		return numbers[total];
	}

	public int countOut() {
		if (isEmpty())
			return NEGATIVE;
		return numbers[total--];
	}
}
