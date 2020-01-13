package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int INT = -1;
    private static final int INT1 = 12;
    private int[] numbers = new int[getINT1()];

    public static int getINT() {
        return INT;
    }

    public static int getINT1() {
        return INT1;
    }

    public int getTotal() {
        return total;
    }

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[setTotal(getTotal() + 1)] = in;
    }

    boolean callCheck() {
        return getTotal() == getINT();
    }

    boolean isFull() {
        return getTotal() == 11;
    }

    int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[getTotal()];
    }

    int countOut() {
        if (callCheck())
            return -1;
        return numbers[setTotal(getTotal() - 1)];
    }

    public int setTotal(int total) {
        this.total = total;
        return total;
    }
}
