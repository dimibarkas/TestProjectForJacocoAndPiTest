package mutation;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void bubbleSort() {
        int[] arr = {9, 2, 2, 7, 6, 8, 2, 3, 4, 5};
        int[] exp = {2, 2, 2, 3, 4, 5, 6, 7, 8, 9};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);
        assertArrayEquals(exp, arr);
    }

    @Test
    public void bubbleSort2() {
        int[] arr = {};
        int[] exp = {};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);
        assertArrayEquals(exp, arr);
    }
}