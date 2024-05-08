package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int ARRAY_SIZE = 12;
    public static final int DEFAULT_NEGATIVE_VALUE = -1;
    public static final int ARRAY_SIZE_PLUS_DEFAULT_NEGATIVE_VALUE = 11;
    private int[] numbers = new int[ARRAY_SIZE];

    public int total = DEFAULT_NEGATIVE_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_NEGATIVE_VALUE;
    }

    public boolean isFull() {
        return total == ARRAY_SIZE_PLUS_DEFAULT_NEGATIVE_VALUE;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
