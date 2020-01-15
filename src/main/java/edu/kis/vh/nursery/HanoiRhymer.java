package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}
	
	@Override
	public void countIn(final int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
// kombinacja alt + (strzalka w lewo/prawo) pozwala na
// przechodzenie pomiedzy plikami aktualnie otwartymi w edytorze