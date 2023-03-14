package samples.leetcode.fb.arrays.passingYearbooks;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import samples.leetcode.fb.arrays.passingYearbooks.PassingYearbooks;

public class passingYearbooksTest {

    PassingYearbooks passingYearbooks = new PassingYearbooks();

    @Test
    void testExample1() {
        // Given
        int[] arr = new int[] { 1, 2 };
        int[] expected = new int[] { 1, 1 };
        // When
        int[] actual = passingYearbooks.findSignatureCounts(arr);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);

    }

    @Test
    void testExample2() {
        // Given
        int[] arr = new int[] { 2, 1 };
        int[] expected = new int[] { 2, 2 };
        // When
        int[] actual = passingYearbooks.findSignatureCounts(arr);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample3() {
        // Given
        int[] arr = new int[] { 4, 3, 2, 5, 1 };
        int[] expected = new int[] { 3, 2, 2, 3, 3 };
        // When
        int[] actual = passingYearbooks.findSignatureCounts(arr);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}
