package samples.hackerrank.data_structures.arrays;

import java.util.List;

public class HourglassSum {


    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here

        int max = Integer.MIN_VALUE;

        for (int i  = 1; i < 5; i++) {
            for (int x = 1; x < 5; x++) {
                int topLeft = arr.get(i - 1).get(x-1);
                int top = arr.get(i-1).get(x);
                int topRight = arr.get(i-1).get(x+1);

                int mid = arr.get(i).get(x);

                int botLeft = arr.get(i+1).get(x-1);
                int bot = arr.get(i+1).get(x);
                int botRight = arr.get(i+1).get(x+1);

                int sum = topLeft + top + topRight + mid + botLeft + bot + botRight;
                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }

}
