package codechallenges.quickSort;

import codechallenges.mergeSort.MergeSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static codechallenges.quickSort.QuickSort.partition;
import static codechallenges.quickSort.QuickSort.quickSort;

public class QuickSortTest {
    @Test
    void testPartitionHelperFunction() throws Exception {
        Integer[] arr = new Integer[]{8, 4, 23, 42, 16, 15};

        System.out.println(partition(arr, 0,5));
        System.out.println(Arrays.toString(arr));
        assert(Arrays.toString(arr).equals("[8, 4, 15, 42, 16, 23]"));
    }

    @Test
    void testPartitionHelperFunctionArrayTwo() throws Exception {
        Integer[] arr = new Integer[]{8, 4, 23, 42, 16, 15};

        partition(arr, 4,5);

        System.out.println(Arrays.toString(quickSort(arr, 4, 3)));
        System.out.println(Arrays.toString(quickSort(arr, 5, 5)));
        //quickSort()
    }
    
    @Test
    void testQuickSortFunction() throws Exception {
        Integer[] arr = new Integer[]{8, 4, 23, 42, 16, 15};

        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
        assert(Arrays.toString(quickSort(arr, 0, arr.length - 1)).equals("[4, 8, 15, 16, 23, 42]"));
    }


    @Test
    void testQuickSortFunctionReversedArrayInput() throws Exception {
        Integer[] arr = new Integer[]{20,18,12,8,5,-2};

        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
        assert(Arrays.toString(quickSort(arr, 0, arr.length - 1)).equals("[-2, 5, 8, 12, 18, 20]"));
    }



    @Test
    void testQuickSortFunctionReversedFewUniqueValues() throws Exception {
        Integer[] arr = new Integer[]{5,12,7,5,5,7};

        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
        assert(Arrays.toString(quickSort(arr, 0, arr.length - 1)).equals("[5, 5, 5, 7, 7, 12]"));
    }


    @Test
    void testQuickSortFunctionReversedNearlySorted() throws Exception {
        Integer[] arr = new Integer[]{2,3,5,7,13,11};

        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
        assert(Arrays.toString(quickSort(arr, 0, arr.length - 1)).equals("[2, 3, 5, 7, 11, 13]"));
    }


    @Test
    void testQuickSortFunctionReversedSmallSize() throws Exception {
        Integer[] arr = new Integer[]{5,100,2,2};

        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
        assert(Arrays.toString(quickSort(arr, 0, arr.length - 1)).equals("[2, 2, 5, 100]"));
    }


    @Test
    void testQuickSortFunctionReversedBigSize() throws Exception {
        Integer[] arr = new Integer[]{5,100,2,2,3,13,15,16,56,43,34,23,900,34,-1,0};

        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
        assert(Arrays.toString(quickSort(arr, 0, arr.length - 1)).equals("[-1, 0, 2, 2, 3, 5, 13, 15, 16, 23, 34, 34, 43, 56, 100, 900]"));
    }


}
