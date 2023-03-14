package samples.leetcode.fb.algorithms;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import samples.leetcode.fb.algorithms.ElementSwapping;

public class ElementSwappingTest {

    ElementSwapping elementSwapping = new ElementSwapping();

    @Test
    void testExample1() {
        // Given
        int[] in = new int[] { 5, 3, 1 };
        int[] expected = new int[] { 1, 5, 3 };
        int k = 2;

        // When
        int[] actual = elementSwapping.findMinArray(in, k);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample2() {
        // Given
        int[] in = new int[] { 8, 9, 11, 2, 1 };
        int[] expected = new int[] { 2, 8, 9, 11, 1 };
        int k = 3;

        // When
        int[] actual = elementSwapping.findMinArray(in, k);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample3() {
        // Given
        int[] in = new int[] { 5, 6, 1, 2, 6, 7, 8, 9 };
        int[] expected = new int[] { 1, 5, 2, 6, 6, 7, 8, 9 };
        int k = 3;

        // When
        int[] actual = elementSwapping.findMinArray(in, k);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
