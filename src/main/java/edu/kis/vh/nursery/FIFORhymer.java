package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountOutRhymer {

	public DefaultCountOutRhymer countOutRhymer = new DefaultCountOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())
			countOutRhymer.countIn(super.countOut());

		int ret = countOutRhymer.countOut();

		while (!countOutRhymer.callCheck())
			countIn(countOutRhymer.countOut());

		return ret;
	}
}
