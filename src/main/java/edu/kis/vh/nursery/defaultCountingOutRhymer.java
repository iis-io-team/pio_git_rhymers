package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private int[] NUMBERS = new int[12];

    public int getTotal() {
        return total;
    }

    private int total = -1;

    public void countIn(int in) {
        if (!isFull()) {
            int totalLocal = getTotal();
            NUMBERS[++totalLocal] = in;
        }
    }

    public boolean callCheck() {
        return getTotal() == -1;
    }

    public boolean isFull() {
        return getTotal() == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[getTotal()];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        int totalLocal = getTotal();
        return NUMBERS[totalLocal--];
    }
}
