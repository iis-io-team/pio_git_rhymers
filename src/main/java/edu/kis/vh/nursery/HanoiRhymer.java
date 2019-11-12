package edu.kis.vh.nursery;

// W eclipse ALT + ← pozwala się cofnąć do poprzednio edytowanego pliku.
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
