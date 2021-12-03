package edu.kis.vh.nursery;
//kombinacja ctrl+-> lub ctrl+<- przesuwa znacznik na początek lub koniec slowa gdy napotka znak nie będący literą przychodzi tylko przez ten znak
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
