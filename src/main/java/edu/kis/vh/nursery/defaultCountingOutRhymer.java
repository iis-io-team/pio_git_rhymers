package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int NONE = -1;
    private static final int SIZE = 12;
    private int[] NUMBERS = new int[SIZE];

    public int total = NONE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == NONE;
    }

    public boolean isFull() {
        return total == 11;
    }
    protected int peekaboo() {
        if (callCheck())
            return NONE;
        return NUMBERS[total];
    }
    public int countOut() {
        if (callCheck())
            return NONE;
        return NUMBERS[total--];
    }

}
