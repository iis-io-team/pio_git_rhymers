package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

	public defaultCountingOutRhymer internalRhymer = new defaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())

			internalRhymer.countIn(super.countOut());

		int ret = internalRhymer.countOut();

		while (!internalRhymer.callCheck())

			countIn(internalRhymer.countOut());

		return ret;
	}
}
