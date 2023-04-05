package samples.leetcode.arrays.rotate_left;

import java.util.ArrayList;
import java.util.List;

public class RotateLeft {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        if (arr == null || arr.size() == 0) {
            return new ArrayList<>();
        }

        int size = arr.size();
        d = d % size;

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            res.add(arr.get(getRotationIdx(i, d, size)));
        }

        return res;

    }

    // rotate left -2 is equivalent to rotate right by size - 2
    private static int getRotationIdx(int i, int step, int size) {
        return (i + step) % size;
    }
}
