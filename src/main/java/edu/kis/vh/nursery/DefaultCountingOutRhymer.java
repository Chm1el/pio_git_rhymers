package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int IS_FULL = 11;
    public static final int IS_NEGATIVE = -1;
    public static final int MAX_SIZE = 12;

    public int total = IS_NEGATIVE;
    private int[] numbers = new int[MAX_SIZE];

    public void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == IS_NEGATIVE;
    }

    public boolean isFull() {
        return total == IS_FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return IS_NEGATIVE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return IS_NEGATIVE;
        return numbers[total--];
    }

}
