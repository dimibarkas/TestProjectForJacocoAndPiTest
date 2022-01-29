package mutation;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {

    @Test
    public void sort() throws ArrayIsEmptyException {

        int[] arr = {12, 11, 13, 5, 6};
        int[] exp = {5, 6, 11, 12, 13};
        Sorting sorting = new Sorting();
        sorting.sort(arr);
        assertArrayEquals(exp, arr);
    }
}