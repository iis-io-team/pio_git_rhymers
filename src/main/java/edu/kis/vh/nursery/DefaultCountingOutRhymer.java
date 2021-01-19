package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int NUMBER_ARRAY_SIZE=12;
    public final int INDEX_ERROR=-1;
    private int[] numbers = new int[NUMBER_ARRAY_SIZE];

    public int index = INDEX_ERROR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++index] = in;
    }


    public boolean isEmpty() {
        return index == INDEX_ERROR;
    }

    public boolean isFull() {
        return index == NUMBER_ARRAY_SIZE+INDEX_ERROR;
    }

    protected int peekaboo() {
        if (isEmpty())
            return INDEX_ERROR;
        return numbers[index];
    }

    public int countOut() {
        if (isEmpty())
            return INDEX_ERROR;
        return numbers[index--];
    }

}
