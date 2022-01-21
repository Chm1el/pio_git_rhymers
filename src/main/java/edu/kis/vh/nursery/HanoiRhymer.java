package edu.kis.vh.nursery;
//kombinacja ctrl+-> lub ctrl+<- przesuwa znacznik na początek lub koniec slowa gdy napotka znak nie będący literą przychodzi tylko przez ten znak
public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(final int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
