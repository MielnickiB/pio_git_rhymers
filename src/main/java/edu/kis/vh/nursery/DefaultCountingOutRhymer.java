package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ARRAY_SIZE = 12;
    private static final int DEFAULT_NEGATIVE_VALUE = -1;
    private static final int ARRAY_SIZE_PLUS_DEFAULT_NEGATIVE_VALUE = 11;
    private final int[] numbers = new int[ARRAY_SIZE];

    public static int getArraySize() {
        return ARRAY_SIZE;
    }

    public static int getDefaultNegativeValue() {
        return DEFAULT_NEGATIVE_VALUE;
    }

    public static int getArraySizePlusDefaultNegativeValue() {
        return ARRAY_SIZE_PLUS_DEFAULT_NEGATIVE_VALUE;
    }

    public int getTotal() {
        return total;
    }

    private int total = DEFAULT_NEGATIVE_VALUE;



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
            return DEFAULT_NEGATIVE_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_NEGATIVE_VALUE;
        return numbers[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }

}
