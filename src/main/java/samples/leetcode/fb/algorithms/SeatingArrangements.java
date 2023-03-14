package samples.leetcode.fb.algorithms;
// Seating Arrangements
// There are n guests attending a dinner party, numbered from 1 to n. The ith guest has a height of arr[i-1] inches.
// The guests will sit down at a circular table which has n seats, numbered from 1 to n in clockwise order around the table.
// As the host, you will choose how to arrange the guests, one per seat. Note that there are n! possible permutations of seat assignments.
// Once the guests have sat down, the awkwardness between a pair of guests sitting in adjacent seats is defined
// as the absolute difference between their two heights. Note that, because the table is circular,
// seats 1 and n are considered to be adjacent to one another, and that there are therefore n pairs of adjacent guests.
// The overall awkwardness of the seating arrangement is then defined as the maximum awkwardness of any pair of adjacent guests.
// Determine the minimum possible overall awkwardness of any seating arrangement.

import java.util.*;

public class SeatingArrangements {

    int minOverallAwkwardness(int[] arr) {
        Arrays.sort(arr);

        int minAwkward = 0;
        for (int i = 2; i < arr.length; i++) {
            minAwkward = Math.max(minAwkward, arr[i] - arr[i - 2]);
        }

        return minAwkward;
    }


}
