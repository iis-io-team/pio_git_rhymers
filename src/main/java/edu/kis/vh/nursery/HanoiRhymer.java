package edu.kis.vh.nursery;

// W eclipse ALT + ← pozwala się cofnąć do poprzednio edytowanego pliku.
public class HanoiRhymer extends DefaultCountingOutRhymer {

    public static final int CONST = 0;
    int totalRejected = CONST;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
