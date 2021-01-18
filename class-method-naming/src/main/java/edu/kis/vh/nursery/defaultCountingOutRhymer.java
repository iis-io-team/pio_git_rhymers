package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	private int[] NUMBERS = new int[12];

	public int total_rename = -1;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total_rename] = in;
	}

	public boolean callCheck() {
		return total_rename == -1;
	}
	
	public boolean isFull() {
			return total_rename == 11;
	}
	
	protected int peekaboo() {
		if (callCheck())
			return -1;
		return NUMBERS[total_rename];
	}
		
	public int countOut() {
		if (callCheck())
			return -1;
		return NUMBERS[total_rename--];
	}

}
