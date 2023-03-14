package samples.leetcode.fb.algorithms;
// Given a sequence of n integers arr, determine the lexicographically smallest sequence which may be obtained from it
// after performing at most k element swaps, each involving a pair of consecutive elements in the sequence.
// Note: A list x is lexicographically smaller than a different equal-length list y if and only if,
// for the earliest index at which the two lists differ, x's element at that index is smaller than y's element at that index.

public class ElementSwapping {


    private int findSmallestIdx(int[] arr, int currIdx, int k) {
        int smallest = Integer.MAX_VALUE;
        int shuffleIdx = currIdx;
        for (int i = currIdx; i < arr.length && i-currIdx <= k; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                shuffleIdx = i;
            }
        }

        return shuffleIdx;
    }

    private int[] shuffleArray(int rightPos, int leftPos, int[] arr) {
        for (int i = rightPos; i > leftPos; i--) {
            int tmp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }

    int[] findMinArray(int[] arr, int k) {
        // loop through values in arr, to find min index in range of k
        // if found, swap to start if possible

        for (int i = 0; i < arr.length && k > 0; i++) {
            // detect smallest number in range

            int shuffleIdx = findSmallestIdx(arr, i, k);
            arr = shuffleArray(shuffleIdx, i, arr);

            k = k - (shuffleIdx - i);
        }

        return arr;
    }

}
