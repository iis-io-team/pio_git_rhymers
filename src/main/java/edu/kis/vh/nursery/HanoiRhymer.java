package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer
{

    int totalRejected = 0;

    public int reportRejected()
    {
        return totalRejected;
    }

    public void countIn(int in)
    {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

//	zmodyfikowano linie 11, 12, 14 i 15
//
//	klawisze strzałek w połączeniu z klawiszem alt przełączają widok pomiędzy otwartymi plikami
}
