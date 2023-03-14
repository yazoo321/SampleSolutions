package samples.leetcode.fb.sorting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import samples.leetcode.fb.sorting.CountingTriangles;
import samples.leetcode.fb.sorting.Sides;

import java.util.ArrayList;

public class CountingTrianglesTest {

    CountingTriangles countingTriangles = new CountingTriangles();

    @Test
    void testExample1() {
        // Given
        ArrayList<Sides> input = new ArrayList<>();
        input.add(new Sides(2,2,3));
        input.add(new Sides(3,2,2));
        input.add(new Sides(2,5,6));

        int expected = 2;

        // When
        int actual = countingTriangles.countDistinctTriangles(input);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
