package mutation;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {

    //mehrere gleiche elemente
    @Test
    public void sort() {
        Integer[] arr = {9, 2, 2, 7, 6, 8, 2, 3, 4, 5};
        Integer[] exp = {2, 2, 2, 3, 4, 5, 6, 7, 8, 9};
        InsertionSort.insertionSort(arr);
        assertArrayEquals(exp, arr);
    }

    //gucken ob der falsch sortiert (random)
    @Test
    public void sortsCorrectly() {
        Integer[] arr = {9, 2, 7, 6, 8, 2, 3, 4, 5};
        Integer[] wrongArr = {9, 2, 2, 3, 4, 5, 6, 7, 8};
        InsertionSort.insertionSort(arr);
        assertFalse(Arrays.equals(wrongArr, arr));
    }

    // nur gleiche Elemente
    @Test
    public void test() {
        Integer[] arr = {1,1};
        Integer[] exp = {1,1};
        InsertionSort.insertionSort(arr);
        assertArrayEquals(exp, arr);
    }

    // nur ungleiche Elemente
    @Test
    public void einzeln() {
        Integer[] arr = {2,6,4,8};
        Integer[] exp = {2,4,6,8};
        InsertionSort.insertionSort(arr);
        assertArrayEquals(exp, arr);
    }

}