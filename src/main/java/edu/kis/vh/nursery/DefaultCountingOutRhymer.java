package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CONSTNUMS = 12;
    public static final int CONST2 = -1;
    public static final int CONST3 = 11;
    private int[] numbers = new int[CONSTNUMS];

    public int total = CONST2;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == CONST2;
    }

    public boolean isFull() {
        return total == CONST3;
    }

    protected int peekaboo() {
        if (callCheck())
            return CONST2;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return CONST2;
        return numbers[total--];
    }

}
