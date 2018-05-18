package ru.waytojava.sort.sorting;

/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class InsertionSort {
    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j];
                    array[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return array;
    }
}
