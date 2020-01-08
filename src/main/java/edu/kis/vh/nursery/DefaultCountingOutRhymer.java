package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int CAPACITY = 11;
	public static final int OUT = -1;
	private int[] NUMBERS = new int[SIZE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == OUT;
    }

    public boolean isFull() {
        return total == CAPACITY;
    }

    protected int checkIn() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
