package ru.waytojava.sort.sorting;

import org.junit.jupiter.api.Test;
import ru.waytojava.sort.sorting.BubbleSort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Created by kochanov_a on 11.05.2018.
 */
public class BubbleSortTest {
    /**
     * Test bubble sort.
    */
    @Test
    public void whenArraySorting() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = new int[8];
        array[0] = 7;
        array[1] = 1;
        array[2] = 9;
        array[3] = 2;
        array[4] = 3;
        array[5] = 2;
        array[6] = 9;
        array[7] = 6;
        int[] result = bubbleSort.sort(array);
        int[] expected = {1, 2, 2, 3, 6, 7, 9, 9};
        assertArrayEquals(expected, result);
    }
}
