package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountOutRhymer;

public interface RhymersFactory {

    public DefaultCountOutRhymer getStandardRhymer();

    public DefaultCountOutRhymer getFalseRhymer();

    public DefaultCountOutRhymer getFIFORhymer();

	public DefaultCountOutRhymer getHanoiRhymer();

}
