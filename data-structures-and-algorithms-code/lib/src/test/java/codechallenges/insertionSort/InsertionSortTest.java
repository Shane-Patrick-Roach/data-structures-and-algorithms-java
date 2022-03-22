package codechallenges.insertionSort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static codechallenges.insertionSort.InsertionSort.insertionSort;

public class InsertionSortTest {


    @Test
    void testInsertionSortArrayOne() throws Exception {
        InsertionSort sut = new InsertionSort();

        Integer[] arr = new Integer[]{8,4,23,42,16,15};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
        assert(Arrays.toString(arr).equals("[4, 8, 15, 16, 23, 42]"));
    }



    @Test
    void testInsertionSortReverseSorted() throws Exception {
        InsertionSort sut = new InsertionSort();

        Integer[] arr = new Integer[]{20,18,12,8,5,-2};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
        assert(Arrays.toString(arr).equals("[-2, 5, 8, 12, 18, 20]"));
    }


    @Test
    void testInsertionSortFewUniqueValues() throws Exception {
        InsertionSort sut = new InsertionSort();

        Integer[] arr = new Integer[]{5,12,7,5,5,7};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
        assert(Arrays.toString(arr).equals("[5, 5, 5, 7, 7, 12]"));
    }

    @Test
    void testInsertionSortAlmostSorted() throws Exception {
        InsertionSort sut = new InsertionSort();

        Integer[] arr = new Integer[]{2,3,5,7,13,11};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
        assert(Arrays.toString(arr).equals("[2, 3, 5, 7, 11, 13]"));
    }


}
