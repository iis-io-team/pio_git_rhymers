package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int isEmpty = -1;
	public static final int maxIndex = 11;
	private final int[] numbersArray = new int[maxIndex + 1];
	public int numberOfElements = -1;

	public void countIn(int in) {
		if (!isFull()) {
			numbersArray[++numberOfElements] = in;
		}
	}

	public boolean callCheck() {
		return numberOfElements == isEmpty;
	}

	public boolean isFull() {
		return numberOfElements == maxIndex;
	}

	protected int peekaboo() {
		if (callCheck()) {
			return -1;
		}
		return numbersArray[numberOfElements];
	}

	public int countOut() {
		if (callCheck()) {
			return -1;
		}
		return numbersArray[numberOfElements--];
	}

}