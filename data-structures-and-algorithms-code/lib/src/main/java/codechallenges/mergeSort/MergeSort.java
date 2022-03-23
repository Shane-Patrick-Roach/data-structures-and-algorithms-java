package codechallenges.mergeSort;

public class MergeSort {

//    public static Integer[] mergeSort(Integer[] arr){
//        int n = arr.length;
//        if (n <= 1){
//            return arr;
//        }
//
//        int mid = n/2;
//        int left = arr[0,mid];
//
//        return arr;
//    }



    public Integer[] merge(Integer[] left, Integer[] right){
        Integer[] result = new Integer[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if (left[i] <= right[j]){
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            result[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length){
            result[k] = right[j];
            j++;
            k++;
        }


        return result;
    }
}
