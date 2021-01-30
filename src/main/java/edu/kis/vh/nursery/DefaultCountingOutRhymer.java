package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private final int NUMBERS_ARRAY_SIZE = 12;
    private final int EMPTY_STACK_VALUE = -1;
    private final int FULL_STACK_VALUE = 11;

    private int[] numbers = new int[NUMBERS_ARRAY_SIZE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK_VALUE;
    }

    public boolean isFull() {
        return total == FULL_STACK_VALUE;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total--];
    }

}
