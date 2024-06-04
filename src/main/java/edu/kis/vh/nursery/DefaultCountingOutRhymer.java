package edu.kis.vh.nursery;

/**
 * The type Default counting out rhymer.
 */
public class DefaultCountingOutRhymer {

    private static final int ARRAY_SIZE = 12;
    private static final int DEFAULT_NEGATIVE_VALUE = -1;
    private static final int ARRAY_SIZE_PLUS_DEFAULT_NEGATIVE_VALUE = 11;
    private final int[] numbers = new int[ARRAY_SIZE];

    /**
     * Gets array size.
     *
     * @return the array size
     */
    public static int getArraySize() {
        return ARRAY_SIZE;
    }

    /**
     * Gets default negative value.
     *
     * @return the default negative value
     */
    public static int getDefaultNegativeValue() {
        return DEFAULT_NEGATIVE_VALUE;
    }

    /**
     * Gets array size plus default negative value.
     *
     * @return the array size plus default negative value
     */
    public static int getArraySizePlusDefaultNegativeValue() {
        return ARRAY_SIZE_PLUS_DEFAULT_NEGATIVE_VALUE;
    }

    /**
     * Gets total.
     *
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    private int total = DEFAULT_NEGATIVE_VALUE;

    /**
     * Count in.
     *
     * @param in the in
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Call check boolean.
     *
     * @return the boolean
     */
    public boolean callCheck() {
        return total == DEFAULT_NEGATIVE_VALUE;
    }

    /**
     * Is full boolean.
     *
     * @return the boolean
     */
    public boolean isFull() {
        return total == ARRAY_SIZE_PLUS_DEFAULT_NEGATIVE_VALUE;
    }

    /**
     * Peekaboo int.
     *
     * @return the int
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_NEGATIVE_VALUE;
        return numbers[total];
    }

    /**
     * Count out int.
     *
     * @return the int
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_NEGATIVE_VALUE;
        return numbers[total--];
    }

    /**
     * Get numbers int [ ].
     *
     * @return the int [ ]
     */
    public int[] getNumbers() {
        return numbers;
    }

}
