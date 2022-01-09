package samples.fb.mixed.pairSums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PairSumsTest {

    PairSums pairSums = new PairSums();

    @Test
    void testExample1() {
        // Given
        int[] input = new int[] { 1, 2, 3, 4, 3 };
        int k = 6;
        int expected = 2;

        // When
        int actual = pairSums.numberOfWays(input, k);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testExample2() {
        // Given
        int[] input = new int[] { 1, 5, 3, 3, 3 };
        int k = 6;
        int expected = 4;

        // When
        int actual = pairSums.numberOfWays(input, k);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
