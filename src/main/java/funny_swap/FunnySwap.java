package funny_swap;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class FunnySwap {
    private final int SIZE_OF_ARRAY = 20;
    private final Random random = new Random();
    private Map<Integer, Integer> mapMinAndMax;
    private int[] array;
    private int max = -10;
    private int min = 10;
    private int indexOfMax;
    private int indexOfMin;

    public void createArray() {
        array = new int[SIZE_OF_ARRAY];
        for (int i = 0; i < SIZE_OF_ARRAY; i++) {
            array[i] = random.nextInt(21) - 10;
        }
    }

    public void funnySwap() {
        array[indexOfMax] = min;
        array[indexOfMin] = max;
    }

    private void findMaximalNegative() {
        for (int i = 0; i < SIZE_OF_ARRAY; i++) {
            if (array[i] >= max && array[i] < 0) {
                max = array[i];
                indexOfMax = i;
            }
        }
    }

    private void findMinimalPositive() {
        for (int i = 0; i < SIZE_OF_ARRAY; i++) {
            if (array[i] <= min && array[i] >= 0) {
                min = array[i];
                indexOfMin = i;
            }
        }
    }

    public String getArray() {
        findMinimalPositive();
        findMaximalNegative();
        return Arrays.toString(array);
    }

    public String getIndexOfMin() {
        return Integer.toString(indexOfMin);
    }

    public String getIndexOfMax() {
        return Integer.toString(indexOfMax);
    }
}
