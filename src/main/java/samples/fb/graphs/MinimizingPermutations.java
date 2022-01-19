package samples.fb.graphs;

// In this problem, you are given an integer N, and a permutation, P of the integers from 1 to N, denoted as (a_1, a_2, ..., a_N). You want to rearrange the elements of the permutation into increasing order, repeatedly making the following operation:
// Select a sub-portion of the permutation, (a_i, ..., a_j), and reverse its order.
// Your goal is to compute the minimum number of such operations required to return the permutation to increasing order.

import java.util.*;
import java.util.stream.IntStream;

public class MinimizingPermutations {

    int minOperations(int[] arr) {
        // Write your code here

        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(arr);
        visited.add(Arrays.toString(arr));

        int[] target = IntStream.rangeClosed(1, arr.length).toArray();

        int counter = 0;

        while(!queue.isEmpty()) {
            Queue<int[]> tmp = new LinkedList<>();

            while (!queue.isEmpty()) {
                int[] numbers = queue.poll();

                if (Arrays.equals(target, numbers)) {
                    return counter;
                }

                reverseAndPush(numbers, tmp, visited);
            }
            counter++;
            queue = tmp;
        }

        return -1;
    }


    private int[] reverseArr(int i, int j, int[] arr) {
        int[] clone = arr.clone();
        for (;i < j;i++, j--) {
            int tmp = clone[i];
            clone[i] = clone[j];
            clone[j] = tmp;
        }

        return clone;
    }

    private void reverseAndPush(int[] arr, Queue<int[]> queue, Set<String> visited) {
        for (int i=0; i<arr.length;i++) {
            for (int j=i+1; j<arr.length;j++) {
                int[] reversed = reverseArr(i,j,arr);

                if (visited.contains(Arrays.toString(reversed))) {
                    continue;
                }
                visited.add(Arrays.toString(reversed));
                queue.add(reversed);
            }
        }
    }


}
