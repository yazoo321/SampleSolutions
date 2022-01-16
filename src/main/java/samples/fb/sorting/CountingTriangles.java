package samples.fb.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountingTriangles {

    int countDistinctTriangles(ArrayList<Sides> arr) {
        // Write your code here
        Set<String> setOfStrings = arr.stream().map((triangle) ->
                        Arrays.toString(IntStream.of(triangle.a, triangle.b, triangle.c)
                                .sorted().toArray()))
                .collect(Collectors.toSet());

        return setOfStrings.size();

    }
}
