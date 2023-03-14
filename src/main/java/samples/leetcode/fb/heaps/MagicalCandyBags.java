package samples.leetcode.fb.heaps;

// Magical Candy Bags
// You have N bags of candy. The ith bag contains arr[i] pieces of candy, and each of the bags is magical!
// It takes you 1 minute to eat all of the pieces of candy in a bag (irrespective of how many pieces of candy are inside), and as soon as you finish, the bag mysteriously refills. If there were x pieces of candy in the bag at the beginning of the minute, then after you've finished you'll find that floor(x/2) pieces are now inside.
// You have k minutes to eat as much candy as possible. How many pieces of candy can you eat?

import java.util.Collections;
import java.util.PriorityQueue;

public class MagicalCandyBags {

//    int maxCandies(int[] arr, int k) {
//        // 1 ≤ N ≤ 10,000
//        // 1 ≤ k ≤ 10,000
//        // 1 ≤ arr[i] ≤ 1,000,000,000
//
//        // use queue to implement this
//
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
//
//        for (int i : arr) {
//            maxHeap.add(i);
//        }
//
//        int totalCandiesAte = 0;
//        while (k > 0) {
//            int candies = maxHeap.poll();
//            totalCandiesAte+= candies;
//
//            maxHeap.add(candies/2);
//            k--;
//        }
//
//        return totalCandiesAte;
//
//    }


    int maxCandies(int[] arr, int k) {
        // Write your code here

        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : arr) {
            max.add(i);
        }

        int candiesAte = 0;
        while (k > 0) {
            int candies = max.poll();
            candiesAte+=candies;
            max.add(candies/2);

            k--;
        }

        return candiesAte;

    }



}
