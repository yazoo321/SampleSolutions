package samples.fb.sorting;

import java.util.Arrays;

public class BalancedSplit {

    boolean balancedSplitExists(int[] arr) {
        // Write your code here
        Arrays.sort(arr);
        return searchAndSplit(0, arr.length - 1, arr);
    }

    boolean searchAndSplit(int start, int end, int[] arr) {
        int diff = end - start;
        if (diff == 0) {
            return false;
        }

        int mid = start + (diff / 2) + 1;

        int leftSum = getSumsForIndexes(arr, 0, mid-1);
        int rightSum = getSumsForIndexes(arr, mid, arr.length-1);

        if (leftSum == rightSum && arr[mid-1] < arr[mid]) {
            return true;
        } else {
            return leftSum > rightSum ? searchAndSplit(start, mid-1, arr) : searchAndSplit(mid, end, arr);
        }
    }



    int getSumsForIndexes(int[] arr, int start, int end) {
        int sum = 0;
        for (int i=start; i<=end;i++) {
            sum+=arr[i];
        }
        return sum;
    }




}
