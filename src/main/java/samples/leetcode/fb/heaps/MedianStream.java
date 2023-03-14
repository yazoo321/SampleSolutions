package samples.leetcode.fb.heaps;

import java.util.*;

public class MedianStream {

    int[] findMedian(int[] arr) {
        PriorityQueue<Integer> lower = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> upper = new PriorityQueue<>();

        int[] res = new int[arr.length];

        for (int i=0; i<arr.length;i++) {
            addNumbers(arr[i], lower, upper);
            rebalance(lower, upper);
            res[i] = getMedian(lower, upper);
        }

        return res;
    }

    private void addNumbers(int number, PriorityQueue<Integer> lower, PriorityQueue<Integer> upper) {
        if (lower.isEmpty() || number < lower.peek()) {
            lower.add(number);
        } else {
            upper.add(number);
        }
    }

    private void rebalance(PriorityQueue<Integer> lower, PriorityQueue<Integer> upper) {
        PriorityQueue<Integer> biggerHeap = lower.size() > upper.size() ? lower : upper;
        PriorityQueue<Integer> smallerHeap = lower.size() > upper.size() ? upper : lower;

        if (biggerHeap.size() - smallerHeap.size() == 2) {
            smallerHeap.add(biggerHeap.poll());
        }
    }

    private int getMedian(PriorityQueue<Integer> lower, PriorityQueue<Integer> upper) {
        PriorityQueue<Integer> biggerHeap = lower.size() > upper.size() ? lower : upper;
        PriorityQueue<Integer> smallerHeap = lower.size() > upper.size() ? upper : lower;

        if (smallerHeap.size() == biggerHeap.size()) {
            return (smallerHeap.peek() + biggerHeap.peek()) / 2;
        } else {
            return biggerHeap.peek();
        }
    }
}
