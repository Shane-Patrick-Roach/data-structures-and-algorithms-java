package codechallenges.mergeSort;

import codechallenges.insertionSort.InsertionSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static codechallenges.insertionSort.InsertionSort.insertionSort;

public class mergeSortTest {


    @Test
    void testMergeHelperFunction() throws Exception {
        MergeSort sut = new MergeSort();

        Integer[] left = new Integer[]{8};
        Integer[] right = new Integer[]{4,23};

        System.out.println(Arrays.toString(sut.merge(left, right)));
        assert(Arrays.toString(sut.merge(left, right)).equals("[4, 8, 23]"));
    }

    @Test
    void testMergeHelperFunctionTwoDifferentLengthArrays() throws Exception {
        MergeSort sut = new MergeSort();

        Integer[] left = new Integer[]{1, 2, 3, 4};
        Integer[] right = new Integer[]{5,23};

        System.out.println(Arrays.toString(sut.merge(left, right)));
        assert(Arrays.toString(sut.merge(left, right)).equals("[1, 2, 3, 4, 5, 23]"));
    }


    @Test
    void testMergeHelperFunctionThreeFewUniqueValues() throws Exception {
        MergeSort sut = new MergeSort();

        Integer[] left = new Integer[]{-1, 2, 2, 4};
        Integer[] right = new Integer[]{2,23};

        System.out.println(Arrays.toString(sut.merge(left, right)));
        assert(Arrays.toString(sut.merge(left, right)).equals("[-1, 2, 2, 2, 4, 23]"));
    }
}
