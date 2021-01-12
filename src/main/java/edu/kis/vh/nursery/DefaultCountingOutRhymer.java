package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INIT_VALUE = -1;
    public static final int SIZE = 12;
    private int[] numbers = new int[SIZE];

    public int total = INIT_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }


    public boolean callCheck() {
        return total == INIT_VALUE;
    }

    public boolean isFull() {
        return total == SIZE - 1;
    }

    protected int getNumbers() {
        if (callCheck())
            return INIT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INIT_VALUE;
        return numbers[total--];
    }

}
