package samples.fb.algorithms;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SeatingArrangementsTest {

    SeatingArrangements seatingArrangements = new SeatingArrangements();

    @Test
    void testExample1() {
        // Given
        int[] in = new int[] { 5, 10, 6, 8 };
        int expected = 4;

        // When
        int actual = seatingArrangements.minOverallAwkwardness(in);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample2() {
        // Given
        int[] in = new int[] { 1, 2, 5, 3, 7 };
        int expected = 4;

        // When
        int actual = seatingArrangements.minOverallAwkwardness(in);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample3() {
        // Given
        int[] in = new int[] { 2,4,7,7,7 };
        int expected = 5;

        // When
        int actual = seatingArrangements.minOverallAwkwardness(in);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
