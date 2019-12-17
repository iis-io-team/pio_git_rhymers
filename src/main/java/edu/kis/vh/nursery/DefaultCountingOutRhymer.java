package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int NONE = -1;
    private int[] numbers = new int[SIZE];

    public int total = NONE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
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
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NONE;
        return numbers[total--];
    }

}
