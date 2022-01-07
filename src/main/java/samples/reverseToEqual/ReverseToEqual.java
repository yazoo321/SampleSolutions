package samples.reverseToEqual;
// Reverse to Make Equal - Leetcode 1460
// You are given two integer arrays of equal length target and arr. In one step, you can select any non-empty sub-array of arr and reverse it. You are allowed to make any number of steps.
//
// Return true if you can make arr equal to target or false otherwise.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseToEqual {

    boolean areTheyEqual(int[] array_a, int[] array_b) {
        // Write your code here

        List<Integer> arr_a = Arrays.stream(array_a).boxed().collect(Collectors.toList());
        List<Integer> arr_b = Arrays.stream(array_b).boxed().collect(Collectors.toList());

        Collections.sort(arr_a);
        Collections.sort(arr_b);

        for (int i = 0; i < arr_a.size(); i++) {
            int a = arr_a.get(i);
            int b = arr_b.get(i);

            if (a != b) {
                return false;
            }
        }

        return true;
    }


}
