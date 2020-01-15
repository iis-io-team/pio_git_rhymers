package edu.kis.vh.nursery;

public class DefaultCountOutRhymer {

	private static final int MINUS_ONE_CODE = -1;
	private static final int HOW_MANY_NUMBERS = 12;
	private int[] numbers = new int[HOW_MANY_NUMBERS];
	public int total = MINUS_ONE_CODE;

	public void countIn(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == MINUS_ONE_CODE;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return MINUS_ONE_CODE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return MINUS_ONE_CODE;
		return numbers[total--];
	}

}
