package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int CAPACITY = 12;
    private final int DEFAULT_VALUE = -1;
    private final int[] NUMBERS = new int[CAPACITY];

    public int total = DEFAULT_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_VALUE;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return NUMBERS[total--];
    }

}
