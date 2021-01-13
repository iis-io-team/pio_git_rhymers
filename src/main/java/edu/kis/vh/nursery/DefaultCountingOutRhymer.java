package edu.kis.vh.nursery;

import java.util.TooManyListenersException;

public class DefaultCountingOutRhymer
{
    private static final int ERR = -1;
    private static final int TOTAL = 11;
    private static final int SIZE = 12;

    private int[] numbers = new int[SIZE];

    public int getTotal()
    {
        return total;
    }

    private int total = ERR;

    public void countIn(int in)
    {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck()
    {
        return total == ERR;
    }

    public boolean isFull()
    {
        return total == TOTAL;
    }

    protected int peekaboo()
    {
        if (callCheck())
            return ERR;

        return numbers[total];
    }

    public int countOut()
    {
        if (callCheck())
            return ERR;

        return numbers[total--];
    }

}
