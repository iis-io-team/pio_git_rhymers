package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.RhymersFactory;

public class DefaultRhymersFactory implements RhymersFactory {

    @Override
    public DefaultCountOutRhymer getStandardRhymer() {
        return new DefaultCountOutRhymer();
    }

    @Override
    public DefaultCountOutRhymer getFalseRhymer() {
        return new DefaultCountOutRhymer();
    }

    @Override
    public DefaultCountOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public DefaultCountOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
