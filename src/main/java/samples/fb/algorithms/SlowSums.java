package samples.fb.algorithms;

// Suppose we have a list of N numbers, and repeat the following operation until we're left with only a single number:
// Choose any two numbers and replace them with their sum.
// Moreover, we associate a penalty with each operation equal to the value of the new number,
// and call the penalty for the entire list as the sum of the penalties of each operation.
// For example, given the list [1, 2, 3, 4, 5], we could choose 2 and 3 for the first operation,
// which would transform the list into [1, 5, 4, 5] and incur a penalty of 5.
// The goal in this problem is to find the highest possible penalty for a given input.


import java.util.*;

public class SlowSums {

    int getTotalTime(int[] arr) {
        // Constraints:
        // 1 ≤ N ≤ 10^6
        // 1 ≤ Ai ≤ 10^7, where *Ai denotes the ith initial element of an array.
        // The sum of values of N over all test cases will not exceed 5 * 10^6.

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i : arr) {
            heap.add(i);
        }

        int sum = 0;
        while (heap.size() > 1) {
            int i = heap.poll() + heap.poll();
            sum+=i;

            heap.add(i);
        }

        return sum;
    }
}
