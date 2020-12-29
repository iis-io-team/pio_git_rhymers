package edu.kis.vh.nursery;

import java.util.TooManyListenersException;

public class DefaultCountingOutRhymer
{
    public static final int ERR = -1;
    public static final int TOTAL = 11;
    public static final int SIZE = 12;

    private int[] numbers = new int[SIZE];

    public int total = ERR;

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
