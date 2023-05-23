package edu.kis.vh.nursery;

/**
 * @author 240827
 *	Default rhymer that works similarly to a stack.
 */
public class DefaultCountingOutRhymer {

	public static final int NUMBER = 12;
	public static final int NEGATIVE = -1;
	private int[] numbers = new int[NUMBER];

	private int total = NEGATIVE;

	/**
	 * @return How many numbers have been added to the rhymer so far.
	 */
	public int getTotal() {
		return total;
	}

	/** 
	 * Adds number specified in in argument to the rhymer.
	 * The in argument is not added if the rhymer is full.
	 * @param in
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * @return boolean value indicating if the rhymer is empty.
	 */
	public boolean isEmpty() {
		return total == NEGATIVE;
	}

	/**
	 * @return boolean value indicating if the rhymer is full.
	 */
	public boolean isFull() {
		return total == 11;
	}

	/**
	 * Returns at the top of the rhymer.
	 * If the rhymer is empty, NEGATIVE is returned.
	 * @return value at the top of the rhymer.
	 */
	protected int peekaboo() { 
		if (isEmpty())
			return NEGATIVE;
		return numbers[total];
	}

	/**
	 * Returns value at the top of the rhymer and removes it from the rhymer.
	 * If the rhymer is empty, NEGATIVE is returned.
	 * @return value at the top of the rhymer.
	 */
	public int countOut() {
		if (isEmpty())
			return NEGATIVE;
		return numbers[total--];
	}
}
