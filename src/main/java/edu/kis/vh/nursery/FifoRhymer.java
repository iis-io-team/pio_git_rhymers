package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

	private DefaultCountingOutRhymer internalRhymer = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!isEmpty())

			internalRhymer.countIn(super.countOut());

		int ret = internalRhymer.countOut();

		while (!internalRhymer.isEmpty())

			countIn(internalRhymer.countOut());

		return ret;
	}
}
