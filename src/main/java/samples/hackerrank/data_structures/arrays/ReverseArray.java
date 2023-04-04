package samples.hackerrank.data_structures.arrays;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here

        List<Integer> resList = new ArrayList<>();
        for (int i = a.size() -1; i >= 0; i--) {
            resList.add(a.get(i));
        }

        return resList;
    }


}
