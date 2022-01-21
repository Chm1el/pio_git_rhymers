package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int is_negative = -1;
    public static final int is_full = 11;
    public static final int max_size = 12;

    public int total = is_negative;
    private int[] numbers = new int[max_size];

    public void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == is_negative;
    }

    public boolean isFull() {
        return total == is_full;
    }

    protected int peekaboo() {
        if (callCheck())
            return is_negative;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return is_negative;
        return numbers[total--];
    }

}
