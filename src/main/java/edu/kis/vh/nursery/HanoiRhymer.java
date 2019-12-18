package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
// kombinacja alt + (strzalka w lewo/prawo) pozwala na
// przechodzenie pomiedzy plikami aktualnie otwartymi w edytorze