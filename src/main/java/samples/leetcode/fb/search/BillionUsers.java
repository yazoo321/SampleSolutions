package samples.leetcode.fb.search;

import java.util.Arrays;
import java.util.List;

public class BillionUsers {

    // Add any helper functions you may need here
    double target = 1_000_000_000;


    double getUsersForDate(float growth, float day) {
        return Math.pow(growth, day);
    }

    double getSumOfUsersForDate(float[] growth, float day) {
        double sum = 0;
        for (float g : growth) {
            sum+= getUsersForDate(g, day);
        }
        return sum;
    }

    int getBillionUsersDay(float[] growthRates) {
        // Write your code here

        // return when prev day is smaller and next day is bigger or equal to

        int res = findDay(0, 1000, growthRates, Integer.MAX_VALUE);

        return res == Integer.MAX_VALUE ? -1 : res;
    }

    int findDay(int start, int end, float[] growth, int minSoFar) {
        int diff = (end - start) / 2;
        int mid = diff + start;

        double sumAtDay = getSumOfUsersForDate(growth, mid);

        if (diff == 0) {
            return sumAtDay >= target ? mid : minSoFar;
        } else if (sumAtDay > target) {
            return findDay(start, mid, growth, Math.min(mid, minSoFar));
        } else {
            return findDay(mid, end, growth, minSoFar);
        }
    }


}
